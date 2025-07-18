package j$.time.chrono;

import j$.time.ZoneOffset;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;
import j$.time.temporal.TemporalAccessor;
import j$.util.Objects;

/* renamed from: j$.time.chrono.i, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract /* synthetic */ class AbstractC0033i {
    public static Temporal a(InterfaceC0026b interfaceC0026b, Temporal temporal) {
        return temporal.d(interfaceC0026b.J(), j$.time.temporal.a.EPOCH_DAY);
    }

    public static int b(InterfaceC0026b interfaceC0026b, InterfaceC0026b interfaceC0026b2) {
        int iCompare = Long.compare(interfaceC0026b.J(), interfaceC0026b2.J());
        if (iCompare != 0) {
            return iCompare;
        }
        return ((AbstractC0025a) interfaceC0026b.a()).o().compareTo(interfaceC0026b2.a().o());
    }

    public static int c(InterfaceC0029e interfaceC0029e, InterfaceC0029e interfaceC0029e2) {
        int iCompareTo = interfaceC0029e.c().compareTo(interfaceC0029e2.c());
        return (iCompareTo == 0 && (iCompareTo = interfaceC0029e.toLocalTime().compareTo(interfaceC0029e2.toLocalTime())) == 0) ? ((AbstractC0025a) interfaceC0029e.a()).o().compareTo(interfaceC0029e2.a().o()) : iCompareTo;
    }

    public static int d(InterfaceC0035k interfaceC0035k, InterfaceC0035k interfaceC0035k2) {
        int iCompare = Long.compare(interfaceC0035k.R(), interfaceC0035k2.R());
        return (iCompare == 0 && (iCompare = interfaceC0035k.toLocalTime().Z() - interfaceC0035k2.toLocalTime().Z()) == 0 && (iCompare = interfaceC0035k.r().compareTo(interfaceC0035k2.r())) == 0 && (iCompare = interfaceC0035k.F().o().compareTo(interfaceC0035k2.F().o())) == 0) ? ((AbstractC0025a) interfaceC0035k.a()).o().compareTo(interfaceC0035k2.a().o()) : iCompare;
    }

    public static int e(InterfaceC0035k interfaceC0035k, j$.time.temporal.n nVar) {
        if (!(nVar instanceof j$.time.temporal.a)) {
            return j$.time.temporal.k.a(interfaceC0035k, nVar);
        }
        int i = AbstractC0034j.a[((j$.time.temporal.a) nVar).ordinal()];
        if (i != 1) {
            return i != 2 ? interfaceC0035k.r().t(nVar) : interfaceC0035k.h().c0();
        }
        throw new j$.time.temporal.q("Invalid field 'InstantSeconds' for get() method, use getLong() instead");
    }

    public static int f(o oVar, j$.time.temporal.a aVar) {
        return aVar == j$.time.temporal.a.ERA ? oVar.getValue() : j$.time.temporal.k.a(oVar, aVar);
    }

    public static long g(o oVar, j$.time.temporal.n nVar) {
        if (nVar == j$.time.temporal.a.ERA) {
            return oVar.getValue();
        }
        if (nVar instanceof j$.time.temporal.a) {
            throw new j$.time.temporal.q("Unsupported field: ".concat(String.valueOf(nVar)));
        }
        return nVar.g(oVar);
    }

    public static boolean h(InterfaceC0026b interfaceC0026b, j$.time.temporal.n nVar) {
        return nVar instanceof j$.time.temporal.a ? ((j$.time.temporal.a) nVar).I() : nVar != null && nVar.t(interfaceC0026b);
    }

    public static boolean i(o oVar, j$.time.temporal.n nVar) {
        return nVar instanceof j$.time.temporal.a ? nVar == j$.time.temporal.a.ERA : nVar != null && nVar.t(oVar);
    }

    public static Object j(InterfaceC0026b interfaceC0026b, j$.time.temporal.p pVar) {
        if (pVar == j$.time.temporal.k.k() || pVar == j$.time.temporal.k.j() || pVar == j$.time.temporal.k.h() || pVar == j$.time.temporal.k.g()) {
            return null;
        }
        return pVar == j$.time.temporal.k.e() ? interfaceC0026b.a() : pVar == j$.time.temporal.k.i() ? ChronoUnit.DAYS : pVar.a(interfaceC0026b);
    }

    public static Object k(InterfaceC0029e interfaceC0029e, j$.time.temporal.p pVar) {
        if (pVar == j$.time.temporal.k.k() || pVar == j$.time.temporal.k.j() || pVar == j$.time.temporal.k.h()) {
            return null;
        }
        return pVar == j$.time.temporal.k.g() ? interfaceC0029e.toLocalTime() : pVar == j$.time.temporal.k.e() ? interfaceC0029e.a() : pVar == j$.time.temporal.k.i() ? ChronoUnit.NANOS : pVar.a(interfaceC0029e);
    }

    public static Object l(InterfaceC0035k interfaceC0035k, j$.time.temporal.p pVar) {
        return (pVar == j$.time.temporal.k.j() || pVar == j$.time.temporal.k.k()) ? interfaceC0035k.F() : pVar == j$.time.temporal.k.h() ? interfaceC0035k.h() : pVar == j$.time.temporal.k.g() ? interfaceC0035k.toLocalTime() : pVar == j$.time.temporal.k.e() ? interfaceC0035k.a() : pVar == j$.time.temporal.k.i() ? ChronoUnit.NANOS : pVar.a(interfaceC0035k);
    }

    public static Object m(o oVar, j$.time.temporal.p pVar) {
        return pVar == j$.time.temporal.k.i() ? ChronoUnit.ERAS : j$.time.temporal.k.c(oVar, pVar);
    }

    public static long n(InterfaceC0029e interfaceC0029e, ZoneOffset zoneOffset) {
        Objects.a(zoneOffset, "offset");
        return ((interfaceC0029e.c().J() * 86400) + interfaceC0029e.toLocalTime().k0()) - zoneOffset.c0();
    }

    public static long o(InterfaceC0035k interfaceC0035k) {
        return ((interfaceC0035k.c().J() * 86400) + interfaceC0035k.toLocalTime().k0()) - interfaceC0035k.h().c0();
    }

    public static n p(TemporalAccessor temporalAccessor) {
        Objects.a(temporalAccessor, "temporal");
        n nVar = (n) temporalAccessor.O(j$.time.temporal.k.e());
        u uVar = u.d;
        if (nVar != null) {
            return nVar;
        }
        Objects.a(uVar, "defaultObj");
        return uVar;
    }
}
