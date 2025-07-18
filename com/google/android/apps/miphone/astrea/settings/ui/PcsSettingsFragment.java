package com.google.android.apps.miphone.astrea.settings.ui;

import android.content.Intent;
import android.content.res.Resources;
import androidx.preference.Preference;
import com.google.android.apps.miphone.astrea.settings.licenses.LicenseMenuActivity;
import com.google.android.as.oss.R;
import defpackage.bdu;

/* compiled from: PG */
/* loaded from: classes.dex */
public class PcsSettingsFragment extends bdu {
    @Override // defpackage.abp, defpackage.abw
    public final boolean ao(Preference preference) {
        if (!preference.s.equals(H(R.string.pcs_settings_pref_key_licenses))) {
            return super.ao(preference);
        }
        s().startActivity(new Intent(s(), (Class<?>) LicenseMenuActivity.class));
        return true;
    }

    @Override // defpackage.abp
    public final void ap(String str) throws Resources.NotFoundException {
        an(R.xml.pcs_settings, str);
    }
}
