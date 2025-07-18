package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.widget.Checkable;
import android.widget.Switch;
import com.google.android.as.oss.R;
import defpackage.aca;
import defpackage.acb;
import defpackage.acf;
import defpackage.ul;

/* compiled from: PG */
/* loaded from: classes.dex */
public class SwitchPreference extends TwoStatePreference {
    private final acf c;
    private CharSequence d;
    private CharSequence e;

    /* JADX WARN: Illegal instructions before constructor call */
    public SwitchPreference(Context context, AttributeSet attributeSet) {
        int iR = ul.r(context, R.attr.switchPreferenceStyle, android.R.attr.switchPreferenceStyle);
        super(context, attributeSet, iR, 0);
        this.c = new acf(this, 0);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, acb.l, iR, 0);
        n(ul.w(typedArrayObtainStyledAttributes, 7, 0));
        l(ul.w(typedArrayObtainStyledAttributes, 6, 1));
        this.d = ul.w(typedArrayObtainStyledAttributes, 9, 3);
        d();
        this.e = ul.w(typedArrayObtainStyledAttributes, 8, 4);
        d();
        ((TwoStatePreference) this).b = ul.x(typedArrayObtainStyledAttributes, 5, 2, false);
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void S(View view) {
        boolean z = view instanceof Switch;
        if (z) {
            ((Switch) view).setOnCheckedChangeListener(null);
        }
        if (view instanceof Checkable) {
            ((Checkable) view).setChecked(this.a);
        }
        if (z) {
            Switch r4 = (Switch) view;
            r4.setTextOn(this.d);
            r4.setTextOff(this.e);
            r4.setOnCheckedChangeListener(this.c);
        }
    }

    @Override // androidx.preference.Preference
    public final void a(aca acaVar) {
        super.a(acaVar);
        S(acaVar.C(android.R.id.switch_widget));
        R(acaVar);
    }

    @Override // androidx.preference.Preference
    public final void b(View view) {
        A();
        if (((AccessibilityManager) this.j.getSystemService("accessibility")).isEnabled()) {
            S(view.findViewById(android.R.id.switch_widget));
            Q(view.findViewById(android.R.id.summary));
        }
    }
}
