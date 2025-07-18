package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import com.google.android.as.oss.R;
import defpackage.aba;
import defpackage.abb;
import defpackage.abi;
import defpackage.acb;
import defpackage.ul;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ListPreference extends DialogPreference {
    private String G;
    private boolean H;
    public CharSequence[] g;
    public CharSequence[] h;
    public String i;

    public ListPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, ul.r(context, R.attr.dialogPreferenceStyle, android.R.attr.dialogPreferenceStyle));
    }

    @Override // androidx.preference.Preference
    protected final Parcelable e() {
        Parcelable parcelableE = super.e();
        if (this.w) {
            return parcelableE;
        }
        aba abaVar = new aba(parcelableE);
        abaVar.a = this.i;
        return abaVar;
    }

    @Override // androidx.preference.Preference
    protected final Object f(TypedArray typedArray, int i) {
        return typedArray.getString(i);
    }

    @Override // androidx.preference.Preference
    protected final void g(Parcelable parcelable) {
        if (!parcelable.getClass().equals(aba.class)) {
            super.g(parcelable);
            return;
        }
        aba abaVar = (aba) parcelable;
        super.g(abaVar.getSuperState());
        n(abaVar.a);
    }

    @Override // androidx.preference.Preference
    protected final void h(Object obj) {
        n(r((String) obj));
    }

    public final int k(String str) {
        CharSequence[] charSequenceArr;
        if (str != null && (charSequenceArr = this.h) != null) {
            for (int length = charSequenceArr.length - 1; length >= 0; length--) {
                if (TextUtils.equals(this.h[length].toString(), str)) {
                    return length;
                }
            }
        }
        return -1;
    }

    public final CharSequence l() {
        CharSequence[] charSequenceArr;
        int iK = k(this.i);
        if (iK < 0 || (charSequenceArr = this.g) == null) {
            return null;
        }
        return charSequenceArr[iK];
    }

    @Override // androidx.preference.Preference
    public final CharSequence m() {
        abi abiVar = this.D;
        if (abiVar != null) {
            return abiVar.a(this);
        }
        CharSequence charSequenceL = l();
        CharSequence charSequenceM = super.m();
        String str = this.G;
        if (str != null) {
            if (charSequenceL == null) {
                charSequenceL = "";
            }
            String str2 = String.format(str, charSequenceL);
            if (!TextUtils.equals(str2, charSequenceM)) {
                Log.w("ListPreference", "Setting a summary with a String formatting marker is no longer supported. You should use a SummaryProvider instead.");
                return str2;
            }
        }
        return charSequenceM;
    }

    public final void n(String str) {
        boolean zEquals = TextUtils.equals(this.i, str);
        if (zEquals && this.H) {
            return;
        }
        this.i = str;
        this.H = true;
        O(str);
        if (zEquals) {
            return;
        }
        d();
    }

    public ListPreference(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, acb.e, i, 0);
        this.g = ul.z(typedArrayObtainStyledAttributes, 2, 0);
        this.h = ul.z(typedArrayObtainStyledAttributes, 3, 1);
        if (ul.x(typedArrayObtainStyledAttributes, 4, 4, false)) {
            if (abb.a == null) {
                abb.a = new abb(0);
            }
            E(abb.a);
        }
        typedArrayObtainStyledAttributes.recycle();
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, acb.g, i, 0);
        this.G = ul.w(typedArrayObtainStyledAttributes2, 33, 7);
        typedArrayObtainStyledAttributes2.recycle();
    }
}
