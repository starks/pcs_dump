package defpackage;

import java.security.GeneralSecurityException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dnf {
    public static final drx a;
    public static final drx b;
    public static final drx c;
    public static final drx d;
    private static final dwt e;

    static {
        dwt dwtVarB = dsp.b("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey");
        e = dwtVarB;
        a = new drx(dna.class, dsg.class, new dnb(0));
        b = new drx(dwtVarB, dsg.class, new dnc(0));
        c = new drx(dmx.class, dsf.class, new dnd(0));
        d = new drx(dwtVarB, dsf.class, new dne(0));
    }

    public static dna a(dvm dvmVar, dvn dvnVar) throws GeneralSecurityException {
        dmy dmyVar;
        dmz dmzVar;
        asr asrVar = (asr) dve.a.createBuilder();
        dve dveVar = dvmVar.d;
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
        dve dveVar3 = dvmVar.d;
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
        dvn dvnVar2 = dvn.RAW;
        if (!asrVar.a.isMutable()) {
            asrVar.B();
        }
        ((dve) asrVar.a).d = dvnVar2.a();
        dli dliVarS = cnx.s(((dve) asrVar.z()).toByteArray());
        if (dliVarS instanceof dmh) {
            dmyVar = dmy.a;
        } else if (dliVarS instanceof dmp) {
            dmyVar = dmy.c;
        } else if (dliVarS instanceof dnp) {
            dmyVar = dmy.b;
        } else if (dliVarS instanceof dlx) {
            dmyVar = dmy.d;
        } else if (dliVarS instanceof dmc) {
            dmyVar = dmy.e;
        } else {
            if (!(dliVarS instanceof dml)) {
                throw new GeneralSecurityException("Unsupported DEK parameters when parsing ".concat(String.valueOf(String.valueOf(dliVarS))));
            }
            dmyVar = dmy.f;
        }
        enh enhVar = new enh();
        int iOrdinal = dvnVar.ordinal();
        if (iOrdinal == 1) {
            dmzVar = dmz.a;
        } else {
            if (iOrdinal != 3) {
                throw new GeneralSecurityException(a.I(dvnVar, "Unable to parse OutputPrefixType: "));
            }
            dmzVar = dmz.b;
        }
        enhVar.d = dmzVar;
        enhVar.c = dvmVar.c;
        enhVar.a = (dte) dliVarS;
        enhVar.b = dmyVar;
        if (enhVar.d == null) {
            enhVar.d = dmz.b;
        }
        if (enhVar.c == null) {
            throw new GeneralSecurityException("kekUri must be set");
        }
        if (enhVar.b == null) {
            throw new GeneralSecurityException("dekParsingStrategy must be set");
        }
        Object obj = enhVar.a;
        if (obj == null) {
            throw new GeneralSecurityException("dekParametersForNewKeys must be set");
        }
        if (((dte) obj).a()) {
            throw new GeneralSecurityException("dekParametersForNewKeys must not have ID Requirements");
        }
        Object obj2 = enhVar.b;
        Object obj3 = enhVar.a;
        if ((obj2.equals(dmy.a) && (obj3 instanceof dmh)) || ((obj2.equals(dmy.c) && (obj3 instanceof dmp)) || ((obj2.equals(dmy.b) && (obj3 instanceof dnp)) || ((obj2.equals(dmy.d) && (obj3 instanceof dlx)) || ((obj2.equals(dmy.e) && (obj3 instanceof dmc)) || (obj2.equals(dmy.f) && (obj3 instanceof dml))))))) {
            return new dna((dmz) enhVar.d, (String) enhVar.c, (dmy) enhVar.b, (dte) enhVar.a);
        }
        throw new GeneralSecurityException("Cannot use parsing strategy " + ((dmy) enhVar.b).g + " when new keys are picked according to " + String.valueOf(enhVar.a) + ".");
    }

    public static dvm b(dna dnaVar) {
        byte[] bArrT = cnx.t(dnaVar.c);
        try {
            een eenVar = een.a;
            egr egrVar = egr.a;
            dve dveVar = (dve) efb.parseFrom(dve.a, bArrT, een.a);
            asr asrVar = (asr) dvm.a.createBuilder();
            String str = dnaVar.b;
            if (!asrVar.a.isMutable()) {
                asrVar.B();
            }
            dvm dvmVar = (dvm) asrVar.a;
            str.getClass();
            dvmVar.c = str;
            if (!asrVar.a.isMutable()) {
                asrVar.B();
            }
            dvm dvmVar2 = (dvm) asrVar.a;
            dveVar.getClass();
            dvmVar2.d = dveVar;
            dvmVar2.b |= 1;
            return (dvm) asrVar.z();
        } catch (efp e2) {
            throw new GeneralSecurityException("Parsing KmsEnvelopeAeadKeyFormat failed: ", e2);
        }
    }

    public static dvn c(dmz dmzVar) {
        if (dmz.a.equals(dmzVar)) {
            return dvn.TINK;
        }
        if (dmz.b.equals(dmzVar)) {
            return dvn.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(String.valueOf(dmzVar))));
    }
}
