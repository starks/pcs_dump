package defpackage;

import android.os.DeadObjectException;
import android.util.Log;
import com.google.android.gms.common.api.Status;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bjm extends bjq {
    protected final bjt a;

    public bjm(bjt bjtVar) {
        super(2);
        this.a = bjtVar;
    }

    @Override // defpackage.bjq
    public final void d(Status status) {
        try {
            this.a.i(status);
        } catch (IllegalStateException e) {
            Log.w("ApiCallRunner", "Exception reporting failure", e);
        }
    }

    @Override // defpackage.bjq
    public final void e(Exception exc) {
        try {
            this.a.i(new Status(10, exc.getClass().getSimpleName() + ": " + exc.getLocalizedMessage()));
        } catch (IllegalStateException e) {
            Log.w("ApiCallRunner", "Exception reporting failure", e);
        }
    }

    @Override // defpackage.bjq
    public final void f(bkb bkbVar) throws DeadObjectException {
        try {
            this.a.h(bkbVar.b);
        } catch (RuntimeException e) {
            e(e);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    @Override // defpackage.bjq
    public final void g(bnz bnzVar, boolean z) {
        bjt bjtVar = this.a;
        bnzVar.b.put(bjtVar, Boolean.valueOf(z));
        bjtVar.g(new bjy(bnzVar, bjtVar, 0));
    }
}
