package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ccn {
    public static final int a = 2;
    public static final int b = 3;
    public static final int c = 4;
    public static final int d = 5;
    public static final int e = 6;
    public static final int f = 7;
    public static final int g = 1;
    private static final /* synthetic */ int[] h = {a, b, c, d, e, f, g};

    public static int a(int i) {
        if (i == 0) {
            throw null;
        }
        if (i != g) {
            return i - 2;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    public static int b(int i) {
        if (i == 0) {
            return a;
        }
        if (i == 1) {
            return b;
        }
        if (i == 2) {
            return c;
        }
        if (i == 3) {
            return d;
        }
        if (i == 4) {
            return e;
        }
        if (i != 5) {
            return 0;
        }
        return f;
    }

    public static int[] values$ar$edu$7cc7eb9c_0() {
        return new int[]{a, b, c, d, e, f, g};
    }
}
