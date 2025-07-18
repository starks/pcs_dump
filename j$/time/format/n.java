package j$.time.format;

import j$.time.LocalDate;
import j$.time.chrono.AbstractC0033i;

/* loaded from: classes2.dex */
final class n extends k {
    static final LocalDate h = LocalDate.i0(2000, 1, 1);
    private final LocalDate g;

    /* synthetic */ n(j$.time.temporal.n nVar, LocalDate localDate, int i) {
        this(nVar, 2, 2, localDate, i);
    }

    @Override // j$.time.format.k
    final long b(v vVar, long j) {
        long jAbs = Math.abs(j);
        LocalDate localDate = this.g;
        long jT = localDate != null ? AbstractC0033i.p(vVar.d()).v(localDate).t(this.a) : 0;
        long[] jArr = k.f;
        if (j >= jT) {
            long j2 = jArr[this.b];
            if (j < jT + j2) {
                return jAbs % j2;
            }
        }
        return jAbs % jArr[this.c];
    }

    @Override // j$.time.format.k
    final k c() {
        if (this.e == -1) {
            return this;
        }
        return new n(this.a, this.b, this.c, this.g, -1);
    }

    @Override // j$.time.format.k
    final k d(int i) {
        int i2 = this.e + i;
        return new n(this.a, this.b, this.c, this.g, i2);
    }

    @Override // j$.time.format.k
    public final String toString() {
        String strValueOf = String.valueOf(this.a);
        Object obj = this.g;
        return "ReducedValue(" + strValueOf + "," + this.b + "," + this.c + "," + String.valueOf(obj != null ? obj : 0) + ")";
    }

    n(j$.time.temporal.n nVar, LocalDate localDate) {
        this(nVar, 2, 2, localDate, 0);
        if (localDate == null) {
            long j = 0;
            if (!nVar.p().i(j)) {
                throw new IllegalArgumentException("The base value must be within the range of the field");
            }
            if (j + k.f[2] > 2147483647L) {
                throw new j$.time.c("Unable to add printer-parser as the range exceeds the capacity of an int");
            }
        }
    }

    private n(j$.time.temporal.n nVar, int i, int i2, LocalDate localDate, int i3) {
        super(nVar, i, i2, B.NOT_NEGATIVE, i3);
        this.g = localDate;
    }
}
