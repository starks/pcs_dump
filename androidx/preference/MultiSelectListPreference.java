package androidx.preference;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.TypedArray;
import android.os.Parcelable;
import android.util.AttributeSet;
import com.google.android.as.oss.R;
import defpackage.abd;
import defpackage.acb;
import defpackage.ul;
import java.util.HashSet;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public class MultiSelectListPreference extends DialogPreference {
    public final CharSequence[] g;
    public final CharSequence[] h;
    public final Set i;

    /* JADX WARN: Illegal instructions before constructor call */
    public MultiSelectListPreference(Context context, AttributeSet attributeSet) {
        int iR = ul.r(context, R.attr.dialogPreferenceStyle, android.R.attr.dialogPreferenceStyle);
        super(context, attributeSet, iR);
        this.i = new HashSet();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, acb.f, iR, 0);
        this.g = ul.z(typedArrayObtainStyledAttributes, 2, 0);
        this.h = ul.z(typedArrayObtainStyledAttributes, 3, 1);
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // androidx.preference.Preference
    protected final Parcelable e() {
        Parcelable parcelableE = super.e();
        if (this.w) {
            return parcelableE;
        }
        abd abdVar = new abd(parcelableE);
        abdVar.a = this.i;
        return abdVar;
    }

    @Override // androidx.preference.Preference
    protected final Object f(TypedArray typedArray, int i) {
        CharSequence[] textArray = typedArray.getTextArray(i);
        HashSet hashSet = new HashSet();
        for (CharSequence charSequence : textArray) {
            hashSet.add(charSequence.toString());
        }
        return hashSet;
    }

    @Override // androidx.preference.Preference
    protected final void g(Parcelable parcelable) {
        if (!parcelable.getClass().equals(abd.class)) {
            super.g(parcelable);
            return;
        }
        abd abdVar = (abd) parcelable;
        super.g(abdVar.getSuperState());
        k(abdVar.a);
    }

    @Override // androidx.preference.Preference
    protected final void h(Object obj) {
        k(s((Set) obj));
    }

    public final void k(Set set) {
        this.i.clear();
        this.i.addAll(set);
        if (L() && !set.equals(s(null))) {
            SharedPreferences.Editor editorB = this.k.b();
            editorB.putStringSet(this.s, set);
            super.G(editorB);
        }
        d();
    }
}
