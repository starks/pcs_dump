package defpackage;

import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fqn {
    public static final fwv d = new fwv();
    public final frf a;
    public final fqd b;
    public final List c;
    private final ffo e;

    public fqn(frf frfVar, fqd fqdVar, List list, fin finVar) {
        frfVar.getClass();
        this.a = frfVar;
        this.b = fqdVar;
        this.c = list;
        this.e = new ffw(new acp(finVar, 4));
    }

    public static final List b(fin finVar) {
        try {
            return (List) finVar.a();
        } catch (SSLPeerUnverifiedException unused) {
            return fgm.a;
        }
    }

    private static final String c(Certificate certificate) {
        if (certificate instanceof X509Certificate) {
            return ((X509Certificate) certificate).getSubjectDN().toString();
        }
        String type = certificate.getType();
        type.getClass();
        return type;
    }

    public final List a() {
        return (List) this.e.a();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof fqn)) {
            return false;
        }
        fqn fqnVar = (fqn) obj;
        return fqnVar.a == this.a && fjs.c(fqnVar.b, this.b) && fjs.c(fqnVar.a(), a()) && fjs.c(fqnVar.c, this.c);
    }

    public final int hashCode() {
        return ((((((this.a.hashCode() + 527) * 31) + this.b.hashCode()) * 31) + a().hashCode()) * 31) + this.c.hashCode();
    }

    public final String toString() {
        List listA = a();
        ArrayList arrayList = new ArrayList(ffh.Q(listA));
        Iterator it = listA.iterator();
        while (it.hasNext()) {
            arrayList.add(c((Certificate) it.next()));
        }
        String string = arrayList.toString();
        frf frfVar = this.a;
        fqd fqdVar = this.b;
        List list = this.c;
        ArrayList arrayList2 = new ArrayList(ffh.Q(list));
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList2.add(c((Certificate) it2.next()));
        }
        return "Handshake{tlsVersion=" + frfVar + " cipherSuite=" + fqdVar + " peerCertificates=" + string + " localCertificates=" + arrayList2 + "}";
    }
}
