package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
abstract class uk {
    private final int a;
    private final Class b;
    private final int c;

    public uk(int i, Class cls, int i2) {
        this.a = i;
        this.b = cls;
        this.c = i2;
    }

    public abstract Object a(View view);

    public abstract void b(View view, Object obj);

    final Object c(View view) {
        return a(view);
    }

    final void d(View view, Object obj) {
        b(view, obj);
    }

    public uk(int i, Class cls) {
        this(i, cls, 0);
    }
}
