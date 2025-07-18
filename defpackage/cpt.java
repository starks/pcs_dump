package defpackage;

import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes.dex */
abstract class cpt extends cpp {
    private final cqi a;

    public cpt(String str, cqn cqnVar, cqi cqiVar, ezn eznVar) {
        super(str, cqnVar, eznVar);
        clq.v(cqiVar.d);
        this.a = cqiVar;
    }

    @Override // defpackage.cqn
    public final cqi h() {
        return cqi.a(this.a, i());
    }

    public cpt(String str, UUID uuid, cqi cqiVar, ezn eznVar) {
        super(str, uuid, eznVar);
        clq.v(cqiVar.d);
        this.a = cqiVar;
    }
}
