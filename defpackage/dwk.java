package defpackage;

import java.security.KeyFactory;
import java.security.KeyPairGenerator;
import java.security.MessageDigest;
import java.security.Provider;
import java.security.Signature;
import javax.crypto.Cipher;
import javax.crypto.KeyAgreement;
import javax.crypto.Mac;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dwk implements dwl {
    private final /* synthetic */ int a;

    public dwk(int i) {
        this.a = i;
    }

    @Override // defpackage.dwl
    public final /* synthetic */ Object a(String str, Provider provider) {
        int i = this.a;
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? provider == null ? Signature.getInstance(str) : Signature.getInstance(str, provider) : provider == null ? MessageDigest.getInstance(str) : MessageDigest.getInstance(str, provider) : provider == null ? Mac.getInstance(str) : Mac.getInstance(str, provider) : provider == null ? KeyPairGenerator.getInstance(str) : KeyPairGenerator.getInstance(str, provider) : provider == null ? KeyFactory.getInstance(str) : KeyFactory.getInstance(str, provider) : provider == null ? Cipher.getInstance(str) : Cipher.getInstance(str, provider) : provider == null ? KeyAgreement.getInstance(str) : KeyAgreement.getInstance(str, provider);
    }
}
