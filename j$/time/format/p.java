package j$.time.format;

/* loaded from: classes2.dex */
final class p implements f {
    private final j$.time.temporal.n a;
    private final C b;
    private final y c;
    private volatile k d;

    p(j$.time.temporal.n nVar, C c, y yVar) {
        this.a = nVar;
        this.b = c;
        this.c = yVar;
    }

    @Override // j$.time.format.f
    public final boolean g(v vVar, StringBuilder sb) {
        Long lE = vVar.e(this.a);
        if (lE == null) {
            return false;
        }
        j$.time.chrono.n nVar = (j$.time.chrono.n) vVar.d().O(j$.time.temporal.k.e());
        String strD = (nVar == null || nVar == j$.time.chrono.u.d) ? this.c.d(this.a, lE.longValue(), this.b, vVar.c()) : this.c.c(nVar, this.a, lE.longValue(), this.b, vVar.c());
        if (strD != null) {
            sb.append(strD);
            return true;
        }
        if (this.d == null) {
            this.d = new k(this.a, 1, 19, B.NORMAL);
        }
        return this.d.g(vVar, sb);
    }

    public final String toString() {
        C c = C.FULL;
        j$.time.temporal.n nVar = this.a;
        C c2 = this.b;
        if (c2 == c) {
            return "Text(" + String.valueOf(nVar) + ")";
        }
        return "Text(" + String.valueOf(nVar) + "," + String.valueOf(c2) + ")";
    }
}
