package defpackage;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.logging.Level;

/* compiled from: PG */
/* loaded from: classes.dex */
abstract class dim extends diq {
    private static final djx b = new djx(dim.class);
    private cwu c;
    private final boolean g;
    private final boolean h;

    public dim(cwu cwuVar, boolean z, boolean z2) {
        super(cwuVar.size());
        cwuVar.getClass();
        this.c = cwuVar;
        this.g = z;
        this.h = z2;
    }

    private final void t(int i, Future future) {
        try {
            h(i, a.f(future));
        } catch (ExecutionException e) {
            u(e.getCause());
        } catch (Throwable th) {
            u(th);
        }
    }

    private final void u(Throwable th) {
        th.getClass();
        if (this.g && !e(th)) {
            Set set = this.seenExceptions;
            if (set == null) {
                Set setNewSetFromMap = Collections.newSetFromMap(new ConcurrentHashMap());
                g(setNewSetFromMap);
                diq.a.b(this, setNewSetFromMap);
                set = this.seenExceptions;
                set.getClass();
            }
            if (w(set, th)) {
                v(th);
                return;
            }
        }
        if (th instanceof Error) {
            v(th);
        }
    }

    private static void v(Throwable th) {
        b.a().logp(Level.SEVERE, "com.google.common.util.concurrent.AggregateFuture", "log", true != (th instanceof Error) ? "Got more than one input Future failure. Logging failures after the first" : "Input Future failed with Error", th);
    }

    private static boolean w(Set set, Throwable th) {
        while (th != null) {
            if (!set.add(th)) {
                return false;
            }
            th = th.getCause();
        }
        return true;
    }

    @Override // defpackage.dif
    protected final String a() {
        cwu cwuVar = this.c;
        return cwuVar != null ? "futures=".concat(cwuVar.toString()) : super.a();
    }

    @Override // defpackage.dif
    protected final void b() {
        cwu cwuVar = this.c;
        s(1);
        if ((cwuVar != null) && isCancelled()) {
            boolean zP = p();
            czc czcVarListIterator = cwuVar.listIterator();
            while (czcVarListIterator.hasNext()) {
                ((Future) czcVarListIterator.next()).cancel(zP);
            }
        }
    }

    @Override // defpackage.diq
    public final void g(Set set) {
        set.getClass();
        if (isCancelled()) {
            return;
        }
        Throwable thL = l();
        thL.getClass();
        w(set, thL);
    }

    public abstract void h(int i, Object obj);

    public final void i(cwu cwuVar) {
        int iA = diq.a.a(this);
        int i = 0;
        clq.G(iA >= 0, "Less than 0 remaining futures");
        if (iA == 0) {
            if (cwuVar != null) {
                czc czcVarListIterator = cwuVar.listIterator();
                while (czcVarListIterator.hasNext()) {
                    Future future = (Future) czcVarListIterator.next();
                    if (!future.isCancelled()) {
                        t(i, future);
                    }
                    i++;
                }
            }
            this.seenExceptions = null;
            j();
            s(2);
        }
    }

    public abstract void j();

    final void q() {
        cwu cwuVar = this.c;
        cwuVar.getClass();
        if (cwuVar.isEmpty()) {
            j();
            return;
        }
        if (this.g) {
            czc czcVarListIterator = this.c.listIterator();
            final int i = 0;
            while (czcVarListIterator.hasNext()) {
                final djy djyVar = (djy) czcVarListIterator.next();
                int i2 = i + 1;
                if (djyVar.isDone()) {
                    r(i, djyVar);
                } else {
                    djyVar.c(new Runnable() { // from class: dik
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.a.r(i, djyVar);
                        }
                    }, diy.a);
                }
                i = i2;
            }
            return;
        }
        cwu cwuVar2 = this.c;
        final cwu cwuVar3 = true != this.h ? null : cwuVar2;
        Runnable runnable = new Runnable() { // from class: dil
            @Override // java.lang.Runnable
            public final void run() {
                this.a.i(cwuVar3);
            }
        };
        czc czcVarListIterator2 = cwuVar2.listIterator();
        while (czcVarListIterator2.hasNext()) {
            djy djyVar2 = (djy) czcVarListIterator2.next();
            if (djyVar2.isDone()) {
                i(cwuVar3);
            } else {
                djyVar2.c(runnable, diy.a);
            }
        }
    }

    public final void r(int i, djy djyVar) {
        try {
            if (djyVar.isCancelled()) {
                this.c = null;
                cancel(false);
            } else {
                t(i, djyVar);
            }
        } finally {
            i(null);
        }
    }

    public void s(int i) {
        this.c = null;
    }
}
