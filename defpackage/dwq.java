package defpackage;

import java.security.InvalidAlgorithmParameterException;
import java.security.Key;
import java.util.Arrays;
import javax.crypto.Mac;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dwq implements dtn {
    public static final int c = doo.b;
    public final String a;
    public final Key b;
    private final ThreadLocal d;
    private final int e;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:24:0x005d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public dwq(java.lang.String r6, java.security.Key r7) throws java.security.GeneralSecurityException {
        /*
            r5 = this;
            r5.<init>()
            dwp r0 = new dwp
            r0.<init>(r5)
            r5.d = r0
            int r1 = defpackage.dwq.c
            boolean r1 = defpackage.doo.a(r1)
            if (r1 == 0) goto L94
            r5.a = r6
            r5.b = r7
            byte[] r7 = r7.getEncoded()
            int r7 = r7.length
            r1 = 16
            if (r7 < r1) goto L8c
            int r7 = r6.hashCode()
            r1 = 4
            r2 = 3
            r3 = 2
            r4 = 1
            switch(r7) {
                case -1823053428: goto L53;
                case 392315023: goto L49;
                case 392315118: goto L3f;
                case 392316170: goto L35;
                case 392317873: goto L2b;
                default: goto L2a;
            }
        L2a:
            goto L5d
        L2b:
            java.lang.String r7 = "HMACSHA512"
            boolean r7 = r6.equals(r7)
            if (r7 == 0) goto L5d
            r7 = r1
            goto L5e
        L35:
            java.lang.String r7 = "HMACSHA384"
            boolean r7 = r6.equals(r7)
            if (r7 == 0) goto L5d
            r7 = r2
            goto L5e
        L3f:
            java.lang.String r7 = "HMACSHA256"
            boolean r7 = r6.equals(r7)
            if (r7 == 0) goto L5d
            r7 = r3
            goto L5e
        L49:
            java.lang.String r7 = "HMACSHA224"
            boolean r7 = r6.equals(r7)
            if (r7 == 0) goto L5d
            r7 = r4
            goto L5e
        L53:
            java.lang.String r7 = "HMACSHA1"
            boolean r7 = r6.equals(r7)
            if (r7 == 0) goto L5d
            r7 = 0
            goto L5e
        L5d:
            r7 = -1
        L5e:
            if (r7 == 0) goto L84
            if (r7 == r4) goto L81
            if (r7 == r3) goto L7e
            if (r7 == r2) goto L7b
            if (r7 != r1) goto L6b
            r6 = 64
            goto L86
        L6b:
            java.lang.String r5 = java.lang.String.valueOf(r6)
            java.security.NoSuchAlgorithmException r6 = new java.security.NoSuchAlgorithmException
            java.lang.String r7 = "unknown Hmac algorithm: "
            java.lang.String r5 = r7.concat(r5)
            r6.<init>(r5)
            throw r6
        L7b:
            r6 = 48
            goto L86
        L7e:
            r6 = 32
            goto L86
        L81:
            r6 = 28
            goto L86
        L84:
            r6 = 20
        L86:
            r5.e = r6
            r0.get()
            return
        L8c:
            java.security.InvalidAlgorithmParameterException r5 = new java.security.InvalidAlgorithmParameterException
            java.lang.String r6 = "key size too small, need at least 16 bytes"
            r5.<init>(r6)
            throw r5
        L94:
            java.security.GeneralSecurityException r5 = new java.security.GeneralSecurityException
            java.lang.String r6 = "Can not use HMAC in FIPS-mode, as BoringCrypto module is not available."
            r5.<init>(r6)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dwq.<init>(java.lang.String, java.security.Key):void");
    }

    @Override // defpackage.dtn
    public final byte[] a(byte[] bArr, int i) throws IllegalStateException, InvalidAlgorithmParameterException {
        if (i > this.e) {
            throw new InvalidAlgorithmParameterException("tag size too big");
        }
        ((Mac) this.d.get()).update(bArr);
        return Arrays.copyOf(((Mac) this.d.get()).doFinal(), i);
    }
}
