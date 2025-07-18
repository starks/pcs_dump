package defpackage;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class eqi {
    public final String a;
    public final Collection b;

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.Object, java.util.Collection] */
    public eqi(eqh eqhVar) {
        String str = (String) eqhVar.a;
        this.a = str;
        ?? r1 = eqhVar.b;
        HashSet hashSet = new HashSet(r1.size());
        for (epg epgVar : r1) {
            epgVar.getClass();
            String str2 = epgVar.c;
            clq.D(str.equals(str2), "service names %s != %s", str2, str);
            clq.A(hashSet.add(epgVar.b), "duplicate name %s", epgVar.b);
        }
        this.b = DesugarCollections.unmodifiableList(new ArrayList((Collection) eqhVar.b));
    }

    public final String toString() {
        crt crtVarQ = clq.Q(this);
        crtVarQ.e("name", this.a);
        crtVarQ.e("schemaDescriptor", null);
        crtVarQ.e("methods", this.b);
        crtVarQ.g();
        return crtVarQ.toString();
    }
}
