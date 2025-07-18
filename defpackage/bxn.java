package defpackage;

import android.os.IBinder;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes.dex */
final class bxn implements IBinder.DeathRecipient {
    public final AtomicReference a = new AtomicReference();
    final /* synthetic */ bxq b;

    public bxn(bxq bxqVar) {
        this.b = bxqVar;
    }

    @Override // android.os.IBinder.DeathRecipient
    public final void binderDied() {
        this.b.c.h("Binder died!");
        Future future = (Future) this.a.getAndSet(null);
        if (future != null) {
            this.b.c.h("Cancelling pending future!");
            future.cancel(false);
        }
    }
}
