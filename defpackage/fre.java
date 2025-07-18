package defpackage;

import java.net.InetSocketAddress;
import java.net.Proxy;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fre {
    public final fpw a;
    public final Proxy b;
    public final InetSocketAddress c;

    public fre(fpw fpwVar, Proxy proxy, InetSocketAddress inetSocketAddress) {
        proxy.getClass();
        inetSocketAddress.getClass();
        this.a = fpwVar;
        this.b = proxy;
        this.c = inetSocketAddress;
    }

    public final boolean a() {
        return this.a.c != null && this.b.type() == Proxy.Type.HTTP;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof fre)) {
            return false;
        }
        fre freVar = (fre) obj;
        return fjs.c(freVar.a, this.a) && fjs.c(freVar.b, this.b) && fjs.c(freVar.c, this.c);
    }

    public final int hashCode() {
        return ((((this.a.hashCode() + 527) * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
    }

    public final String toString() {
        return "Route{" + this.c + "}";
    }
}
