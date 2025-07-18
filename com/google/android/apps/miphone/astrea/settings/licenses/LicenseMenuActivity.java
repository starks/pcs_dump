package com.google.android.apps.miphone.astrea.settings.licenses;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import com.google.android.as.oss.R;
import defpackage.ax;
import defpackage.bdp;
import defpackage.bds;
import defpackage.cm;
import defpackage.d;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class LicenseMenuActivity extends cm {
    public final void B(bdp bdpVar) {
        Intent intent = new Intent(this, (Class<?>) LicenseActivity.class);
        intent.putExtra("license", bdpVar);
        startActivity(intent);
    }

    @Override // defpackage.ae, defpackage.lx, defpackage.bz, android.app.Activity
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.pcs_license_menu_activity);
        if (p() != null) {
            p().d(true);
        }
        ax axVarAQ = aQ();
        if (axVarAQ.d(R.id.license_menu_fragment_container) instanceof bds) {
            return;
        }
        bds bdsVar = new bds();
        d dVar = new d(axVarAQ);
        dVar.m(R.id.license_menu_fragment_container, bdsVar);
        dVar.n();
        dVar.a.G(dVar, false);
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        finish();
        return true;
    }
}
