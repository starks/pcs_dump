package defpackage;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class egr {
    public static final egr a = new egr();
    private final ConcurrentMap b = new ConcurrentHashMap();
    private final egb c = new egb();

    private egr() {
    }

    public final egx a(Class cls) {
        egx egxVarL;
        efn.e(cls, "messageType");
        egx egxVar = (egx) this.b.get(cls);
        if (egxVar != null) {
            return egxVar;
        }
        egb egbVar = this.c;
        ehh ehhVar = egy.a;
        efb.class.isAssignableFrom(cls);
        egf egfVarA = egbVar.a.a(cls);
        if (egfVarA.b()) {
            egxVarL = new egm(egy.a, eeo.a, egfVarA.a());
        } else {
            egxVarL = egl.l(egfVarA, ego.a, efx.a, egy.a, egb.a(egfVarA) ? eeo.a : null, ege.a);
        }
        efn.e(cls, "messageType");
        egx egxVar2 = (egx) this.b.putIfAbsent(cls, egxVarL);
        return egxVar2 != null ? egxVar2 : egxVarL;
    }

    public final egx b(Object obj) {
        return a(obj.getClass());
    }
}
