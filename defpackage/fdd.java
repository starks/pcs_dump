package defpackage;

import java.lang.reflect.InvocationTargetException;
import java.net.Socket;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.security.Provider;
import java.security.Security;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLEngine;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;

/* compiled from: PG */
/* loaded from: classes.dex */
public class fdd {
    public final Provider c;
    public static final Logger a = Logger.getLogger(fdd.class.getName());
    private static final String[] d = {"com.google.android.gms.org.conscrypt.OpenSSLProvider", "org.conscrypt.OpenSSLProvider", "com.android.org.conscrypt.OpenSSLProvider", "org.apache.harmony.xnet.provider.jsse.OpenSSLProvider", "com.google.android.libraries.stitch.sslguard.SslGuardProvider"};
    public static final fdd b = f();

    public fdd(Provider provider) {
        this.c = provider;
    }

    public static byte[] e(List list) {
        fvk fvkVar = new fvk();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            fde fdeVar = (fde) list.get(i);
            if (fdeVar != fde.HTTP_1_0) {
                fvkVar.P(fdeVar.e.length());
                fvkVar.t(fdeVar.e);
            }
        }
        return fvkVar.F();
    }

    private static fdd f() throws IllegalAccessException, NoSuchMethodException, NoSuchAlgorithmException, ClassNotFoundException, SecurityException, KeyManagementException, IllegalArgumentException, InvocationTargetException {
        Provider provider;
        Provider[] providers = Security.getProviders();
        int length = providers.length;
        int i = 0;
        loop0: while (true) {
            if (i >= length) {
                provider = null;
                break;
            }
            Provider provider2 = providers[i];
            String[] strArr = d;
            int length2 = strArr.length;
            for (int i2 = 0; i2 < 5; i2++) {
                String str = strArr[i2];
                if (str.equals(provider2.getClass().getName())) {
                    a.logp(Level.FINE, "io.grpc.okhttp.internal.Platform", "getAndroidSecurityProvider", "Found registered provider {0}", str);
                    provider = provider2;
                    break loop0;
                }
            }
            i++;
        }
        if (provider != null) {
            fcy fcyVar = new fcy((Class) null, "setUseSessionTickets", Boolean.TYPE);
            fcy fcyVar2 = new fcy((Class) null, "setHostname", String.class);
            fcy fcyVar3 = new fcy(byte[].class, "getAlpnSelectedProtocol", new Class[0]);
            fcy fcyVar4 = new fcy((Class) null, "setAlpnProtocols", byte[].class);
            try {
                Class<?> cls = Class.forName("android.net.TrafficStats");
                cls.getMethod("tagSocket", Socket.class);
                cls.getMethod("untagSocket", Socket.class);
            } catch (ClassNotFoundException | NoSuchMethodException unused) {
            }
            int i3 = 1;
            if (!provider.getName().equals("GmsCore_OpenSSL") && !provider.getName().equals("Conscrypt") && !provider.getName().equals("Ssl_Guard")) {
                try {
                    fdd.class.getClassLoader().loadClass("android.net.Network");
                } catch (ClassNotFoundException e) {
                    a.logp(Level.FINE, "io.grpc.okhttp.internal.Platform", "isAtLeastAndroid5", "Can't find class", (Throwable) e);
                    try {
                        fdd.class.getClassLoader().loadClass("android.app.ActivityOptions");
                        i3 = 2;
                    } catch (ClassNotFoundException e2) {
                        a.logp(Level.FINE, "io.grpc.okhttp.internal.Platform", "isAtLeastAndroid41", "Can't find class", (Throwable) e2);
                        i3 = 3;
                    }
                }
            }
            return new fcz(fcyVar, fcyVar2, fcyVar3, fcyVar4, provider, i3);
        }
        try {
            Provider provider3 = SSLContext.getDefault().getProvider();
            try {
                try {
                    SSLContext sSLContext = SSLContext.getInstance("TLS", provider3);
                    sSLContext.init(null, null, null);
                    SSLEngine.class.getMethod("getApplicationProtocol", null).invoke(sSLContext.createSSLEngine(), null);
                    return new fda(provider3, SSLParameters.class.getMethod("setApplicationProtocols", String[].class), SSLSocket.class.getMethod("getApplicationProtocol", null));
                } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException | KeyManagementException | NoSuchAlgorithmException unused2) {
                    Class<?> cls2 = Class.forName("org.eclipse.jetty.alpn.ALPN");
                    Class<?> cls3 = Class.forName("org.eclipse.jetty.alpn.ALPN$Provider");
                    return new fdb(cls2.getMethod("put", SSLSocket.class, cls3), cls2.getMethod("get", SSLSocket.class), cls2.getMethod("remove", SSLSocket.class), Class.forName("org.eclipse.jetty.alpn.ALPN$ClientProvider"), Class.forName("org.eclipse.jetty.alpn.ALPN$ServerProvider"), provider3);
                }
            } catch (ClassNotFoundException | NoSuchMethodException unused3) {
                return new fdd(provider3);
            }
        } catch (NoSuchAlgorithmException e3) {
            throw new RuntimeException(e3);
        }
    }

    public String a(SSLSocket sSLSocket) {
        return null;
    }

    public int c() {
        return 3;
    }

    public void d(SSLSocket sSLSocket) {
    }

    public void b(SSLSocket sSLSocket, String str, List list) {
    }
}
