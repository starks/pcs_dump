package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fpb {
    private static final StackTraceElement a;
    private static final String b;

    static {
        Object objB;
        Object objB2;
        Exception exc = new Exception();
        String simpleName = a.class.getSimpleName();
        simpleName.getClass();
        StackTraceElement stackTraceElement = exc.getStackTrace()[0];
        a = new StackTraceElement("_COROUTINE." + simpleName, "_", stackTraceElement.getFileName(), stackTraceElement.getLineNumber());
        try {
            objB = Class.forName("fhx").getCanonicalName();
        } catch (Throwable th) {
            objB = ffh.b(th);
        }
        if (ffu.a(objB) != null) {
            objB = "kotlin.coroutines.jvm.internal.BaseContinuationImpl";
        }
        b = (String) objB;
        try {
            objB2 = Class.forName("fpb").getCanonicalName();
        } catch (Throwable th2) {
            objB2 = ffh.b(th2);
        }
        if (ffu.a(objB2) != null) {
            objB2 = "kotlinx.coroutines.internal.StackTraceRecoveryKt";
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0036  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Throwable a(java.lang.Throwable r10, defpackage.fia r11) {
        /*
            Method dump skipped, instructions count: 333
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fpb.a(java.lang.Throwable, fia):java.lang.Throwable");
    }

    public static final Throwable b(Throwable th) {
        Throwable cause = th.getCause();
        if (cause != null) {
            if (fjs.c(cause.getClass(), th.getClass())) {
                for (StackTraceElement stackTraceElement : th.getStackTrace()) {
                    if (c(stackTraceElement)) {
                        return cause;
                    }
                }
            }
        }
        return th;
    }

    public static final boolean c(StackTraceElement stackTraceElement) {
        return fjz.E(stackTraceElement.getClassName(), "_COROUTINE");
    }
}
