package defpackage;

import j$.util.DesugarCollections;
import java.security.GeneralSecurityException;
import java.util.HashSet;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dmr implements dks {
    public static final /* synthetic */ int a = 0;
    private static final Set b;

    static {
        HashSet hashSet = new HashSet();
        hashSet.add("type.googleapis.com/google.crypto.tink.AesGcmKey");
        hashSet.add("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key");
        hashSet.add("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key");
        hashSet.add("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey");
        hashSet.add("type.googleapis.com/google.crypto.tink.AesGcmSivKey");
        hashSet.add("type.googleapis.com/google.crypto.tink.AesEaxKey");
        b = DesugarCollections.unmodifiableSet(hashSet);
    }

    @Deprecated
    public dmr(dve dveVar) throws GeneralSecurityException {
        if (!b.contains(dveVar.b)) {
            throw new IllegalArgumentException("Unsupported DEK key type: " + dveVar.b + ". Only Tink AEAD key types are supported.");
        }
        String str = dveVar.b;
        asr asrVar = (asr) dve.a.createBuilder(dveVar);
        dvn dvnVar = dvn.RAW;
        if (!asrVar.a.isMutable()) {
            asrVar.B();
        }
        ((dve) asrVar.a).d = dvnVar.a();
        cnx.s(((dve) asrVar.z()).toByteArray());
    }

    @Override // defpackage.dks
    public final byte[] a(byte[] bArr, byte[] bArr2) {
        throw null;
    }

    @Override // defpackage.dks
    public final byte[] b(byte[] bArr, byte[] bArr2) {
        throw null;
    }
}
