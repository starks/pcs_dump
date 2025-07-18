package defpackage;

import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import java.io.Closeable;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bpb implements Closeable {
    public final bos a;
    private final Executor b;
    private final String c;
    private final bok d;
    private bnu e;
    private final AtomicBoolean f = new AtomicBoolean(false);
    private final boi g;
    private final fpv h;

    public bpb(fpv fpvVar, Executor executor, bos bosVar, String str, bok bokVar, boi boiVar, bnu bnuVar) {
        this.h = fpvVar;
        this.b = executor;
        this.a = bosVar;
        this.c = str;
        this.d = bokVar;
        this.g = boiVar;
        this.e = bnuVar;
    }

    private static boolean d(bnu bnuVar) {
        return bnuVar == null || bnuVar.asBinder() == null || !bnuVar.asBinder().pingBinder();
    }

    private final synchronized byte[] e(Map map) {
        byte[] bArrD;
        if (d(this.e)) {
            throw new bix(new Status(20, "The handle object on the module side is unreachable"));
        }
        try {
            bArrD = this.e.d(map);
            if (bArrD == null) {
                throw new bix(new Status(8, "Received null response on snapshot"));
            }
        } catch (RemoteException e) {
            throw ayg.i(e, "Failed to get a snapshot");
        }
        return bArrD;
    }

    private final synchronized void f(bln blnVar, boi boiVar) {
        if (this.d.d && d(this.e)) {
            boiVar.c(cqw.b, boh.COARSE);
            this.e = fcy.l(blnVar, this.c, this.d, this.h.k(), boiVar).a;
        }
    }

    public final cag a(final Map map) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        cag cagVarN = this.f.get() ? up.n(new bix(new Status(10, "DroidGuard handle is closed"))) : this.h.l(this.d.d ? 1 : 2, 2, new boq() { // from class: boz
            @Override // defpackage.boq
            public final Object a(bln blnVar) {
                return this.a.c(blnVar, map);
            }
        });
        Executor executor = this.b;
        cag cagVarM = uo.m(executor, cagVarN, this.d.c);
        cagVarM.h(executor, new bov(this, jCurrentTimeMillis, 2));
        return cagVarM;
    }

    public final synchronized void b() {
        if (d(this.e)) {
            Log.w("DGInternalHandle", "The handle object on the module side is unreachable for close");
            return;
        }
        try {
            this.e.b();
        } catch (RemoteException e) {
            Log.e("DGInternalHandle", "Error while closing the handle: ".concat(String.valueOf(e.getMessage())));
        }
        this.e = null;
    }

    public final synchronized brb c(bln blnVar, Map map) {
        boi boiVarClone;
        byte[] bArrE;
        boiVarClone = this.g.clone();
        f(blnVar, boiVarClone);
        boiVarClone.c(cqw.n, boh.COARSE);
        bArrE = e(map);
        boiVarClone.c(cqw.o, boh.COARSE);
        return new brb((Object) bnh.z(bnh.y(blnVar.a, bArrE, boiVarClone.b())));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f.getAndSet(true)) {
            Log.w("DGInternalHandle", "Handle is already closed");
        } else {
            this.h.l(2, 3, new boq() { // from class: box
                @Override // defpackage.boq
                public final Object a(bln blnVar) {
                    this.a.b();
                    return null;
                }
            }).i(new cac() { // from class: boy
                @Override // defpackage.cac
                public final void c(Exception exc) {
                    Log.w("DGInternalHandle", "Client disconnected on close: ".concat(String.valueOf(exc.getMessage())));
                }
            });
        }
    }
}
