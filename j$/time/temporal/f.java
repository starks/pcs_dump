package j$.time.temporal;

import j$.time.LocalDate;
import j$.time.chrono.AbstractC0033i;
import j$.time.chrono.u;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
abstract class f implements n {
    public static final f DAY_OF_QUARTER;
    public static final f QUARTER_OF_YEAR;
    public static final f WEEK_BASED_YEAR;
    public static final f WEEK_OF_WEEK_BASED_YEAR;
    private static final int[] a;
    private static final /* synthetic */ f[] b;

    static {
        f fVar = new f() { // from class: j$.time.temporal.b
            @Override // j$.time.temporal.n
            public final long g(TemporalAccessor temporalAccessor) {
                if (!t(temporalAccessor)) {
                    throw new q("Unsupported field: DayOfQuarter");
                }
                return temporalAccessor.t(a.DAY_OF_YEAR) - f.a[((temporalAccessor.t(a.MONTH_OF_YEAR) - 1) / 3) + (u.d.L(temporalAccessor.I(a.YEAR)) ? 4 : 0)];
            }

            @Override // j$.time.temporal.n
            public final r p() {
                return r.k(1L, 90L, 92L);
            }

            @Override // j$.time.temporal.n
            public final boolean t(TemporalAccessor temporalAccessor) {
                if (!temporalAccessor.e(a.DAY_OF_YEAR) || !temporalAccessor.e(a.MONTH_OF_YEAR) || !temporalAccessor.e(a.YEAR)) {
                    return false;
                }
                n nVar = h.a;
                return AbstractC0033i.p(temporalAccessor).equals(u.d);
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "DayOfQuarter";
            }

            @Override // j$.time.temporal.n
            public final Temporal y(Temporal temporal, long j) {
                long jG = g(temporal);
                p().b(j, this);
                a aVar = a.DAY_OF_YEAR;
                return temporal.d((j - jG) + temporal.I(aVar), aVar);
            }

            @Override // j$.time.temporal.n
            public final r z(TemporalAccessor temporalAccessor) {
                if (!t(temporalAccessor)) {
                    throw new q("Unsupported field: DayOfQuarter");
                }
                long jI = temporalAccessor.I(f.QUARTER_OF_YEAR);
                if (jI == 1) {
                    return u.d.L(temporalAccessor.I(a.YEAR)) ? r.j(1L, 91L) : r.j(1L, 90L);
                }
                return jI == 2 ? r.j(1L, 91L) : (jI == 3 || jI == 4) ? r.j(1L, 92L) : p();
            }
        };
        DAY_OF_QUARTER = fVar;
        f fVar2 = new f() { // from class: j$.time.temporal.c
            @Override // j$.time.temporal.n
            public final long g(TemporalAccessor temporalAccessor) {
                if (t(temporalAccessor)) {
                    return (temporalAccessor.I(a.MONTH_OF_YEAR) + 2) / 3;
                }
                throw new q("Unsupported field: QuarterOfYear");
            }

            @Override // j$.time.temporal.n
            public final r p() {
                return r.j(1L, 4L);
            }

            @Override // j$.time.temporal.n
            public final boolean t(TemporalAccessor temporalAccessor) {
                if (!temporalAccessor.e(a.MONTH_OF_YEAR)) {
                    return false;
                }
                n nVar = h.a;
                return AbstractC0033i.p(temporalAccessor).equals(u.d);
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "QuarterOfYear";
            }

            @Override // j$.time.temporal.n
            public final Temporal y(Temporal temporal, long j) {
                long jG = g(temporal);
                p().b(j, this);
                a aVar = a.MONTH_OF_YEAR;
                return temporal.d(((j - jG) * 3) + temporal.I(aVar), aVar);
            }

            @Override // j$.time.temporal.n
            public final r z(TemporalAccessor temporalAccessor) {
                if (t(temporalAccessor)) {
                    return p();
                }
                throw new q("Unsupported field: QuarterOfYear");
            }
        };
        QUARTER_OF_YEAR = fVar2;
        f fVar3 = new f() { // from class: j$.time.temporal.d
            @Override // j$.time.temporal.n
            public final long g(TemporalAccessor temporalAccessor) {
                if (t(temporalAccessor)) {
                    return f.U(LocalDate.W(temporalAccessor));
                }
                throw new q("Unsupported field: WeekOfWeekBasedYear");
            }

            @Override // j$.time.temporal.n
            public final r p() {
                return r.k(1L, 52L, 53L);
            }

            @Override // j$.time.temporal.n
            public final boolean t(TemporalAccessor temporalAccessor) {
                if (!temporalAccessor.e(a.EPOCH_DAY)) {
                    return false;
                }
                n nVar = h.a;
                return AbstractC0033i.p(temporalAccessor).equals(u.d);
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "WeekOfWeekBasedYear";
            }

            @Override // j$.time.temporal.n
            public final Temporal y(Temporal temporal, long j) {
                p().b(j, this);
                return temporal.f(j$.time.b.c(j, g(temporal)), ChronoUnit.WEEKS);
            }

            @Override // j$.time.temporal.n
            public final r z(TemporalAccessor temporalAccessor) {
                if (t(temporalAccessor)) {
                    return f.X(LocalDate.W(temporalAccessor));
                }
                throw new q("Unsupported field: WeekOfWeekBasedYear");
            }
        };
        WEEK_OF_WEEK_BASED_YEAR = fVar3;
        f fVar4 = new f() { // from class: j$.time.temporal.e
            @Override // j$.time.temporal.n
            public final long g(TemporalAccessor temporalAccessor) {
                if (t(temporalAccessor)) {
                    return f.Y(LocalDate.W(temporalAccessor));
                }
                throw new q("Unsupported field: WeekBasedYear");
            }

            @Override // j$.time.temporal.n
            public final r p() {
                return a.YEAR.p();
            }

            @Override // j$.time.temporal.n
            public final boolean t(TemporalAccessor temporalAccessor) {
                if (!temporalAccessor.e(a.EPOCH_DAY)) {
                    return false;
                }
                n nVar = h.a;
                return AbstractC0033i.p(temporalAccessor).equals(u.d);
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "WeekBasedYear";
            }

            @Override // j$.time.temporal.n
            public final Temporal y(Temporal temporal, long j) {
                if (!t(temporal)) {
                    throw new q("Unsupported field: WeekBasedYear");
                }
                int iA = a.YEAR.p().a(j, f.WEEK_BASED_YEAR);
                LocalDate localDateW = LocalDate.W(temporal);
                int iT = localDateW.t(a.DAY_OF_WEEK);
                int iU = f.U(localDateW);
                if (iU == 53 && f.Z(iA) == 52) {
                    iU = 52;
                }
                return temporal.y(LocalDate.i0(iA, 1, 4).m0(((iU - 1) * 7) + (iT - r6.t(r0))));
            }

            @Override // j$.time.temporal.n
            public final r z(TemporalAccessor temporalAccessor) {
                if (t(temporalAccessor)) {
                    return p();
                }
                throw new q("Unsupported field: WeekBasedYear");
            }
        };
        WEEK_BASED_YEAR = fVar4;
        b = new f[]{fVar, fVar2, fVar3, fVar4};
        a = new int[]{0, 90, 181, 273, 0, 91, 182, 274};
    }

