package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.RadioButton;
import com.google.android.as.oss.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public class hg extends RadioButton {
    private final gx a;
    private final gs b;
    private final hu c;
    private ayo d;

    public hg(Context context, AttributeSet attributeSet) {
        super(lb.a(context), attributeSet, R.attr.radioButtonStyle);
        kz.d(this, getContext());
        gx gxVar = new gx(this);
        this.a = gxVar;
        gxVar.b(attributeSet, R.attr.radioButtonStyle);
        gs gsVar = new gs(this);
        this.b = gsVar;
        gsVar.b(attributeSet, R.attr.radioButtonStyle);
        hu huVar = new hu(this);
        this.c = huVar;
        huVar.c(attributeSet, R.attr.radioButtonStyle);
        a().p(attributeSet, R.attr.radioButtonStyle);
    }

    private final ayo a() {
        if (this.d == null) {
            this.d = new ayo(this);
        }
        return this.d;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected final void drawableStateChanged() {
        super.drawableStateChanged();
        gs gsVar = this.b;
        if (gsVar != null) {
            gsVar.a();
        }
        hu huVar = this.c;
        if (huVar != null) {
            huVar.a();
        }
    }

    @Override // android.widget.TextView
    public final void setAllCaps(boolean z) {
        super.setAllCaps(z);
        a().q(z);
    }

    @Override // android.view.View
    public final void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        gs gsVar = this.b;
        if (gsVar != null) {
            gsVar.e();
        }
    }

    @Override // android.view.View
    public final void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        gs gsVar = this.b;
        if (gsVar != null) {
            gsVar.c(i);
        }
    }

    @Override // android.widget.CompoundButton
    public final void setButtonDrawable(int i) {
        setButtonDrawable(a.t(getContext(), i));
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        hu huVar = this.c;
        if (huVar != null) {
            huVar.a();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        hu huVar = this.c;
        if (huVar != null) {
            huVar.a();
        }
    }

    @Override // android.widget.TextView
    public final void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(a().r(inputFilterArr));
    }

    @Override // android.widget.CompoundButton
    public final void setButtonDrawable(Drawable drawable) {
        super.setButtonDrawable(drawable);
        gx gxVar = this.a;
        if (gxVar != null) {
            gxVar.c();
        }
    }
}
