package defpackage;

import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import javax.net.ssl.SSLPeerUnverifiedException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fqc {
    public final Set b;
    public final fvc c;
    public static final fme d = new fme();
    public static final fqc a = new fqc(ffh.N(new ArrayList()), null);

    public fqc(Set set, fvc fvcVar) {
        this.b = set;
        this.c = fvcVar;
    }

    public final void a(String str, fin finVar) {
        Set set = this.b;
        fgm<fqb> fgmVar = fgm.a;
        Iterator it = set.iterator();
        if (it.hasNext()) {
            throw null;
        }
        if (fgmVar.isEmpty()) {
            return;
        }
        List<X509Certificate> list = (List) finVar.a();
        for (X509Certificate x509Certificate : list) {
            Iterator it2 = fgmVar.iterator();
            if (it2.hasNext()) {
                throw null;
            }
        }
        StringBuilder sb = new StringBuilder("Certificate pinning failure!\n  Peer certificate chain:");
        for (X509Certificate x509Certificate2 : list) {
            sb.append("\n    ");
            sb.append(d.j(x509Certificate2));
            sb.append(": ");
            sb.append(x509Certificate2.getSubjectDN().getName());
        }
        sb.append("\n  Pinned certificates for ");
        sb.append(str);
        sb.append(":");
        for (fqb fqbVar : fgmVar) {
            sb.append("\n    ");
            sb.append(fqbVar);
        }
        throw new SSLPeerUnverifiedException(sb.toString());
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof fqc)) {
            return false;
        }
        fqc fqcVar = (fqc) obj;
        return fjs.c(fqcVar.b, this.b) && fjs.c(fqcVar.c, this.c);
    }

    public final int hashCode() {
        int iHashCode = this.b.hashCode() + 1517;
        fvc fvcVar = this.c;
        return (iHashCode * 41) + (fvcVar != null ? fvcVar.hashCode() : 0);
    }
}
