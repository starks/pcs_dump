package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.os.StrictMode;
import android.util.Log;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bie {
    public static final /* synthetic */ int g = 0;
    private static volatile bmc h;
    private static Context j;
    static final bic a = new bhv(blv.c("0\u0082\u0005È0\u0082\u0003° \u0003\u0002\u0001\u0002\u0002\u0014\u007f¢fú§p\u0085xb±"));
    static final bic b = new bhw(blv.c("0\u0082\u0006\u00040\u0082\u0003ì \u0003\u0002\u0001\u0002\u0002\u0014QÕÛ\u0004÷XçB\u0086<"));
    static final bic c = new bhx(blv.c("0\u0082\u0005È0\u0082\u0003° \u0003\u0002\u0001\u0002\u0002\u0014\u0010\u008ae\bsù/\u008eQí"));
    static final bic d = new bhy(blv.c("0\u0082\u0006\u00040\u0082\u0003ì \u0003\u0002\u0001\u0002\u0002\u0014\u0003£²\u00ad×árÊkì"));
    static final bic e = new bhz(blv.c("0\u0082\u0004C0\u0082\u0003+ \u0003\u0002\u0001\u0002\u0002\t\u0000Âà\u0087FdJ0\u008d0"));
    static final bic f = new bia(blv.c("0\u0082\u0004¨0\u0082\u0003\u0090 \u0003\u0002\u0001\u0002\u0002\t\u0000Õ\u0085¸l}ÓNõ0"));
    private static final Object i = new Object();

    static synchronized void a(Context context) {
        if (j != null) {
            Log.w("GoogleCertificates", "GoogleCertificates has been initialized already");
        } else if (context != null) {
            j = context.getApplicationContext();
        }
    }

    public static boolean b() {
        boolean zC;
        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            try {
                f();
                zC = h.c();
            } catch (RemoteException | bpm e2) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e2);
                zC = false;
            }
            return zC;
        } finally {
            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
        }
    }

    @Deprecated
    public static bik c(String str, blv blvVar, boolean z, boolean z2) {
        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            return d(str, blvVar, z, z2);
        } finally {
            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
        }
    }

    @Deprecated
    public static bik d(final String str, final blv blvVar, final boolean z, boolean z2) {
        try {
            f();
            aso.F(j);
            try {
                return h.b(new bii(str, blvVar, z, z2), new bpe(j.getPackageManager())) ? bik.a : new bij(new Callable() { // from class: bhu
                    @Override // java.util.concurrent.Callable
                    public final Object call() throws NoSuchAlgorithmException {
                        int i2 = bie.g;
                        String str2 = str;
                        boolean z3 = z;
                        blv blvVar2 = blvVar;
                        String str3 = (z3 || !bie.d(str2, blvVar2, true, false).b) ? "not allowed" : "debug cert rejected";
                        MessageDigest messageDigestA = bna.a();
                        aso.F(messageDigestA);
                        byte[] bArrDigest = messageDigestA.digest(blvVar2.aU());
                        char[] cArr = bne.a;
                        int length = bArrDigest.length;
                        char[] cArr2 = new char[length + length];
                        int i3 = 0;
                        for (byte b2 : bArrDigest) {
                            int i4 = i3 + 1;
                            char[] cArr3 = bne.a;
                            cArr2[i3] = cArr3[(b2 & 255) >>> 4];
                            i3 += 2;
                            cArr2[i4] = cArr3[b2 & 15];
                        }
                        return String.format("%s: pkg=%s, sha256=%s, atk=%s, ver=%s", str3, str2, new String(cArr2), Boolean.valueOf(z3), "250825000.false");
                    }
                });
            } catch (RemoteException e2) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e2);
                return bik.b("module call", e2);
            }
        } catch (bpm e3) {
            Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e3);
            return bik.b("module init: ".concat(String.valueOf(e3.getMessage())), e3);
        }
    }

    public static bik e(String str, boolean z) {
        bik bikVarB;
        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            aso.F(j);
            try {
                f();
                try {
                    bih bihVarA = h.a(new big(str, z, false, new bpe(j), false, true, null));
                    if (bihVarA.a) {
                        bihVarA.a();
                        bikVarB = new bik(true, null);
                    } else {
                        String str2 = bihVarA.b;
                        if (bihVarA.b() == 4) {
                            new PackageManager.NameNotFoundException();
                        }
                        if (str2 == null) {
                            str2 = "error checking package certificate";
                        }
                        bihVarA.a();
                        bihVarA.b();
                        bikVarB = new bik(false, str2);
                    }
                } catch (RemoteException e2) {
                    Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e2);
                    bikVarB = bik.b("module call", e2);
                }
            } catch (bpm e3) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e3);
                bikVarB = bik.b("module init: ".concat(String.valueOf(e3.getMessage())), e3);
            }
            return bikVarB;
        } finally {
            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
        }
    }

    private static void f() {
        bmc bmbVar;
        if (h != null) {
            return;
        }
        aso.F(j);
        synchronized (i) {
            if (h == null) {
                IBinder iBinderC = bpq.d(j, bpq.c, "com.google.android.gms.googlecertificates").c("com.google.android.gms.common.GoogleCertificatesImpl");
                if (iBinderC == null) {
                    bmbVar = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = iBinderC.queryLocalInterface("com.google.android.gms.common.internal.IGoogleCertificatesApi");
                    bmbVar = iInterfaceQueryLocalInterface instanceof bmc ? (bmc) iInterfaceQueryLocalInterface : new bmb(iBinderC);
                }
                h = bmbVar;
            }
        }
    }
}
