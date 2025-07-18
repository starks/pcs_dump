package android.support.v7.app;

import android.R;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import defpackage.gr;
import defpackage.gt;
import defpackage.gu;
import defpackage.hg;
import defpackage.hy;
import defpackage.oc;
import java.lang.reflect.Constructor;

/* compiled from: PG */
/* loaded from: classes.dex */
public class AppCompatViewInflater {
    public final Object[] c = new Object[2];
    private static final Class[] d = {Context.class, AttributeSet.class};
    public static final int[] a = {R.attr.onClick};
    public static final String[] b = {"android.widget.", "android.view.", "android.webkit."};
    private static final oc e = new oc();

    public gr a(Context context, AttributeSet attributeSet) {
        return new gr(context, attributeSet);
    }

    public gt b(Context context, AttributeSet attributeSet) {
        return new gt(context, attributeSet);
    }

    public gu c(Context context, AttributeSet attributeSet) {
        return new gu(context, attributeSet);
    }

    public hg d(Context context, AttributeSet attributeSet) {
        return new hg(context, attributeSet);
    }

    public hy e(Context context, AttributeSet attributeSet) {
        return new hy(context, attributeSet);
    }

    public final View f(Context context, String str, String str2) throws NoSuchMethodException, SecurityException {
        String str3;
        oc ocVar = e;
        Constructor constructor = (Constructor) ocVar.get(str);
        if (constructor == null) {
            if (str2 != null) {
                try {
                    str3 = str2 + str;
                } catch (Exception unused) {
                    return null;
                }
            } else {
                str3 = str;
            }
            constructor = Class.forName(str3, false, context.getClassLoader()).asSubclass(View.class).getConstructor(d);
            ocVar.put(str, constructor);
        }
        constructor.setAccessible(true);
        return (View) constructor.newInstance(this.c);
    }
}
