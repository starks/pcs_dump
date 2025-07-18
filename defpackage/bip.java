package defpackage;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.util.Log;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bip {
    public static volatile Set a;
    public static volatile Set b;
    private static bip e;
    public final Context c;
    public volatile String d;

    public bip(Context context) {
        this.c = context.getApplicationContext();
    }

    public static bip a(Context context) {
        aso.F(context);
        synchronized (bip.class) {
            if (e == null) {
                bie.a(context);
                e = new bip(context);
            }
        }
        return e;
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x009b, code lost:
    
        r5 = r9;
     */
    @java.lang.Deprecated
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final boolean b(android.content.pm.PackageInfo r10, boolean r11) {
        /*
            r0 = 1
            r1 = 0
            if (r11 == 0) goto L27
            if (r10 == 0) goto L27
            java.lang.String r2 = "com.android.vending"
            java.lang.String r3 = r10.packageName
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L1a
            java.lang.String r2 = r10.packageName
            java.lang.String r3 = "com.google.android.gms"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L27
        L1a:
            android.content.pm.ApplicationInfo r11 = r10.applicationInfo
            if (r11 != 0) goto L20
        L1e:
            r11 = r1
            goto L27
        L20:
            int r11 = r11.flags
            r11 = r11 & 129(0x81, float:1.81E-43)
            if (r11 == 0) goto L1e
            r11 = r0
        L27:
            if (r10 != 0) goto L2a
            return r1
        L2a:
            if (r11 == 0) goto L2f
            cxc r2 = defpackage.bid.b     // Catch: java.lang.IllegalArgumentException -> La6
            goto L31
        L2f:
            cxc r2 = defpackage.bid.a     // Catch: java.lang.IllegalArgumentException -> La6
        L31:
            int r3 = defpackage.bna.a     // Catch: java.lang.IllegalArgumentException -> La6
            defpackage.clq.F(r0)     // Catch: java.lang.IllegalArgumentException -> La6
            android.content.pm.SigningInfo r3 = r10.signingInfo     // Catch: java.lang.IllegalArgumentException -> La6
            if (r3 == 0) goto L67
            boolean r4 = r3.hasMultipleSigners()     // Catch: java.lang.IllegalArgumentException -> La6
            if (r4 != 0) goto L67
            android.content.pm.Signature[] r4 = r3.getSigningCertificateHistory()     // Catch: java.lang.IllegalArgumentException -> La6
            if (r4 != 0) goto L47
            goto L67
        L47:
            int r4 = defpackage.cxc.d     // Catch: java.lang.IllegalArgumentException -> La6
            cwy r4 = new cwy     // Catch: java.lang.IllegalArgumentException -> La6
            r4.<init>()     // Catch: java.lang.IllegalArgumentException -> La6
            android.content.pm.Signature[] r3 = r3.getSigningCertificateHistory()     // Catch: java.lang.IllegalArgumentException -> La6
            int r5 = r3.length     // Catch: java.lang.IllegalArgumentException -> La6
            r6 = r1
        L54:
            if (r6 >= r5) goto L62
            r7 = r3[r6]     // Catch: java.lang.IllegalArgumentException -> La6
            byte[] r7 = r7.toByteArray()     // Catch: java.lang.IllegalArgumentException -> La6
            r4.h(r7)     // Catch: java.lang.IllegalArgumentException -> La6
            int r6 = r6 + 1
            goto L54
        L62:
            cxc r3 = r4.g()     // Catch: java.lang.IllegalArgumentException -> La6
            goto L6b
        L67:
            int r3 = defpackage.cxc.d     // Catch: java.lang.IllegalArgumentException -> La6
            cxc r3 = defpackage.cyp.a     // Catch: java.lang.IllegalArgumentException -> La6
        L6b:
            boolean r4 = r3.isEmpty()     // Catch: java.lang.IllegalArgumentException -> La6
            if (r4 != 0) goto L9e
            cxc r3 = r3.h()     // Catch: java.lang.IllegalArgumentException -> La6
            int r4 = r3.size()     // Catch: java.lang.IllegalArgumentException -> La6
            r5 = r1
        L7a:
            if (r5 >= r4) goto L9d
            java.lang.Object r6 = r3.get(r5)     // Catch: java.lang.IllegalArgumentException -> La6
            byte[] r6 = (byte[]) r6     // Catch: java.lang.IllegalArgumentException -> La6
            java.util.Iterator r7 = r2.iterator()     // Catch: java.lang.IllegalArgumentException -> La6
        L86:
            boolean r8 = r7.hasNext()     // Catch: java.lang.IllegalArgumentException -> La6
            int r9 = r5 + 1
            if (r8 == 0) goto L9b
            java.lang.Object r8 = r7.next()     // Catch: java.lang.IllegalArgumentException -> La6
            byte[] r8 = (byte[]) r8     // Catch: java.lang.IllegalArgumentException -> La6
            boolean r8 = java.util.Arrays.equals(r6, r8)     // Catch: java.lang.IllegalArgumentException -> La6
            if (r8 == 0) goto L86
            return r0
        L9b:
            r5 = r9
            goto L7a
        L9d:
            return r1
        L9e:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException     // Catch: java.lang.IllegalArgumentException -> La6
            java.lang.String r3 = "Unable to obtain package certificate history."
            r2.<init>(r3)     // Catch: java.lang.IllegalArgumentException -> La6
            throw r2     // Catch: java.lang.IllegalArgumentException -> La6
        La6:
            java.lang.String r2 = "GoogleSignatureVerifier"
            java.lang.String r3 = "package info is not set correctly"
            android.util.Log.i(r2, r3)
            if (r11 == 0) goto Lb6
            blv[] r11 = defpackage.bid.c
            blv r10 = c(r10, r11)
            goto Lc2
        Lb6:
            blv[] r11 = new defpackage.blv[r0]
            blv[] r2 = defpackage.bid.c
            r2 = r2[r1]
            r11[r1] = r2
            blv r10 = c(r10, r11)
        Lc2:
            if (r10 == 0) goto Lc5
            return r0
        Lc5:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bip.b(android.content.pm.PackageInfo, boolean):boolean");
    }

    private static blv c(PackageInfo packageInfo, blv... blvVarArr) {
        if (packageInfo.signatures != null) {
            if (packageInfo.signatures.length != 1) {
                Log.w("GoogleSignatureVerifier", "Package has more than one signature.");
                return null;
            }
            bib bibVar = new bib(packageInfo.signatures[0].toByteArray());
            for (int i = 0; i < blvVarArr.length; i++) {
                if (blvVarArr[i].equals(bibVar)) {
                    return blvVarArr[i];
                }
            }
        }
        return null;
    }
}
