package defpackage;

import android.content.Context;
import android.util.Log;
import java.io.IOException;
import java.io.InputStream;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cgg {
    private static final Object f = new Object();
    private static volatile Map g;
    public final String a;
    public final dwu b;
    public final boolean c;
    public final boolean d;
    public final boolean e;

    public cgg(Context context, cgh cghVar) {
        this.a = cghVar.c ? cej.b(context, cghVar.b) : cghVar.b;
        dwu dwuVarB = dwu.b(cghVar.d);
        this.b = dwuVarB == null ? dwu.UNKNOWN : dwuVarB;
        this.c = cghVar.g;
        this.d = cghVar.e;
        this.e = cghVar.f;
    }

    public static Map a(Context context) {
        Map mapE;
        Map map = g;
        if (map != null) {
            return map;
        }
        synchronized (f) {
            mapE = g;
            if (mapE == null) {
                cxe cxeVar = new cxe();
                try {
                    String[] list = context.getAssets().list("phenotype");
                    if (list != null) {
                        for (String str : list) {
                            if (str.endsWith("_package_metadata.binarypb")) {
                                try {
                                    InputStream inputStreamOpen = context.getAssets().open("phenotype/" + str);
                                    try {
                                        een eenVar = een.a;
                                        egr egrVar = egr.a;
                                        cgg cggVar = new cgg(context, (cgh) efb.parseFrom(cgh.a, inputStreamOpen, een.a));
                                        cxeVar.b(cggVar.a, cggVar);
                                        if (inputStreamOpen != null) {
                                            inputStreamOpen.close();
                                        }
                                    } catch (Throwable th) {
                                        if (inputStreamOpen != null) {
                                            try {
                                                inputStreamOpen.close();
                                            } catch (Throwable th2) {
                                                th.addSuppressed(th2);
                                            }
                                        }
                                        throw th;
                                    }
                                } catch (efp e) {
                                    Log.e("PackageInfo", "Unable to read Phenotype PackageMetadata for " + str, e);
                                }
                            }
                        }
                    }
                } catch (IOException e2) {
                    Log.e("PackageInfo", "Unable to read Phenotype PackageMetadata from assets.", e2);
                }
                mapE = cxeVar.e();
                g = mapE;
            }
        }
        return mapE;
    }
}
