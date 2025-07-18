package defpackage;

import android.util.Log;
import java.security.GeneralSecurityException;
import java.security.ProviderException;
import javax.crypto.BadPaddingException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dqt implements dks {
    private static final String a = "dqt";
    private final dks b;

    public dqt(String str) {
        this.b = new dqs(str, cnx.q());
    }

    private static void c() throws InterruptedException {
        try {
            Thread.sleep((int) (Math.random() * 100.0d));
        } catch (InterruptedException unused) {
        }
    }

    @Override // defpackage.dks
    public final byte[] a(byte[] bArr, byte[] bArr2) throws BadPaddingException, InterruptedException {
        try {
            return this.b.a(bArr, bArr2);
        } catch (BadPaddingException e) {
            throw e;
        } catch (GeneralSecurityException | ProviderException e2) {
            Log.w(a, "encountered a potentially transient KeyStore error, will wait and retry", e2);
            c();
            return this.b.a(bArr, bArr2);
        }
    }

    @Override // defpackage.dks
    public final byte[] b(byte[] bArr, byte[] bArr2) throws InterruptedException {
        try {
            return this.b.b(bArr, bArr2);
        } catch (GeneralSecurityException | ProviderException e) {
            Log.w(a, "encountered a potentially transient KeyStore error, will wait and retry", e);
            c();
            return this.b.b(bArr, bArr2);
        }
    }
}
