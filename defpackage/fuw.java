package defpackage;

import java.util.List;
import javax.net.ssl.SSLSocket;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fuw implements fux {
    private fux a;
    private final fuu b;

    public fuw(fuu fuuVar) {
        this.b = fuuVar;
    }

    private final synchronized fux e(SSLSocket sSLSocket) {
        if (this.a == null && this.b.a(sSLSocket)) {
            this.a = fuu.b(sSLSocket);
        }
        return this.a;
    }

    @Override // defpackage.fux
    public final String a(SSLSocket sSLSocket) {
        fux fuxVarE = e(sSLSocket);
        if (fuxVarE != null) {
            return fuxVarE.a(sSLSocket);
        }
        return null;
    }

    @Override // defpackage.fux
    public final void b(SSLSocket sSLSocket, String str, List list) {
        fux fuxVarE = e(sSLSocket);
        if (fuxVarE != null) {
            fuxVarE.b(sSLSocket, str, list);
        }
    }

    @Override // defpackage.fux
    public final boolean c() {
        return true;
    }

    @Override // defpackage.fux
    public final boolean d(SSLSocket sSLSocket) {
        return this.b.a(sSLSocket);
    }
}
