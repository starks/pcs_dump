package defpackage;

import java.security.GeneralSecurityException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dnr {
    public static final drx a;
    public static final drx b;
    public static final drx c;
    public static final drx d;
    private static final dwt e;

    static {
        dwt dwtVarB = dsp.b("type.googleapis.com/google.crypto.tink.AesEaxKey");
        e = dwtVarB;
        a = new drx(dmc.class, dsg.class, new dnb(3));
        b = new drx(dwtVarB, dsg.class, new dnc(3));
        c = new drx(dly.class, dsf.class, new dnd(3));
        d = new drx(dwtVarB, dsf.class, new dne(3));
    }

    public static dmb a(dvn dvnVar) throws GeneralSecurityException {
        int iOrdinal = dvnVar.ordinal();
        if (iOrdinal == 1) {
            return dmb.a;
        }
        if (iOrdinal != 2) {
            if (iOrdinal == 3) {
                return dmb.c;
            }
            if (iOrdinal != 4) {
                throw new GeneralSecurityException(a.I(dvnVar, "Unable to parse OutputPrefixType: "));
            }
        }
        return dmb.b;
    }

    public static dty b(dmc dmcVar) {
        if (dmcVar.c != 16) {
            throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d. Currently Tink only supports aes eax keys with tag size equal to 16 bytes.", Integer.valueOf(dmcVar.c)));
        }
        asr asrVar = (asr) dty.a.createBuilder();
        int i = dmcVar.b;
        if (!asrVar.a.isMutable()) {
            asrVar.B();
        }
        ((dty) asrVar.a).b = i;
        return (dty) asrVar.z();
    }

    public static dvn c(dmb dmbVar) {
        if (dmb.a.equals(dmbVar)) {
            return dvn.TINK;
        }
        if (dmb.b.equals(dmbVar)) {
            return dvn.CRUNCHY;
        }
        if (dmb.c.equals(dmbVar)) {
            return dvn.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(String.valueOf(dmbVar))));
    }
}