    static int U(LocalDate localDate) {
        int iOrdinal = localDate.Z().ordinal();
        int iA0 = localDate.a0() - 1;
        int i = (3 - iOrdinal) + iA0;
        int i2 = i - ((i / 7) * 7);
        int i3 = i2 - 3;
        if (i3 < -3) {
            i3 = i2 + 4;
        }
        if (iA0 < i3) {
            return (int) r.j(1L, Z(Y(localDate.r0(180).o0(-1L)))).d();
        }
        int i4 = ((iA0 - i3) / 7) + 1;
        if (i4 != 53 || i3 == -3 || (i3 == -2 && localDate.s())) {
            return i4;
        }
        return 1;
    }

    static r X(LocalDate localDate) {
        return r.j(1L, Z(Y(localDate)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int Y(LocalDate localDate) {
        int iD0 = localDate.d0();
        int iA0 = localDate.a0();
        if (iA0 <= 3) {
            return iA0 - localDate.Z().ordinal() < -2 ? iD0 - 1 : iD0;
        }
        if (iA0 >= 363) {
            return ((iA0 - 363) - (localDate.s() ? 1 : 0)) - localDate.Z().ordinal() >= 0 ? iD0 + 1 : iD0;
        }
        return iD0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int Z(int i) {
        LocalDate localDateI0 = LocalDate.i0(i, 1, 1);
        if (localDateI0.Z() != j$.time.d.THURSDAY) {
            return (localDateI0.Z() == j$.time.d.WEDNESDAY && localDateI0.s()) ? 53 : 52;
        }
        return 53;
    }

    public static f valueOf(String str) {
        return (f) Enum.valueOf(f.class, str);
    }

    public static f[] values() {
        return (f[]) b.clone();
    }

    @Override // j$.time.temporal.n
    public final boolean I() {
        return true;
    }
}
