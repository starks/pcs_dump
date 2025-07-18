package j$.time.chrono;

import j$.time.Instant;
import j$.time.LocalTime;
import j$.time.ZoneId;
import j$.time.temporal.Temporal;
import j$.util.Objects;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;
import java.util.ServiceConfigurationError;
import java.util.ServiceLoader;

/* renamed from: j$.time.chrono.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC0025a implements n {
    private static final ConcurrentHashMap a = new ConcurrentHashMap();
    private static final ConcurrentHashMap b = new ConcurrentHashMap();
    public static final /* synthetic */ int c = 0;

    static {
        new Locale("ja", "JP", "JP");
    }

    protected AbstractC0025a() {
    }

    static n g(String str) {
        Objects.a(str, "id");
        while (true) {
            ConcurrentHashMap concurrentHashMap = a;
            n nVar = (n) concurrentHashMap.get(str);
            if (nVar == null) {
                nVar = (n) b.get(str);
            }
            if (nVar != null) {
                return nVar;
            }
            if (concurrentHashMap.get("ISO") != null) {
                Iterator it = ServiceLoader.load(n.class).iterator();
                while (it.hasNext()) {
                    n nVar2 = (n) it.next();
                    if (str.equals(nVar2.o()) || str.equals(nVar2.G())) {
                        return nVar2;
                    }
                }
                throw new j$.time.c("Unknown chronology: ".concat(str));
            }
            q qVar = q.m;
            p(qVar, qVar.o());
            x xVar = x.d;
            p(xVar, xVar.o());
            C c2 = C.d;
            p(c2, c2.o());
            I i = I.d;
            p(i, i.o());
            try {
                for (AbstractC0025a abstractC0025a : Arrays.asList(new AbstractC0025a[0])) {
                    if (!abstractC0025a.o().equals("ISO")) {
                        p(abstractC0025a, abstractC0025a.o());
                    }
                }
                u uVar = u.d;
                p(uVar, uVar.o());
            } catch (Throwable th) {
                throw new ServiceConfigurationError(th.getMessage(), th);
            }
        }
    }

    static n p(AbstractC0025a abstractC0025a, String str) {
        String strG;
        n nVar = (n) a.putIfAbsent(str, abstractC0025a);
        if (nVar == null && (strG = abstractC0025a.G()) != null) {
            b.putIfAbsent(strG, abstractC0025a);
        }
        return nVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v7, types: [j$.time.chrono.k] */
    @Override // j$.time.chrono.n
    public InterfaceC0035k N(Temporal temporal) {
        try {
            ZoneId zoneIdU = ZoneId.U(temporal);
            try {
                temporal = A(Instant.V(temporal), zoneIdU);
                return temporal;
            } catch (j$.time.c unused) {
                return m.U(zoneIdU, null, C0031g.U(this, T(temporal)));
            }
        } catch (j$.time.c e) {
            throw new j$.time.c("Unable to obtain ChronoZonedDateTime from TemporalAccessor: ".concat(String.valueOf(temporal.getClass())), e);
        }
    }

    @Override // j$.time.chrono.n
    public InterfaceC0029e T(Temporal temporal) {
        try {
            return v(temporal).M(LocalTime.W(temporal));
        } catch (j$.time.c e) {
            throw new j$.time.c("Unable to obtain ChronoLocalDateTime from TemporalAccessor: ".concat(String.valueOf(temporal.getClass())), e);
        }
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return o().compareTo(((n) obj).o());
    }

    @Override // j$.time.chrono.n
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AbstractC0025a) && o().compareTo(((AbstractC0025a) obj).o()) == 0;
    }

    @Override // j$.time.chrono.n
    public final int hashCode() {
        return getClass().hashCode() ^ o().hashCode();
    }

    @Override // j$.time.chrono.n
    public final String toString() {
        return o();
    }
}
