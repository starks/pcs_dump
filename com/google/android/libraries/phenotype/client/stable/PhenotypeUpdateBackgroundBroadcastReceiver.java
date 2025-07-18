package com.google.android.libraries.phenotype.client.stable;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import defpackage.a;
import defpackage.arl;
import defpackage.cem;
import defpackage.cgg;
import defpackage.cgi;
import defpackage.cgn;
import defpackage.clq;
import defpackage.cnx;
import defpackage.dij;
import defpackage.djr;
import defpackage.dwu;
import defpackage.n;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class PhenotypeUpdateBackgroundBroadcastReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        String stringExtra = intent.getStringExtra("com.google.android.gms.phenotype.PACKAGE_NAME");
        if (stringExtra != null) {
            if (stringExtra.contains("../") || stringExtra.contains("/..")) {
                Log.w("PhenotypeBackgroundRecv", a.z(stringExtra, "Got an invalid config package for P/H that includes '..': ", ". Exiting."));
                return;
            }
            cem cemVarA = cem.a(context);
            if (cemVarA == null) {
                cem.d();
                clq.F(false);
                return;
            }
            Map mapA = cgg.a(context);
            if (mapA.isEmpty()) {
                return;
            }
            cgg cggVar = (cgg) mapA.get(stringExtra);
            if (cggVar == null || !cggVar.b.equals(dwu.FILE)) {
                Log.i("PhenotypeBackgroundRecv", a.z(stringExtra, "Skipping ", " which doesn't use ProcessStable flags."));
                return;
            }
            BroadcastReceiver.PendingResult pendingResultGoAsync = goAsync();
            djr djrVar = (djr) cnx.G(dij.j(djr.q(dij.i(djr.q(cgi.b(cemVarA).a()), new arl(stringExtra, 15), cemVarA.c())), new cgn(cggVar, stringExtra, cemVarA, 0), cemVarA.c()), 25L, TimeUnit.SECONDS, cemVarA.c());
            djrVar.c(new n(djrVar, stringExtra, pendingResultGoAsync, 6), cemVarA.c());
        }
    }
}
