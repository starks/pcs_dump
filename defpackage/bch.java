package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bch {
    public static final int a = 2;
    public static final int b = 3;
    public static final int c = 4;
    public static final int d = 5;
    public static final int e = 6;
    public static final int f = 1;
    private static final /* synthetic */ int[] g = {a, b, c, d, e, f};

    public static int a(int i) {
        if (i == 0) {
            throw null;
        }
        if (i != f) {
            return i - 2;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    public static int[] values$ar$edu$e115c9f3_0() {
        return new int[]{a, b, c, d, e, f};
    }
}
