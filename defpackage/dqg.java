package defpackage;

import java.math.BigInteger;
import java.security.GeneralSecurityException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dqg {
    private static final byte[] d = new byte[0];
    public final dqf a;
    public final byte[] b;
    public final byte[] c;
    private final BigInteger e;
    private final byte[] f;
    private BigInteger g = BigInteger.ZERO;

    private dqg(byte[] bArr, byte[] bArr2, byte[] bArr3, BigInteger bigInteger, dqf dqfVar) {
        this.c = bArr;
        this.b = bArr2;
        this.f = bArr3;
        this.e = bigInteger;
        this.a = dqfVar;
    }

    static dqg b(byte[] bArr, byte[] bArr2, byte[] bArr3, dqj dqjVar, fsc fscVar, dqf dqfVar, byte[] bArr4) throws GeneralSecurityException {
        byte[] bArrA = dqjVar.a();
        byte[] bArrW = fscVar.W();
        byte[] bArrB = dqfVar.b();
        byte[] bArr5 = dql.a;
        byte[] bArrAl = dcr.al(dql.m, bArrA, bArrW, bArrB);
        byte[] bArr6 = dql.l;
        byte[] bArr7 = d;
        byte[] bArrAl2 = dcr.al(bArr, fscVar.Y(bArr6, bArr7, "psk_id_hash", bArrAl), fscVar.Y(dql.l, bArr4, "info_hash", bArrAl));
        byte[] bArrY = fscVar.Y(bArr3, bArr7, "secret", bArrAl);
        return new dqg(bArr2, fscVar.X(bArrY, bArrAl2, "key", bArrAl, dqfVar.a()), fscVar.X(bArrY, bArrAl2, "base_nonce", bArrAl, 12), BigInteger.ONE.shiftLeft(96).subtract(BigInteger.ONE), dqfVar);
    }

    public final synchronized byte[] a() {
        byte[] bArrAm;
        bArrAm = dcr.am(this.f, dcr.ar(this.g, 12));
        if (this.g.compareTo(this.e) >= 0) {
            throw new GeneralSecurityException("message limit reached");
        }
        this.g = this.g.add(BigInteger.ONE);
        return bArrAm;
    }
}
