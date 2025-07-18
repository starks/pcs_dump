package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ecs {
    public static final int a = 1;
    public static final int b = 2;
    public static final int c = 3;
    private static final /* synthetic */ int[] d = {a, b, c};

    public static /* synthetic */ String a(int i) {
        return i != 1 ? i != 2 ? i != 3 ? "null" : "OUTCOME_NOT_SET" : "ERROR" : "SUCCESS";
    }

    public static int b(int i) {
        if (i == 0) {
            return c;
        }
        if (i == 1) {
            return a;
        }
        if (i != 2) {
            return 0;
        }
        return b;
    }

    public static int[] values$ar$edu$d2d3f576_0() {
        return new int[]{a, b, c};
    }
}
