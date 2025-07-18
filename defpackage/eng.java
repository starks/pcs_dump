package defpackage;

import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class eng extends epy {
    private static final long serialVersionUID = 0;
    public final SocketAddress a;
    public final InetSocketAddress b;
    public final String c;
    public final String d;

    public eng(SocketAddress socketAddress, InetSocketAddress inetSocketAddress, String str, String str2) {
        socketAddress.getClass();
        inetSocketAddress.getClass();
        clq.J(!((InetSocketAddress) socketAddress).isUnresolved(), "The proxy address %s is not resolved", socketAddress);
        this.a = socketAddress;
        this.b = inetSocketAddress;
        this.c = str;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof eng)) {
            return false;
        }
        eng engVar = (eng) obj;
        return a.g(this.a, engVar.a) && a.g(this.b, engVar.b) && a.g(this.c, engVar.c) && a.g(this.d, engVar.d);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.d});
    }

    public final String toString() {
        crt crtVarQ = clq.Q(this);
        crtVarQ.e("proxyAddr", this.a);
        crtVarQ.e("targetAddr", this.b);
        crtVarQ.e("username", this.c);
        return crtVarQ.c("hasPassword", this.d != null).toString();
    }
}
