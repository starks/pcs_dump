package defpackage;

import j$.util.DesugarCollections;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class exu {
    public final ezu a;
    public final Object b;
    public final Map c;
    private final exs d;
    private final Map e;
    private final Map f;

    public exu(exs exsVar, Map map, Map map2, ezu ezuVar, Object obj, Map map3) {
        this.d = exsVar;
        this.e = DesugarCollections.unmodifiableMap(new HashMap(map));
        this.f = DesugarCollections.unmodifiableMap(new HashMap(map2));
        this.a = ezuVar;
        this.b = obj;
        this.c = map3 != null ? DesugarCollections.unmodifiableMap(new HashMap(map3)) : null;
    }

    final enm a() {
        if (this.f.isEmpty() && this.e.isEmpty() && this.d == null) {
            return null;
        }
        return new ext(this);
    }

    final exs b(epg epgVar) {
        exs exsVar = (exs) this.e.get(epgVar.b);
        if (exsVar == null) {
            exsVar = (exs) this.f.get(epgVar.c);
        }
        return exsVar == null ? this.d : exsVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            exu exuVar = (exu) obj;
            if (a.g(this.d, exuVar.d) && a.g(this.e, exuVar.e) && a.g(this.f, exuVar.f) && a.g(this.a, exuVar.a) && a.g(this.b, exuVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.d, this.e, this.f, this.a, this.b});
    }

    public final String toString() {
        crt crtVarQ = clq.Q(this);
        crtVarQ.e("defaultMethodConfig", this.d);
        crtVarQ.e("serviceMethodMap", this.e);
        crtVarQ.e("serviceMap", this.f);
        crtVarQ.e("retryThrottling", this.a);
        crtVarQ.e("loadBalancingConfig", this.b);
        return crtVarQ.toString();
    }
}
