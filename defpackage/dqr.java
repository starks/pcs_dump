package defpackage;

import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.NoSuchAlgorithmException;
import java.security.Provider;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.util.Arrays;
import javax.crypto.KeyAgreement;

/* compiled from: PG */
/* loaded from: classes.dex */
final class dqr implements dqj {
    private final /* synthetic */ int a;
    private final Object b;
    private final fsc c;

    private dqr(fsc fscVar, dwe dweVar, int i) {
        this.a = i;
        this.c = fscVar;
        this.b = dweVar;
    }

    static dqr d(dwe dweVar) throws GeneralSecurityException {
        int iOrdinal = dweVar.ordinal();
        if (iOrdinal == 0) {
            return new dqr(new fsc("HmacSha256"), dwe.NIST_P256, 1);
        }
        if (iOrdinal == 1) {
            return new dqr(new fsc("HmacSha384"), dwe.NIST_P384, 1);
        }
        if (iOrdinal == 2) {
            return new dqr(new fsc("HmacSha512"), dwe.NIST_P521, 1);
        }
        throw new GeneralSecurityException("invalid curve type: ".concat(String.valueOf(String.valueOf(dweVar))));
    }

    private final byte[] e(byte[] bArr, byte[] bArr2, byte[] bArr3) throws GeneralSecurityException {
        return this.c.Z(bArr, dcr.al(bArr2, bArr3), dql.c(dql.b), this.c.V());
    }

    private final byte[] f(byte[] bArr, byte[] bArr2, byte[] bArr3) throws GeneralSecurityException {
        return this.c.Z(bArr, dcr.al(bArr2, bArr3), dql.c(a()), this.c.V());
    }

    @Override // defpackage.dqj
    public final byte[] a() throws GeneralSecurityException {
        if (this.a == 0) {
            if (Arrays.equals(this.c.W(), dql.f)) {
                return dql.b;
            }
            throw new GeneralSecurityException("Could not determine HPKE KEM ID");
        }
        int iOrdinal = ((dwe) this.b).ordinal();
        if (iOrdinal == 0) {
            return dql.c;
        }
        if (iOrdinal == 1) {
            return dql.d;
        }
        if (iOrdinal == 2) {
            return dql.e;
        }
        throw new GeneralSecurityException("Could not determine HPKE KEM ID");
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [dqo, java.lang.Object] */
    @Override // defpackage.dqj
    public final byte[] b(byte[] bArr, exo exoVar) throws NoSuchAlgorithmException {
        if (this.a == 0) {
            return e(this.b.a(((dwt) exoVar.b).c(), bArr), bArr, ((dwt) exoVar.a).c());
        }
        return f(dcr.ah(dcr.ac((dwe) this.b, ((dwt) exoVar.b).c()), dcr.ad((dwe) this.b, dwf.UNCOMPRESSED, bArr)), bArr, ((dwt) exoVar.a).c());
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [dqo, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v0, types: [dqo, java.lang.Object] */
    @Override // defpackage.dqj
    public final exo c(byte[] bArr) throws IllegalStateException, GeneralSecurityException {
        if (this.a == 0) {
            exo exoVarB = this.b.b();
            Object obj = exoVarB.b;
            Object obj2 = exoVarB.a;
            return new exo(e(this.b.a((byte[]) obj, bArr), (byte[]) obj2, bArr), obj2, (byte[]) null);
        }
        Object obj3 = this.b;
        KeyPair keyPairAa = dcr.aa((dwe) obj3);
        byte[] bArrAh = dcr.ah((ECPrivateKey) keyPairAa.getPrivate(), dcr.ad((dwe) obj3, dwf.UNCOMPRESSED, bArr));
        byte[] bArrAi = dcr.ai((dwe) this.b, dwf.UNCOMPRESSED, ((ECPublicKey) keyPairAa.getPublic()).getW());
        return new exo(f(bArrAh, bArrAi, bArr), bArrAi, (byte[]) null);
    }

    public dqr(fsc fscVar, int i) throws GeneralSecurityException {
        dqo dqqVar;
        Provider providerA;
        this.a = i;
        this.c = fscVar;
        try {
            int i2 = dqp.b;
            providerA = dqv.a();
        } catch (GeneralSecurityException unused) {
            dqqVar = new dqq();
        }
        if (providerA == null) {
            throw new GeneralSecurityException("Conscrypt is not available.");
        }
        KeyFactory.getInstance("XDH", providerA);
        KeyAgreement.getInstance("XDH", providerA);
        dqqVar = new dqp(providerA);
        dqqVar.b();
        this.b = dqqVar;
    }
}
