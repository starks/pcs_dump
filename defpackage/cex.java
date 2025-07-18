package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cex {
    public static final int a = 2;
    public static final int b = 3;
    public static final int c = 4;
    public static final int d = 5;
    public static final int e = 6;
    public static final int f = 7;
    public static final int g = 8;
    public static final int h = 9;
    public static final int i = 10;
    public static final int j = 11;
    public static final int k = 12;
    public static final int l = 13;
    public static final int m = 14;

    @Deprecated
    public static final int n = 15;
    public static final int o = 16;
    public static final int p = 1;
    private static final /* synthetic */ int[] q = {a, b, c, d, e, f, g, h, i, j, k, l, m, n, o, p};

    public static int a(int i2) {
        if (i2 == 0) {
            throw null;
        }
        if (i2 != p) {
            return i2 - 2;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    public static int b(int i2) {
        switch (i2) {
            case 0:
                return a;
            case 1:
                return b;
            case 2:
                return c;
            case 3:
                return d;
            case 4:
                return e;
            case 5:
                return f;
            case 6:
                return g;
            case 7:
                return h;
            case 8:
                return i;
            case 9:
                return j;
            case 10:
                return k;
            case 11:
                return l;
            case 12:
                return m;
            case 13:
                return n;
            case 14:
                return o;
            default:
                return 0;
        }
    }

    public static int[] values$ar$edu$21544a16_0() {
        return new int[]{a, b, c, d, e, f, g, h, i, j, k, l, m, n, o, p};
    }
}
