package defpackage;

import java.security.GeneralSecurityException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dnq {
    public static final drx a;
    public static final drx b;
    public static final drx c;
    public static final drx d;
    private static final dwt e;

    static {
        dwt dwtVarB = dsp.b("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey");
        e = dwtVarB;
        a = new drx(dlx.class, dsg.class, new dnb(2));
        b = new drx(dwtVarB, dsg.class, new dnc(2));
        c = new drx(dls.class, dsf.class, new dnd(2));
        d = new drx(dwtVarB, dsf.class, new dne(2));
    }

    public static dlv a(duq duqVar) throws GeneralSecurityException {
        int iOrdinal = duqVar.ordinal();
        if (iOrdinal == 1) {
            return dlv.a;
        }
        if (iOrdinal == 2) {
            return dlv.d;
        }
        if (iOrdinal == 3) {
            return dlv.c;
        }
        if (iOrdinal == 4) {
            return dlv.e;
        }
        if (iOrdinal == 5) {
            return dlv.b;
        }
        throw new GeneralSecurityException("Unable to parse HashType: " + duqVar.a());
    }

    public static dlw b(dvn dvnVar) throws GeneralSecurityException {
        int iOrdinal = dvnVar.ordinal();
        if (iOrdinal == 1) {
            return dlw.a;
        }
        if (iOrdinal != 2) {
            if (iOrdinal == 3) {
                return dlw.c;
            }
            if (iOrdinal != 4) {
                throw new GeneralSecurityException(a.I(dvnVar, "Unable to parse OutputPrefixType: "));
            }
        }
        return dlw.b;
    }

    public static dut c(dlx dlxVar) {
        duq duqVar;
        asr asrVar = (asr) dut.a.createBuilder();
        if (!asrVar.a.isMutable()) {
            asrVar.B();
        }
        ((dut) asrVar.a).c = dlxVar.d;
        dlv dlvVar = dlxVar.f;
        if (dlv.a.equals(dlvVar)) {
            duqVar = duq.SHA1;
        } else if (dlv.b.equals(dlvVar)) {
            duqVar = duq.SHA224;
        } else if (dlv.c.equals(dlvVar)) {
            duqVar = duq.SHA256;
        } else if (dlv.d.equals(dlvVar)) {
            duqVar = duq.SHA384;
        } else {
            if (!dlv.e.equals(dlvVar)) {
                throw new GeneralSecurityException("Unable to serialize HashType ".concat(String.valueOf(String.valueOf(dlvVar))));
            }
            duqVar = duq.SHA512;
        }
        if (!asrVar.a.isMutable()) {
            asrVar.B();
        }
        ((dut) asrVar.a).b = duqVar.a();
        return (dut) asrVar.z();
    }

    public static dvn d(dlw dlwVar) {
        if (dlw.a.equals(dlwVar)) {
            return dvn.TINK;
        }
        if (dlw.b.equals(dlwVar)) {
            return dvn.CRUNCHY;
        }
        if (dlw.c.equals(dlwVar)) {
            return dvn.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(String.valueOf(dlwVar))));
    }
}
