package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class eck {
    public static final int a = 1;
    public static final int b = 2;
    public static final int c = 3;
    public static final int d = 4;
    public static final int e = 5;
    private static final /* synthetic */ int[] f = {a, b, c, d, e};

    public static /* synthetic */ String a(int i) {
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? "null" : "KIND_NOT_SET" : "EMPTY_REQUEST_ERROR" : "GET_CHUNKS_RESPONSE" : "SELECT_FILE_RESPONSE" : "SELECT_DATABASE_RESPONSE";
    }

    public static int b(int i) {
        if (i == 0) {
            return e;
        }
        if (i == 1) {
            return a;
        }
        if (i == 2) {
            return b;
        }
        if (i == 3) {
            return c;
        }
        if (i != 4) {
            return 0;
        }
        return d;
    }

    public static int[] values$ar$edu$a34335b2_0() {
        return new int[]{a, b, c, d, e};
    }
}
