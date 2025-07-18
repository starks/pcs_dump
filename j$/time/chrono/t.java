package j$.time.chrono;

import j$.time.temporal.Temporal;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class t implements o {
    public static final t AH;
    private static final /* synthetic */ t[] a;

    static {
        t tVar = new t("AH", 0);
        AH = tVar;
        a = new t[]{tVar};
    }

    public static t valueOf(String str) {
        return (t) Enum.valueOf(t.class, str);
    }

    public static t[] values() {
        return (t[]) a.clone();
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
        return temporal.d(1, j$.time.temporal.a.ERA);
    }

    @Override // j$.time.chrono.o
    public final int getValue() {
        return 1;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final /* synthetic */ int t(j$.time.temporal.n nVar) {
        return AbstractC0033i.f(this, (j$.time.temporal.a) nVar);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.r z(j$.time.temporal.n nVar) {
        return nVar == j$.time.temporal.a.ERA ? j$.time.temporal.r.j(1L, 1L) : j$.time.temporal.k.d(this, nVar);
    }
}
