package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cau {
    public static final int a = 1;
    public static final int b = 2;
    public static final int c = 3;
    public static final int d = 4;
    public static final int e = 5;
    public static final int f = 6;
    private static final /* synthetic */ int[] g = {a, b, c, d, e, f};

    public static /* synthetic */ String a(int i) {
        switch (i) {
            case 1:
                return "NONE";
            case 2:
                return "WARN";
            case 3:
                return "HIDE";
            case 4:
                return "UNKNOWN";
            case 5:
                return "NOT_AVAILABLE";
            case 6:
                return "DELETE";
            default:
                return "null";
        }
    }

    public static /* synthetic */ int b(int i) {
        if (i != 0) {
            return i;
        }
        throw null;
    }

    public static int[] values$ar$edu$803c3a76_0() {
        return new int[]{a, b, c, d, e, f};
    }
}
