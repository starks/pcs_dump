package defpackage;

import java.security.GeneralSecurityException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dny {
    public static final drx a;
    public static final drx b;
    public static final drx c;
    public static final drx d;
    private static final dwt e;

    static {
        dwt dwtVarB = dsp.b("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key");
        e = dwtVarB;
        int i = 6;
        a = new drx(dmp.class, dsg.class, new dnb(i));
        b = new drx(dwtVarB, dsg.class, new dnc(i));
        c = new drx(dmm.class, dsf.class, new dnd(i));
        d = new drx(dwtVarB, dsf.class, new dne(i));
    }

    public static dmo a(dvn dvnVar) throws GeneralSecurityException {
        int iOrdinal = dvnVar.ordinal();
        if (iOrdinal == 1) {
            return dmo.a;
        }
        if (iOrdinal != 2) {
            if (iOrdinal == 3) {
                return dmo.c;
            }
            if (iOrdinal != 4) {
                throw new GeneralSecurityException(a.I(dvnVar, "Unable to parse OutputPrefixType: "));
            }
        }
        return dmo.b;
    }

    public static dvn b(dmo dmoVar) {
        if (dmo.a.equals(dmoVar)) {
            return dvn.TINK;
        }
        if (dmo.b.equals(dmoVar)) {
            return dvn.CRUNCHY;
        }
        if (dmo.c.equals(dmoVar)) {
            return dvn.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(dmoVar.d));
    }
}
