package defpackage;

import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;

/* compiled from: PG */
/* loaded from: classes.dex */
final class clk extends aic {
    final /* synthetic */ cln b;

    public clk(cln clnVar) {
        this.b = clnVar;
    }

    @Override // defpackage.aic
    public final void b(Drawable drawable) {
        ColorStateList colorStateList = this.b.b;
        if (colorStateList != null) {
            drawable.setTintList(colorStateList);
        }
    }

    @Override // defpackage.aic
    public final void c(Drawable drawable) {
        cln clnVar = this.b;
        ColorStateList colorStateList = clnVar.b;
        if (colorStateList != null) {
            drawable.setTint(colorStateList.getColorForState(clnVar.d, colorStateList.getDefaultColor()));
        }
    }
}
