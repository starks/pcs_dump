package defpackage;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;

/* compiled from: PG */
/* loaded from: classes.dex */
final class aip extends Drawable.ConstantState {
    private final Drawable.ConstantState a;

    public aip(Drawable.ConstantState constantState) {
        this.a = constantState;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final boolean canApplyTheme() {
        return this.a.canApplyTheme();
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public int getChangingConfigurations() {
        return this.a.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        aiq aiqVar = new aiq();
        aiqVar.e = (VectorDrawable) this.a.newDrawable();
        return aiqVar;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        aiq aiqVar = new aiq();
        aiqVar.e = (VectorDrawable) this.a.newDrawable(resources);
        return aiqVar;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources, Resources.Theme theme) {
        aiq aiqVar = new aiq();
        aiqVar.e = (VectorDrawable) this.a.newDrawable(resources, theme);
        return aiqVar;
    }
}
