package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fwb {
    public static final fwb a = new fwb();
    private static final fwa b = new fwa(new byte[0], 0, 0, false);
    private static final int c;
    private static final AtomicReference[] d;

    static {
        int iAvailableProcessors = Runtime.getRuntime().availableProcessors();
        int iHighestOneBit = Integer.highestOneBit((iAvailableProcessors + iAvailableProcessors) - 1);
        c = iHighestOneBit;
        AtomicReference[] atomicReferenceArr = new AtomicReference[iHighestOneBit];
        for (int i = 0; i < iHighestOneBit; i++) {
            atomicReferenceArr[i] = new AtomicReference();
        }
        d = atomicReferenceArr;
    }

    private fwb() {
    }

    public static final fwa a() {
        AtomicReference atomicReferenceC = c();
        fwa fwaVar = b;
        fwa fwaVar2 = (fwa) atomicReferenceC.getAndSet(fwaVar);
        if (fwaVar2 == fwaVar) {
            return new fwa();
        }
        if (fwaVar2 == null) {
            atomicReferenceC.set(null);
            return new fwa();
        }
        atomicReferenceC.set(fwaVar2.f);
        fwaVar2.f = null;
        fwaVar2.c = 0;
        return fwaVar2;
    }

    public static final void b(fwa fwaVar) {
        if (fwaVar.f != null || fwaVar.g != null) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (fwaVar.d) {
            return;
        }
        AtomicReference atomicReferenceC = c();
        fwa fwaVar2 = b;
        fwa fwaVar3 = (fwa) atomicReferenceC.getAndSet(fwaVar2);
        if (fwaVar3 != fwaVar2) {
            int i = fwaVar3 != null ? fwaVar3.c : 0;
            if (i >= 65536) {
                atomicReferenceC.set(fwaVar3);
                return;
            }
            fwaVar.f = fwaVar3;
            fwaVar.b = 0;
            fwaVar.c = i + 8192;
            atomicReferenceC.set(fwaVar);
        }
    }

    private static final AtomicReference c() {
        return d[(int) (Thread.currentThread().getId() & (c - 1))];
    }
}
