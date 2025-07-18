package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class tz {
    public int a;
    public int b;

    public final int a() {
        return this.b | this.a;
    }

    public final void b(View view, View view2, int i) {
        c(i, 0);
    }

    public final void c(int i, int i2) {
        if (i2 == 1) {
            this.b = i;
        } else {
            this.a = i;
        }
    }

    public final void d(int i) {
        if (i == 1) {
            this.b = 0;
        } else {
            this.a = 0;
        }
    }

    public final tz e(km kmVar) {
        View view = kmVar.a;
        this.b = view.getLeft();
        this.a = view.getTop();
        view.getRight();
        view.getBottom();
        return this;
    }
}
