package defpackage;

import java.security.GeneralSecurityException;
import javax.crypto.Cipher;

/* compiled from: PG */
/* loaded from: classes.dex */
final class dnw extends ThreadLocal {
    protected static final Cipher a() {
        try {
            Cipher cipher = (Cipher) dwj.a.a("ChaCha20-Poly1305");
            if (dnx.e(cipher)) {
                return cipher;
            }
            return null;
        } catch (GeneralSecurityException unused) {
            return null;
        }
    }

    @Override // java.lang.ThreadLocal
    protected final /* bridge */ /* synthetic */ Object initialValue() {
        return a();
    }
}
