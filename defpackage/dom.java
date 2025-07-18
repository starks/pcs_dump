package defpackage;

import java.security.GeneralSecurityException;
import javax.crypto.Cipher;

/* compiled from: PG */
/* loaded from: classes.dex */
final class dom extends ThreadLocal {
    protected static final Cipher a() {
        try {
            Cipher cipher = (Cipher) dwj.a.a("AES/GCM-SIV/NoPadding");
            if (don.c(cipher)) {
                return cipher;
            }
            return null;
        } catch (GeneralSecurityException e) {
            throw new IllegalStateException(e);
        }
    }

    @Override // java.lang.ThreadLocal
    protected final /* bridge */ /* synthetic */ Object initialValue() {
        return a();
    }
}
