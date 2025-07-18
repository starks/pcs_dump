package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import defpackage.abq;
import defpackage.acb;
import defpackage.oc;
import defpackage.ul;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class PreferenceGroup extends Preference {
    public final oc a;
    public final List b;
    public boolean c;
    public int d;
    public boolean e;
    public int f;

    public PreferenceGroup(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public final void Q(int i) {
        if (i != Integer.MAX_VALUE && !J()) {
            Log.e("PreferenceGroup", String.valueOf(getClass().getSimpleName()).concat(" should have a key defined if it contains an expandable preference"));
        }
        this.f = i;
    }

    public boolean R() {
        return true;
    }

    @Override // androidx.preference.Preference
    protected final Parcelable e() {
        return new abq(super.e(), this.f);
    }

    @Override // androidx.preference.Preference
    protected final void g(Parcelable parcelable) {
        if (!parcelable.getClass().equals(abq.class)) {
            super.g(parcelable);
            return;
        }
        abq abqVar = (abq) parcelable;
        this.f = abqVar.a;
        super.g(abqVar.getSuperState());
    }

    public final int k() {
        return this.b.size();
    }

    public final Preference l(CharSequence charSequence) {
        Preference preferenceL;
        if (charSequence == null) {
            throw new IllegalArgumentException("Key cannot be null");
        }
        if (TextUtils.equals(this.s, charSequence)) {
            return this;
        }
        int iK = k();
        for (int i = 0; i < iK; i++) {
            Preference preferenceN = n(i);
            if (TextUtils.equals(preferenceN.s, charSequence)) {
                return preferenceN;
            }
            if ((preferenceN instanceof PreferenceGroup) && (preferenceL = ((PreferenceGroup) preferenceN).l(charSequence)) != null) {
                return preferenceL;
            }
        }
        return null;
    }

    public final Preference n(int i) {
        return (Preference) this.b.get(i);
    }

    @Override // androidx.preference.Preference
    public final void t(Bundle bundle) {
        super.t(bundle);
        int iK = k();
        for (int i = 0; i < iK; i++) {
            n(i).t(bundle);
        }
    }

    @Override // androidx.preference.Preference
    public final void u(Bundle bundle) {
        super.u(bundle);
        int iK = k();
        for (int i = 0; i < iK; i++) {
            n(i).u(bundle);
        }
    }

    @Override // androidx.preference.Preference
    public final void v(boolean z) {
        super.v(z);
        int iK = k();
        for (int i = 0; i < iK; i++) {
            n(i).N(z);
        }
    }

    @Override // androidx.preference.Preference
    public final void x() {
        super.B();
        this.e = true;
        int iK = k();
        for (int i = 0; i < iK; i++) {
            n(i).x();
        }
    }

    @Override // androidx.preference.Preference
    public final void z() {
        super.H();
        this.e = false;
        int iK = k();
        for (int i = 0; i < iK; i++) {
            n(i).z();
        }
    }

    public PreferenceGroup(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public PreferenceGroup(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.a = new oc();
        new Handler(Looper.getMainLooper());
        this.c = true;
        this.d = 0;
        this.e = false;
        this.f = Integer.MAX_VALUE;
        this.b = new ArrayList();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, acb.i, i, i2);
        this.c = ul.x(typedArrayObtainStyledAttributes, 2, 2, true);
        if (typedArrayObtainStyledAttributes.hasValue(1)) {
            Q(ul.A(typedArrayObtainStyledAttributes, 1, 1));
        }
        typedArrayObtainStyledAttributes.recycle();
    }
}
