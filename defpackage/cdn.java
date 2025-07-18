package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cdn {
    public final String a;
    public final String b;
    public final Map c;
    private final String d;
    private final List e;
    private final List f;
    private final cdy g;
    private final List h;

    public cdn(String str, String str2, String str3, List list, Map map, List list2, cdy cdyVar) {
        this.a = str;
        this.b = str2;
        this.d = str3;
        this.e = list;
        this.c = map;
        this.f = list2;
        this.g = cdyVar;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            List list3 = ((cdq) it.next()).a;
            ArrayList arrayList2 = new ArrayList();
            Iterator it2 = list3.iterator();
            while (it2.hasNext()) {
                ffh.P(arrayList2, a((cdo) it2.next()));
            }
            ffh.P(arrayList, arrayList2);
        }
        this.h = arrayList;
        ArrayList arrayList3 = new ArrayList();
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            ffh.P(arrayList3, ((cdo) it3.next()).a.keySet());
        }
        ffh.N(arrayList3);
    }

    private static final List a(cdo cdoVar) {
        List listZ = ffh.z(cdoVar);
        ArrayList arrayList = new ArrayList();
        Iterator it = cdoVar.b.iterator();
        while (it.hasNext()) {
            ffh.P(arrayList, a((cdo) it.next()));
        }
        return ffh.H(listZ, arrayList);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cdn)) {
            return false;
        }
        cdn cdnVar = (cdn) obj;
        return fjs.c(this.a, cdnVar.a) && fjs.c(this.b, cdnVar.b) && fjs.c(this.d, cdnVar.d) && fjs.c(this.e, cdnVar.e) && fjs.c(this.c, cdnVar.c) && fjs.c(this.f, cdnVar.f) && fjs.c(this.g, cdnVar.g);
    }

    public final int hashCode() {
        return (((((((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31) + this.c.hashCode()) * 31) + this.f.hashCode()) * 31) + this.g.hashCode();
    }

    public final String toString() {
        return "Policy(name=" + this.a + ", egressType=" + this.b + ", description=" + this.d + ", targets=" + this.e + ", configs=" + this.c + ", annotations=" + this.f + ", allowedContext=" + this.g + ")";
    }
}
