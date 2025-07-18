package defpackage;

import java.security.cert.X509Certificate;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ajt extends aju {
    private final byte[] a;

    public ajt(X509Certificate x509Certificate, byte[] bArr) {
        super(x509Certificate);
        this.a = bArr;
    }

    @Override // defpackage.aju, java.security.cert.Certificate
    public final byte[] getEncoded() {
        return this.a;
    }
}
