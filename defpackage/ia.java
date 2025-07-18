package defpackage;

import android.R;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.ToggleButton;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ia extends ToggleButton {
    private final gs a;
    private final hu b;
    private ayo c;

    public ia(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.buttonStyleToggle);
        kz.d(this, getContext());
        gs gsVar = new gs(this);
        this.a = gsVar;
        gsVar.b(attributeSet, R.attr.buttonStyleToggle);
        hu huVar = new hu(this);
        this.b = huVar;
        huVar.c(attributeSet, R.attr.buttonStyleToggle);
        a().p(attributeSet, R.attr.buttonStyleToggle);
    }

    private final ayo a() {
        if (this.c == null) {
            this.c = new ayo(this);
        }
        return this.c;
    }

    @Override // android.widget.ToggleButton, android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected final void drawableStateChanged() {
        super.drawableStateChanged();
        gs gsVar = this.a;
        if (gsVar != null) {
            gsVar.a();
        }
        hu huVar = this.b;
        if (huVar != null) {
            huVar.a();
        }
    }

    @Override // android.widget.TextView
    public final void setAllCaps(boolean z) {
        super.setAllCaps(z);
        a().q(z);
    }

    @Override // android.widget.ToggleButton, android.view.View
    public final void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        gs gsVar = this.a;
        if (gsVar != null) {
            gsVar.e();
        }
    }

    @Override // android.view.View
    public final void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        gs gsVar = this.a;
        if (gsVar != null) {
            gsVar.c(i);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        hu huVar = this.b;
        if (huVar != null) {
            huVar.a();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        hu huVar = this.b;
        if (huVar != null) {
            huVar.a();
        }
    }

    @Override // android.widget.TextView
    public final void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(a().r(inputFilterArr));
    }
}
