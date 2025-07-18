package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Trace;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class sd {
    public static final sf a;
    public static final ob b;

    static {
        agf.a("TypefaceCompat static init");
        a = new se();
        b = new ob(16);
        Trace.endSection();
    }

    public static Typeface a(Context context, Resources resources, int i, String str, int i2, int i3) {
        Typeface typefaceC = a.c(context, resources, i);
        if (typefaceC != null) {
            b.b(b(resources, i, str, i2, i3), typefaceC);
        }
        return typefaceC;
    }

    public static String b(Resources resources, int i, String str, int i2, int i3) {
        return resources.getResourcePackageName(i) + '-' + str + '-' + i2 + '-' + i + '-' + i3;
    }
}
