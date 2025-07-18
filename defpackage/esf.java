package defpackage;

import android.os.IBinder;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
final class esf extends esh {
    private final fae d;

    public esf(IBinder iBinder, Executor executor) {
        super(iBinder);
        this.d = new fae(executor);
    }

    @Override // defpackage.esh
    public final void a(int i, esj esjVar) {
        this.d.execute(new bdq(this, i, esjVar.a(), 3));
        esjVar.b();
    }
}
