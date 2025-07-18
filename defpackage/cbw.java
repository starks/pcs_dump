package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cbw {
    private static final cxc c;
    public final int a;
    public final String b;

    static {
        int i = cxc.d;
        clq.w(true, "the total number of elements must fit in an int");
        Object[] objArr = new Object[17];
        objArr[0] = "OK";
        objArr[1] = "CANCELLED";
        objArr[2] = "UNKNOWN";
        objArr[3] = "INVALID_ARGUMENT";
        objArr[4] = "DEADLINE_EXCEEDED";
        objArr[5] = "NOT_FOUND";
        objArr[6] = "ALREADY_EXISTS";
        objArr[7] = "PERMISSION_DENIED";
        objArr[8] = "RESOURCE_EXHAUSTED";
        objArr[9] = "FAILED_PRECONDITION";
        objArr[10] = "ABORTED";
        objArr[11] = "OUT_OF_RANGE";
        System.arraycopy(new String[]{"UNIMPLEMENTED", "INTERNAL", "UNAVAILABLE", "DATA_LOSS", "UNAUTHENTICATED"}, 0, objArr, 12, 5);
        c = cxc.m(objArr);
    }

    public cbw(int i, String str) {
        this.a = i;
        this.b = str;
    }

    public static cbw a(int i, String str, Object... objArr) {
        return new cbw(i, String.format(str, objArr));
    }

    public static String b(int i) {
        if (i >= 0) {
            cxc cxcVar = c;
            if (i < ((cyp) cxcVar).c) {
                return (String) cxcVar.get(i);
            }
        }
        return a.x(i, "#");
    }

    public final String toString() {
        return this.b == null ? b(this.a) : String.format("%s: %s", b(this.a), this.b);
    }
}
