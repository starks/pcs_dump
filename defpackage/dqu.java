package defpackage;

import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.KeyStoreException;
import java.util.Arrays;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dqu implements dlf {
    public static final Object a = new Object();

    public dqu() {
        new dcr((char[]) null, (byte[]) null);
    }

    public static void c(dks dksVar) throws KeyStoreException {
        byte[] bArrB = dsi.b(10);
        byte[] bArr = new byte[0];
        if (!Arrays.equals(bArrB, dksVar.a(dksVar.b(bArrB, bArr), bArr))) {
            throw new KeyStoreException("cannot use Android Keystore: encryption/decryption of non-empty message and empty aad returns an incorrect result");
        }
    }

    @Override // defpackage.dlf
    public final dks a(String str) throws GeneralSecurityException {
        dqt dqtVar;
        try {
            synchronized (a) {
                dqtVar = new dqt(dws.b(str));
                c(dqtVar);
            }
            return dqtVar;
        } catch (IOException e) {
            throw new GeneralSecurityException(e);
        }
    }

    @Override // defpackage.dlf
    public final boolean b(String str) {
        return str.toLowerCase(Locale.US).startsWith("android-keystore://");
    }
}
