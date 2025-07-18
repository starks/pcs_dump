package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.view.View;
import android.view.ViewGroup;
import java.lang.ref.WeakReference;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class cp {
    static final co a = new co(new my(1));
    public static final int b = -100;
    private static Boolean f = null;
    public static boolean c = false;
    public static final nx d = new nx();
    public static final Object e = new Object();

    public static void i(cp cpVar) {
        synchronized (e) {
            nw nwVar = new nw(d);
            while (nwVar.hasNext()) {
                cp cpVar2 = (cp) ((WeakReference) nwVar.next()).get();
                if (cpVar2 == cpVar || cpVar2 == null) {
                    nwVar.remove();
                }
            }
        }
    }

    static boolean n(Context context) throws PackageManager.NameNotFoundException {
        if (f == null) {
            try {
                ServiceInfo serviceInfo = context.getPackageManager().getServiceInfo(new ComponentName(context, (Class<?>) di.class), 640);
                if (serviceInfo.metaData != null) {
                    f = Boolean.valueOf(serviceInfo.metaData.getBoolean("autoStoreLocales"));
                }
            } catch (PackageManager.NameNotFoundException unused) {
                f = false;
            }
        }
        return f.booleanValue();
    }

    public Context a() {
        throw null;
    }

    public abstract cc b();

    public abstract View c(int i);

    public abstract void d(View view, ViewGroup.LayoutParams layoutParams);

    public abstract void e();

    public abstract void f();

    public abstract void g();

    public abstract void h();

    public abstract void j(int i);

    public abstract void k(View view);

    public abstract void l(View view, ViewGroup.LayoutParams layoutParams);

    public abstract void m(CharSequence charSequence);

    public abstract void o();

    public abstract void p();

    public abstract void q(int i);
}
