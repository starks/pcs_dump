package j$.time.format;

import j$.util.Objects;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;

/* loaded from: classes2.dex */
final class g extends k {
    private final boolean g;

    g(j$.time.temporal.a aVar, int i, int i2, boolean z) {
        this(aVar, i, i2, z, 0);
        Objects.a(aVar, "field");
        if (!aVar.p().g()) {
            throw new IllegalArgumentException("Field must have a fixed set of values: ".concat(String.valueOf(aVar)));
        }
        if (i < 0 || i > 9) {
            throw new IllegalArgumentException("Minimum width must be from 0 to 9 inclusive but was " + i);
        }
        if (i2 < 1 || i2 > 9) {
            throw new IllegalArgumentException("Maximum width must be from 1 to 9 inclusive but was " + i2);
        }
        if (i2 >= i) {
            return;
        }
        throw new IllegalArgumentException("Maximum width must exceed or equal the minimum width but " + i2 + " < " + i);
    }

    @Override // j$.time.format.k
    final k c() {
        if (this.e == -1) {
            return this;
        }
        return new g(this.a, this.b, this.c, this.g, -1);
    }

    @Override // j$.time.format.k
    final k d(int i) {
        return new g(this.a, this.b, this.c, this.g, this.e + i);
    }

    @Override // j$.time.format.k, j$.time.format.f
    public final boolean g(v vVar, StringBuilder sb) {
        j$.time.temporal.n nVar = this.a;
        Long lE = vVar.e(nVar);
        if (lE == null) {
            return false;
        }
        z zVarB = vVar.b();
        long jLongValue = lE.longValue();
        j$.time.temporal.r rVarP = nVar.p();
        rVarP.b(jLongValue, nVar);
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(rVarP.e());
        BigDecimal bigDecimalAdd = BigDecimal.valueOf(rVarP.d()).subtract(bigDecimalValueOf).add(BigDecimal.ONE);
        BigDecimal bigDecimalSubtract = BigDecimal.valueOf(jLongValue).subtract(bigDecimalValueOf);
        RoundingMode roundingMode = RoundingMode.FLOOR;
        BigDecimal bigDecimalDivide = bigDecimalSubtract.divide(bigDecimalAdd, 9, roundingMode);
        BigDecimal bigDecimal = BigDecimal.ZERO;
        if (bigDecimalDivide.compareTo(bigDecimal) != 0) {
            bigDecimal = bigDecimalDivide.signum() == 0 ? new BigDecimal(BigInteger.ZERO, 0) : bigDecimalDivide.stripTrailingZeros();
        }
        int iScale = bigDecimal.scale();
        boolean z = this.g;
        int i = this.b;
        if (iScale != 0) {
            String strSubstring = bigDecimal.setScale(Math.min(Math.max(bigDecimal.scale(), i), this.c), roundingMode).toPlainString().substring(2);
            zVarB.getClass();
            if (z) {
                sb.append('.');
            }
            sb.append(strSubstring);
            return true;
        }
        if (i <= 0) {
            return true;
        }
        if (z) {
            zVarB.getClass();
            sb.append('.');
        }
        for (int i2 = 0; i2 < i; i2++) {
            zVarB.getClass();
            sb.append('0');
        }
        return true;
    }

    @Override // j$.time.format.k
    public final String toString() {
        String str = this.g ? ",DecimalPoint" : "";
        return "Fraction(" + String.valueOf(this.a) + "," + this.b + "," + this.c + str + ")";
    }

    g(j$.time.temporal.n nVar, int i, int i2, boolean z, int i3) {
        super(nVar, i, i2, B.NOT_NEGATIVE, i3);
        this.g = z;
    }
}
