package defpackage;

import android.graphics.Typeface;
import android.os.Handler;
import android.os.Looper;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class rv {
    public static Handler e() {
        return new Handler(Looper.getMainLooper());
    }

    public abstract void a(int i);

    public abstract void b(Typeface typeface);

    public final void c(int i) {
        e().post(new sp(this, i, 1));
    }

    public final void d(Typeface typeface) {
        e().post(new o(this, typeface, 12));
    }
}
