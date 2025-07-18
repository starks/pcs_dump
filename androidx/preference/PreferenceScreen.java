package androidx.preference;

import android.content.Context;
import android.util.AttributeSet;
import com.google.android.as.oss.R;
import defpackage.abv;
import defpackage.ul;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class PreferenceScreen extends PreferenceGroup {
    public final boolean g;

    public PreferenceScreen(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, ul.r(context, R.attr.preferenceScreenStyle, android.R.attr.preferenceScreenStyle));
        this.g = true;
    }

    @Override // androidx.preference.PreferenceGroup
    public final boolean R() {
        return false;
    }

    @Override // androidx.preference.Preference
    protected final void c() {
        abv abvVar;
        if (this.t != null || this.u != null || k() == 0 || (abvVar = this.k.e) == null) {
            return;
        }
        abvVar.am(this);
    }
}
