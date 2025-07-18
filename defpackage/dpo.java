package defpackage;

import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.spec.ECParameterSpec;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dpo extends dpw {
    public final dpq a;
    public final fsc b;

    private dpo(dpq dpqVar, fsc fscVar) {
        this.a = dpqVar;
        this.b = fscVar;
    }

    public static dpo e(dpq dpqVar, fsc fscVar) throws GeneralSecurityException {
        ECParameterSpec eCParameterSpec;
        int iT = fscVar.T();
        dpl dplVar = dpqVar.a.a;
        String str = "Encoded private key byte length for " + String.valueOf(dplVar) + " must be %d, not " + iT;
        if (dplVar == dpl.a) {
            if (iT != 32) {
                throw new GeneralSecurityException(String.format(str, 32));
            }
        } else if (dplVar == dpl.b) {
            if (iT != 48) {
                throw new GeneralSecurityException(String.format(str, 48));
            }
        } else if (dplVar == dpl.c) {
            if (iT != 66) {
                throw new GeneralSecurityException(String.format(str, 66));
            }
        } else {
            if (dplVar != dpl.f) {
                throw new GeneralSecurityException("Unable to validate private key length for ".concat(String.valueOf(String.valueOf(dplVar))));
            }
            if (iT != 32) {
                throw new GeneralSecurityException(String.format(str, 32));
            }
        }
        dpn dpnVar = dpqVar.a;
        byte[] bArrC = dpqVar.b.c();
        byte[] bArrU = fscVar.U();
        dpl dplVar2 = dpnVar.a;
        dpl dplVar3 = dpl.a;
        if (dplVar2 == dplVar3 || dplVar2 == dpl.b || dplVar2 == dpl.c) {
            if (dplVar2 == dplVar3) {
                eCParameterSpec = dqy.a;
            } else if (dplVar2 == dpl.b) {
                eCParameterSpec = dqy.b;
            } else {
                if (dplVar2 != dpl.c) {
                    throw new IllegalArgumentException("Unable to determine NIST curve params for ".concat(String.valueOf(String.valueOf(dplVar2))));
                }
                eCParameterSpec = dqy.c;
            }
            BigInteger order = eCParameterSpec.getOrder();
            BigInteger bigInteger = new BigInteger(1, bArrU);
            if (bigInteger.signum() <= 0 || bigInteger.compareTo(order) >= 0) {
                throw new GeneralSecurityException("Invalid private key.");
            }
            if (!dqy.e(bigInteger, eCParameterSpec).equals(dcr.ag(eCParameterSpec.getCurve(), dwf.UNCOMPRESSED, bArrC))) {
                throw new GeneralSecurityException("Invalid private key for public key.");
            }
        } else {
            if (dplVar2 != dpl.f) {
                throw new IllegalArgumentException("Unable to validate key pair for ".concat(String.valueOf(String.valueOf(dplVar2))));
            }
            if (!Arrays.equals(dcr.U(bArrU), bArrC)) {
                throw new GeneralSecurityException("Invalid private key for public key.");
            }
        }
        return new dpo(dpqVar, fscVar);
    }

    @Override // defpackage.dpw, defpackage.dlj
    public final /* synthetic */ dky b() {
        return this.a;
    }

    public final dpn c() {
        return this.a.a;
    }

    @Override // defpackage.dpw
    public final /* synthetic */ dpx d() {
        return this.a;
    }
}
