package defpackage;

import java.io.InputStream;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class eee {
    public static final /* synthetic */ int f = 0;
    private static volatile int g = 100;
    public int a;
    int b;
    int c = g;
    public int d = Integer.MAX_VALUE;
    public fdu e;

    public static int H(int i) {
        return (i >>> 1) ^ (-(i & 1));
    }

    public static long I(long j) {
        return (j >>> 1) ^ (-(1 & j));
    }

    public static eee J(InputStream inputStream) {
        return inputStream == null ? K(efn.b) : new eed(inputStream);
    }

    public static eee K(byte[] bArr) {
        int length = bArr.length;
        return P(bArr, 0);
    }

    static eee L(byte[] bArr, int i, int i2, boolean z) {
        eeb eebVar = new eeb(bArr, i, i2);
        try {
            eebVar.e(i2);
            return eebVar;
        } catch (efp e) {
            throw new IllegalArgumentException(e);
        }
    }

    public static eee P(byte[] bArr, int i) {
        return L(bArr, 0, i, false);
    }

    public abstract void A(int i);

    public abstract boolean C();

    public abstract boolean D();

    public abstract boolean E(int i);

    public abstract byte[] F();

    public final void M() throws efp {
        if (this.a + this.b >= this.c) {
            throw new efp("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
    }

    public final void N() {
        if (this.b == 0) {
            z(0);
        }
    }

    public final void O() throws efp {
        int iM;
        do {
            iM = m();
            if (iM == 0) {
                return;
            }
            M();
            this.b++;
            this.b--;
        } while (E(iM));
    }

    public abstract double b();

    public abstract float c();

    public abstract int d();

    public abstract int e(int i);

    public abstract int f();

    public abstract int g();

    public abstract int h();

    public abstract int j();

    public abstract int k();

    public abstract int l();

    public abstract int m();

    public abstract int n();

    public abstract long o();

    public abstract long p();

    public abstract long r();

    public abstract long t();

    public abstract long u();

    public abstract long v();

    public abstract eea w();

    public abstract String x();

    public abstract String y();

    public abstract void z(int i);
}
