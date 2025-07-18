package defpackage;

import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cyl extends cym implements Serializable, crw {
    public static final cyl a = new cyl(cwk.a, cwi.a);
    private static final long serialVersionUID = 0;
    public final cwl b;
    public final cwl c;

    public cyl(cwl cwlVar, cwl cwlVar2) {
        this.b = cwlVar;
        this.c = cwlVar2;
        if (cwlVar.compareTo(cwlVar2) > 0 || cwlVar == cwi.a || cwlVar2 == cwk.a) {
            throw new IllegalArgumentException("Invalid range: ".concat(String.valueOf(c(cwlVar, cwlVar2))));
        }
    }

    private static String c(cwl cwlVar, cwl cwlVar2) {
        StringBuilder sb = new StringBuilder(16);
        cwlVar.b(sb);
        sb.append("..");
        cwlVar2.c(sb);
        return sb.toString();
    }

    @Override // defpackage.crw
    @Deprecated
    public final /* synthetic */ boolean a(Object obj) {
        ((Comparable) obj).getClass();
        return this.b.d() && !this.c.d();
    }

    public final boolean b() {
        return this.b.equals(this.c);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof cyl) {
            cyl cylVar = (cyl) obj;
            if (this.b.equals(cylVar.b) && this.c.equals(cylVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.b.hashCode() * 31) + this.c.hashCode();
    }

    Object readResolve() {
        cyl cylVar = a;
        return equals(cylVar) ? cylVar : this;
    }

    public final String toString() {
        return c(this.b, this.c);
    }
}
