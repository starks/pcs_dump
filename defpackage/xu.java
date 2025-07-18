package defpackage;

import android.text.InputFilter;
import android.text.method.PasswordTransformationMethod;
import android.text.method.TransformationMethod;
import android.util.SparseArray;
import android.widget.TextView;

/* compiled from: PG */
/* loaded from: classes.dex */
final class xu extends uo {
    public boolean a = true;
    private final TextView b;
    private final xs c;

    public xu(TextView textView) {
        this.b = textView;
        this.c = new xs(textView);
    }

    @Override // defpackage.uo
    public final TransformationMethod c(TransformationMethod transformationMethod) {
        if (this.a) {
            if (!(transformationMethod instanceof xx) && !(transformationMethod instanceof PasswordTransformationMethod)) {
                return new xx(transformationMethod);
            }
        } else if (transformationMethod instanceof xx) {
            return ((xx) transformationMethod).a;
        }
        return transformationMethod;
    }

    @Override // defpackage.uo
    public final void d(boolean z) {
        if (z) {
            p();
        }
    }

    @Override // defpackage.uo
    public final void e(boolean z) {
        this.a = z;
        p();
        this.b.setFilters(g(this.b.getFilters()));
    }

    @Override // defpackage.uo
    public final InputFilter[] g(InputFilter[] inputFilterArr) {
        int length;
        if (this.a) {
            int length2 = inputFilterArr.length;
            for (InputFilter inputFilter : inputFilterArr) {
                if (inputFilter != this.c) {
                }
            }
            InputFilter[] inputFilterArr2 = new InputFilter[inputFilterArr.length + 1];
            System.arraycopy(inputFilterArr, 0, inputFilterArr2, 0, length2);
            inputFilterArr2[length2] = this.c;
            return inputFilterArr2;
        }
        SparseArray sparseArray = new SparseArray(1);
        int i = 0;
        while (true) {
            length = inputFilterArr.length;
            if (i >= length) {
                break;
            }
            InputFilter inputFilter2 = inputFilterArr[i];
            if (inputFilter2 instanceof xs) {
                sparseArray.put(i, inputFilter2);
            }
            i++;
        }
        if (sparseArray.size() != 0) {
            InputFilter[] inputFilterArr3 = new InputFilter[length - sparseArray.size()];
            int i2 = 0;
            for (int i3 = 0; i3 < length; i3++) {
                if (sparseArray.indexOfKey(i3) < 0) {
                    inputFilterArr3[i2] = inputFilterArr[i3];
                    i2++;
                }
            }
            return inputFilterArr3;
        }
        return inputFilterArr;
    }

    final void p() {
        this.b.setTransformationMethod(c(this.b.getTransformationMethod()));
    }
}
