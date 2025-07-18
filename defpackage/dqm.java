package defpackage;

import java.security.GeneralSecurityException;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dqm implements dkw {
    private final dkw a;
    private final byte[] b;

    public dqm(dkw dkwVar, byte[] bArr) {
        this.a = dkwVar;
        this.b = bArr;
    }

    @Override // defpackage.dkw
    public final byte[] a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] bArr3 = this.b;
        if (bArr3.length == 0) {
            return this.a.a(bArr, bArr2);
        }
        if (!dsp.c(bArr3, bArr)) {
            throw new GeneralSecurityException("Invalid ciphertext (output prefix mismatch)");
        }
        byte[] bArr4 = this.b;
        return this.a.a(Arrays.copyOfRange(bArr, bArr4.length, bArr.length), bArr2);
    }
}
