package j$.time.format;

import j$.time.ZoneId;
import j$.time.chrono.InterfaceC0026b;
import j$.time.temporal.TemporalAccessor;

/* loaded from: classes2.dex */
final class u implements TemporalAccessor {
    final /* synthetic */ InterfaceC0026b a;
    final /* synthetic */ TemporalAccessor b;
    final /* synthetic */ j$.time.chrono.n c;
    final /* synthetic */ ZoneId d;

    u(InterfaceC0026b interfaceC0026b, TemporalAccessor temporalAccessor, j$.time.chrono.n nVar, ZoneId zoneId) {
        this.a = interfaceC0026b;
        this.b = temporalAccessor;
        this.c = nVar;
        this.d = zoneId;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long I(j$.time.temporal.n nVar) {
        InterfaceC0026b interfaceC0026b = this.a;
        return (interfaceC0026b == null || !nVar.I()) ? this.b.I(nVar) : interfaceC0026b.I(nVar);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final Object O(j$.time.temporal.p pVar) {
        return pVar == j$.time.temporal.k.e() ? this.c : pVar == j$.time.temporal.k.k() ? this.d : pVar == j$.time.temporal.k.i() ? this.b.O(pVar) : pVar.a(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final boolean e(j$.time.temporal.n nVar) {
        InterfaceC0026b interfaceC0026b = this.a;
        return (interfaceC0026b == null || !nVar.I()) ? this.b.e(nVar) : interfaceC0026b.e(nVar);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final /* synthetic */ int t(j$.time.temporal.n nVar) {
        return j$.time.temporal.k.a(this, nVar);
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.b);
        j$.time.chrono.n nVar = this.c;
        String strConcat = nVar != null ? " with chronology ".concat(String.valueOf(nVar)) : "";
        ZoneId zoneId = this.d;
        return strValueOf + strConcat + (zoneId != null ? " with zone ".concat(String.valueOf(zoneId)) : "");
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.r z(j$.time.temporal.n nVar) {
        InterfaceC0026b interfaceC0026b = this.a;
        return (interfaceC0026b == null || !nVar.I()) ? this.b.z(nVar) : interfaceC0026b.z(nVar);
    }
}
