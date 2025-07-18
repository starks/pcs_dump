package j$.time.temporal;

import j$.time.chrono.AbstractC0033i;
import j$.time.chrono.InterfaceC0026b;

/* loaded from: classes2.dex */
final class s implements n {
    private static final r f = r.j(1, 7);
    private static final r g = r.k(0, 4, 6);
    private static final r h = r.k(0, 52, 54);
    private static final r i = r.k(1, 52, 53);
    private final String a;
    private final t b;
    private final Enum c;
    private final Enum d;
    private final r e;

    /* JADX WARN: Multi-variable type inference failed */
    private s(String str, t tVar, TemporalUnit temporalUnit, TemporalUnit temporalUnit2, r rVar) {
        this.a = str;
        this.b = tVar;
        this.c = (Enum) temporalUnit;
        this.d = (Enum) temporalUnit2;
        this.e = rVar;
    }

    private static int a(int i2, int i3) {
        return ((i3 - 1) + (i2 + 7)) / 7;
    }

    private int b(TemporalAccessor temporalAccessor) {
        int iT = temporalAccessor.t(a.DAY_OF_WEEK) - this.b.d().getValue();
        int i2 = iT % 7;
        if (i2 == 0) {
            i2 = 0;
        } else if ((((iT ^ 7) >> 31) | 1) <= 0) {
            i2 += 7;
        }
        return i2 + 1;
    }

    private int c(TemporalAccessor temporalAccessor) {
        int iB = b(temporalAccessor);
        a aVar = a.DAY_OF_YEAR;
        int iT = temporalAccessor.t(aVar);
        int iK = k(iT, iB);
        int iA = a(iK, iT);
        if (iA == 0) {
            return c(AbstractC0033i.p(temporalAccessor).v(temporalAccessor).p(iT, ChronoUnit.DAYS));
        }
        if (iA <= 50) {
            return iA;
        }
        int iA2 = a(iK, this.b.e() + ((int) temporalAccessor.z(aVar).d()));
        return iA >= iA2 ? (iA - iA2) + 1 : iA;
    }

    static s d(t tVar) {
        return new s("DayOfWeek", tVar, ChronoUnit.DAYS, ChronoUnit.WEEKS, f);
    }

    static s e(t tVar) {
        return new s("WeekBasedYear", tVar, h.d, ChronoUnit.FOREVER, a.YEAR.p());
    }

    static s f(t tVar) {
        return new s("WeekOfMonth", tVar, ChronoUnit.WEEKS, ChronoUnit.MONTHS, g);
    }

    static s h(t tVar) {
        return new s("WeekOfWeekBasedYear", tVar, ChronoUnit.WEEKS, h.d, i);
    }

    private r i(TemporalAccessor temporalAccessor, a aVar) {
        int iK = k(temporalAccessor.t(aVar), b(temporalAccessor));
        r rVarZ = temporalAccessor.z(aVar);
        return r.j(a(iK, (int) rVarZ.e()), a(iK, (int) rVarZ.d()));
    }

    private r j(TemporalAccessor temporalAccessor) {
        a aVar = a.DAY_OF_YEAR;
        if (!temporalAccessor.e(aVar)) {
            return h;
        }
        int iB = b(temporalAccessor);
        int iT = temporalAccessor.t(aVar);
        int iK = k(iT, iB);
        int iA = a(iK, iT);
        if (iA == 0) {
            return j(AbstractC0033i.p(temporalAccessor).v(temporalAccessor).p(iT + 7, ChronoUnit.DAYS));
        }
        return iA >= a(iK, this.b.e() + ((int) temporalAccessor.z(aVar).d())) ? j(AbstractC0033i.p(temporalAccessor).v(temporalAccessor).f((r0 - iT) + 8, (TemporalUnit) ChronoUnit.DAYS)) : r.j(1L, r1 - 1);
    }

    private int k(int i2, int i3) {
        int i4 = i2 - i3;
        int i5 = i4 % 7;
        if (i5 == 0) {
            i5 = 0;
        } else if ((((i4 ^ 7) >> 31) | 1) <= 0) {
            i5 += 7;
        }
        return i5 + 1 > this.b.e() ? 7 - i5 : -i5;
    }

    @Override // j$.time.temporal.n
    public final boolean I() {
        return true;
    }

