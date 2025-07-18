package defpackage;

import java.security.GeneralSecurityException;
import java.security.spec.EllipticCurve;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dpq extends dpx {
    public final dpn a;
    public final dwt b;
    public final dwt c;
    public final Integer d;

    private dpq(dpn dpnVar, dwt dwtVar, dwt dwtVar2, Integer num) {
        this.a = dpnVar;
        this.b = dwtVar;
        this.c = dwtVar2;
        this.d = num;
    }

    public static dpq b(dpn dpnVar, dwt dwtVar, Integer num) throws GeneralSecurityException {
        EllipticCurve curve;
        dwt dwtVarB;
        dpm dpmVar = dpnVar.d;
        if (!dpmVar.equals(dpm.c) && num == null) {
            throw new GeneralSecurityException(a.H(dpmVar, "'idRequirement' must be non-null for ", " variant."));
        }
        if (dpmVar.equals(dpm.c) && num != null) {
            throw new GeneralSecurityException("'idRequirement' must be null for NO_PREFIX variant.");
        }
        dpl dplVar = dpnVar.a;
        int iA = dwtVar.a();
        String str = "Encoded public key byte length for " + String.valueOf(dplVar) + " must be %d, not " + iA;
        dpl dplVar2 = dpl.a;
        if (dplVar == dplVar2) {
            if (iA != 65) {
                throw new GeneralSecurityException(String.format(str, 65));
            }
        } else if (dplVar == dpl.b) {
            if (iA != 97) {
                throw new GeneralSecurityException(String.format(str, 97));
            }
        } else if (dplVar == dpl.c) {
            if (iA != 133) {
                throw new GeneralSecurityException(String.format(str, 133));
            }
        } else {
            if (dplVar != dpl.f) {
                throw new GeneralSecurityException("Unable to validate public key length for ".concat(String.valueOf(String.valueOf(dplVar))));
            }
            if (iA != 32) {
                throw new GeneralSecurityException(String.format(str, 32));
            }
        }
        if (dplVar == dplVar2 || dplVar == dpl.b || dplVar == dpl.c) {
            if (dplVar == dplVar2) {
                curve = dqy.a.getCurve();
            } else if (dplVar == dpl.b) {
                curve = dqy.b.getCurve();
            } else {
                if (dplVar != dpl.c) {
                    throw new IllegalArgumentException("Unable to determine NIST curve type for ".concat(String.valueOf(String.valueOf(dplVar))));
                }
                curve = dqy.c.getCurve();
            }
            dqy.f(dcr.ag(curve, dwf.UNCOMPRESSED, dwtVar.c()), curve);
        }
        dpm dpmVar2 = dpnVar.d;
        if (dpmVar2 == dpm.c) {
            dwtVarB = dru.a;
        } else {
            if (num == null) {
                throw new IllegalStateException("idRequirement must be non-null for HpkeParameters.Variant ".concat(String.valueOf(String.valueOf(dpmVar2))));
            }
            if (dpmVar2 == dpm.b) {
                dwtVarB = dru.a(num.intValue());
            } else {
                if (dpmVar2 != dpm.a) {
                    throw new IllegalStateException("Unknown HpkeParameters.Variant: ".concat(String.valueOf(String.valueOf(dpmVar2))));
                }
                dwtVarB = dru.b(num.intValue());
            }
        }
        return new dpq(dpnVar, dwtVar, dwtVarB, num);
    }

    @Override // defpackage.dky
    public final Integer a() {
        return this.d;
    }

    @Override // defpackage.dpx
    public final dwt d() {
        return this.c;
    }
}
