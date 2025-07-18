package com.google.android.apps.miphone.astrea.fl.brella.service;

import android.net.Uri;
import com.google.android.gms.common.api.Status;
import defpackage.aqf;
import defpackage.aqg;
import defpackage.aqi;
import defpackage.aqk;
import defpackage.aqr;
import defpackage.auh;
import defpackage.bqf;
import defpackage.bqg;
import defpackage.bqo;
import defpackage.bqp;
import defpackage.brb;
import defpackage.cnx;
import defpackage.cxg;
import defpackage.czl;
import defpackage.czn;
import defpackage.dij;
import defpackage.djy;
import defpackage.wh;
import j$.util.Optional;
import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public class AstreaResultHandlingService extends aqk {
    public static final czn a = czn.j("com/google/android/apps/miphone/astrea/fl/brella/service/AstreaResultHandlingService");
    public cxg b;
    public String c;
    public String d;
    public Executor e;
    public aqr f;
    public Optional g;
    public aqi h;
    public auh i;

    private final void e(djy djyVar, bqg bqgVar, List list, brb brbVar, String str) {
        cnx.J(djyVar, new aqg(this, bqgVar, list, brbVar, str), this.e);
    }

    @Override // defpackage.bqn
    public final void c(bqg bqgVar, boolean z, List list, brb brbVar) {
        if (!this.f.l()) {
            brbVar.b(Status.c);
            return;
        }
        aqi aqiVar = this.h;
        String str = bqgVar.d;
        if (str == null) {
            str = bqgVar.a;
        }
        String str2 = str.startsWith("aiai/") ? aqiVar.c : str.startsWith("odad/") ? aqiVar.d : null;
        if (!z || list == null || list.isEmpty() || str2 == null) {
            ((czl) ((czl) a.b()).i("com/google/android/apps/miphone/astrea/fl/brella/service/AstreaResultHandlingService", "handleResult", 94, "AstreaResultHandlingService.java")).p("ResultHandlingService callback unsuccessful");
            brbVar.b(Status.c);
            return;
        }
        if (bqgVar.f == null) {
            e(this.h.b(str2), bqgVar, list, brbVar, str2);
            return;
        }
        Optional optional = this.g;
        Uri uri = bqgVar.k;
        Uri uri2 = bqgVar.i;
        String str3 = bqgVar.a;
        if (uri != null && uri2 != null) {
            optional.isPresent();
        }
        djy djyVarJ = dij.j(cnx.B(new IllegalArgumentException("Local computation input or output is null or the resource manager is not present.")), new aqf(this, str2, 0), this.e);
        if (bqgVar.f != null) {
            bqf bqfVar = new bqf();
            bqfVar.b(bqgVar.e);
            bqfVar.e(bqgVar.b, bqgVar.c);
            bqfVar.g(bqgVar.a);
            Uri uri3 = bqgVar.f;
            Uri uri4 = bqgVar.k;
            Uri uri5 = bqgVar.i;
            String str4 = bqgVar.a;
            if (uri3 != null && uri4 != null && uri5 != null) {
                String path = uri3.getPath();
                path.getClass();
                String strG = wh.g(str4);
                if (!path.startsWith(strG)) {
                    throw new IllegalArgumentException(String.format("Given plan Uri %s is invalid", uri3));
                }
                Uri uriD = wh.d(path.substring(strG.length()));
                String path2 = uri4.getPath();
                path2.getClass();
                String strE = wh.e(str4);
                if (!path2.startsWith(strE)) {
                    throw new IllegalArgumentException(String.format("Given input Uri %s is invalid", uri4));
                }
                Uri uriD2 = wh.d(path2.substring(strE.length()));
                String path3 = uri5.getPath();
                path3.getClass();
                String strF = wh.f(str4);
                if (!path3.startsWith(strF)) {
                    throw new IllegalArgumentException(String.format("Given output Uri %s is invalid", uri5));
                }
                bqfVar.f(uriD, uriD2, wh.d(path3.substring(strF.length())));
            }
            bqp bqpVar = bqgVar.j;
            if (bqpVar != null) {
                bqo bqoVar = new bqo();
                bqoVar.b = bqpVar.b;
                bqoVar.a = bqpVar.a;
                bqfVar.f = bqoVar.a();
            }
            bqfVar.c(bqgVar.c());
            bqgVar = bqfVar.a();
        }
        e(djyVarJ, bqgVar, list, brbVar, str2);
    }

    @Override // defpackage.aqk, android.app.Service
    public final void onCreate() {
        super.onCreate();
        ((czl) ((czl) a.b()).i("com/google/android/apps/miphone/astrea/fl/brella/service/AstreaResultHandlingService", "onCreate", 60, "AstreaResultHandlingService.java")).p("AstreaResultHandlingService.onCreate()");
        this.h = new aqi(this, this.b, 2, this.i, this.c, this.d);
    }

    @Override // android.app.Service
    public final void onDestroy() {
        this.h.f();
        super.onDestroy();
    }
}
