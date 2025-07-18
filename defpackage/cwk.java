package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class cwk extends cwl {
    public static final cwk a = new cwk();
    private static final long serialVersionUID = 0;

    private cwk() {
    }

    private Object readResolve() {
        return a;
    }

    @Override // defpackage.cwl
    /* renamed from: a */
    public final int compareTo(cwl cwlVar) {
        return cwlVar == this ? 0 : -1;
    }

    @Override // defpackage.cwl
    public final void b(StringBuilder sb) {
        sb.append("(-∞");
    }

    @Override // defpackage.cwl
    public final void c(StringBuilder sb) {
        throw null;
    }

    @Override // defpackage.cwl, java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return compareTo((cwl) obj);
    }

    @Override // defpackage.cwl
    public final boolean d() {
        return true;
    }

    @Override // defpackage.cwl
    public final int hashCode() {
        return System.identityHashCode(this);
    }

    public final String toString() {
        return "-∞";
    }
}
