package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import com.google.android.as.oss.R;
import defpackage.aax;
import defpackage.abb;
import defpackage.acb;
import defpackage.ul;

/* compiled from: PG */
/* loaded from: classes.dex */
public class EditTextPreference extends DialogPreference {
    public String g;

    /* JADX WARN: Illegal instructions before constructor call */
    public EditTextPreference(Context context, AttributeSet attributeSet) {
        int iR = ul.r(context, R.attr.editTextPreferenceStyle, android.R.attr.editTextPreferenceStyle);
        super(context, attributeSet, iR);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, acb.d, iR, 0);
        if (ul.x(typedArrayObtainStyledAttributes, 0, 0, false)) {
            if (abb.b == null) {
                abb.b = new abb(1);
            }
            E(abb.b);
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // androidx.preference.Preference
    protected final Parcelable e() {
        Parcelable parcelableE = super.e();
        if (this.w) {
            return parcelableE;
        }
        aax aaxVar = new aax(parcelableE);
        aaxVar.a = this.g;
        return aaxVar;
    }

    @Override // androidx.preference.Preference
    protected final Object f(TypedArray typedArray, int i) {
        return typedArray.getString(i);
    }

    @Override // androidx.preference.Preference
    protected final void g(Parcelable parcelable) {
        if (!parcelable.getClass().equals(aax.class)) {
            super.g(parcelable);
            return;
        }
        aax aaxVar = (aax) parcelable;
        super.g(aaxVar.getSuperState());
        i(aaxVar.a);
    }

    @Override // androidx.preference.Preference
    protected final void h(Object obj) {
        i(r((String) obj));
    }

    public final void i(String str) {
        boolean zJ = j();
        this.g = str;
        O(str);
        boolean zJ2 = j();
        if (zJ2 != zJ) {
            v(zJ2);
        }
        d();
    }

    @Override // androidx.preference.Preference
    public final boolean j() {
        return TextUtils.isEmpty(this.g) || super.j();
    }
}
