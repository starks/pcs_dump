package defpackage;

import java.security.GeneralSecurityException;
import java.security.KeyPair;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dwd implements dkx {
    public static final exo a;
    public static final exo b;
    private final String c;
    private final byte[] d;
    private final dwf e;
    private final dqc f;
    private final byte[] g;
    private final fsc h;

    static {
        eqh eqhVar = new eqh();
        eqhVar.b(dwe.NIST_P256, dpb.a);
        eqhVar.b(dwe.NIST_P384, dpb.b);
        eqhVar.b(dwe.NIST_P521, dpb.c);
        a = eqhVar.n();
        eqh eqhVar2 = new eqh();
        eqhVar2.b(dwf.UNCOMPRESSED, dpd.b);
        eqhVar2.b(dwf.COMPRESSED, dpd.a);
        eqhVar2.b(dwf.DO_NOT_USE_CRUNCHY_UNCOMPRESSED, dpd.c);
        b = eqhVar2.n();
    }

    public dwd(ECPublicKey eCPublicKey, byte[] bArr, String str, dwf dwfVar, dqc dqcVar, byte[] bArr2) {
        dqy.f(eCPublicKey.getW(), eCPublicKey.getParams().getCurve());
        this.h = new fsc(eCPublicKey);
        this.d = bArr;
        this.c = str;
        this.e = dwfVar;
        this.f = dqcVar;
        this.g = bArr2;
    }

    public static final String b(dpc dpcVar) throws GeneralSecurityException {
        if (dpcVar.equals(dpc.a)) {
            return "HmacSha1";
        }
        if (dpcVar.equals(dpc.b)) {
            return "HmacSha224";
        }
        if (dpcVar.equals(dpc.c)) {
            return "HmacSha256";
        }
        if (dpcVar.equals(dpc.d)) {
            return "HmacSha384";
        }
        if (dpcVar.equals(dpc.e)) {
            return "HmacSha512";
        }
        throw new GeneralSecurityException("hash unsupported for EciesAeadHkdf: ".concat(String.valueOf(String.valueOf(dpcVar))));
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.security.interfaces.ECPublicKey] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.security.interfaces.ECPublicKey] */
    @Override // defpackage.dkx
    public final byte[] a(byte[] bArr, byte[] bArr2) throws IllegalStateException, GeneralSecurityException {
        fsc fscVar = this.h;
        ?? r1 = fscVar.a;
        int iA = this.f.a();
        KeyPair keyPairAb = dcr.ab(r1.getParams());
        ECPublicKey eCPublicKey = (ECPublicKey) keyPairAb.getPublic();
        byte[] bArrAh = dcr.ah((ECPrivateKey) keyPairAb.getPrivate(), fscVar.a);
        byte[] bArrAj = dcr.aj(eCPublicKey.getParams().getCurve(), this.e, eCPublicKey.getW());
        exo exoVar = new exo(bArrAj, dcr.W(bArrAj, bArrAh, this.c, this.d, bArr2, iA));
        return this.f.c(((dwt) exoVar.b).c(), this.g, ((dwt) exoVar.a).c(), bArr);
    }
}
