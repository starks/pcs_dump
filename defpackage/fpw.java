package defpackage;

import j$.util.Objects;
import java.net.ProxySelector;
import java.util.List;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fpw {
    public final fql a;
    public final SocketFactory b;
    public final SSLSocketFactory c;
    public final HostnameVerifier d;
    public final fqc e;
    public final fpy f;
    public final ProxySelector g;
    public final fqq h;
    public final List i;
    public final List j;

    public fpw(String str, int i, fql fqlVar, SocketFactory socketFactory, SSLSocketFactory sSLSocketFactory, HostnameVerifier hostnameVerifier, fqc fqcVar, fpy fpyVar, List list, List list2, ProxySelector proxySelector) {
        list.getClass();
        list2.getClass();
        proxySelector.getClass();
        this.a = fqlVar;
        this.b = socketFactory;
        this.c = sSLSocketFactory;
        this.d = hostnameVerifier;
        this.e = fqcVar;
        this.f = fpyVar;
        this.g = proxySelector;
        fqp fqpVar = new fqp();
        String str2 = sSLSocketFactory != null ? "https" : "http";
        if (fjz.q(str2, "http")) {
            fqpVar.a = "http";
        } else {
            if (!fjz.q(str2, "https")) {
                throw new IllegalArgumentException("unexpected scheme: ".concat(str2));
            }
            fqpVar.a = "https";
        }
        char[] cArr = fqq.a;
        String strZ = fwv.z(fwv.D(str, 0, 0, false, 7));
        if (strZ == null) {
            throw new IllegalArgumentException("unexpected host: ".concat(str));
        }
        fqpVar.d = strZ;
        if (i <= 0) {
            throw new IllegalArgumentException(a.x(i, "unexpected port: "));
        }
        fqpVar.e = i;
        this.h = fqpVar.a();
        this.i = frh.o(list);
        this.j = frh.o(list2);
    }

    public final boolean a(fpw fpwVar) {
        fpwVar.getClass();
        if (fjs.c(this.a, fpwVar.a) && fjs.c(this.f, fpwVar.f) && fjs.c(this.i, fpwVar.i) && fjs.c(this.j, fpwVar.j) && fjs.c(this.g, fpwVar.g) && fjs.c(null, null) && fjs.c(this.c, fpwVar.c) && fjs.c(this.d, fpwVar.d) && fjs.c(this.e, fpwVar.e)) {
            return this.h.d == fpwVar.h.d;
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof fpw)) {
            return false;
        }
        fpw fpwVar = (fpw) obj;
        return fjs.c(this.h, fpwVar.h) && a(fpwVar);
    }

    public final int hashCode() {
        return ((((((((((((((((((this.h.hashCode() + 527) * 31) + this.a.hashCode()) * 31) + this.f.hashCode()) * 31) + this.i.hashCode()) * 31) + this.j.hashCode()) * 31) + this.g.hashCode()) * 31) + Objects.hashCode(null)) * 31) + Objects.hashCode(this.c)) * 31) + Objects.hashCode(this.d)) * 31) + Objects.hashCode(this.e);
    }

    public final String toString() {
        ProxySelector proxySelector = this.g;
        java.util.Objects.toString(proxySelector);
        String strConcat = "proxySelector=".concat(proxySelector.toString());
        StringBuilder sb = new StringBuilder("Address{");
        fqq fqqVar = this.h;
        sb.append(fqqVar.c);
        sb.append(":");
        sb.append(fqqVar.d);
        sb.append(", ");
        sb.append(strConcat);
        sb.append("}");
        return sb.toString();
    }
}
