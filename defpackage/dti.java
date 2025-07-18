package defpackage;

import java.security.GeneralSecurityException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dti {
    public static final drx a;
    public static final drx b;
    public static final drx c;
    public static final drx d;
    private static final dwt e;

    static {
        dwt dwtVarB = dsp.b("type.googleapis.com/google.crypto.tink.AesCmacKey");
        e = dwtVarB;
        int i = 12;
        a = new drx(dst.class, dsg.class, new dnb(i));
        b = new drx(dwtVarB, dsg.class, new dnc(i));
        c = new drx(dsq.class, dsf.class, new dnd(15));
        d = new drx(dwtVarB, dsf.class, new dne(14));
    }

    public static dss a(dvn dvnVar) throws GeneralSecurityException {
        int iOrdinal = dvnVar.ordinal();
        if (iOrdinal == 1) {
            return dss.a;
        }
        if (iOrdinal == 2) {
            return dss.c;
        }
        if (iOrdinal == 3) {
            return dss.d;
        }
        if (iOrdinal == 4) {
            return dss.b;
        }
        throw new GeneralSecurityException(a.I(dvnVar, "Unable to parse OutputPrefixType: "));
    }

    public static dtq b(dst dstVar) {
        asr asrVar = (asr) dtq.a.createBuilder();
        if (!asrVar.a.isMutable()) {
            asrVar.B();
        }
        ((dtq) asrVar.a).b = dstVar.b;
        return (dtq) asrVar.z();
    }

    public static dvn c(dss dssVar) {
        if (dss.a.equals(dssVar)) {
            return dvn.TINK;
        }
        if (dss.b.equals(dssVar)) {
            return dvn.CRUNCHY;
        }
        if (dss.d.equals(dssVar)) {
            return dvn.RAW;
        }
        if (dss.c.equals(dssVar)) {
            return dvn.LEGACY;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(String.valueOf(dssVar))));
    }
}