    @Override // j$.time.temporal.n
    public final long g(TemporalAccessor temporalAccessor) {
        int iC;
        ChronoUnit chronoUnit = ChronoUnit.WEEKS;
        Enum r1 = this.d;
        if (r1 == chronoUnit) {
            iC = b(temporalAccessor);
        } else if (r1 == ChronoUnit.MONTHS) {
            int iB = b(temporalAccessor);
            int iT = temporalAccessor.t(a.DAY_OF_MONTH);
            iC = a(k(iT, iB), iT);
        } else if (r1 == ChronoUnit.YEARS) {
            int iB2 = b(temporalAccessor);
            int iT2 = temporalAccessor.t(a.DAY_OF_YEAR);
            iC = a(k(iT2, iB2), iT2);
        } else {
            if (r1 != t.h) {
                if (r1 != ChronoUnit.FOREVER) {
                    throw new IllegalStateException(j$.time.f.a("unreachable, rangeUnit: ", String.valueOf(r1), ", this: ", String.valueOf(this)));
                }
                int iB3 = b(temporalAccessor);
                int iT3 = temporalAccessor.t(a.YEAR);
                a aVar = a.DAY_OF_YEAR;
                int iT4 = temporalAccessor.t(aVar);
                int iK = k(iT4, iB3);
                int iA = a(iK, iT4);
                if (iA == 0) {
                    iT3--;
                } else {
                    if (iA >= a(iK, this.b.e() + ((int) temporalAccessor.z(aVar).d()))) {
                        iT3++;
                    }
                }
                return iT3;
            }
            iC = c(temporalAccessor);
        }
        return iC;
    }

    @Override // j$.time.temporal.n
    public final r p() {
        return this.e;
    }

    @Override // j$.time.temporal.n
    public final boolean t(TemporalAccessor temporalAccessor) {
        if (!temporalAccessor.e(a.DAY_OF_WEEK)) {
            return false;
        }
        ChronoUnit chronoUnit = ChronoUnit.WEEKS;
        Enum r1 = this.d;
        if (r1 == chronoUnit) {
            return true;
        }
        if (r1 == ChronoUnit.MONTHS) {
            return temporalAccessor.e(a.DAY_OF_MONTH);
        }
        if (r1 == ChronoUnit.YEARS) {
            return temporalAccessor.e(a.DAY_OF_YEAR);
        }
        if (r1 == t.h) {
            return temporalAccessor.e(a.DAY_OF_YEAR);
        }
        if (r1 == ChronoUnit.FOREVER) {
            return temporalAccessor.e(a.YEAR);
        }
        return false;
    }

    public final String toString() {
        return this.a + "[" + this.b.toString() + "]";
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [j$.time.temporal.TemporalUnit, java.lang.Enum] */
    @Override // j$.time.temporal.n
    public final Temporal y(Temporal temporal, long j) {
        if (this.e.a(j, this) == temporal.t(this)) {
            return temporal;
        }
        if (this.d != ChronoUnit.FOREVER) {
            return temporal.f(r0 - r1, this.c);
        }
        t tVar = this.b;
        int iT = temporal.t(tVar.c);
        int iT2 = temporal.t(tVar.e);
        InterfaceC0026b interfaceC0026bN = AbstractC0033i.p(temporal).n((int) j);
        int iK = k(1, b(interfaceC0026bN));
        int i2 = iT - 1;
        return interfaceC0026bN.f(((Math.min(iT2, a(iK, tVar.e() + interfaceC0026bN.D()) - 1) - 1) * 7) + i2 + (-iK), (TemporalUnit) ChronoUnit.DAYS);
    }

    @Override // j$.time.temporal.n
    public final r z(TemporalAccessor temporalAccessor) {
        ChronoUnit chronoUnit = ChronoUnit.WEEKS;
        Enum r1 = this.d;
        if (r1 == chronoUnit) {
            return this.e;
        }
        if (r1 == ChronoUnit.MONTHS) {
            return i(temporalAccessor, a.DAY_OF_MONTH);
        }
        if (r1 == ChronoUnit.YEARS) {
            return i(temporalAccessor, a.DAY_OF_YEAR);
        }
        if (r1 == t.h) {
            return j(temporalAccessor);
        }
        if (r1 == ChronoUnit.FOREVER) {
            return a.YEAR.p();
        }
        throw new IllegalStateException(j$.time.f.a("unreachable, rangeUnit: ", String.valueOf(r1), ", this: ", String.valueOf(this)));
    }
}
