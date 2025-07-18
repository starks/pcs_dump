package defpackage;

import java.security.interfaces.ECPrivateKey;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dwc implements dkw {
    private final ECPrivateKey a;
    private final String b;
    private final byte[] c;
    private final dwf d;
    private final dqc e;
    private final byte[] f;
    private final fsc g;

    public dwc(ECPrivateKey eCPrivateKey, byte[] bArr, String str, dwf dwfVar, dqc dqcVar, byte[] bArr2) {
        this.a = eCPrivateKey;
        this.g = new fsc(eCPrivateKey);
        this.c = bArr;
        this.b = str;
        this.d = dwfVar;
        this.e = dqcVar;
        this.f = bArr2;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0065  */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, java.security.interfaces.ECPrivateKey] */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object, java.security.interfaces.ECPrivateKey] */
    @Override // defpackage.dkw
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final byte[] a(byte[] r10, byte[] r11) throws java.lang.IllegalStateException, java.security.GeneralSecurityException {
        /*
            r9 = this;
            byte[] r0 = r9.f
            boolean r0 = defpackage.dsp.c(r0, r10)
            if (r0 == 0) goto L6d
            byte[] r0 = r9.f
            java.security.interfaces.ECPrivateKey r1 = r9.a
            java.security.spec.ECParameterSpec r1 = r1.getParams()
            java.security.spec.EllipticCurve r1 = r1.getCurve()
            dwf r2 = r9.d
            int r1 = defpackage.dcr.Z(r1)
            int r2 = r2.ordinal()
            r3 = 1
            if (r2 == 0) goto L30
            if (r2 == r3) goto L31
            r3 = 2
            if (r2 != r3) goto L28
            int r1 = r1 + r1
            goto L32
        L28:
            java.security.GeneralSecurityException r9 = new java.security.GeneralSecurityException
            java.lang.String r10 = "unknown EC point format"
            r9.<init>(r10)
            throw r9
        L30:
            int r1 = r1 + r1
        L31:
            int r1 = r1 + r3
        L32:
            int r0 = r0.length
            int r2 = r10.length
            int r1 = r1 + r0
            if (r2 < r1) goto L65
            byte[] r3 = java.util.Arrays.copyOfRange(r10, r0, r1)
            fsc r0 = r9.g
            java.lang.String r5 = r9.b
            byte[] r6 = r9.c
            dqc r2 = r9.e
            dwf r4 = r9.d
            int r8 = r2.a()
            java.lang.Object r2 = r0.a
            java.security.spec.ECParameterSpec r2 = r2.getParams()
            java.security.interfaces.ECPublicKey r2 = defpackage.dcr.ae(r2, r4, r3)
            java.lang.Object r0 = r0.a
            byte[] r4 = defpackage.dcr.ah(r0, r2)
            r7 = r11
            byte[] r11 = defpackage.dcr.W(r3, r4, r5, r6, r7, r8)
            dqc r9 = r9.e
            byte[] r9 = r9.b(r11, r10, r1)
            return r9
        L65:
            java.security.GeneralSecurityException r9 = new java.security.GeneralSecurityException
            java.lang.String r10 = "ciphertext too short"
            r9.<init>(r10)
            throw r9
        L6d:
            java.security.GeneralSecurityException r9 = new java.security.GeneralSecurityException
            java.lang.String r10 = "Invalid ciphertext (output prefix mismatch)"
            r9.<init>(r10)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dwc.a(byte[], byte[]):byte[]");
    }
}
