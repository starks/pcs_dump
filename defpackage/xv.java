package defpackage;

import android.text.InputFilter;
import android.text.method.TransformationMethod;
import android.widget.TextView;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class xv extends uo {
    private final xu a;

    public xv(TextView textView) {
        this.a = new xu(textView);
    }

    private static final boolean p() {
        xm.a();
        return true;
    }

    @Override // defpackage.uo
    public final TransformationMethod c(TransformationMethod transformationMethod) {
        return p() ? transformationMethod : this.a.c(transformationMethod);
    }

    @Override // defpackage.uo
    public final void d(boolean z) {
        if (p()) {
            return;
        }
        this.a.d(z);
    }

    @Override // defpackage.uo
    public final void e(boolean z) {
        boolean zP = p();
        xu xuVar = this.a;
        if (zP) {
            xuVar.a = z;
        } else {
            xuVar.e(z);
        }
    }

    @Override // defpackage.uo
    public final boolean f() {
        return this.a.a;
    }

    @Override // defpackage.uo
    public final InputFilter[] g(InputFilter[] inputFilterArr) {
        return p() ? inputFilterArr : this.a.g(inputFilterArr);
    }
}
