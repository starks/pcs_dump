package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes.dex */
final class cpm extends dif {
    private cpo a;
    private final int b;

    public cpm(cpo cpoVar, int i) {
        this.a = cpoVar;
        this.b = i;
    }

    @Override // defpackage.dif
    protected final String a() {
        Object obj;
        cpo cpoVar = this.a;
        if (cpoVar == null || (obj = cpoVar.d.a) == null) {
            return null;
        }
        String strG = a.G(obj, "callable=[", "]");
        cpn cpnVar = (cpn) this.a.b.get();
        if (cpnVar == null) {
            return strG;
        }
        return strG + ", trial=[" + cpnVar.toString() + "]";
    }

    @Override // defpackage.dif
    protected final void b() {
        long j;
        int i;
        int iA;
        boolean z;
        cpo cpoVar = this.a;
        this.a = null;
        if (cpoVar == null) {
            return;
        }
        do {
            j = cpoVar.a.get();
            i = (int) j;
            iA = cpo.a(j);
            if (i == Integer.MIN_VALUE) {
                throw new AssertionError(a.C(j, "Refcount is: "));
            }
            z = i == -2147483647;
            if (z) {
                iA++;
            }
        } while (!cpoVar.a.compareAndSet(j, cpo.b(iA, i - 1)));
        if (z) {
            while (true) {
                cpn cpnVar = (cpn) cpoVar.b.get();
                if (cpnVar != null) {
                    if (cpnVar.a <= this.b) {
                        cpnVar.cancel(true);
                        AtomicReference atomicReference = cpoVar.b;
                        while (!atomicReference.compareAndSet(cpnVar, null)) {
                            if (atomicReference.get() != cpnVar) {
                                break;
                            }
                        }
                        return;
                    }
                    return;
                }
                return;
            }
        }
    }

    @Override // defpackage.dif
    public final boolean f(djy djyVar) {
        return super.f(djyVar);
    }
}
