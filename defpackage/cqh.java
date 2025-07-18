package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cqh extends cqi {
    public static final cqi a;
    static final cqi b;

    static {
        cqi cqiVarB = new cqh(null, new oc(0)).b();
        a = cqiVarB;
        cqh cqhVar = new cqh(cqiVarB, new oc());
        clq clqVar = cqi.e;
        clq.G(!cqhVar.d, "Can't mutate after handing to trace");
        clq.G(true ^ cqhVar.d(clqVar), "Key already present");
        cqhVar.c.put(clqVar, true);
        b = cqhVar.b();
    }

    public cqh(cqi cqiVar, oc ocVar) {
        super(cqiVar, ocVar);
    }
}
