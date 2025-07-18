package defpackage;

import java.net.ProxySelector;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fqu implements Cloneable {
    private final X509TrustManager A;
    private final fvc B;
    public final fqj c;
    public final List d;
    public final List e;
    public final boolean f;
    public final fpy g;
    public final boolean h;
    public final boolean i;
    public final fqi j;
    public final fql k;
    public final ProxySelector l;
    public final fpy m;
    public final SocketFactory n;
    public final SSLSocketFactory o;
    public final List p;
    public final List q;
    public final HostnameVerifier r;
    public final fqc s;
    public final int t;
    public final int u;
    public final int v;
    public final fsc w;
    public final fuu x;
    public final fsc y;
    public static final fwv z = new fwv();
    public static final List a = frh.n(fqv.d, fqv.b);
    public static final List b = frh.n(fqf.a, fqf.b);

    public fqu() {
        this(new fqt());
    }

    public final Object clone() {
        return super.clone();
    }

    public fqu(fqt fqtVar) throws NoSuchAlgorithmException, KeyStoreException {
        this.c = fqtVar.a;
        this.y = fqtVar.t;
        this.d = frh.o(fqtVar.b);
        this.e = frh.o(fqtVar.c);
        this.x = fqtVar.s;
        this.f = fqtVar.d;
        this.g = fqtVar.e;
        this.h = true;
        this.i = true;
        this.j = fqtVar.h;
        this.k = fqtVar.i;
        ProxySelector proxySelector = ProxySelector.getDefault();
        this.l = proxySelector == null ? fuy.a : proxySelector;
        this.m = fqtVar.j;
        this.n = fqtVar.k;
        List list = fqtVar.l;
        this.p = list;
        this.q = fqtVar.m;
        this.r = fqtVar.n;
        this.t = fqtVar.p;
        this.u = fqtVar.q;
        this.v = fqtVar.r;
        this.w = new fsc();
        if ((list instanceof Collection) && list.isEmpty()) {
            this.o = null;
            this.B = null;
            this.A = null;
            this.s = fqc.a;
        } else {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (((fqf) it.next()).c) {
                    fup fupVar = fup.c;
                    TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
                    trustManagerFactory.init((KeyStore) null);
                    TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
                    trustManagers.getClass();
                    if (trustManagers.length == 1) {
                        TrustManager trustManager = trustManagers[0];
                        if (trustManager instanceof X509TrustManager) {
                            trustManager.getClass();
                            X509TrustManager x509TrustManager = (X509TrustManager) trustManager;
                            this.A = x509TrustManager;
                            fup fupVar2 = fup.c;
                            x509TrustManager.getClass();
                            this.o = fupVar2.j(x509TrustManager);
                            x509TrustManager.getClass();
                            fvc fvcVarB = fup.c.b(x509TrustManager);
                            this.B = fvcVarB;
                            fqc fqcVar = fqtVar.o;
                            fvcVarB.getClass();
                            this.s = fjs.c(fqcVar.c, fvcVarB) ? fqcVar : new fqc(fqcVar.b, fvcVarB);
                        }
                    }
                    String string = Arrays.toString(trustManagers);
                    string.getClass();
                    throw new IllegalStateException("Unexpected default trust managers: ".concat(string));
                }
            }
            this.o = null;
            this.B = null;
            this.A = null;
            this.s = fqc.a;
        }
        if (this.d.contains(null)) {
            List list2 = this.d;
            Objects.toString(list2);
            throw new IllegalStateException("Null interceptor: ".concat(list2.toString()));
        }
        if (this.e.contains(null)) {
            List list3 = this.e;
            Objects.toString(list3);
            throw new IllegalStateException("Null network interceptor: ".concat(list3.toString()));
        }
        List list4 = this.p;
        if (!(list4 instanceof Collection) || !list4.isEmpty()) {
            Iterator it2 = list4.iterator();
            while (it2.hasNext()) {
                if (((fqf) it2.next()).c) {
                    if (this.o == null) {
                        throw new IllegalStateException("sslSocketFactory == null");
                    }
                    if (this.B == null) {
                        throw new IllegalStateException("certificateChainCleaner == null");
                    }
                    if (this.A == null) {
                        throw new IllegalStateException("x509TrustManager == null");
                    }
                    return;
                }
            }
        }
        if (this.o != null) {
            throw new IllegalStateException("Check failed.");
        }
        if (this.B != null) {
            throw new IllegalStateException("Check failed.");
        }
        if (this.A != null) {
            throw new IllegalStateException("Check failed.");
        }
        if (!fjs.c(this.s, fqc.a)) {
            throw new IllegalStateException("Check failed.");
        }
    }
}
