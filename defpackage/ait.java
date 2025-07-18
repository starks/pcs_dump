package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ait {
    public static final int a = 1;
    public static final int b = 2;
    public static final int c = 3;
    public static final int d = 4;
    private static final /* synthetic */ int[] e = {a, b, c, d};

    public static /* synthetic */ String a(int i) {
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? "null" : "VALUE_NOT_SET" : "BOOL_VALUE" : "NUM_VALUE" : "STR_VALUE";
    }

    public static int b(int i) {
        if (i == 0) {
            return d;
        }
        if (i == 2) {
            return a;
        }
        if (i == 3) {
            return b;
        }
        if (i != 4) {
            return 0;
        }
        return c;
    }

    public static int[] values$ar$edu$979d8e23_0() {
        return new int[]{a, b, c, d};
    }
}
