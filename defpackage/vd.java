package defpackage;

import android.view.WindowInsetsAnimation;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class vd extends ve {
    private final WindowInsetsAnimation a;

    public vd(WindowInsetsAnimation windowInsetsAnimation) {
        super(0, null);
        this.a = windowInsetsAnimation;
    }

    @Override // defpackage.ve
    public final float a() {
        return this.a.getInterpolatedFraction();
    }

    @Override // defpackage.ve
    public final int b() {
        return this.a.getTypeMask();
    }

    @Override // defpackage.ve
    public final void c(float f) {
        this.a.setFraction(f);
    }
}
