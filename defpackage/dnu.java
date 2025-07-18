package defpackage;

import java.security.GeneralSecurityException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dnu {
    public static final drx a;
    public static final drx b;
    public static final drx c;
    public static final drx d;
    private static final dwt e;

    static {
        dwt dwtVarB = dsp.b("type.googleapis.com/google.crypto.tink.AesGcmKey");
        e = dwtVarB;
        int i = 4;
        a = new drx(dmh.class, dsg.class, new dnb(i));
        b = new drx(dwtVarB, dsg.class, new dnc(i));
        c = new drx(dmd.class, dsf.class, new dnd(i));
        d = new drx(dwtVarB, dsf.class, new dne(i));
    }

    public static dmg a(dvn dvnVar) throws GeneralSecurityException {
        int iOrdinal = dvnVar.ordinal();
        if (iOrdinal == 1) {
            return dmg.a;
        }
        if (iOrdinal != 2) {
            if (iOrdinal == 3) {
                return dmg.c;
            }
            if (iOrdinal != 4) {
                throw new GeneralSecurityException(a.I(dvnVar, "Unable to parse OutputPrefixType: "));
            }
        }
        return dmg.b;
    }

    public static dvn b(dmg dmgVar) {
        if (dmg.a.equals(dmgVar)) {
            return dvn.TINK;
        }
        if (dmg.b.equals(dmgVar)) {
            return dvn.CRUNCHY;
        }
        if (dmg.c.equals(dmgVar)) {
            return dvn.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(String.valueOf(dmgVar))));
    }

    public static void c(dmh dmhVar) {
        if (dmhVar.c != 16) {
            throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d. Currently Tink only supports serialization of AES GCM keys with tag size equal to 16 bytes.", Integer.valueOf(dmhVar.c)));
        }
        if (dmhVar.b != 12) {
            throw new GeneralSecurityException(String.format("Invalid IV size in bytes %d. Currently Tink only supports serialization of AES GCM keys with IV size equal to 12 bytes.", Integer.valueOf(dmhVar.b)));
        }
    }
}
