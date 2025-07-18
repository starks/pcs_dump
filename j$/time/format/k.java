package j$.time.format;

/* loaded from: classes2.dex */
class k implements f {
    static final long[] f = {0, 10, 100, 1000, 10000, 100000, 1000000, 10000000, 100000000, 1000000000, 10000000000L};
    final j$.time.temporal.n a;
    final int b;
    final int c;
    private final B d;
    final int e;

    k(j$.time.temporal.n nVar, int i, int i2, B b) {
        this.a = nVar;
        this.b = i;
        this.c = i2;
        this.d = b;
        this.e = 0;
    }

    long b(v vVar, long j) {
        return j;
    }

    k c() {
        if (this.e == -1) {
            return this;
        }
        return new k(this.a, this.b, this.c, this.d, -1);
    }

    k d(int i) {
        int i2 = this.e + i;
        return new k(this.a, this.b, this.c, this.d, i2);
    }

    @Override // j$.time.format.f
    public boolean g(v vVar, StringBuilder sb) {
        j$.time.temporal.n nVar = this.a;
        Long lE = vVar.e(nVar);
        if (lE == null) {
            return false;
        }
        long jB = b(vVar, lE.longValue());
        z zVarB = vVar.b();
        String string = jB == Long.MIN_VALUE ? "9223372036854775808" : Long.toString(Math.abs(jB));
        int length = string.length();
        int i = this.c;
        if (length > i) {
            throw new j$.time.c("Field " + String.valueOf(nVar) + " cannot be printed as the value " + jB + " exceeds the maximum print width of " + i);
        }
        zVarB.getClass();
        int i2 = this.b;
        B b = this.d;
        if (jB >= 0) {
            int i3 = AbstractC0039c.a[b.ordinal()];
            if (i3 != 1) {
                if (i3 == 2) {
                    sb.append('+');
                }
            } else if (i2 < 19 && jB >= f[i2]) {
                sb.append('+');
            }
        } else {
            int i4 = AbstractC0039c.a[b.ordinal()];
            if (i4 == 1 || i4 == 2 || i4 == 3) {
                sb.append('-');
            } else if (i4 == 4) {
                throw new j$.time.c("Field " + String.valueOf(nVar) + " cannot be printed as the value " + jB + " cannot be negative according to the SignStyle");
            }
        }
        for (int i5 = 0; i5 < i2 - string.length(); i5++) {
            sb.append('0');
        }
        sb.append(string);
        return true;
    }

    public String toString() {
        j$.time.temporal.n nVar = this.a;
        B b = this.d;
        int i = this.c;
        int i2 = this.b;
        if (i2 == 1 && i == 19 && b == B.NORMAL) {
            return "Value(" + String.valueOf(nVar) + ")";
        }
        if (i2 == i && b == B.NOT_NEGATIVE) {
            return "Value(" + String.valueOf(nVar) + "," + i2 + ")";
        }
        return "Value(" + String.valueOf(nVar) + "," + i2 + "," + i + "," + String.valueOf(b) + ")";
    }

    protected k(j$.time.temporal.n nVar, int i, int i2, B b, int i3) {
        this.a = nVar;
        this.b = i;
        this.c = i2;
        this.d = b;
        this.e = i3;
    }
}
