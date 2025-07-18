package defpackage;

import java.security.GeneralSecurityException;
import java.util.EnumSet;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fbz extends emw {
    static final fcu a;
    public static final long b;
    static final eyg c;
    private static final fbe n;
    public final eyg d;
    public final eyg e;
    public final fcu f;
    public long g;
    public final long h;
    public final int i;
    public int j;
    public final int k;
    public final int l;
    public final ekf m;
    private final exp o;
    private SSLSocketFactory p;

    static {
        Logger.getLogger(fbz.class.getName());
        fqe fqeVar = new fqe(fcu.a);
        fqeVar.g(fct.TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256, fct.TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256, fct.TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384, fct.TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384, fct.TLS_ECDHE_ECDSA_WITH_CHACHA20_POLY1305_SHA256, fct.TLS_ECDHE_RSA_WITH_CHACHA20_POLY1305_SHA256);
        fqeVar.i(fdg.TLS_1_2);
        fqeVar.h();
        a = new fcu(fqeVar);
        b = TimeUnit.DAYS.toNanos(1000L);
        fbx fbxVar = new fbx(0);
        n = fbxVar;
        c = new fbg(fbxVar, 0);
        EnumSet.of(eqw.MTLS, eqw.CUSTOM_MANAGERS);
    }

    public fbz(String str, int i) {
        String strD = evt.d(str, i);
        this.m = fbn.i;
        this.d = c;
        this.e = new fbg(evt.p, 0);
        this.f = a;
        this.l = 1;
        this.g = Long.MAX_VALUE;
        this.h = evt.l;
        this.i = 65535;
        this.j = 4194304;
        this.k = Integer.MAX_VALUE;
        this.o = new exp(strD, new fuu(this, null), new fuu(this, null));
    }

    @Override // defpackage.emw
    public final eon b() {
        return this.o;
    }

    public final SSLSocketFactory c() {
        try {
            if (this.p == null) {
                this.p = SSLContext.getInstance("Default", fdd.b.c).getSocketFactory();
            }
            return this.p;
        } catch (GeneralSecurityException e) {
            throw new RuntimeException("TLS Provider failure", e);
        }
    }

    public final void d(int i) {
        clq.w(true, "negative max");
        this.j = i;
    }
}
