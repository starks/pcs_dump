package j$.time.chrono;

import j$.time.temporal.Temporal;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class F implements o {
    public static final F BEFORE_ROC;
    public static final F ROC;
    private static final /* synthetic */ F[] a;

    static {
        F f = new F("BEFORE_ROC", 0);
        BEFORE_ROC = f;
        F f2 = new F("ROC", 1);
        ROC = f2;
        a = new F[]{f, f2};
    }

    public static F valueOf(String str) {
        return (F) Enum.valueOf(F.class, str);
    }

    public static F[] values() {
        return (F[]) a.clone();
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final /* synthetic */ long I(j$.time.temporal.n nVar) {
        return AbstractC0033i.g(this, nVar);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final /* synthetic */ Object O(j$.time.temporal.p pVar) {
        return AbstractC0033i.m(this, pVar);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final /* synthetic */ boolean e(j$.time.temporal.n nVar) {
        return AbstractC0033i.i(this, nVar);
    }

    @Override // j$.time.temporal.l
    public final Temporal g(Temporal temporal) {
        return temporal.d(getValue(), j$.time.temporal.a.ERA);
    }

    @Override // j$.time.chrono.o
    public final int getValue() {
        return ordinal();
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final /* synthetic */ int t(j$.time.temporal.n nVar) {
        return AbstractC0033i.f(this, (j$.time.temporal.a) nVar);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.r z(j$.time.temporal.n nVar) {
        return j$.time.temporal.k.d(this, nVar);
    }
}
