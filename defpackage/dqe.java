package defpackage;

import java.security.GeneralSecurityException;
import java.security.spec.ECPoint;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dqe {
    public static final drx a;
    public static final drx b;
    public static final drx c;
    public static final drx d;
    public static final drx e;
    public static final drx f;
    public static final exo g;
    private static final dwt h;
    private static final dwt i;
    private static final exo j;
    private static final exo k;
    private static final exo l;

    static {
        dwt dwtVarB = dsp.b("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey");
        h = dwtVarB;
        dwt dwtVarB2 = dsp.b("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPublicKey");
        i = dwtVarB2;
        a = new drx(dpf.class, dsg.class, new dnb(11));
        b = new drx(dwtVarB, dsg.class, new dnc(11));
        c = new drx(dph.class, dsf.class, new dnd(12));
        e = new drx(dwtVarB2, dsf.class, new dne(12));
        d = new drx(dpg.class, dsf.class, new dnd(13));
        f = new drx(dwtVarB, dsf.class, new dne(13));
        eqh eqhVar = new eqh();
        eqhVar.b(dvn.RAW, dpe.c);
        eqhVar.b(dvn.TINK, dpe.a);
        eqhVar.b(dvn.LEGACY, dpe.b);
        eqhVar.b(dvn.CRUNCHY, dpe.b);
        g = eqhVar.n();
        eqh eqhVar2 = new eqh();
        eqhVar2.b(duq.SHA1, dpc.a);
        eqhVar2.b(duq.SHA224, dpc.b);
        eqhVar2.b(duq.SHA256, dpc.c);
        eqhVar2.b(duq.SHA384, dpc.d);
        eqhVar2.b(duq.SHA512, dpc.e);
        j = eqhVar2.n();
        eqh eqhVar3 = new eqh();
        eqhVar3.b(duo.NIST_P256, dpb.a);
        eqhVar3.b(duo.NIST_P384, dpb.b);
        eqhVar3.b(duo.NIST_P521, dpb.c);
        eqhVar3.b(duo.CURVE25519, dpb.d);
        k = eqhVar3.n();
        eqh eqhVar4 = new eqh();
        eqhVar4.b(duh.UNCOMPRESSED, dpd.b);
        eqhVar4.b(duh.COMPRESSED, dpd.a);
        eqhVar4.b(duh.DO_NOT_USE_CRUNCHY_UNCOMPRESSED, dpd.c);
        l = eqhVar4.n();
    }

    public static int a(dpb dpbVar) {
        if (dpb.a.equals(dpbVar)) {
            return 33;
        }
        if (dpb.b.equals(dpbVar)) {
            return 49;
        }
        if (dpb.c.equals(dpbVar)) {
            return 67;
        }
        throw new GeneralSecurityException("Unable to serialize CurveType ".concat(String.valueOf(String.valueOf(dpbVar))));
    }

    public static dpf b(dvn dvnVar, duk dukVar) {
        asr asrVar = (asr) dve.a.createBuilder();
        dui duiVar = dukVar.d;
        if (duiVar == null) {
            duiVar = dui.a;
        }
        dve dveVar = duiVar.c;
        if (dveVar == null) {
            dveVar = dve.a;
        }
        String str = dveVar.b;
        if (!asrVar.a.isMutable()) {
            asrVar.B();
        }
        dve dveVar2 = (dve) asrVar.a;
        str.getClass();
        dveVar2.b = str;
        dvn dvnVar2 = dvn.RAW;
        if (!asrVar.a.isMutable()) {
            asrVar.B();
        }
        ((dve) asrVar.a).d = dvnVar2.a();
        dui duiVar2 = dukVar.d;
        if (duiVar2 == null) {
            duiVar2 = dui.a;
        }
        dve dveVar3 = duiVar2.c;
        if (dveVar3 == null) {
            dveVar3 = dve.a;
        }
        eea eeaVar = dveVar3.c;
        if (!asrVar.a.isMutable()) {
            asrVar.B();
        }
        dve dveVar4 = (dve) asrVar.a;
        eeaVar.getClass();
        dveVar4.c = eeaVar;
        dve dveVar5 = (dve) asrVar.z();
        Set set = dpf.a;
        dpa dpaVar = new dpa();
        dpaVar.e = (dpe) g.e(dvnVar);
        exo exoVar = k;
        dun dunVar = dukVar.c;
        if (dunVar == null) {
            dunVar = dun.a;
        }
        duo duoVarB = duo.b(dunVar.b);
        if (duoVarB == null) {
            duoVarB = duo.UNRECOGNIZED;
        }
        dpaVar.a = (dpb) exoVar.e(duoVarB);
        exo exoVar2 = j;
        dun dunVar2 = dukVar.c;
        if (dunVar2 == null) {
            dunVar2 = dun.a;
        }
        duq duqVarB = duq.b(dunVar2.c);
        if (duqVarB == null) {
            duqVarB = duq.UNRECOGNIZED;
        }
        dpaVar.b = (dpc) exoVar2.e(duqVarB);
        dpaVar.b(cnx.s(dveVar5.toByteArray()));
        dun dunVar3 = dukVar.c;
        if (dunVar3 == null) {
            dunVar3 = dun.a;
        }
        dwt dwtVarB = dwt.b(dunVar3.d.x());
        if (dwtVarB.a() == 0) {
            dpaVar.f = null;
        } else {
            dpaVar.f = dwtVarB;
        }
        dun dunVar4 = dukVar.c;
        if (dunVar4 == null) {
            dunVar4 = dun.a;
        }
        duo duoVarB2 = duo.b(dunVar4.b);
        if (duoVarB2 == null) {
            duoVarB2 = duo.UNRECOGNIZED;
        }
        if (duoVarB2.equals(duo.CURVE25519)) {
            duh duhVarB = duh.b(dukVar.e);
            if (duhVarB == null) {
                duhVarB = duh.UNRECOGNIZED;
            }
            if (!duhVarB.equals(duh.COMPRESSED)) {
                throw new GeneralSecurityException("For CURVE25519 EcPointFormat must be compressed");
            }
        } else {
            exo exoVar3 = l;
            duh duhVarB2 = duh.b(dukVar.e);
            if (duhVarB2 == null) {
                duhVarB2 = duh.UNRECOGNIZED;
            }
            dpaVar.c = (dpd) exoVar3.e(duhVarB2);
        }
        return dpaVar.a();
    }

    public static duk c(dpf dpfVar) {
        asr asrVar = (asr) dun.a.createBuilder();
        duo duoVar = (duo) k.d(dpfVar.b);
        if (!asrVar.a.isMutable()) {
            asrVar.B();
        }
        ((dun) asrVar.a).b = duoVar.a();
        duq duqVar = (duq) j.d(dpfVar.c);
        if (!asrVar.a.isMutable()) {
            asrVar.B();
        }
        ((dun) asrVar.a).c = duqVar.a();
        dwt dwtVar = dpfVar.g;
        if (dwtVar != null && dwtVar.a() > 0) {
            eea eeaVarR = eea.r(dpfVar.g.c());
            if (!asrVar.a.isMutable()) {
                asrVar.B();
            }
            ((dun) asrVar.a).d = eeaVarR;
        }
        dun dunVar = (dun) asrVar.z();
        try {
            byte[] bArrT = cnx.t(dpfVar.f);
            een eenVar = een.a;
            egr egrVar = egr.a;
            dve dveVar = (dve) efb.parseFrom(dve.a, bArrT, een.a);
            asr asrVar2 = (asr) dui.a.createBuilder();
            asr asrVar3 = (asr) dve.a.createBuilder();
            String str = dveVar.b;
            if (!asrVar3.a.isMutable()) {
                asrVar3.B();
            }
            dve dveVar2 = (dve) asrVar3.a;
            str.getClass();
            dveVar2.b = str;
            dvn dvnVar = dvn.TINK;
            if (!asrVar3.a.isMutable()) {
                asrVar3.B();
            }
            ((dve) asrVar3.a).d = dvnVar.a();
            eea eeaVar = dveVar.c;
            if (!asrVar3.a.isMutable()) {
                asrVar3.B();
            }
            dve dveVar3 = (dve) asrVar3.a;
            eeaVar.getClass();
            dveVar3.c = eeaVar;
            dve dveVar4 = (dve) asrVar3.z();
            if (!asrVar2.a.isMutable()) {
                asrVar2.B();
            }
            dui duiVar = (dui) asrVar2.a;
            dveVar4.getClass();
            duiVar.c = dveVar4;
            duiVar.b |= 1;
            dui duiVar2 = (dui) asrVar2.z();
            dpd dpdVar = dpfVar.d;
            if (dpdVar == null) {
                dpdVar = dpd.a;
            }
            asr asrVar4 = (asr) duk.a.createBuilder();
            if (!asrVar4.a.isMutable()) {
                asrVar4.B();
            }
            duk dukVar = (duk) asrVar4.a;
            dunVar.getClass();
            dukVar.c = dunVar;
            dukVar.b |= 1;
            if (!asrVar4.a.isMutable()) {
                asrVar4.B();
            }
            duk dukVar2 = (duk) asrVar4.a;
            duiVar2.getClass();
            dukVar2.d = duiVar2;
            dukVar2.b |= 2;
            duh duhVar = (duh) l.d(dpdVar);
            if (!asrVar4.a.isMutable()) {
                asrVar4.B();
            }
            ((duk) asrVar4.a).e = duhVar.a();
            return (duk) asrVar4.z();
        } catch (efp e2) {
            throw new GeneralSecurityException("Parsing EciesParameters failed: ", e2);
        }
    }

    public static dum d(dph dphVar) {
        if (dphVar.a.b.equals(dpb.d)) {
            asr asrVar = (asr) dum.a.createBuilder();
            if (!asrVar.a.isMutable()) {
                asrVar.B();
            }
            ((dum) asrVar.a).c = 0;
            duk dukVarC = c(dphVar.a);
            if (!asrVar.a.isMutable()) {
                asrVar.B();
            }
            dum dumVar = (dum) asrVar.a;
            dukVarC.getClass();
            dumVar.d = dukVarC;
            dumVar.b |= 1;
            eea eeaVarR = eea.r(dphVar.c.c());
            if (!asrVar.a.isMutable()) {
                asrVar.B();
            }
            ((dum) asrVar.a).e = eeaVarR;
            eea eeaVar = eea.b;
            if (!asrVar.a.isMutable()) {
                asrVar.B();
            }
            dum dumVar2 = (dum) asrVar.a;
            eeaVar.getClass();
            dumVar2.f = eeaVar;
            return (dum) asrVar.z();
        }
        int iA = a(dphVar.a.b);
        ECPoint eCPoint = dphVar.b;
        if (eCPoint == null) {
            throw new GeneralSecurityException("NistCurvePoint was null for NIST curve");
        }
        asr asrVar2 = (asr) dum.a.createBuilder();
        if (!asrVar2.a.isMutable()) {
            asrVar2.B();
        }
        ((dum) asrVar2.a).c = 0;
        duk dukVarC2 = c(dphVar.a);
        if (!asrVar2.a.isMutable()) {
            asrVar2.B();
        }
        dum dumVar3 = (dum) asrVar2.a;
        dukVarC2.getClass();
        dumVar3.d = dukVarC2;
        dumVar3.b |= 1;
        eea eeaVarR2 = eea.r(dcr.ar(eCPoint.getAffineX(), iA));
        if (!asrVar2.a.isMutable()) {
            asrVar2.B();
        }
        ((dum) asrVar2.a).e = eeaVarR2;
        eea eeaVarR3 = eea.r(dcr.ar(eCPoint.getAffineY(), iA));
        if (!asrVar2.a.isMutable()) {
            asrVar2.B();
        }
        ((dum) asrVar2.a).f = eeaVarR3;
        return (dum) asrVar2.z();
    }
}
