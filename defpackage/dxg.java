package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dxg {
    public static final int a = 2;
    public static final int b = 3;
    public static final int c = 4;
    public static final int d = 5;
    public static final int e = 6;
    public static final int f = 7;
    public static final int g = 8;
    public static final int h = 1;
    private static final /* synthetic */ int[] i = {a, b, c, d, e, f, g, h};

    public static int a(int i2) {
        if (i2 == 0) {
            throw null;
        }
        if (i2 != h) {
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
            default:
                return 0;
        }
    }

    public static int[] values$ar$edu$94e9c90b_0() {
        return new int[]{a, b, c, d, e, f, g, h};
    }
}
