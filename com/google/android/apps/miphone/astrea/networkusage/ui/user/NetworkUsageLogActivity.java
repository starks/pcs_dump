package com.google.android.apps.miphone.astrea.networkusage.ui.user;

import android.os.Bundle;
import com.google.android.as.oss.R;
import defpackage.abx;
import defpackage.asr;
import defpackage.atc;
import defpackage.atk;
import defpackage.auh;
import defpackage.awb;
import defpackage.awz;
import defpackage.axd;
import defpackage.czl;
import defpackage.czn;
import defpackage.d;

/* compiled from: PG */
/* loaded from: classes.dex */
public class NetworkUsageLogActivity extends awb {
    private static final czn k = czn.j("com/google/android/apps/miphone/astrea/networkusage/ui/user/NetworkUsageLogActivity");
    public auh j;

    @Override // defpackage.awb, defpackage.ajv, defpackage.ae, defpackage.lx, defpackage.bz, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        auh auhVar = this.j;
        asr asrVar = (asr) atc.a.createBuilder();
        atk atkVar = atk.PCS_NETWORK_USAGE_LOG_OPENED;
        if (!asrVar.a.isMutable()) {
            asrVar.B();
        }
        atc atcVar = (atc) asrVar.a;
        atcVar.c = atkVar.H;
        atcVar.b |= 1;
        auhVar.a((atc) asrVar.z());
        ((czl) ((czl) k.c()).i("com/google/android/apps/miphone/astrea/networkusage/ui/user/NetworkUsageLogActivity", "onCreate", 29, "NetworkUsageLogActivity.java")).p("Network usage log is opened");
        setContentView(R.layout.network_usage_log_activity);
        if (bundle != null) {
            return;
        }
        d dVar = new d(aQ());
        dVar.m(R.id.settings_fragment_container, new axd());
        if (abx.c(this).getBoolean(getString(R.string.pref_network_usage_log_enabled_key), getResources().getBoolean(R.bool.pref_network_usage_log_enabled_default))) {
            dVar.m(R.id.log_fragment_container, new awz());
        }
        dVar.j();
    }
}
