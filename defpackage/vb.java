package defpackage;

import android.view.WindowInsetsAnimation;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class vb {
    public final rz a;
    public final rz b;

    public vb(WindowInsetsAnimation.Bounds bounds) {
        this.a = rz.d(bounds.getLowerBound());
        this.b = rz.d(bounds.getUpperBound());
    }

    public final String toString() {
        return "Bounds{lower=" + this.a + " upper=" + this.b + "}";
    }
}
