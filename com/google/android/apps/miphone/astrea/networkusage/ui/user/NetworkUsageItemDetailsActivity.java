package com.google.android.apps.miphone.astrea.networkusage.ui.user;

import android.content.pm.PackageManager;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.format.Formatter;
import com.google.android.apps.aicore.aidl.AIFeature;
import com.google.android.as.oss.R;
import defpackage.alg;
import defpackage.asr;
import defpackage.atc;
import defpackage.atk;
import defpackage.auh;
import defpackage.auw;
import defpackage.aux;
import defpackage.ava;
import defpackage.avf;
import defpackage.avs;
import defpackage.avu;
import defpackage.awa;
import defpackage.awk;
import defpackage.awn;
import defpackage.awq;
import defpackage.awr;
import defpackage.awt;
import defpackage.aww;
import defpackage.bbe;
import defpackage.cvu;
import defpackage.cwy;
import defpackage.cxc;
import defpackage.cyp;
import defpackage.czl;
import defpackage.czn;
import defpackage.dcr;
import defpackage.dw;
import j$.util.Collection;

/* compiled from: PG */
/* loaded from: classes.dex */
public class NetworkUsageItemDetailsActivity extends awa {
    private static final czn l = czn.j("com/google/android/apps/miphone/astrea/networkusage/ui/user/NetworkUsageItemDetailsActivity");
    public avs j;
    public auh k;

    @Override // defpackage.awa, defpackage.ajv, defpackage.ae, defpackage.lx, defpackage.bz, android.app.Activity
    public final void onCreate(Bundle bundle) {
        cxc cxcVarA;
        String string;
        super.onCreate(bundle);
        auh auhVar = this.k;
        asr asrVar = (asr) atc.a.createBuilder();
        atk atkVar = atk.PCS_NETWORK_USAGE_LOG_ITEM_INSPECTED;
        if (!asrVar.a.isMutable()) {
            asrVar.B();
        }
        atc atcVar = (atc) asrVar.a;
        atcVar.c = atkVar.H;
        int i = 1;
        atcVar.b |= 1;
        auhVar.a((atc) asrVar.z());
        ((czl) ((czl) l.c()).i("com/google/android/apps/miphone/astrea/networkusage/ui/user/NetworkUsageItemDetailsActivity", "onCreate", 36, "NetworkUsageItemDetailsActivity.java")).p("Network usage log item inspected");
        Bundle extras = getIntent().getExtras();
        extras.getClass();
        aww awwVar = (aww) extras.getParcelable("NETWORK_USAGE_ITEM_EXTRA_KEY");
        awwVar.getClass();
        setContentView(R.layout.network_usage_item_details_activity);
        setTitle((CharSequence) this.j.d(awwVar.a()).orElseThrow(new awq(awwVar, i)));
        dw dwVar = new dw(this.j);
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.network_usage_item_details_list);
        recyclerView.S(dwVar);
        recyclerView.T(new LinearLayoutManager(this));
        avs avsVar = this.j;
        auh auhVar2 = this.k;
        czn cznVar = awt.a;
        int i2 = cxc.d;
        cwy cwyVar = new cwy();
        aux auxVarA = awwVar.a();
        int i3 = 0;
        String str = (String) avsVar.b(auxVarA).orElseThrow(new awq(auxVarA, i3));
        cwy cwyVar2 = new cwy();
        cwyVar2.i(new awn(getString(R.string.details_page_method), avsVar.j(auxVarA)), new awn(getString(R.string.details_page_description), str));
        if (auxVarA.b() != auw.FC_CHECK_IN) {
            String string2 = getString(R.string.details_page_apk_name);
            String strC = auxVarA.c();
            PackageManager packageManager = getPackageManager();
            try {
                string = packageManager.getApplicationLabel(packageManager.getApplicationInfo(strC, 0)).toString();
            } catch (PackageManager.NameNotFoundException e) {
                ((czl) ((czl) ((czl) awt.a.e()).h(e)).i("com/google/android/apps/miphone/astrea/networkusage/ui/user/NetworkUsageItemUtils", "getApplicationNameForPackage", (char) 373, "NetworkUsageItemUtils.java")).p("Unknown package name");
                string = "Unknown";
            }
            cwyVar2.h(new awn(string2, string));
        }
        cwyVar.j(cwyVar2.g());
        int iOrdinal = awwVar.a().b().ordinal();
        int i4 = R.string.details_page_download_size;
        int i5 = R.string.details_page_status;
        switch (iOrdinal) {
            case 1:
                cxcVarA = awt.a(this, awwVar);
                break;
            case 2:
            case 3:
                cxcVarA = (cxc) Collection.EL.stream(dcr.o(awwVar.b, new avf(5)).j().values()).map(new bbe(this, auhVar2, i)).flatMap(new alg(11)).collect(cvu.a);
                break;
            case 4:
            case 5:
                cwy cwyVar3 = new cwy();
                cxc cxcVar = awwVar.b;
                int size = cxcVar.size();
                int i6 = 0;
                while (i6 < size) {
                    ava avaVar = (ava) cxcVar.get(i6);
                    cwyVar3.i(avu.a(avaVar.i()), new awn(getString(i5), awt.d(this, avaVar.k())), new awn(getString(i4), Formatter.formatShortFileSize(this, avaVar.c())), new awr(getString(R.string.details_page_url), avaVar.j(), avaVar));
                    i6++;
                    i4 = R.string.details_page_download_size;
                    i5 = R.string.details_page_status;
                }
                cxcVarA = cwyVar3.g();
                break;
            case 6:
                cwy cwyVar4 = new cwy();
                cxc cxcVar2 = awwVar.b;
                int size2 = cxcVar2.size();
                int i7 = 0;
                while (i7 < size2) {
                    ava avaVar2 = (ava) cxcVar2.get(i7);
                    awk[] awkVarArr = new awk[2];
                    awkVarArr[i3] = avu.a(avaVar2.i());
                    int i8 = i3;
                    awkVarArr[1] = new awn(getString(R.string.details_page_status), awt.d(this, avaVar2.k()));
                    cwyVar4.i(awkVarArr);
                    if (avaVar2.c() > 0) {
                        cwyVar4.h(new awn(getString(R.string.details_page_download_size), Formatter.formatShortFileSize(this, avaVar2.c())));
                    }
                    i7++;
                    i3 = i8;
                }
                cxcVarA = cwyVar4.g();
                break;
            case 7:
                cxcVarA = awt.a(this, awwVar);
                break;
            default:
                ((czl) ((czl) awt.a.e()).i("com/google/android/apps/miphone/astrea/networkusage/ui/user/NetworkUsageItemUtils", "createTotalInstanceInfo", AIFeature.Id.AIAI_ZERO_STATE_MAP, "NetworkUsageItemUtils.java")).r("WARNING: Unknown ConnectionType %s", awwVar.a().b());
                cxcVarA = cyp.a;
                break;
        }
        cwyVar.j(cxcVarA);
        dwVar.a.b(cwyVar.g(), null);
    }
}
