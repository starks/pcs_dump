package com.google.android.apps.miphone.astrea.settings.ui;

import android.os.Bundle;
import com.google.android.as.oss.R;
import defpackage.bdt;
import defpackage.cc;

/* compiled from: PG */
/* loaded from: classes.dex */
public class PcsSettingsActivity extends bdt {
    @Override // defpackage.bdt, defpackage.ae, defpackage.lx, defpackage.bz, android.app.Activity
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.pcs_settings_activity);
        cc ccVarP = p();
        if (ccVarP != null) {
            ccVarP.d(true);
        }
    }

    @Override // defpackage.cm
    public final boolean t() {
        d().b();
        return true;
    }
}
