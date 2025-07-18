package defpackage;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

/* compiled from: PG */
/* loaded from: classes.dex */
abstract class bjl extends bjk {
    protected final brb a;

    public bjl(int i, brb brbVar) {
        super(i);
        this.a = brbVar;
    }

    protected abstract void c(bkb bkbVar);

    @Override // defpackage.bjq
    public final void d(Status status) {
        this.a.E(new bix(status));
    }

    @Override // defpackage.bjq
    public final void e(Exception exc) {
        this.a.E(exc);
    }

    @Override // defpackage.bjq
    public final void f(bkb bkbVar) throws DeadObjectException {
        try {
            c(bkbVar);
        } catch (DeadObjectException e) {
            d(bjq.h(e));
            throw e;
        } catch (RemoteException e2) {
            d(bjq.h(e2));
        } catch (RuntimeException e3) {
            e(e3);
        }
    }

    @Override // defpackage.bjq
    public void g(bnz bnzVar, boolean z) {
    }
}
