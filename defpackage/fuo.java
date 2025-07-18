package defpackage;

import java.util.List;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fuo extends fup {
    public static final boolean a;
    public static final fwv b = new fwv();

    /* JADX WARN: Removed duplicated region for block: B:22:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x005a A[PHI: r10
  0x005a: PHI (r10v2 int) = (r10v1 int), (r10v3 int) binds: [B:25:0x0050, B:28:0x0057] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x006c  */
    static {
        /*
            fwv r0 = new fwv
            r0.<init>()
            defpackage.fuo.b = r0
            java.lang.String r0 = "java.specification.version"
            java.lang.String r0 = java.lang.System.getProperty(r0)
            r1 = 1
            r2 = 0
            r3 = 0
            if (r0 == 0) goto L72
            int r4 = r0.length()
            if (r4 != 0) goto L1a
            goto L72
        L1a:
            char r5 = r0.charAt(r2)
            r6 = 48
            int r6 = defpackage.fjs.a(r5, r6)
            r7 = -2147483647(0xffffffff80000001, float:-1.4E-45)
            if (r6 >= 0) goto L3c
            if (r4 != r1) goto L2c
            goto L72
        L2c:
            r6 = 43
            if (r5 == r6) goto L39
            r6 = 45
            if (r5 == r6) goto L35
            goto L72
        L35:
            r7 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r1
            goto L3d
        L39:
            r5 = r1
            r6 = r2
            goto L3e
        L3c:
            r5 = r2
        L3d:
            r6 = r5
        L3e:
            r8 = -59652323(0xfffffffffc71c71d, float:-5.0215282E36)
            r9 = r2
            r10 = r8
        L43:
            if (r5 >= r4) goto L65
            char r11 = r0.charAt(r5)
            int r11 = defpackage.fjz.I(r11)
            if (r11 >= 0) goto L50
            goto L72
        L50:
            if (r9 >= r10) goto L5a
            if (r10 != r8) goto L72
            r10 = -214748364(0xfffffffff3333334, float:-1.4197688E31)
            if (r9 >= r10) goto L5a
            goto L72
        L5a:
            int r9 = r9 * 10
            int r12 = r7 + r11
            if (r9 >= r12) goto L61
            goto L72
        L61:
            int r9 = r9 - r11
            int r5 = r5 + 1
            goto L43
        L65:
            if (r6 == 0) goto L6c
            java.lang.Integer r0 = java.lang.Integer.valueOf(r9)
            goto L73
        L6c:
            int r0 = -r9
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            goto L73
        L72:
            r0 = r3
        L73:
            if (r0 == 0) goto L80
            int r0 = r0.intValue()
            r3 = 9
            if (r0 < r3) goto L7e
            goto L87
        L7e:
            r1 = r2
            goto L87
        L80:
            java.lang.Class<javax.net.ssl.SSLSocket> r0 = javax.net.ssl.SSLSocket.class
            java.lang.String r4 = "getApplicationProtocol"
            r0.getMethod(r4, r3)     // Catch: java.lang.NoSuchMethodException -> L7e
        L87:
            defpackage.fuo.a = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fuo.<clinit>():void");
    }

    @Override // defpackage.fup
    public final String a(SSLSocket sSLSocket) {
        try {
            String applicationProtocol = sSLSocket.getApplicationProtocol();
            if (applicationProtocol != null) {
                if (!fjs.c(applicationProtocol, "")) {
                    return applicationProtocol;
                }
            }
        } catch (UnsupportedOperationException unused) {
        }
        return null;
    }

    @Override // defpackage.fup
    public final void c(SSLSocket sSLSocket, String str, List list) {
        SSLParameters sSLParameters = sSLSocket.getSSLParameters();
        sSLParameters.setApplicationProtocols((String[]) fwv.r(list).toArray(new String[0]));
        sSLSocket.setSSLParameters(sSLParameters);
    }
}
