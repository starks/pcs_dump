package defpackage;

import java.security.GeneralSecurityException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dqi implements dkx {
    private static final byte[] a = new byte[0];
    private final byte[] b;
    private final dqj c;
    private final dqf d;
    private final byte[] e;
    private final fsc f;

    public dqi(dwt dwtVar, dqj dqjVar, fsc fscVar, dqf dqfVar, dwt dwtVar2) {
        this.b = dwtVar.c();
        this.c = dqjVar;
        this.f = fscVar;
        this.d = dqfVar;
        this.e = dwtVar2.c();
    }

    public static dqf b(dpi dpiVar) throws GeneralSecurityException {
        if (dpiVar.equals(dpi.a)) {
            return new dpy(16);
        }
        if (dpiVar.equals(dpi.b)) {
            return new dpy(32);
        }
        if (dpiVar.equals(dpi.c)) {
            return new dpz();
        }
        throw new GeneralSecurityException("Unrecognized HPKE AEAD identifier");
    }

    public static dqj c(dpl dplVar) throws GeneralSecurityException {
        if (dplVar.equals(dpl.f)) {
            return new dqr(new fsc("HmacSha256"), 0);
        }
        if (dplVar.equals(dpl.a)) {
            return dqr.d(dwe.NIST_P256);
        }
        if (dplVar.equals(dpl.b)) {
            return dqr.d(dwe.NIST_P384);
        }
        if (dplVar.equals(dpl.c)) {
            return dqr.d(dwe.NIST_P521);
        }
        throw new GeneralSecurityException("Unrecognized HPKE KEM identifier");
    }

    public static fsc d(dpk dpkVar) throws GeneralSecurityException {
        if (dpkVar.equals(dpk.a)) {
            return new fsc("HmacSha256");
        }
        if (dpkVar.equals(dpk.b)) {
            return new fsc("HmacSha384");
        }
        if (dpkVar.equals(dpk.c)) {
            return new fsc("HmacSha512");
        }
        throw new GeneralSecurityException("Unrecognized HPKE KDF identifier");
    }

    @Override // defpackage.dkx
    public final byte[] a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (bArr2 == null) {
            bArr2 = new byte[0];
        }
        byte[] bArr3 = bArr2;
        byte[] bArr4 = this.b;
        dqj dqjVar = this.c;
        fsc fscVar = this.f;
        dqf dqfVar = this.d;
        exo exoVarC = dqjVar.c(bArr4);
        Object obj = exoVarC.b;
        byte[] bArr5 = (byte[]) obj;
        dqg dqgVarB = dqg.b(dql.a, bArr5, (byte[]) exoVarC.a, dqjVar, fscVar, dqfVar, bArr3);
        byte[] bArr6 = dqgVarB.c;
        int length = this.e.length;
        int length2 = bArr6.length;
        byte[] bArr7 = a;
        byte[] bArrA = dqgVarB.a();
        byte[] bArrD = dqgVarB.a.d(dqgVarB.b, bArrA, bArr, length + length2, bArr7);
        byte[] bArr8 = this.e;
        System.arraycopy(bArr8, 0, bArrD, 0, bArr8.length);
        System.arraycopy(bArr6, 0, bArrD, this.e.length, length2);
        return bArrD;
    }
}
