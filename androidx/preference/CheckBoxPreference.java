package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.widget.Checkable;
import android.widget.CompoundButton;
import com.google.android.as.oss.R;
import defpackage.aca;
import defpackage.acb;
import defpackage.acf;
import defpackage.ul;

/* compiled from: PG */
/* loaded from: classes.dex */
public class CheckBoxPreference extends TwoStatePreference {
    private final acf c;

    /* JADX WARN: Illegal instructions before constructor call */
    public CheckBoxPreference(Context context, AttributeSet attributeSet) {
        int iR = ul.r(context, R.attr.checkBoxPreferenceStyle, android.R.attr.checkBoxPreferenceStyle);
        super(context, attributeSet, iR, 0);
        this.c = new acf(this, 1);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, acb.b, iR, 0);
        n(ul.w(typedArrayObtainStyledAttributes, 5, 0));
        l(ul.w(typedArrayObtainStyledAttributes, 4, 1));
        ((TwoStatePreference) this).b = ul.x(typedArrayObtainStyledAttributes, 3, 2, false);
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void S(View view) {
        boolean z = view instanceof CompoundButton;
        if (z) {
            ((CompoundButton) view).setOnCheckedChangeListener(null);
        }
        if (view instanceof Checkable) {
            ((Checkable) view).setChecked(this.a);
        }
        if (z) {
            ((CompoundButton) view).setOnCheckedChangeListener(this.c);
        }
    }

    @Override // androidx.preference.Preference
    public final void a(aca acaVar) {
        super.a(acaVar);
        S(acaVar.C(android.R.id.checkbox));
        R(acaVar);
    }

    @Override // androidx.preference.Preference
    public final void b(View view) {
        A();
        if (((AccessibilityManager) this.j.getSystemService("accessibility")).isEnabled()) {
            S(view.findViewById(android.R.id.checkbox));
            Q(view.findViewById(android.R.id.summary));
        }
    }
}
