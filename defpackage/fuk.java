package defpackage;

import android.security.NetworkSecurityPolicy;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fuk extends fup {
    private final List e;
    public static final fwv b = new fwv();
    public static final boolean a = fwv.s();

    public fuk() {
        fux[] fuxVarArr = new fux[2];
        fuxVarArr[0] = fwv.q() ? new fuq() : null;
        fuxVarArr[1] = new fuw(fuv.a);
        List listAb = ffh.ab(fuxVarArr);
        ArrayList arrayList = new ArrayList();
        for (Object obj : listAb) {
            if (((fux) obj).c()) {
                arrayList.add(obj);
            }
        }
        this.e = arrayList;
    }

    @Override // defpackage.fup
    public final String a(SSLSocket sSLSocket) {
        Object next;
        Iterator it = this.e.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((fux) next).d(sSLSocket)) {
                break;
            }
        }
        fux fuxVar = (fux) next;
        if (fuxVar != null) {
            return fuxVar.a(sSLSocket);
        }
        return null;
    }

    @Override // defpackage.fup
    public final fvc b(X509TrustManager x509TrustManager) {
        fur furVarP = fwv.p(x509TrustManager);
        return furVarP != null ? furVarP : super.b(x509TrustManager);
    }

    @Override // defpackage.fup
    public final void c(SSLSocket sSLSocket, String str, List list) {
        Object next;
        Iterator it = this.e.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (((fux) next).d(sSLSocket)) {
                    break;
                }
            }
        }
        fux fuxVar = (fux) next;
        if (fuxVar != null) {
            fuxVar.b(sSLSocket, str, list);
        }
    }

    @Override // defpackage.fup
    public final boolean d(String str) {
        return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(str);
    }
}
