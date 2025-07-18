package defpackage;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aig extends Drawable.ConstantState {
    private final Drawable.ConstantState a;

    public aig(Drawable.ConstantState constantState) {
        this.a = constantState;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final boolean canApplyTheme() {
        return this.a.canApplyTheme();
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        return this.a.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        aih aihVar = new aih();
        aihVar.e = this.a.newDrawable();
        aihVar.e.setCallback(aihVar.d);
        return aihVar;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        aih aihVar = new aih();
        aihVar.e = this.a.newDrawable(resources);
        aihVar.e.setCallback(aihVar.d);
        return aihVar;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources, Resources.Theme theme) {
        aih aihVar = new aih();
        aihVar.e = this.a.newDrawable(resources, theme);
        aihVar.e.setCallback(aihVar.d);
        return aihVar;
    }
}
