package defpackage;

import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import javax.crypto.Mac;

/* compiled from: PG */
/* loaded from: classes.dex */
final class dwp extends ThreadLocal {
    final /* synthetic */ dwq a;

    public dwp(dwq dwqVar) {
        this.a = dwqVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // java.lang.ThreadLocal
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Mac initialValue() throws InvalidKeyException {
        try {
            Mac mac = (Mac) dwj.b.a(this.a.a);
            mac.init(this.a.b);
            return mac;
        } catch (GeneralSecurityException e) {
            throw new IllegalStateException(e);
        }
    }
}
