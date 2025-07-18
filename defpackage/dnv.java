package defpackage;

import java.security.GeneralSecurityException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dnv {
    public static final drx a;
    public static final drx b;
    public static final drx c;
    public static final drx d;
    private static final dwt e;

    static {
        dwt dwtVarB = dsp.b("type.googleapis.com/google.crypto.tink.AesGcmSivKey");
        e = dwtVarB;
        int i = 5;
        a = new drx(dml.class, dsg.class, new dnb(i));
        b = new drx(dwtVarB, dsg.class, new dnc(i));
        c = new drx(dmi.class, dsf.class, new dnd(i));
        d = new drx(dwtVarB, dsf.class, new dne(i));
    }

    public static dmk a(dvn dvnVar) throws GeneralSecurityException {
        int iOrdinal = dvnVar.ordinal();
        if (iOrdinal == 1) {
            return dmk.a;
        }
        if (iOrdinal != 2) {
            if (iOrdinal == 3) {
                return dmk.c;
            }
            if (iOrdinal != 4) {
                throw new GeneralSecurityException(a.I(dvnVar, "Unable to parse OutputPrefixType: "));
            }
        }
        return dmk.b;
    }

    public static dvn b(dmk dmkVar) {
        if (dmk.a.equals(dmkVar)) {
            return dvn.TINK;
        }
        if (dmk.b.equals(dmkVar)) {
            return dvn.CRUNCHY;
        }
        if (dmk.c.equals(dmkVar)) {
            return dvn.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(String.valueOf(dmkVar))));
    }
}
