package defpackage;

import android.view.textclassifier.TextClassifier;

/* compiled from: PG */
/* loaded from: classes.dex */
class hv {
    final /* synthetic */ hy a;

    public hv(hy hyVar) {
        this.a = hyVar;
    }

    public final int a() {
        return super/*android.widget.TextView*/.getAutoSizeMaxTextSize();
    }

    public final int b() {
        return super/*android.widget.TextView*/.getAutoSizeMinTextSize();
    }

    public final int c() {
        return super/*android.widget.TextView*/.getAutoSizeStepGranularity();
    }

    public final int d() {
        return super/*android.widget.TextView*/.getAutoSizeTextType();
    }

    public final TextClassifier e() {
        return super/*android.widget.TextView*/.getTextClassifier();
    }

    public final void f(int i, int i2, int i3, int i4) {
        super/*android.widget.TextView*/.setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
    }

    public final void g(int[] iArr, int i) {
        super/*android.widget.TextView*/.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
    }

    public final void h(int i) {
        super/*android.widget.TextView*/.setAutoSizeTextTypeWithDefaults(i);
    }

    public final void l(TextClassifier textClassifier) {
        super/*android.widget.TextView*/.setTextClassifier(textClassifier);
    }

    public final int[] m() {
        return super/*android.widget.TextView*/.getAutoSizeTextAvailableSizes();
    }

    public void i(int i) {
    }

    public void j(int i) {
    }

    public void k(int i, float f) {
    }
}
