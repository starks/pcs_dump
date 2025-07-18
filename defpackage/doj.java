package defpackage;

import j$.util.Objects;
import java.security.GeneralSecurityException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class doj {
    public static final drx a;
    public static final drx b;
    public static final drx c;
    public static final drx d;
    private static final dwt e;

    static {
        dwt dwtVarB = dsp.b("type.googleapis.com/google.crypto.tink.XAesGcmKey");
        e = dwtVarB;
        int i = 7;
        a = new drx(dnl.class, dsg.class, new dnb(i));
        b = new drx(dwtVarB, dsg.class, new dnc(i));
        c = new drx(dni.class, dsf.class, new dnd(i));
        d = new drx(dwtVarB, dsf.class, new dne(i));
    }

    public static dnk a(dvn dvnVar) {
        int iOrdinal = dvnVar.ordinal();
        if (iOrdinal == 1) {
            return dnk.a;
        }
        if (iOrdinal == 3) {
            return dnk.b;
        }
        throw new GeneralSecurityException(a.I(dvnVar, "Unable to parse OutputPrefixType: "));
    }

    public static dvn b(dnk dnkVar) {
        if (Objects.equals(dnkVar, dnk.a)) {
            return dvn.TINK;
        }
        if (Objects.equals(dnkVar, dnk.b)) {
            return dvn.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(dnkVar.c));
    }
}
