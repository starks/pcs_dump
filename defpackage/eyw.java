package defpackage;

import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.PasswordAuthentication;
import java.net.Proxy;
import java.net.ProxySelector;
import java.net.SocketAddress;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: PG */
/* loaded from: classes.dex */
final class eyw implements epz {
    private final csg c;
    private final InetSocketAddress d;
    private final fbc f;
    public static final Logger a = Logger.getLogger(eyw.class.getName());
    private static final fbc e = new fbc();
    private static final csg b = new eyv(0);

    public eyw() {
        csg csgVar = b;
        fbc fbcVar = e;
        String str = System.getenv("GRPC_PROXY_EXP");
        csgVar.getClass();
        this.c = csgVar;
        fbcVar.getClass();
        this.f = fbcVar;
        if (str == null) {
            this.d = null;
            return;
        }
        String[] strArrSplit = str.split(":", 2);
        int i = strArrSplit.length > 1 ? Integer.parseInt(strArrSplit[1]) : 80;
        a.logp(Level.WARNING, "io.grpc.internal.ProxyDetectorImpl", "overrideProxy", "Detected GRPC_PROXY_EXP and will honor it, but this feature will be removed in a future release. Use the JVM flags \"-Dhttps.proxyHost=HOST -Dhttps.proxyPort=PORT\" to set the https proxy for this JVM.");
        this.d = new InetSocketAddress(strArrSplit[0], i);
    }

    private final epy b(InetSocketAddress inetSocketAddress) {
        try {
            URI uri = new URI("https", null, inetSocketAddress.getHostString(), inetSocketAddress.getPort(), null, null, null);
            ProxySelector proxySelector = (ProxySelector) this.c.a();
            if (proxySelector == null) {
                a.logp(Level.FINE, "io.grpc.internal.ProxyDetectorImpl", "detectProxy", "proxy selector is null, so continuing without proxy lookup");
                return null;
            }
            List<Proxy> listSelect = proxySelector.select(uri);
            if (listSelect.size() > 1) {
                a.logp(Level.WARNING, "io.grpc.internal.ProxyDetectorImpl", "detectProxy", "More than 1 proxy detected, gRPC will select the first one");
            }
            Proxy proxy = listSelect.get(0);
            if (proxy.type() == Proxy.Type.DIRECT) {
                return null;
            }
            InetSocketAddress inetSocketAddress2 = (InetSocketAddress) proxy.address();
            PasswordAuthentication passwordAuthenticationD = fbc.d(inetSocketAddress2.getHostString(), inetSocketAddress2.getAddress(), inetSocketAddress2.getPort());
            if (inetSocketAddress2.isUnresolved()) {
                inetSocketAddress2 = new InetSocketAddress(InetAddress.getByName(inetSocketAddress2.getHostName()), inetSocketAddress2.getPort());
            }
            enh enhVar = new enh();
            enhVar.e(inetSocketAddress);
            enhVar.d(inetSocketAddress2);
            if (passwordAuthenticationD == null) {
                return enhVar.c();
            }
            enhVar.a = passwordAuthenticationD.getUserName();
            enhVar.b = passwordAuthenticationD.getPassword() != null ? new String(passwordAuthenticationD.getPassword()) : null;
            return enhVar.c();
        } catch (URISyntaxException e2) {
            a.logp(Level.WARNING, "io.grpc.internal.ProxyDetectorImpl", "detectProxy", "Failed to construct URI for proxy lookup, proceeding without proxy", (Throwable) e2);
            return null;
        }
    }

    @Override // defpackage.epz
    public final epy a(SocketAddress socketAddress) {
        if (!(socketAddress instanceof InetSocketAddress)) {
            return null;
        }
        if (this.d == null) {
            return b((InetSocketAddress) socketAddress);
        }
        enh enhVar = new enh();
        enhVar.d(this.d);
        enhVar.e((InetSocketAddress) socketAddress);
        return enhVar.c();
    }
}
