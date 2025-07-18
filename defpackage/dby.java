package defpackage;

import java.lang.reflect.InvocationTargetException;

/* compiled from: PG */
/* loaded from: classes.dex */
final class dby {
    public static final dca a = a(dca.d);

    private static dca a(String[] strArr) {
        dcj dcjVar;
        try {
            dcjVar = dck.a;
        } catch (NoClassDefFoundError unused) {
            dcjVar = null;
        }
        if (dcjVar != null) {
            return dcjVar;
        }
        StringBuilder sb = new StringBuilder();
        for (String str : strArr) {
            try {
                return (dca) Class.forName(str).getConstructor(null).newInstance(null);
            } catch (Throwable th) {
                th = th;
                sb.append('\n');
                sb.append(str);
                sb.append(": ");
                if (th instanceof InvocationTargetException) {
                    th = th.getCause();
                }
                sb.append(th);
            }
        }
        throw new IllegalStateException(sb.insert(0, "No logging platforms found:").toString());
    }
}
