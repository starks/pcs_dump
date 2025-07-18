package defpackage;

import android.R;
import android.content.Context;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.util.Log;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public class hy extends TextView {
    private final gs a;
    private final hu b;
    private boolean c;
    private Typeface d;
    private Typeface e;
    private String f;
    private hv g;
    private ayo h;

    public hy(Context context) {
        this(context, null);
    }

    private final void a(Typeface typeface) {
        this.e = typeface;
        super.setTypeface(typeface);
    }

    private final ayo b() {
        if (this.h == null) {
            this.h = new ayo(this);
        }
        return this.h;
    }

    @Override // android.widget.TextView, android.view.View
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
    public final int getAutoSizeMaxTextSize() {
        return t().a();
    }

    @Override // android.widget.TextView
    public final int getAutoSizeMinTextSize() {
        return t().b();
    }

    @Override // android.widget.TextView
    public final int getAutoSizeStepGranularity() {
        return t().c();
    }

    @Override // android.widget.TextView
    public final int[] getAutoSizeTextAvailableSizes() {
        return t().m();
    }

    @Override // android.widget.TextView
    public final int getAutoSizeTextType() {
        return t().d() == 1 ? 1 : 0;
    }

    @Override // android.widget.TextView
    public final ActionMode.Callback getCustomSelectionActionModeCallback() {
        return vq.b(super.getCustomSelectionActionModeCallback());
    }

    @Override // android.widget.TextView
    public final int getFirstBaselineToTopHeight() {
        return getPaddingTop() - getPaint().getFontMetricsInt().top;
    }

    @Override // android.widget.TextView
    public final String getFontVariationSettings() {
        return this.f;
    }

    @Override // android.widget.TextView
    public final int getLastBaselineToBottomHeight() {
        return getPaddingBottom() + getPaint().getFontMetricsInt().bottom;
    }

    @Override // android.widget.TextView
    public final TextClassifier getTextClassifier() {
        return t().e();
    }

    @Override // android.widget.TextView
    public final Typeface getTypeface() {
        return this.d;
    }

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        a.s(inputConnectionOnCreateInputConnection, editorInfo, this);
        return inputConnectionOnCreateInputConnection;
    }

    @Override // android.widget.TextView, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
    }

    @Override // android.widget.TextView, android.view.View
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
    }

    @Override // android.widget.TextView
    public final void setAllCaps(boolean z) {
        super.setAllCaps(z);
        b().q(z);
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithConfiguration(int i, int i2, int i3, int i4) {
        t().f(i, i2, i3, i4);
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i) {
        t().g(iArr, i);
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeWithDefaults(int i) {
        t().h(i);
    }

    @Override // android.view.View
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
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        Context context = getContext();
        setCompoundDrawablesRelativeWithIntrinsicBounds(i != 0 ? a.t(context, i) : null, i2 != 0 ? a.t(context, i2) : null, i3 != 0 ? a.t(context, i3) : null, i4 != 0 ? a.t(context, i4) : null);
        hu huVar = this.b;
        if (huVar != null) {
            huVar.a();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        Context context = getContext();
        setCompoundDrawablesWithIntrinsicBounds(i != 0 ? a.t(context, i) : null, i2 != 0 ? a.t(context, i2) : null, i3 != 0 ? a.t(context, i3) : null, i4 != 0 ? a.t(context, i4) : null);
        hu huVar = this.b;
        if (huVar != null) {
            huVar.a();
        }
    }

    @Override // android.widget.TextView
    public final void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(b().r(inputFilterArr));
    }

    @Override // android.widget.TextView
    public final void setFirstBaselineToTopHeight(int i) {
        t().i(i);
    }

    @Override // android.widget.TextView
    public final boolean setFontVariationSettings(String str) {
        Typeface typeface = this.d;
        if (this.e != getPaint().getTypeface()) {
            Log.w("AppCompatTextView", "getPaint().getTypeface() changed unexpectedly. App code should not modify the result of getPaint().");
            typeface = getPaint().getTypeface();
        }
        ob obVar = ht.a;
        tk tkVar = new tk(typeface, str);
        Typeface typeface2 = (Typeface) ht.a.a(tkVar);
        if (typeface2 == null) {
            Paint paint = ht.b;
            if (paint == null) {
                paint = new Paint();
                ht.b = paint;
            }
            if (Objects.equals(paint.getFontVariationSettings(), str)) {
                paint.setFontVariationSettings(null);
            }
            paint.setTypeface(typeface);
            if (paint.setFontVariationSettings(str)) {
                typeface2 = paint.getTypeface();
                ht.a.b(tkVar, typeface2);
            } else {
                typeface2 = null;
            }
        }
        if (typeface2 == null) {
            return false;
        }
        a(typeface2);
        this.f = str;
        return true;
    }

    @Override // android.widget.TextView
    public final void setLastBaselineToBottomHeight(int i) {
        t().j(i);
    }

    @Override // android.widget.TextView
    public final void setLineHeight(int i) {
        vq.c(this, i);
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        hu huVar = this.b;
        if (huVar != null) {
            huVar.d(context, i);
        }
    }

    @Override // android.widget.TextView
    public final void setTextClassifier(TextClassifier textClassifier) {
        t().l(textClassifier);
    }

    @Override // android.widget.TextView
    public final void setTypeface(Typeface typeface) {
        this.d = typeface;
        a(typeface);
    }

    final hv t() {
        if (this.g == null) {
            this.g = new hx(this);
        }
        return this.g;
    }

    public hy(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.textViewStyle);
    }

    @Override // android.widget.TextView
    public final void setLineHeight(int i, float f) {
        t().k(i, f);
    }

    @Override // android.widget.TextView
    public final void setTypeface(Typeface typeface, int i) {
        if (this.c) {
            return;
        }
        if (typeface != null && i > 0) {
            Context context = getContext();
            sf sfVar = sd.a;
            if (context == null) {
                throw new IllegalArgumentException("Context cannot be null");
            }
            typeface = Typeface.create(typeface, i);
        }
        this.c = true;
        try {
            super.setTypeface(typeface, i);
        } finally {
            this.c = false;
        }
    }

    public hy(Context context, AttributeSet attributeSet, int i) {
        super(lb.a(context), attributeSet, i);
        this.c = false;
        this.g = null;
        kz.d(this, getContext());
        gs gsVar = new gs(this);
        this.a = gsVar;
        gsVar.b(attributeSet, i);
        hu huVar = new hu(this);
        this.b = huVar;
        huVar.c(attributeSet, i);
        huVar.a();
        b().p(attributeSet, i);
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        hu huVar = this.b;
        if (huVar != null) {
            huVar.a();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        hu huVar = this.b;
        if (huVar != null) {
            huVar.a();
        }
    }
}
