package defpackage;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLSocket;

/* compiled from: PG */
/* loaded from: classes.dex */
class fcj {
    public static final fcj b;
    protected final fdd c;
    public static final Logger a = Logger.getLogger(fcj.class.getName());
    private static final fdd d = fdd.b;

    static {
        fcj fcjVar;
        ClassLoader classLoader = fcj.class.getClassLoader();
        try {
            classLoader.loadClass("com.android.org.conscrypt.OpenSSLSocketImpl");
        } catch (ClassNotFoundException e) {
            a.logp(Level.FINE, "io.grpc.okhttp.OkHttpProtocolNegotiator", "createNegotiator", "Unable to find Conscrypt. Skipping", (Throwable) e);
            try {
                classLoader.loadClass("org.apache.harmony.xnet.provider.jsse.OpenSSLSocketImpl");
            } catch (ClassNotFoundException e2) {
                a.logp(Level.FINE, "io.grpc.okhttp.OkHttpProtocolNegotiator", "createNegotiator", "Unable to find any OpenSSLSocketImpl. Skipping", (Throwable) e2);
                fcjVar = new fcj(d);
            }
        }
        fcjVar = new fci(d);
        b = fcjVar;
    }

    public fcj(fdd fddVar) {
        fddVar.getClass();
        this.c = fddVar;
    }

    public String a(SSLSocket sSLSocket) {
        return this.c.a(sSLSocket);
    }

    public String b(SSLSocket sSLSocket, String str, List list) {
        if (list != null) {
            c(sSLSocket, str, list);
        }
        try {
            sSLSocket.startHandshake();
            String strA = a(sSLSocket);
            if (strA != null) {
                return strA;
            }
            throw new RuntimeException("TLS ALPN negotiation failed with protocols: " + String.valueOf(list));
        } finally {
            this.c.d(sSLSocket);
        }
    }

    protected void c(SSLSocket sSLSocket, String str, List list) {
        this.c.b(sSLSocket, str, list);
    }
}
