package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bct {
    public static final int a = 2;
    public static final int b = 3;
    public static final int c = 4;
    public static final int d = 6;
    public static final int e = 1;
    private static final /* synthetic */ int[] f = {a, b, c, d, e};

    public static int a(int i) {
        if (i == 0) {
            throw null;
        }
        if (i != e) {
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
        if (i != 4) {
            return 0;
        }
        return d;
    }

    public static int[] values$ar$edu$279c354c_0() {
        return new int[]{a, b, c, d, e};
    }
}
