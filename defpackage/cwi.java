package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class cwi extends cwl {
    public static final cwi a = new cwi();
    private static final long serialVersionUID = 0;

    private cwi() {
    }

    private Object readResolve() {
        return a;
    }

    @Override // defpackage.cwl
    /* renamed from: a */
    public final int compareTo(cwl cwlVar) {
        return cwlVar == this ? 0 : 1;
    }

    @Override // defpackage.cwl
    public final void b(StringBuilder sb) {
        throw null;
    }

    @Override // defpackage.cwl
    public final void c(StringBuilder sb) {
        sb.append("+∞)");
    }

    @Override // defpackage.cwl, java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return compareTo((cwl) obj);
    }

    @Override // defpackage.cwl
    public final boolean d() {
        return false;
    }

    @Override // defpackage.cwl
    public final int hashCode() {
        return System.identityHashCode(this);
    }

    public final String toString() {
        return "+∞";
    }
}
