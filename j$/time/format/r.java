package j$.time.format;

import j$.time.ZoneId;

/* loaded from: classes2.dex */
class r implements f {
    private final j$.time.temporal.p a;
    private final String b;

    r(j$.time.temporal.p pVar, String str) {
        this.a = pVar;
        this.b = str;
    }

    @Override // j$.time.format.f
    public boolean g(v vVar, StringBuilder sb) {
        ZoneId zoneId = (ZoneId) vVar.f(this.a);
        if (zoneId == null) {
            return false;
        }
        sb.append(zoneId.o());
        return true;
    }

    public final String toString() {
        return this.b;
    }
}
