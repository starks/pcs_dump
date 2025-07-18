package defpackage;

import j$.util.DesugarCollections;
import java.net.InetAddress;
import java.net.URI;
import java.net.UnknownHostException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class evd extends epo {
    public static final Logger a;
    public static final Set b;
    static final boolean c;
    static final boolean d;
    protected static final boolean e;
    public static final evc f;
    private static final String s;
    private static final String t;
    private static final String u;
    private static String v;
    private fjp A;
    final epz g;
    public final String j;
    public final int k;
    public final long l;
    public final equ m;
    public final epn n;
    public final csf o;
    protected boolean p;
    public boolean q;
    private final String w;
    private final eyg x;
    private boolean y;
    private Executor z;
    public final Random h = new Random();
    protected volatile int r = eux.a;
    public final AtomicReference i = new AtomicReference();

    static {
        Logger logger = Logger.getLogger(evd.class.getName());
        a = logger;
        b = DesugarCollections.unmodifiableSet(new HashSet(Arrays.asList("clientLanguage", "percentage", "clientHostname", "serviceConfig")));
        String property = System.getProperty("io.grpc.internal.DnsNameResolverProvider.enable_jndi", "true");
        s = property;
        String property2 = System.getProperty("io.grpc.internal.DnsNameResolverProvider.enable_jndi_localhost", "false");
        t = property2;
        String property3 = System.getProperty("io.grpc.internal.DnsNameResolverProvider.enable_service_config", "false");
        u = property3;
        c = Boolean.parseBoolean(property);
        d = Boolean.parseBoolean(property2);
        e = Boolean.parseBoolean(property3);
        evc evcVar = null;
        try {
            try {
                try {
                    evc evcVar2 = (evc) Class.forName("io.grpc.internal.JndiResourceResolverFactory", true, evd.class.getClassLoader()).asSubclass(evc.class).getConstructor(null).newInstance(null);
                    if (evcVar2.b() != null) {
                        logger.logp(Level.FINE, "io.grpc.internal.DnsNameResolver", "getResourceResolverFactory", "JndiResourceResolverFactory not available, skipping.", evcVar2.b());
                    } else {
                        evcVar = evcVar2;
                    }
                } catch (Exception e2) {
                    a.logp(Level.FINE, "io.grpc.internal.DnsNameResolver", "getResourceResolverFactory", "Can't construct JndiResourceResolverFactory, skipping.", (Throwable) e2);
                }
            } catch (Exception e3) {
                a.logp(Level.FINE, "io.grpc.internal.DnsNameResolver", "getResourceResolverFactory", "Can't find JndiResourceResolverFactory ctor, skipping.", (Throwable) e3);
            }
        } catch (ClassCastException e4) {
            a.logp(Level.FINE, "io.grpc.internal.DnsNameResolver", "getResourceResolverFactory", "Unable to cast JndiResourceResolverFactory, skipping.", (Throwable) e4);
        } catch (ClassNotFoundException e5) {
            a.logp(Level.FINE, "io.grpc.internal.DnsNameResolver", "getResourceResolverFactory", "Unable to find JndiResourceResolverFactory, skipping.", (Throwable) e5);
        }
        f = evcVar;
    }

    protected evd(String str, epi epiVar, fbe fbeVar, csf csfVar, boolean z) throws NumberFormatException {
        epiVar.getClass();
        str.getClass();
        URI uriCreate = URI.create("//".concat(str));
        clq.A(uriCreate.getHost() != null, "Invalid DNS name: %s", str);
        String authority = uriCreate.getAuthority();
        authority.getClass();
        this.w = authority;
        this.j = uriCreate.getHost();
        if (uriCreate.getPort() == -1) {
            this.k = epiVar.a;
        } else {
            this.k = uriCreate.getPort();
        }
        this.g = epiVar.b;
        Executor executor = epiVar.f;
        if (executor != null) {
            this.x = new fbg(executor, 1);
        } else {
            this.x = new fbg(fbeVar, 0);
        }
        long nanos = 0;
        if (!z) {
            String property = System.getProperty("networkaddress.cache.ttl");
            long j = 30;
            if (property != null) {
                try {
                    j = Long.parseLong(property);
                } catch (NumberFormatException unused) {
                    a.logp(Level.WARNING, "io.grpc.internal.DnsNameResolver", "getNetworkAddressCacheTtlNanos", "Property({0}) valid is not valid number format({1}), fall back to default({2})", new Object[]{"networkaddress.cache.ttl", property, 30L});
                }
            }
            nanos = j > 0 ? TimeUnit.SECONDS.toNanos(j) : j;
        }
        this.l = nanos;
        this.o = csfVar;
        this.m = epiVar.c;
        this.n = epiVar.d;
    }

    public static String e() {
        if (v == null) {
            try {
                v = InetAddress.getLocalHost().getHostName();
            } catch (UnknownHostException e2) {
                throw new RuntimeException(e2);
            }
        }
        return v;
    }

    private final void f() {
        if (this.q || this.y) {
            return;
        }
        if (this.p) {
            long j = this.l;
            if (j != 0 && (j <= 0 || this.o.a(TimeUnit.NANOSECONDS) <= this.l)) {
                return;
            }
        }
        this.q = true;
        this.z.execute(new eva(this, this.A));
    }

    @Override // defpackage.epo
    public final String a() {
        return this.w;
    }

    @Override // defpackage.epo
    public final void b() {
        clq.G(this.A != null, "not started");
        f();
    }

    @Override // defpackage.epo
    public final void c() {
        if (this.y) {
            return;
        }
        this.y = true;
        Executor executor = this.z;
        if (executor != null) {
            this.x.b(executor);
            this.z = null;
        }
    }

    @Override // defpackage.epo
    public final void d(fjp fjpVar) {
        clq.G(this.A == null, "already started");
        this.z = (Executor) this.x.a();
        this.A = fjpVar;
        f();
    }
}
