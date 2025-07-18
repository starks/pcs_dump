package defpackage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aes {
    public final String a;
    public final boolean b;
    public final List c;
    public List d;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.util.ArrayList] */
    public aes(String str, boolean z, List list, List list2) {
        this.a = str;
        this.b = z;
        this.c = list;
        this.d = list2;
        if (list2.isEmpty()) {
            int size = list.size();
            list2 = new ArrayList(size);
            for (int i = 0; i < size; i++) {
                list2.add("ASC");
            }
        }
        this.d = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aes)) {
            return false;
        }
        aes aesVar = (aes) obj;
        if (this.b == aesVar.b && fjs.c(this.c, aesVar.c) && fjs.c(this.d, aesVar.d)) {
            return fjz.E(this.a, "index_") ? fjz.E(aesVar.a, "index_") : fjs.c(this.a, aesVar.a);
        }
        return false;
    }

    public final int hashCode() {
        return ((((((fjz.E(this.a, "index_") ? -1184239155 : this.a.hashCode()) * 31) + (this.b ? 1 : 0)) * 31) + this.c.hashCode()) * 31) + this.d.hashCode();
    }

    public final String toString() throws IOException {
        StringBuilder sb = new StringBuilder("\n            |Index {\n            |   name = '");
        sb.append(this.a);
        sb.append("',\n            |   unique = '");
        sb.append(this.b);
        sb.append("',\n            |   columns = {");
        up.i(this.c);
        sb.append(ffz.a);
        sb.append("\n            |   orders = {");
        up.h(this.d);
        sb.append(ffz.a);
        sb.append("\n            |}\n        ");
        return fjs.h(new fkz(fjz.k(fjz.G(sb.toString())), (fiy) new mf(5, (byte[]) null), 0), "\n");
    }
}
