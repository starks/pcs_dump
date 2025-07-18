package defpackage;

import java.security.GeneralSecurityException;

/* compiled from: PG */
/* loaded from: classes.dex */
final class dmw {
    public static final drx a;
    public static final drx b;
    public static final drx c;
    public static final drx d;
    private static final dwt e;

    static {
        dwt dwtVarB = dsp.b("type.googleapis.com/google.crypto.tink.KmsAeadKey");
        e = dwtVarB;
        a = new drx(dmv.class, dsg.class, new dnb(1));
        b = new drx(dwtVarB, dsg.class, new dnc(1));
        c = new drx(dmt.class, dsf.class, new dnd(1));
        d = new drx(dwtVarB, dsf.class, new dne(1));
    }

    public static dmu a(dvn dvnVar) throws GeneralSecurityException {
        int iOrdinal = dvnVar.ordinal();
        if (iOrdinal == 1) {
            return dmu.a;
        }
        if (iOrdinal == 3) {
            return dmu.b;
        }
        throw new GeneralSecurityException(a.I(dvnVar, "Unable to parse OutputPrefixType: "));
    }

    public static dvn b(dmu dmuVar) {
        if (dmu.a.equals(dmuVar)) {
            return dvn.TINK;
        }
        if (dmu.b.equals(dmuVar)) {
            return dvn.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(dmuVar.c));
    }
}
