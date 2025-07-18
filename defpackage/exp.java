package defpackage;

import java.lang.reflect.Method;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class exp extends eon {
    public static final Method f;
    public boolean A;
    public boolean B;
    List C;
    public final fuu D;
    public final fuu E;
    public eyg g;
    eyg h;
    public final List i;
    public epq j;
    final List k;
    public final String l;
    String m;
    emu n;
    emf o;
    public long p;
    int q;
    int r;
    long s;
    long t;
    boolean u;
    enl v;
    boolean w;
    public boolean x;
    public boolean y;
    public boolean z;
    public static final Logger a = Logger.getLogger(exp.class.getName());
    static final long b = TimeUnit.MINUTES.toMillis(30);
    public static final long c = TimeUnit.SECONDS.toMillis(1);
    public static final eyg d = new fbg(evt.o, 0);
    private static final emu F = emu.a;
    private static final emf G = emf.a;
    static final Pattern e = Pattern.compile("[a-zA-Z][a-zA-Z0-9+.-]*:/.*");

    static {
        Method declaredMethod = null;
        try {
            declaredMethod = Class.forName("esq").getDeclaredMethod("getClientInterceptor", Boolean.TYPE, Boolean.TYPE, Boolean.TYPE, Boolean.TYPE);
        } catch (ClassNotFoundException e2) {
            a.logp(Level.FINE, "io.grpc.internal.ManagedChannelImplBuilder", "<clinit>", "Unable to apply census stats", (Throwable) e2);
        } catch (NoSuchMethodException e3) {
            a.logp(Level.FINE, "io.grpc.internal.ManagedChannelImplBuilder", "<clinit>", "Unable to apply census stats", (Throwable) e3);
        }
        f = declaredMethod;
    }

    public exp(String str, fuu fuuVar, fuu fuuVar2) {
        eyg eygVar = d;
        this.g = eygVar;
        this.h = eygVar;
        this.i = new ArrayList();
        this.j = epq.b();
        this.k = new ArrayList();
        this.m = "pick_first";
        this.n = F;
        this.o = G;
        this.p = b;
        this.q = 5;
        this.r = 5;
        this.s = 16777216L;
        this.t = 1048576L;
        this.u = true;
        this.v = enl.b;
        this.w = true;
        this.x = true;
        this.y = true;
        this.z = true;
        this.A = true;
        this.B = true;
        this.C = new ArrayList();
        str.getClass();
        this.l = str;
        this.D = fuuVar;
        this.E = fuuVar2;
        Iterator it = fsc.s().p().iterator();
        while (it.hasNext()) {
            ((emg) it.next()).a();
        }
    }

    public static exo b(String str, epq epqVar, Collection collection) {
        URI uri;
        StringBuilder sb = new StringBuilder();
        try {
            uri = new URI(str);
        } catch (URISyntaxException e2) {
            sb.append(e2.getMessage());
            uri = null;
        }
        epp eppVarA = uri != null ? epqVar.a(uri.getScheme()) : null;
        if (eppVarA == null && !e.matcher(str).matches()) {
            try {
                uri = new URI(epqVar.c(), "", "/" + str, null);
                eppVarA = epqVar.a(uri.getScheme());
            } catch (URISyntaxException e3) {
                throw new IllegalArgumentException(e3);
            }
        }
        if (eppVarA == null) {
            throw new IllegalArgumentException(String.format("Could not find a NameResolverProvider for %s%s", str, sb.length() > 0 ? a.G(sb, " (", ")") : ""));
        }
        if (collection == null || collection.containsAll(eppVarA.c())) {
            return new exo(uri, eppVarA);
        }
        throw new IllegalArgumentException(String.format("Address types of NameResolver '%s' for '%s' not supported by transport", uri.getScheme(), str));
    }

    @Override // defpackage.eon
    public final eol a() {
        throw null;
    }
}
