package defpackage;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bjo extends bjk {
    private final bkv a;
    private final zl b;
    private final brb d;

    public bjo(int i, bkv bkvVar, brb brbVar, zl zlVar) {
        super(i);
        this.d = brbVar;
        this.a = bkvVar;
        this.b = zlVar;
        if (i == 2 && bkvVar.b) {
            throw new IllegalArgumentException("Best-effort write calls cannot pass methods that should auto-resolve missing features.");
        }
    }

    @Override // defpackage.bjk
    public final boolean a(bkb bkbVar) {
        return this.a.b;
    }

    @Override // defpackage.bjk
    public final bhq[] b(bkb bkbVar) {
        return this.a.a;
    }

    @Override // defpackage.bjq
    public final void d(Status status) {
        this.d.E(api.d(status));
    }

    @Override // defpackage.bjq
    public final void e(Exception exc) {
        this.d.E(exc);
    }

    @Override // defpackage.bjq
    public final void f(bkb bkbVar) throws DeadObjectException {
        try {
            bkv bkvVar = this.a;
            bkvVar.c.a.a(bkbVar.b, this.d);
        } catch (DeadObjectException e) {
            throw e;
        } catch (RemoteException e2) {
            d(bjq.h(e2));
        } catch (RuntimeException e3) {
            e(e3);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    @Override // defpackage.bjq
    public final void g(bnz bnzVar, boolean z) {
        ?? r0 = bnzVar.a;
        brb brbVar = this.d;
        r0.put(brbVar, Boolean.valueOf(z));
        ((cag) brbVar.a).g(new bjz(bnzVar, brbVar));
    }
}
