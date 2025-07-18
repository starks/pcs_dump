package defpackage;

import java.security.InvalidAlgorithmParameterException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dor {
    public static final dsa a = new dsa(doq.class, dkv.class, new dlt(10));
    public static final dkz b;
    public static final dro c;
    public static final drm d;

    static {
        dvb dvbVar = dvb.SYMMETRIC;
        dud.a.getParserForType();
        b = new dre("type.googleapis.com/google.crypto.tink.AesSivKey", dkv.class, dvbVar);
        c = new dme();
        d = new dlz(9);
    }

    public static void a(dot dotVar) {
        int i = dotVar.a;
        if (i != 64) {
            throw new InvalidAlgorithmParameterException(a.E(i, "invalid key size: ", ". Valid keys must have 64 bytes."));
        }
    }
}
