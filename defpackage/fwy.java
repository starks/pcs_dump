package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fwy {
    public static final int a = 1;
    public static final int b = 2;
    public static final int c = 3;
    public static final int d = 4;
    private static final /* synthetic */ int[] e = {a, b, c, d};

    public static /* synthetic */ String a(int i) {
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? "null" : "KIND_NOT_SET" : "INT64_LIST" : "FLOAT_LIST" : "BYTES_LIST";
    }

    public static int b(int i) {
        if (i == 0) {
            return d;
        }
        if (i == 1) {
            return a;
        }
        if (i == 2) {
            return b;
        }
        if (i != 3) {
            return 0;
        }
        return c;
    }

    public static int[] values$ar$edu$e126fd1e_0() {
        return new int[]{a, b, c, d};
    }
}
