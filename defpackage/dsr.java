package defpackage;

import java.security.GeneralSecurityException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dsr {
    public static final drm a = new dlz(13);
    public static final dsa b = new dsa(dsq.class, dsu.class, new dlt(18));
    public static final dsa c = new dsa(dsq.class, dlh.class, new dlt(19));
    public static final dkz d;

    static {
        dvb dvbVar = dvb.SYMMETRIC;
        dto.a.getParserForType();
        d = new dre("type.googleapis.com/google.crypto.tink.AesCmacKey", dlh.class, dvbVar);
    }

    public static void a(dst dstVar) {
        if (dstVar.a != 32) {
            throw new GeneralSecurityException("AesCmacKey size wrong, must be 32 bytes");
        }
    }
}
