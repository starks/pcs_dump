package defpackage;

import java.lang.ref.WeakReference;
import java.util.Set;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class adv extends acq {
    private final acs b;
    private final WeakReference c;

    public adv(acs acsVar, acq acqVar) {
        super(acqVar.a);
        this.b = acsVar;
        this.c = new WeakReference(acqVar);
    }

    @Override // defpackage.acq
    public final void a(Set set) throws Throwable {
        set.getClass();
        acq acqVar = (acq) this.c.get();
        if (acqVar != null) {
            acqVar.a(set);
            return;
        }
        acs acsVar = this.b;
        ReentrantLock reentrantLock = acsVar.d;
        reentrantLock.lock();
        try {
            ahm ahmVar = (ahm) acsVar.c.remove(this);
            if (ahmVar != null) {
                acv acvVar = acsVar.b.c;
                ReentrantLock reentrantLock2 = (ReentrantLock) acvVar.b;
                reentrantLock2.lock();
                Object obj = ahmVar.a;
                try {
                    int length = ((int[]) obj).length;
                    boolean z = false;
                    for (int i = 0; i < length; i++) {
                        int i2 = ((int[]) obj)[i];
                        Object obj2 = acvVar.c;
                        long j = ((long[]) obj2)[i2];
                        ((long[]) obj2)[i2] = (-1) + j;
                        if (j == 1) {
                            z = true;
                            acvVar.a = true;
                        }
                    }
                    if (z) {
                        fjp.r(new acr(acsVar, (fhk) null, 0));
                    }
                } finally {
                    reentrantLock2.unlock();
                }
            }
        } finally {
            reentrantLock.unlock();
        }
    }
}
