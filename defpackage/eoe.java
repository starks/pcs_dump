package defpackage;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class eoe {
    public final List a;
    public final elp b;
    public final Object c;

    public eoe(List list, elp elpVar, Object obj) {
        list.getClass();
        this.a = DesugarCollections.unmodifiableList(new ArrayList(list));
        elpVar.getClass();
        this.b = elpVar;
        this.c = obj;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof eoe)) {
            return false;
        }
        eoe eoeVar = (eoe) obj;
        return a.g(this.a, eoeVar.a) && a.g(this.b, eoeVar.b) && a.g(this.c, eoeVar.c);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c});
    }

    public final String toString() {
        crt crtVarQ = clq.Q(this);
        crtVarQ.e("addresses", this.a);
        crtVarQ.e("attributes", this.b);
        crtVarQ.e("loadBalancingPolicyConfig", this.c);
        return crtVarQ.toString();
    }
}
