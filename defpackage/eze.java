package defpackage;

import java.util.Collection;
import java.util.concurrent.Future;

/* compiled from: PG */
/* loaded from: classes.dex */
final class eze implements Runnable {
    final /* synthetic */ Collection a;
    final /* synthetic */ ezt b;
    final /* synthetic */ Future c;
    final /* synthetic */ boolean d;
    final /* synthetic */ Future e;
    final /* synthetic */ ezv f;

    public eze(ezv ezvVar, Collection collection, ezt eztVar, Future future, boolean z, Future future2) {
        this.a = collection;
        this.b = eztVar;
        this.c = future;
        this.d = z;
        this.e = future2;
        this.f = ezvVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        for (ezt eztVar : this.a) {
            if (eztVar != this.b) {
                eztVar.a.d(ezv.c);
            }
        }
        Future future = this.c;
        if (future != null) {
            future.cancel(false);
            if (!this.d && this.f.u.decrementAndGet() == Integer.MIN_VALUE) {
                ezv ezvVar = this.f;
                ezvVar.h.execute(new ezk(this, 1));
            }
        }
        Future future2 = this.e;
        if (future2 != null) {
            future2.cancel(false);
        }
        this.f.y();
    }
}
