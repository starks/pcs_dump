package defpackage;

import java.io.IOException;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aer {
    public final String a;
    public final String b;
    public final String c;
    public final List d;
    public final List e;

    public aer(String str, String str2, String str3, List list, List list2) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = list;
        this.e = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aer)) {
            return false;
        }
        aer aerVar = (aer) obj;
        if (fjs.c(this.a, aerVar.a) && fjs.c(this.b, aerVar.b) && fjs.c(this.c, aerVar.c) && fjs.c(this.d, aerVar.d)) {
            return fjs.c(this.e, aerVar.e);
        }
        return false;
    }

    public final int hashCode() {
        return (((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode();
    }

    public final String toString() throws IOException {
        StringBuilder sb = new StringBuilder("\n            |ForeignKey {\n            |   referenceTable = '");
        sb.append(this.a);
        sb.append("',\n            |   onDelete = '");
        sb.append(this.b);
        sb.append("',\n            |   onUpdate = '");
        sb.append(this.c);
        sb.append("',\n            |   columnNames = {");
        up.i(ffh.J(this.d));
        sb.append(ffz.a);
        sb.append("\n            |   referenceColumnNames = {");
        up.h(ffh.J(this.e));
        sb.append(ffz.a);
        sb.append("\n            |}\n        ");
        return fjs.h(new fkz(fjz.k(fjz.G(sb.toString())), (fiy) new mf(5, (byte[]) null), 0), "\n");
    }
}
