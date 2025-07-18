package defpackage;

import android.graphics.Insets;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class il {
    public static final Rect a = new Rect();

    public static Rect a(Drawable drawable) {
        Insets opticalInsets = drawable.getOpticalInsets();
        return new Rect(opticalInsets.left, opticalInsets.top, opticalInsets.right, opticalInsets.bottom);
    }

    static void b(Drawable drawable) {
        drawable.getClass().getName();
    }
}
