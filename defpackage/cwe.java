package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class cwe extends cwg {
    @Override // defpackage.cwg
    public final int a() {
        return 0;
    }

    @Override // defpackage.cwg
    public final cwg b(Comparable comparable, Comparable comparable2) {
        int iCompareTo = comparable.compareTo(comparable2);
        return iCompareTo < 0 ? cwg.c : iCompareTo > 0 ? cwg.d : cwg.b;
    }
}
