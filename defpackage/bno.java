package defpackage;

import android.content.Context;
import android.util.Log;
import java.io.Closeable;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bno implements Closeable {
    public volatile bnu a;
    public volatile byte[] b;
    private final Context c;
    private final bnr d;
    private final long e;
    private final boi f;

    public bno(Context context, bnr bnrVar, bnu bnuVar, long j, boi boiVar) {
        this.c = context;
        this.d = bnrVar;
        this.a = bnuVar;
        this.e = j;
        this.f = boiVar;
    }

    public final String a(Map map) {
        byte[] bArrL;
        boi boiVarClone = this.f.clone();
        boiVarClone.c(cqw.n, boh.COARSE);
        if (this.b != null) {
            bArrL = this.b;
        } else {
            bof bofVar = new bof();
            this.d.e(new n(this, map, bofVar, 3));
            try {
                long j = this.e;
                if (bofVar.c) {
                    throw new RuntimeException("BlockingChannel can be read only once.");
                }
                bofVar.c = true;
                bArrL = (byte[]) bofVar.a.poll(j, TimeUnit.MILLISECONDS);
                if (bArrL == null) {
                    bArrL = ayg.k("Snapshot timeout: " + this.e + " ms");
                }
            } catch (InterruptedException e) {
                bArrL = ayg.l("Results transfer failed: ".concat(e.toString()), e);
            }
        }
        boiVarClone.c(cqw.o, boh.COARSE);
        return ayg.j(bnh.z(bnh.y(this.c, bArrL, boiVarClone.b())));
    }

    public final /* synthetic */ void b() {
        if (this.a == null) {
            return;
        }
        try {
            this.a.b();
        } catch (Exception unused) {
            Log.e("DGHandleImpl", "Error while closing handle.");
        }
        this.a = null;
        r2.b--;
        this.d.d();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.d.e(new bks(this, 2, null));
    }

    public bno(Context context, bnr bnrVar, String str, boi boiVar) {
        this.c = context;
        this.d = bnrVar;
        this.f = boiVar;
        this.b = ayg.k(str);
        this.e = 0L;
    }

    public bno(Context context, bnr bnrVar, String str, boi boiVar, Throwable th) {
        this.c = context;
        this.d = bnrVar;
        this.f = boiVar;
        this.b = ayg.l(str, th);
        this.e = 0L;
    }
}
