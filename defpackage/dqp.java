package defpackage;

import com.google.android.apps.aicore.aidl.AIFeature;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.Provider;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import java.util.Arrays;
import javax.crypto.KeyAgreement;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dqp implements dqo {
    public static final /* synthetic */ int b = 0;
    private static final byte[] c = {48, 46, 2, 1, 0, 48, 5, 6, 3, 43, 101, 110, 4, 34, 4, 32};
    private static final byte[] d = {48, 42, 48, 5, 6, 3, 43, 101, 110, 3, 33, 0};
    final Provider a;

    public dqp(Provider provider) {
        this.a = provider;
    }

    @Override // defpackage.dqo
    public final byte[] a(byte[] bArr, byte[] bArr2) throws IllegalStateException, InvalidKeySpecException, NoSuchAlgorithmException, InvalidKeyException {
        KeyFactory keyFactory = KeyFactory.getInstance("XDH", this.a);
        if (bArr.length != 32) {
            throw new InvalidKeyException("Invalid X25519 private key");
        }
        PrivateKey privateKeyGeneratePrivate = keyFactory.generatePrivate(new PKCS8EncodedKeySpec(dcr.al(c, bArr)));
        if (bArr2.length != 32) {
            throw new InvalidKeyException("Invalid X25519 public key");
        }
        PublicKey publicKeyGeneratePublic = keyFactory.generatePublic(new X509EncodedKeySpec(dcr.al(d, bArr2)));
        KeyAgreement keyAgreement = KeyAgreement.getInstance("XDH", this.a);
        keyAgreement.init(privateKeyGeneratePrivate);
        keyAgreement.doPhase(publicKeyGeneratePublic, true);
        return keyAgreement.generateSecret();
    }

    @Override // defpackage.dqo
    public final exo b() throws GeneralSecurityException {
        KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("XDH", this.a);
        keyPairGenerator.initialize(AIFeature.Id.ROSIE_ROBOT_TRANSLATE);
        KeyPair keyPairGenerateKeyPair = keyPairGenerator.generateKeyPair();
        byte[] encoded = keyPairGenerateKeyPair.getPrivate().getEncoded();
        if (encoded.length != 48) {
            throw new GeneralSecurityException("Invalid encoded private key length");
        }
        if (!dsp.c(c, encoded)) {
            throw new GeneralSecurityException("Invalid encoded private key prefix");
        }
        byte[] bArrCopyOfRange = Arrays.copyOfRange(encoded, 16, 48);
        byte[] encoded2 = keyPairGenerateKeyPair.getPublic().getEncoded();
        if (encoded2.length != 44) {
            throw new GeneralSecurityException("Invalid encoded public key length");
        }
        if (dsp.c(d, encoded2)) {
            return new exo((Object) bArrCopyOfRange, (Object) Arrays.copyOfRange(encoded2, 12, 44));
        }
        throw new GeneralSecurityException("Invalid encoded public key prefix");
    }
}
