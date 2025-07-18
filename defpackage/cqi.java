package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public class cqi {
    public static final clq e = new clq();
    private final cqi a;
    public final oc c;
    public boolean d = false;

    public cqi(cqi cqiVar, oc ocVar) {
        if (cqiVar != null) {
            clq.v(cqiVar.d);
        }
        this.a = cqiVar;
        this.c = ocVar;
    }

    static cqi a(cqi cqiVar, cqi cqiVar2) {
        if (cqiVar.c()) {
            return cqiVar2;
        }
        if (cqiVar2.c()) {
            return cqiVar;
        }
        cxo<cqi> cxoVarO = cxo.o(cqiVar, cqiVar2);
        if (cxoVarO.isEmpty()) {
            return cqh.a;
        }
        if (cxoVarO.size() == 1) {
            return (cqi) cxoVarO.iterator().next();
        }
        int i = 0;
        for (cqi cqiVar3 : cxoVarO) {
            do {
                i += cqiVar3.c.f;
                cqiVar3 = cqiVar3.a;
            } while (cqiVar3 != null);
        }
        if (i == 0) {
            return cqh.a;
        }
        oc ocVar = new oc(i);
        for (cqi cqiVar4 : cxoVarO) {
            do {
                int i2 = 0;
                while (true) {
                    oc ocVar2 = cqiVar4.c;
                    if (i2 >= ocVar2.f) {
                        break;
                    }
                    clq.A(ocVar.put((clq) ocVar2.d(i2), cqiVar4.c.g(i2)) == null, "Duplicate bindings: %s", cqiVar4.c.d(i2));
                    i2++;
                }
                cqiVar4 = cqiVar4.a;
            } while (cqiVar4 != null);
        }
        return new cqh(null, ocVar).b();
    }

    final cqi b() {
        if (this.d) {
            throw new IllegalStateException("Already frozen");
        }
        this.d = true;
        cqi cqiVar = this.a;
        return (cqiVar == null || !this.c.isEmpty()) ? this : cqiVar;
    }

    public final boolean c() {
        return this == cqh.a;
    }

    final boolean d(clq clqVar) {
        if (this.c.containsKey(clqVar)) {
            return true;
        }
        cqi cqiVar = this.a;
        return cqiVar != null && cqiVar.d(clqVar);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SpanExtras<");
        for (cqi cqiVar = this; cqiVar != null; cqiVar = cqiVar.a) {
            for (int i = 0; i < cqiVar.c.f; i++) {
                sb.append(this.c.g(i));
                sb.append("], ");
            }
        }
        sb.append(">");
        return sb.toString();
    }
}
