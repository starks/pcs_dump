package defpackage;

import android.net.http.X509TrustManagerExtensions;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.X509TrustManager;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fur extends fvc {
    public static final fwv a = new fwv();
    private final X509TrustManager c;
    private final X509TrustManagerExtensions d;

    public fur(X509TrustManager x509TrustManager, X509TrustManagerExtensions x509TrustManagerExtensions) {
        this.c = x509TrustManager;
        this.d = x509TrustManagerExtensions;
    }

    @Override // defpackage.fvc
    public final List a(List list, String str) throws CertificateException, SSLPeerUnverifiedException {
        list.getClass();
        try {
            List<X509Certificate> listCheckServerTrusted = this.d.checkServerTrusted((X509Certificate[]) list.toArray(new X509Certificate[0]), "RSA", str);
            listCheckServerTrusted.getClass();
            return listCheckServerTrusted;
        } catch (CertificateException e) {
            SSLPeerUnverifiedException sSLPeerUnverifiedException = new SSLPeerUnverifiedException(e.getMessage());
            sSLPeerUnverifiedException.initCause(e);
            throw sSLPeerUnverifiedException;
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof fur) && ((fur) obj).c == this.c;
    }

    public final int hashCode() {
        return System.identityHashCode(this.c);
    }
}
