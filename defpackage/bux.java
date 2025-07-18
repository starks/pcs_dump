package defpackage;

import android.content.Context;
import android.os.IInterface;
import java.lang.reflect.InvocationTargetException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bux {
    private static final Object a = new Object();
    private static volatile buu b;

    private bux() {
    }

    public static IInterface a(Context context, String str, buw buwVar) {
        return b(context).b(str, buwVar);
    }

    public static buu b(Context context) {
        buu buuVarC;
        buu buuVar = b;
        if (buuVar != null) {
            return buuVar;
        }
        synchronized (a) {
            buuVarC = b;
            if (buuVarC == null) {
                buuVarC = c(context);
                b = buuVarC;
            }
        }
        return buuVarC;
    }

    private static buu c(Context context) throws buv, ClassNotFoundException {
        Class<?> clsLoadClass;
        try {
            clsLoadClass = bux.class.getClassLoader().loadClass("buy");
        } catch (ClassNotFoundException unused) {
            clsLoadClass = null;
        }
        try {
            return (buu) clsLoadClass.getConstructor(Context.class).newInstance(context);
        } catch (IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e) {
            throw new buv("Failed to create dynamite loader instance: ".concat(String.valueOf(e.getMessage())), e);
        }
    }
}
