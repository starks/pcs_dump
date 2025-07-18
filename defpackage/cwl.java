package defpackage;

import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class cwl implements Comparable, Serializable {
    private static final long serialVersionUID = 0;
    final Comparable b = "";

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(cwl cwlVar) {
        if (cwlVar == cwk.a) {
            return 1;
        }
        if (cwlVar == cwi.a) {
            return -1;
        }
        Comparable comparable = cwlVar.b;
        cyl cylVar = cyl.a;
        int iCompareTo = "".compareTo("");
        return iCompareTo != 0 ? iCompareTo : Boolean.compare(this instanceof cwj, cwlVar instanceof cwj);
    }

    public abstract void b(StringBuilder sb);

    public abstract void c(StringBuilder sb);

    public abstract boolean d();

    public final boolean equals(Object obj) {
        if (obj instanceof cwl) {
            try {
                if (compareTo((cwl) obj) == 0) {
                    return true;
                }
            } catch (ClassCastException unused) {
            }
        }
        return false;
    }

    public abstract int hashCode();
}
