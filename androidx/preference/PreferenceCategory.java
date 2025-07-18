package androidx.preference;

import android.content.Context;
import android.util.AttributeSet;
import com.google.android.as.oss.R;
import defpackage.aca;
import defpackage.ul;

/* compiled from: PG */
/* loaded from: classes.dex */
public class PreferenceCategory extends PreferenceGroup {
    public PreferenceCategory(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, ul.r(context, R.attr.preferenceCategoryStyle, android.R.attr.preferenceCategoryStyle), 0);
    }

    @Override // androidx.preference.Preference
    public final boolean K() {
        return false;
    }

    @Override // androidx.preference.Preference
    public final void a(aca acaVar) {
        super.a(acaVar);
        acaVar.a.setAccessibilityHeading(true);
    }

    @Override // androidx.preference.Preference
    public final boolean j() {
        return !super.K();
    }
}
