package defpackage;

import java.security.GeneralSecurityException;
import java.security.spec.ECPoint;
import java.security.spec.EllipticCurve;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dph extends dpx {
    public final dpf a;
    public final ECPoint b;
    public final dwt c;
    public final dwt d;
    public final Integer e;

    private dph(dpf dpfVar, ECPoint eCPoint, dwt dwtVar, dwt dwtVar2, Integer num) {
        this.a = dpfVar;
        this.b = eCPoint;
        this.c = dwtVar;
        this.d = dwtVar2;
        this.e = num;
    }

    public static dph b(dpf dpfVar, dwt dwtVar, Integer num) throws GeneralSecurityException {
        if (!dpfVar.b.equals(dpb.d)) {
            throw new GeneralSecurityException("createForCurveX25519 may only be called with parameters for curve X25519");
        }
        f(dpfVar.e, num);
        if (dwtVar.a() == 32) {
            return new dph(dpfVar, null, dwtVar, e(dpfVar.e, num), num);
        }
        throw new GeneralSecurityException("Encoded public point byte length for X25519 curve must be 32");
    }

    public static dph c(dpf dpfVar, ECPoint eCPoint, Integer num) throws GeneralSecurityException {
        EllipticCurve curve;
        if (dpfVar.b.equals(dpb.d)) {
            throw new GeneralSecurityException("createForNistCurve may only be called with parameters for NIST curve");
        }
        f(dpfVar.e, num);
        dpb dpbVar = dpfVar.b;
        if (dpbVar == dpb.a) {
            curve = dqy.a.getCurve();
        } else if (dpbVar == dpb.b) {
            curve = dqy.b.getCurve();
        } else {
            if (dpbVar != dpb.c) {
                throw new IllegalArgumentException("Unable to determine NIST curve type for ".concat(String.valueOf(String.valueOf(dpbVar))));
            }
            curve = dqy.c.getCurve();
        }
        dqy.f(eCPoint, curve);
        return new dph(dpfVar, eCPoint, null, e(dpfVar.e, num), num);
    }

    private static dwt e(dpe dpeVar, Integer num) {
        if (dpeVar == dpe.c) {
            return dru.a;
        }
        if (num == null) {
            throw new IllegalStateException("idRequirement must be non-null for EciesParameters.Variant: ".concat(String.valueOf(String.valueOf(dpeVar))));
        }
        if (dpeVar == dpe.b) {
            return dru.a(num.intValue());
        }
        if (dpeVar == dpe.a) {
            return dru.b(num.intValue());
        }
        throw new IllegalStateException("Unknown EciesParameters.Variant: ".concat(String.valueOf(String.valueOf(dpeVar))));
    }

    private static void f(dpe dpeVar, Integer num) throws GeneralSecurityException {
        if (!dpeVar.equals(dpe.c) && num == null) {
            throw new GeneralSecurityException(a.H(dpeVar, "'idRequirement' must be non-null for ", " variant."));
        }
        if (dpeVar.equals(dpe.c) && num != null) {
            throw new GeneralSecurityException("'idRequirement' must be null for NO_PREFIX variant.");
        }
    }

    @Override // defpackage.dky
    public final Integer a() {
        return this.e;
    }

    @Override // defpackage.dpx
    public final dwt d() {
        return this.d;
    }
}
