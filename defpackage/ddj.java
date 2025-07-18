package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ddj {
    public static final ddm a;
    private static final String[] b = {"com.google.common.flogger.util.StackWalkerStackGetter", "com.google.common.flogger.util.JavaLangAccessStackGetter"};

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v8, types: [ddm] */
    static {
        ddn ddnVar;
        int i = 0;
        while (true) {
            if (i >= 2) {
                ddnVar = new ddn();
                break;
            }
            ddnVar = null;
            try {
                ddnVar = (ddm) Class.forName(b[i]).asSubclass(ddm.class).getDeclaredConstructor(null).newInstance(null);
            } catch (Throwable unused) {
            }
            if (ddnVar != null) {
                break;
            } else {
                i++;
            }
        }
        a = ddnVar;
    }
}
