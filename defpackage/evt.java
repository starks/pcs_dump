package defpackage;

import j$.util.DesugarCollections;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.charset.Charset;
import java.util.EnumSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class evt {
    public static final epz m;
    public static final els n;
    public static final fbe o;
    public static final fbe p;
    public static final csg q;
    private static final emb t;
    private static final Logger r = Logger.getLogger(evt.class.getName());
    private static final Set s = DesugarCollections.unmodifiableSet(EnumSet.of(eql.OK, eql.INVALID_ARGUMENT, eql.NOT_FOUND, eql.ALREADY_EXISTS, eql.FAILED_PRECONDITION, eql.ABORTED, eql.OUT_OF_RANGE, eql.DATA_LOSS));
    public static final Charset a = Charset.forName("US-ASCII");
    public static final eox b = eox.c("grpc-timeout", new evs(0));
    public static final eox c = eox.c("grpc-encoding", epc.b);
    public static final eox d = enq.a("grpc-accept-encoding", new evv(1));
    public static final eox e = eox.c("content-encoding", epc.b);
    public static final eox f = enq.a("accept-encoding", new evv(1));
    static final eox g = eox.c("content-length", epc.b);
    public static final eox h = eox.c("content-type", epc.b);
    public static final eox i = eox.c("te", epc.b);
    public static final eox j = eox.c("user-agent", epc.b);
    public static final csd k = csd.b(',').d();
    public static final long l = TimeUnit.SECONDS.toNanos(20);

    static {
        TimeUnit.HOURS.toNanos(2L);
        TimeUnit.SECONDS.toNanos(20L);
        m = new eyw();
        n = new els("io.grpc.internal.CALL_OPTIONS_RPC_OWNED_BY_BALANCER");
        t = new evp();
        o = new evq();
        p = new fbx(1);
        q = new eyv(1);
    }

    private evt() {
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0035  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static defpackage.eqo a(int r2) {
        /*
            r0 = 100
            if (r2 < r0) goto Lb
            r0 = 200(0xc8, float:2.8E-43)
            if (r2 >= r0) goto Lb
            eql r0 = defpackage.eql.INTERNAL
            goto L37
        Lb:
            r0 = 400(0x190, float:5.6E-43)
            if (r2 == r0) goto L35
            r0 = 401(0x191, float:5.62E-43)
            if (r2 == r0) goto L32
            r0 = 403(0x193, float:5.65E-43)
            if (r2 == r0) goto L2f
            r0 = 404(0x194, float:5.66E-43)
            if (r2 == r0) goto L2c
            r0 = 429(0x1ad, float:6.01E-43)
            if (r2 == r0) goto L29
            r0 = 431(0x1af, float:6.04E-43)
            if (r2 == r0) goto L35
            switch(r2) {
                case 502: goto L29;
                case 503: goto L29;
                case 504: goto L29;
                default: goto L26;
            }
        L26:
            eql r0 = defpackage.eql.UNKNOWN
            goto L37
        L29:
            eql r0 = defpackage.eql.UNAVAILABLE
            goto L37
        L2c:
            eql r0 = defpackage.eql.UNIMPLEMENTED
            goto L37
        L2f:
            eql r0 = defpackage.eql.PERMISSION_DENIED
            goto L37
        L32:
            eql r0 = defpackage.eql.UNAUTHENTICATED
            goto L37
        L35:
            eql r0 = defpackage.eql.INTERNAL
        L37:
            eqo r0 = r0.a()
            java.lang.String r1 = "HTTP status code "
            java.lang.String r2 = defpackage.a.x(r2, r1)
            eqo r2 = r0.e(r2)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.evt.a(int):eqo");
    }

    public static eqo b(eqo eqoVar) {
        clq.v(true);
        if (!s.contains(eqoVar.o)) {
            return eqoVar;
        }
        eql eqlVar = eqoVar.o;
        String str = eqoVar.p;
        return eqo.k.e("Inappropriate status code from control plane: " + eqlVar.toString() + " " + str).d(eqoVar.q);
    }

    static etz c(eoc eocVar, boolean z) {
        eof eofVar = eocVar.b;
        etz etzVarA = eofVar != null ? ((ewn) eofVar.a()).a() : null;
        if (etzVarA != null) {
            return etzVarA;
        }
        if (!eocVar.c.g()) {
            if (eocVar.d) {
                return new evh(b(eocVar.c), etx.DROPPED);
            }
            if (!z) {
                return new evh(b(eocVar.c), etx.PROCESSED);
            }
        }
        return null;
    }

    public static String d(String str, int i2) {
        String str2;
        int i3;
        try {
            str2 = str;
            i3 = i2;
        } catch (URISyntaxException e2) {
            e = e2;
            str2 = str;
            i3 = i2;
        }
        try {
            return new URI(null, null, str2, i3, null, null, null).getAuthority();
        } catch (URISyntaxException e3) {
            e = e3;
            throw new IllegalArgumentException("Invalid host or port: " + str2 + " " + i3, e);
        }
    }

    public static URI e(String str) {
        String str2;
        str.getClass();
        try {
            str2 = str;
            try {
                return new URI(null, str2, null, null, null);
            } catch (URISyntaxException e2) {
                e = e2;
                throw new IllegalArgumentException("Invalid authority: ".concat(str2), e);
            }
        } catch (URISyntaxException e3) {
            e = e3;
            str2 = str;
        }
    }

    static void f(fbj fbjVar) throws IOException {
        while (true) {
            InputStream inputStreamA = fbjVar.a();
            if (inputStreamA == null) {
                return;
            } else {
                g(inputStreamA);
            }
        }
    }

    public static void g(Closeable closeable) throws IOException {
        try {
            closeable.close();
        } catch (IOException e2) {
            r.logp(Level.WARNING, "io.grpc.internal.GrpcUtil", "closeQuietly", "exception caught in closeQuietly", (Throwable) e2);
        }
    }

    public static boolean h(String str, boolean z) {
        String strTrim = System.getenv(str);
        if (strTrim == null) {
            strTrim = System.getProperty(str);
        }
        if (strTrim != null) {
            strTrim = strTrim.trim();
        }
        return z ? clq.O(strTrim) || Boolean.parseBoolean(strTrim) : !clq.O(strTrim) && Boolean.parseBoolean(strTrim);
    }

    public static emb[] i(elt eltVar, epc epcVar, int i2, boolean z) {
        List list = eltVar.d;
        int size = list.size();
        emb[] embVarArr = new emb[size + 1];
        elz elzVar = new elz();
        eltVar.getClass();
        elzVar.a = eltVar;
        elzVar.b = i2;
        elzVar.c = z;
        new ema(elzVar.a, i2, z);
        for (int i3 = 0; i3 < list.size(); i3++) {
            embVarArr[i3] = ((ebz) list.get(i3)).w();
        }
        embVarArr[size] = t;
        return embVarArr;
    }

    public static ThreadFactory j(String str) {
        eqh eqhVar = new eqh((byte[]) null, (byte[]) null);
        eqhVar.b = true;
        eqhVar.h(str);
        return eqh.m(eqhVar);
    }
}
