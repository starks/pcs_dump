package defpackage;

import android.content.Context;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bzg {
    public static final bht a = bht.d;
    public static final Object b = new Object();
    private static Method d = null;
    public static boolean c = false;

    public static void a(Context context, Context context2, String str) throws IllegalAccessException, bil, IllegalArgumentException, InvocationTargetException {
        try {
            if (d == null) {
                d = context.getClassLoader().loadClass(str).getMethod("insertProvider", Context.class);
            }
            d.invoke(null, context);
        } catch (Exception e) {
            Throwable cause = e.getCause();
            if (Log.isLoggable("ProviderInstaller", 6)) {
                Log.e("ProviderInstaller", "Failed to install provider: ".concat(String.valueOf(cause == null ? e.toString() : cause.toString())));
            }
            throw new bil();
        }
    }
}
