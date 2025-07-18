package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ddn implements ddm {
    private static final int c(StackTraceElement[] stackTraceElementArr, Class cls) {
        String name = cls.getName();
        boolean z = false;
        for (int i = 3; i < stackTraceElementArr.length; i++) {
            if (stackTraceElementArr[i].getClassName().equals(name)) {
                z = true;
            } else if (z) {
                return i;
            }
        }
        return -1;
    }

    @Override // defpackage.ddm
    public final StackTraceElement a(Class cls) {
        cnx.U(true, "skipFrames must be >= 0");
        StackTraceElement[] stackTrace = new Throwable().getStackTrace();
        int iC = c(stackTrace, cls);
        if (iC != -1) {
            return stackTrace[iC];
        }
        return null;
    }

    @Override // defpackage.ddm
    public final StackTraceElement[] b(Class cls, int i) {
        cnx.U(i == -1 || i > 0, "maxDepth must be > 0 or -1");
        cnx.U(true, "skipFrames must be >= 0");
        StackTraceElement[] stackTrace = new Throwable().getStackTrace();
        int iC = c(stackTrace, cls);
        if (iC == -1) {
            return new StackTraceElement[0];
        }
        int length = stackTrace.length - iC;
        if (i <= 0 || i >= length) {
            i = length;
        }
        StackTraceElement[] stackTraceElementArr = new StackTraceElement[i];
        System.arraycopy(stackTrace, iC, stackTraceElementArr, 0, i);
        return stackTraceElementArr;
    }
}
