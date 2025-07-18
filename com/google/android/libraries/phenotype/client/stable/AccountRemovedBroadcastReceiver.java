package com.google.android.libraries.phenotype.client.stable;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import defpackage.a;
import defpackage.aqf;
import defpackage.arl;
import defpackage.bcv;
import defpackage.bre;
import defpackage.cem;
import defpackage.cfz;
import defpackage.cgi;
import defpackage.cxc;
import defpackage.dhq;
import defpackage.dij;
import defpackage.diy;
import defpackage.djr;
import defpackage.dju;
import defpackage.djy;
import defpackage.ezo;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class AccountRemovedBroadcastReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        String stringExtra;
        if ("android.accounts.action.ACCOUNT_REMOVED".equals(intent.getAction()) && (stringExtra = intent.getStringExtra("accountType")) != null) {
            if ("com.google".equals(stringExtra) || "com.google.work".equals(stringExtra) || "cn.google".equals(stringExtra) || "__logged_out_type".equals(stringExtra)) {
                Bundle extras = intent.getExtras();
                String string = extras != null ? extras.getString("authAccount") : null;
                if (string != null && (string.contains("../") || string.contains("/.."))) {
                    Log.w("AccountRemovedRecv", a.z(string, "Got an invalid account name for P/H that includes '..':", ". Exiting."));
                    return;
                }
                cem.d();
                cem cemVarA = cem.a(context);
                if (cemVarA == null) {
                    Log.w("AccountRemovedRecv", "Did not set PhenotypeContext before Account Removed Broadcast. Exiting.");
                    return;
                }
                BroadcastReceiver.PendingResult pendingResultGoAsync = goAsync();
                djy[] djyVarArr = new djy[2];
                djyVarArr[0] = dhq.i(string != null ? dij.j(djr.q(cgi.b(cemVarA).b(new arl(string, 14), cemVarA.c())), new aqf(cemVarA, string, 8), cemVarA.c()) : dju.a, IOException.class, new bre(6), diy.a);
                djyVarArr[1] = string != null ? cemVarA.c().submit(new cfz(context, string, 1)) : dju.a;
                new ezo(false, cxc.p(djyVarArr)).a(new bcv(pendingResultGoAsync, 2), diy.a);
            }
        }
    }
}
