package j$.time.temporal;

import j$.util.Objects;

/* loaded from: classes2.dex */
public abstract /* synthetic */ class k {
    static final p a = new o(0);
    static final p b = new o(1);
    static final p c = new o(2);
    static final p d = new o(3);
    static final p e = new o(4);
    static final p f = new o(5);
    static final p g = new o(6);

    public static int a(TemporalAccessor temporalAccessor, n nVar) {
        r rVarZ = temporalAccessor.z(nVar);
        if (!rVarZ.h()) {
            throw new q("Invalid field " + String.valueOf(nVar) + " for get() method, use getLong() instead");
        }
        long jI = temporalAccessor.I(nVar);
        if (rVarZ.i(jI)) {
            return (int) jI;
        }
        throw new j$.time.c("Invalid value for " + String.valueOf(nVar) + " (valid values " + String.valueOf(rVarZ) + "): " + jI);
    }

    public static Temporal b(Temporal temporal, long j, TemporalUnit temporalUnit) {
        long j2;
        if (j == Long.MIN_VALUE) {
            temporal = temporal.f(Long.MAX_VALUE, temporalUnit);
            j2 = 1;
        } else {
            j2 = -j;
        }
        return temporal.f(j2, temporalUnit);
    }

    public static Object c(TemporalAccessor temporalAccessor, p pVar) {
        if (pVar == a || pVar == b || pVar == c) {
            return null;
        }
        return pVar.a(temporalAccessor);
    }

    public static r d(TemporalAccessor temporalAccessor, n nVar) {
        if (!(nVar instanceof a)) {
            Objects.a(nVar, "field");
            return nVar.z(temporalAccessor);
        }
        if (temporalAccessor.e(nVar)) {
            return ((a) nVar).p();
        }
        throw new q("Unsupported field: ".concat(String.valueOf(nVar)));
    }

    public static p e() {
        return b;
    }

    public static p f() {
        return f;
    }

    public static p g() {
        return g;
    }

    public static p h() {
        return d;
    }

    public static p i() {
        return c;
    }

    public static p j() {
        return e;
    }

    public static p k() {
        return a;
    }
}
