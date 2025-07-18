package defpackage;

import android.os.Build;
import android.os.DeadObjectException;
import android.os.RemoteException;
import android.util.Base64;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import java.nio.charset.StandardCharsets;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ayg {
    public static volatile eqi a;
    private static volatile epg b;
    private static volatile epg c;
    private static volatile epg d;
    private static volatile epg e;

    public static epg a() {
        epg epgVarA;
        epg epgVar = e;
        if (epgVar != null) {
            return epgVar;
        }
        synchronized (ayg.class) {
            epgVarA = e;
            if (epgVarA == null) {
                epd epdVarA = epg.a();
                epdVarA.c = epf.UNARY;
                epdVarA.d = epg.c("com.google.android.apps.miphone.astrea.pd.api.ProtectedDownloadService", "DeleteVm");
                epdVarA.b();
                axq axqVar = axq.a;
                int i = fec.b;
                epdVarA.a = new fea(axqVar);
                epdVarA.b = new fea(axr.a);
                epgVarA = epdVarA.a();
                e = epgVarA;
            }
        }
        return epgVarA;
    }

    public static epg b() {
        epg epgVarA;
        epg epgVar = b;
        if (epgVar != null) {
            return epgVar;
        }
        synchronized (ayg.class) {
            epgVarA = b;
            if (epgVarA == null) {
                epd epdVarA = epg.a();
                epdVarA.c = epf.UNARY;
                epdVarA.d = epg.c("com.google.android.apps.miphone.astrea.pd.api.ProtectedDownloadService", "Download");
                epdVarA.b();
                axt axtVar = axt.a;
                int i = fec.b;
                epdVarA.a = new fea(axtVar);
                epdVarA.b = new fea(axu.a);
                epgVarA = epdVarA.a();
                b = epgVarA;
            }
        }
        return epgVarA;
    }

    public static epg c() {
        epg epgVarA;
        epg epgVar = c;
        if (epgVar != null) {
            return epgVar;
        }
        synchronized (ayg.class) {
            epgVarA = c;
            if (epgVarA == null) {
                epd epdVarA = epg.a();
                epdVarA.c = epf.UNARY;
                epdVarA.d = epg.c("com.google.android.apps.miphone.astrea.pd.api.ProtectedDownloadService", "GetManifestConfig");
                epdVarA.b();
                axv axvVar = axv.a;
                int i = fec.b;
                epdVarA.a = new fea(axvVar);
                epdVarA.b = new fea(axw.a);
                epgVarA = epdVarA.a();
                c = epgVarA;
            }
        }
        return epgVarA;
    }

    public static epg d() {
        epg epgVarA;
        epg epgVar = d;
        if (epgVar != null) {
            return epgVar;
        }
        synchronized (ayg.class) {
            epgVarA = d;
            if (epgVarA == null) {
                epd epdVarA = epg.a();
                epdVarA.c = epf.UNARY;
                epdVarA.d = epg.c("com.google.android.apps.miphone.astrea.pd.api.ProtectedDownloadService", "GetVmDescriptor");
                epdVarA.b();
                axx axxVar = axx.a;
                int i = fec.b;
                epdVarA.a = new fea(axxVar);
                epdVarA.b = new fea(axy.a);
                epgVarA = epdVarA.a();
                d = epgVarA;
            }
        }
        return epgVarA;
    }

    public static /* synthetic */ String e(int i) {
        return i != 1 ? "FAILED" : "SUCCEEDED";
    }

    public static auz f(aux auxVar, int i, long j) {
        clq.v(j >= 0);
        auz auzVarA = ava.a();
        auzVarA.b(auxVar);
        auzVarA.h(i);
        auzVarA.d(j);
        return auzVarA;
    }

    public static ava g(aux auxVar, int i, long j, String str) {
        clq.v(!clq.O(str));
        auz auzVarF = f(auxVar, i, j);
        auzVarF.j(str);
        return auzVarF.a();
    }

    public static bix h(Exception exc, int i, String str) {
        bix bixVar = new bix(new Status(i, String.valueOf(str).concat(exc.getMessage() == null ? "" : ": ".concat(String.valueOf(exc.getMessage())))));
        bixVar.initCause(exc);
        return bixVar;
    }

    public static bix i(RemoteException remoteException, String str) {
        return h(remoteException, true != (remoteException instanceof DeadObjectException) ? 19 : 20, str);
    }

    public static String j(byte[] bArr) {
        return Base64.encodeToString(bArr, 11);
    }

    public static byte[] k(String str) {
        return m(str, Build.VERSION.SDK_INT, null);
    }

    public static byte[] l(String str, Throwable th) {
        return m(str, Build.VERSION.SDK_INT, th);
    }

    public static byte[] m(String str, int i, Throwable th) {
        String strConcat = String.format(Locale.US, "ERROR : %s\nAPI_LEVEL: %d\nGMSCORE_VERSION: %s", str, Integer.valueOf(i), "25.08.25-000");
        if (th != null) {
            strConcat = String.valueOf(strConcat).concat(String.valueOf(String.format(Locale.US, "\nEXCEPTION: %s\nSTACK_TRACE: %s", th, Log.getStackTraceString(th))));
        }
        return String.valueOf(strConcat).concat(String.valueOf(String.format(Locale.US, "\nBuild.FINGERPRINT: %s", Build.FINGERPRINT))).getBytes(StandardCharsets.UTF_8);
    }

    public static euw n(auw auwVar) {
        cxo cxoVar = aux.a;
        euw euwVar = new euw((byte[]) null, (char[]) null, (byte[]) null, (byte[]) null);
        euwVar.n(auwVar);
        euwVar.m("unknown");
        euwVar.l(auj.a);
        return euwVar;
    }

    public static euw o(auw auwVar, String str) {
        clq.v(!clq.O(str));
        euw euwVarN = n(auwVar);
        euwVarN.m(str);
        return euwVarN;
    }
}
