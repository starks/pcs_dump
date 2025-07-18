package com.android.settingslib.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.preference.TwoStatePreference;
import com.google.android.as.oss.R;
import defpackage.aca;
import defpackage.acb;
import defpackage.akc;
import defpackage.gc;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public class MainSwitchPreference extends TwoStatePreference implements akc {
    public final List c;
    public MainSwitchBar d;

    public MainSwitchPreference(Context context) {
        super(context);
        this.c = new ArrayList();
        U(context, null);
    }

    private final void U(Context context, AttributeSet attributeSet) {
        this.A = R.layout.settingslib_main_switch_layout;
        this.c.add(this);
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, acb.g, 0, 0);
            F(typedArrayObtainStyledAttributes.getText(4));
            S(typedArrayObtainStyledAttributes.getBoolean(15, true));
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    @Override // androidx.preference.Preference
    public final void F(CharSequence charSequence) {
        super.F(charSequence);
        MainSwitchBar mainSwitchBar = this.d;
        if (mainSwitchBar != null) {
            mainSwitchBar.c(charSequence);
        }
    }

    public final void S(boolean z) {
        if (this.y != z) {
            this.y = z;
            d();
        }
    }

    public final void T(boolean z) {
        k(z);
        MainSwitchBar mainSwitchBar = this.d;
        if (mainSwitchBar != null) {
            mainSwitchBar.c(this.o);
            MainSwitchBar mainSwitchBar2 = this.d;
            mainSwitchBar2.setVisibility(0);
            mainSwitchBar2.b.setOnCheckedChangeListener(mainSwitchBar2);
        }
    }

    @Override // androidx.preference.Preference
    public final void a(aca acaVar) {
        super.a(acaVar);
        acaVar.u = false;
        acaVar.v = false;
        MainSwitchBar mainSwitchBar = (MainSwitchBar) acaVar.C(R.id.settingslib_main_switch_bar);
        this.d = mainSwitchBar;
        mainSwitchBar.setOnClickListener(new gc(this, 5, null));
        S(this.y);
        T(((TwoStatePreference) this).a);
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            this.d.a((akc) it.next());
        }
    }

    @Override // defpackage.akc
    public final void aO(boolean z) {
        super.k(z);
    }

    @Override // androidx.preference.TwoStatePreference
    public final void k(boolean z) {
        super.k(z);
        MainSwitchBar mainSwitchBar = this.d;
        if (mainSwitchBar == null || mainSwitchBar.d() == z) {
            return;
        }
        this.d.b(z);
    }

    public MainSwitchPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.c = new ArrayList();
        U(context, attributeSet);
    }

    public MainSwitchPreference(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.c = new ArrayList();
        U(context, attributeSet);
    }

    public MainSwitchPreference(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.c = new ArrayList();
        U(context, attributeSet);
    }
}
