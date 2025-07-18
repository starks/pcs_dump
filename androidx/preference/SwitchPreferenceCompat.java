package androidx.preference;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.support.v7.widget.SwitchCompat;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.widget.Checkable;
import com.google.android.as.oss.R;
import defpackage.aca;
import defpackage.acb;
import defpackage.acf;
import defpackage.ul;

/* compiled from: PG */
/* loaded from: classes.dex */
public class SwitchPreferenceCompat extends TwoStatePreference {
    private CharSequence c;
    private CharSequence d;
    private final acf e;

    public SwitchPreferenceCompat(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.switchPreferenceCompatStyle, 0);
        this.e = new acf(this, 2);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, acb.m, R.attr.switchPreferenceCompatStyle, 0);
        n(ul.w(typedArrayObtainStyledAttributes, 7, 0));
        l(ul.w(typedArrayObtainStyledAttributes, 6, 1));
        this.c = ul.w(typedArrayObtainStyledAttributes, 9, 3);
        d();
        this.d = ul.w(typedArrayObtainStyledAttributes, 8, 4);
        d();
        ((TwoStatePreference) this).b = ul.x(typedArrayObtainStyledAttributes, 5, 2, false);
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void S(View view) throws Resources.NotFoundException {
        boolean z = view instanceof SwitchCompat;
        if (z) {
            ((SwitchCompat) view).setOnCheckedChangeListener(null);
        }
        if (view instanceof Checkable) {
            ((Checkable) view).setChecked(this.a);
        }
        if (z) {
            SwitchCompat switchCompat = (SwitchCompat) view;
            switchCompat.g(this.c);
            switchCompat.requestLayout();
            if (switchCompat.isChecked()) {
                switchCompat.d();
            }
            switchCompat.f(this.d);
            switchCompat.requestLayout();
            if (!switchCompat.isChecked()) {
                switchCompat.c();
            }
            switchCompat.setOnCheckedChangeListener(this.e);
        }
    }

    @Override // androidx.preference.Preference
    public final void a(aca acaVar) throws Resources.NotFoundException {
        super.a(acaVar);
        S(acaVar.C(R.id.switchWidget));
        R(acaVar);
    }

    @Override // androidx.preference.Preference
    public final void b(View view) throws Resources.NotFoundException {
        A();
        if (((AccessibilityManager) this.j.getSystemService("accessibility")).isEnabled()) {
            S(view.findViewById(R.id.switchWidget));
            Q(view.findViewById(android.R.id.summary));
        }
    }
}
