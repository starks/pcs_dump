package defpackage;

import android.app.PendingIntent;
import android.os.Bundle;

/* compiled from: PG */
/* loaded from: classes.dex */
abstract class bky extends bla {
    public final int a;
    public final Bundle b;
    final /* synthetic */ blg c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    protected bky(blg blgVar, int i, Bundle bundle) {
        super(blgVar, true);
        this.c = blgVar;
        this.a = i;
        this.b = bundle;
    }

    protected abstract void a(bho bhoVar);

    protected abstract boolean c();

    @Override // defpackage.bla
    protected final /* bridge */ /* synthetic */ void d() {
        if (this.a != 0) {
            this.c.I(1, null);
            Bundle bundle = this.b;
            a(new bho(this.a, bundle != null ? (PendingIntent) bundle.getParcelable("pendingIntent") : null));
        } else {
            if (c()) {
                return;
            }
            this.c.I(1, null);
            a(new bho(8, null));
        }
    }

    @Override // defpackage.bla
    protected final void b() {
    }
}
