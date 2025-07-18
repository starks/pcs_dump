package defpackage;

import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.util.Arrays;
import java.util.Collection;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dwb implements dkv {
    public final byte[] b;
    public final byte[] c;
    private final dwo g;
    public static final int d = doo.a;
    private static final Collection e = Arrays.asList(64);
    private static final byte[] f = new byte[16];
    public static final ThreadLocal a = new dwa();

    private dwb(byte[] bArr, dwt dwtVar) throws GeneralSecurityException {
        if (!doo.a(d)) {
            throw new GeneralSecurityException("Can not use AES-SIV in FIPS-mode.");
        }
        int length = bArr.length;
        if (!e.contains(Integer.valueOf(length))) {
            throw new InvalidKeyException(a.E(length, "invalid key size: ", " bytes; key must have 64 bytes"));
        }
        int i = length >> 1;
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, 0, i);
        this.b = Arrays.copyOfRange(bArr, i, length);
        this.g = new dwo(bArrCopyOfRange);
        this.c = dwtVar.c();
    }

    public static dkv a(doq doqVar) {
        return new dwb(doqVar.d.U(), doqVar.b);
    }

    public final byte[] b(byte[]... bArr) throws GeneralSecurityException {
        byte[] bArrAm;
        byte[] bArrA = this.g.a(f, 16);
        for (char c = 0; c <= 0; c = 1) {
            byte[] bArr2 = bArr[0];
            if (bArr2 == null) {
                bArr2 = new byte[0];
            }
            bArrA = dcr.am(dcr.ap(bArrA), this.g.a(bArr2, 16));
        }
        byte[] bArr3 = bArr[1];
        int length = bArr3.length;
        if (length >= 16) {
            int length2 = bArrA.length;
            if (length < length2) {
                throw new IllegalArgumentException("xorEnd requires a.length >= b.length");
            }
            bArrAm = Arrays.copyOf(bArr3, length);
            for (int i = 0; i < bArrA.length; i++) {
                int i2 = (length - length2) + i;
                bArrAm[i2] = (byte) (bArrAm[i2] ^ bArrA[i]);
            }
        } else {
            bArrAm = dcr.am(dcr.ao(bArr3), dcr.ap(bArrA));
        }
        return this.g.a(bArrAm, 16);
    }
}
