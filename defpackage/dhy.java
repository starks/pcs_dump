package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class dhy extends dhr {
    @Override // defpackage.dhr
    public final dhw a(dif difVar, dhw dhwVar) {
        dhw dhwVar2;
        synchronized (difVar) {
            dhwVar2 = difVar.listeners;
            if (dhwVar2 != dhwVar) {
                difVar.listeners = dhwVar;
            }
        }
        return dhwVar2;
    }

    @Override // defpackage.dhr
    public final die b(dif difVar, die dieVar) {
        die dieVar2;
        synchronized (difVar) {
            dieVar2 = difVar.waiters;
            if (dieVar2 != dieVar) {
                difVar.waiters = dieVar;
            }
        }
        return dieVar2;
    }

    @Override // defpackage.dhr
    public final void c(die dieVar, die dieVar2) {
        dieVar.next = dieVar2;
    }

    @Override // defpackage.dhr
    public final void d(die dieVar, Thread thread) {
        dieVar.thread = thread;
    }

    @Override // defpackage.dhr
    public final boolean e(dif difVar, dhw dhwVar, dhw dhwVar2) {
        synchronized (difVar) {
            if (difVar.listeners != dhwVar) {
                return false;
            }
            difVar.listeners = dhwVar2;
            return true;
        }
    }

    @Override // defpackage.dhr
    public final boolean f(dif difVar, Object obj, Object obj2) {
        synchronized (difVar) {
            if (difVar.value != obj) {
                return false;
            }
            difVar.value = obj2;
            return true;
        }
    }

    @Override // defpackage.dhr
    public final boolean g(dif difVar, die dieVar, die dieVar2) {
        synchronized (difVar) {
            if (difVar.waiters != dieVar) {
                return false;
            }
            difVar.waiters = dieVar2;
            return true;
        }
    }
}
