package defpackage;

import java.security.GeneralSecurityException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dol {
    public static final drx a;
    public static final drx b;
    public static final drx c;
    public static final drx d;
    private static final dwt e;

    static {
        dwt dwtVarB = dsp.b("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key");
        e = dwtVarB;
        int i = 8;
        a = new drx(dnp.class, dsg.class, new dnb(i));
        b = new drx(dwtVarB, dsg.class, new dnc(i));
        c = new drx(dnm.class, dsf.class, new dnd(i));
        d = new drx(dwtVarB, dsf.class, new dne(i));
    }

    public static dno a(dvn dvnVar) throws GeneralSecurityException {
        int iOrdinal = dvnVar.ordinal();
        if (iOrdinal == 1) {
            return dno.a;
        }
        if (iOrdinal != 2) {
            if (iOrdinal == 3) {
                return dno.c;
            }
            if (iOrdinal != 4) {
                throw new GeneralSecurityException(a.I(dvnVar, "Unable to parse OutputPrefixType: "));
            }
        }
        return dno.b;
    }

    public static dvn b(dno dnoVar) {
        if (dno.a.equals(dnoVar)) {
            return dvn.TINK;
        }
        if (dno.b.equals(dnoVar)) {
            return dvn.CRUNCHY;
        }
        if (dno.c.equals(dnoVar)) {
            return dvn.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(dnoVar.d));
    }
}
