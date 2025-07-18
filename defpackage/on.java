package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class on extends og {
    @Override // defpackage.og
    public final void a(oo ooVar, oo ooVar2) {
        ooVar.next = ooVar2;
    }

    @Override // defpackage.og
    public final void b(oo ooVar, Thread thread) {
        ooVar.thread = thread;
    }

    @Override // defpackage.og
    public final boolean c(op opVar, ok okVar, ok okVar2) {
        synchronized (opVar) {
            if (opVar.listeners != okVar) {
                return false;
            }
            opVar.listeners = okVar2;
            return true;
        }
    }

    @Override // defpackage.og
    public final boolean d(op opVar, Object obj, Object obj2) {
        synchronized (opVar) {
            if (opVar.value != obj) {
                return false;
            }
            opVar.value = obj2;
            return true;
        }
    }

    @Override // defpackage.og
    public final boolean e(op opVar, oo ooVar, oo ooVar2) {
        synchronized (opVar) {
            if (opVar.waiters != ooVar) {
                return false;
            }
            opVar.waiters = ooVar2;
            return true;
        }
    }
}
