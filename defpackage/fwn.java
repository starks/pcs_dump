package defpackage;

import android.content.Context;
import android.util.Log;
import j$.util.DesugarCollections;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class fwn {
    public static final /* synthetic */ int a = 0;
    private static final String b = "fwn";

    public static List c(Context context) throws NoSuchMethodException, SecurityException {
        String string;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        int identifier = context.getResources().getIdentifier("CronetProviderClassName", "string", context.getPackageName());
        if (identifier != 0 && (string = context.getString(identifier)) != null && !string.equals("com.google.android.gms.net.PlayServicesCronetProvider") && !string.equals("com.google.android.gms.net.GmsCoreCronetProvider") && !string.equals("org.chromium.net.impl.JavaCronetProvider") && !string.equals("org.chromium.net.impl.NativeCronetProvider") && !g(context, string, 1, linkedHashSet, true)) {
            Log.e(b, a.z(string, "Unable to instantiate Cronet implementation class ", " that is listed as in the app string resource file under CronetProviderClassName key"));
        }
        g(context, "com.google.android.gms.net.PlayServicesCronetProvider", 3, linkedHashSet, false);
        g(context, "com.google.android.gms.net.GmsCoreCronetProvider", 3, linkedHashSet, false);
        g(context, "org.chromium.net.impl.NativeCronetProvider", 2, linkedHashSet, false);
        g(context, "org.chromium.net.impl.JavaCronetProvider", 4, linkedHashSet, false);
        return DesugarCollections.unmodifiableList(new ArrayList(linkedHashSet));
    }

    private static void f(String str, boolean z, Exception exc) {
        if (z) {
            Log.e(b, "Unable to load provider class: ".concat(str), exc);
        }
    }

    private static boolean g(Context context, String str, int i, Set set, boolean z) throws NoSuchMethodException, SecurityException {
        try {
            Constructor constructor = context.getClassLoader().loadClass(str).asSubclass(fwn.class).getConstructor(Context.class);
            fwm fwmVar = new fwm();
            fwmVar.a = (fwn) constructor.newInstance(context);
            fwmVar.b = i;
            set.add(fwmVar);
            return true;
        } catch (ClassNotFoundException e) {
            f(str, z, e);
            return false;
        } catch (IllegalAccessException e2) {
            f(str, z, e2);
            return false;
        } catch (InstantiationException e3) {
            f(str, z, e3);
            return false;
        } catch (NoSuchMethodException e4) {
            f(str, z, e4);
            return false;
        } catch (InvocationTargetException e5) {
            f(str, z, e5);
            return false;
        }
    }

    public abstract String a();

    public abstract String b();

    public abstract boolean d();

    public abstract ekf e();

    public final String toString() {
        throw null;
    }
}
