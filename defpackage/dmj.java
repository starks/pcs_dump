package defpackage;

import java.security.NoSuchAlgorithmException;
import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dmj {
    public static final dsa a = new dsa(dmi.class, dks.class, new dlt(4));
    public static final drm b = new dlz(3);
    public static final dro c = new dme();
    public static final dkz d;

    static {
        dvb dvbVar = dvb.SYMMETRIC;
        dub.a.getParserForType();
        d = new dre("type.googleapis.com/google.crypto.tink.AesGcmSivKey", dks.class, dvbVar);
    }

    public static boolean a() throws NoSuchPaddingException, NoSuchAlgorithmException {
        try {
            Cipher.getInstance("AES/GCM-SIV/NoPadding");
            return true;
        } catch (NoSuchAlgorithmException | NoSuchPaddingException unused) {
            return false;
        }
    }
}
