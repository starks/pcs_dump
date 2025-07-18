package defpackage;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cdo {
    public final Map a;
    public final List b;
    private final List c;
    private final Set d;
    private final List e;

    public cdo(List list, Set set, Map map, List list2, List list3) {
        this.c = list;
        this.d = set;
        this.a = map;
        this.b = list2;
        this.e = list3;
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            cdo cdoVar = (cdo) it.next();
            if (this.c.size() >= cdoVar.c.size() || !fjs.c(cdoVar.c.subList(0, this.c.size()), this.c)) {
                throw new IllegalArgumentException("Subfield's field path must be nested inside parent's field path, but got parent: '" + this.c + "', child: '" + cdoVar.c + "'.");
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cdo)) {
            return false;
        }
        cdo cdoVar = (cdo) obj;
        return fjs.c(this.c, cdoVar.c) && fjs.c(this.d, cdoVar.d) && fjs.c(this.a, cdoVar.a) && fjs.c(this.b, cdoVar.b) && fjs.c(this.e, cdoVar.e);
    }

    public final int hashCode() {
        return (((((((this.c.hashCode() * 31) + this.d.hashCode()) * 31) + this.a.hashCode()) * 31) + this.b.hashCode()) * 31) + this.e.hashCode();
    }

    public final String toString() {
        return "PolicyField(fieldPath=" + this.c + ", rawUsages=" + this.d + ", redactedUsages=" + this.a + ", subfields=" + this.b + ", annotations=" + this.e + ")";
    }
}
