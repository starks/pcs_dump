package defpackage;

import j$.lang.Iterable$EL;
import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cqe extends cpt implements cps {
    public final boolean a;
    private final Exception b;
    private final boolean c;

    public cqe(String str, cps cpsVar, cqi cqiVar, boolean z, ezn eznVar) {
        super("<missing root>:".concat(String.valueOf(str)), cpsVar, cqi.a(cqiVar, cqh.b), eznVar);
        this.b = cpsVar.e();
        this.a = cpsVar.f();
        this.c = z;
    }

    public static void j(UUID uuid, Exception exc) {
        cxo cxoVarC = cqa.c();
        if (cxoVarC.isEmpty()) {
            return;
        }
        Iterable$EL.forEach(cxoVarC, new cqd(uuid, exc, 0));
    }

    @Override // defpackage.cps
    public final Exception e() {
        return this.b;
    }

    @Override // defpackage.cps
    public final boolean f() {
        return this.a;
    }

    @Override // defpackage.cps
    public final cqn g(String str, cqi cqiVar, boolean z, ezn eznVar) {
        if (z && !this.c) {
            cqa.f();
        }
        boolean z2 = true;
        if ((!z || this.c) && !this.c) {
            z2 = false;
        }
        return new cqe(str, this, cqiVar, z2, eznVar);
    }

    @Override // defpackage.cqn
    public final cqi i() {
        return cqh.a;
    }

    @Override // defpackage.cqn
    public final cqn k(String str, cqi cqiVar, ezn eznVar) {
        return g(str, cqiVar, true, eznVar);
    }

    public cqe(UUID uuid, String str, cqi cqiVar, Exception exc, boolean z, boolean z2, ezn eznVar) {
        super("<missing root>:".concat(String.valueOf(str)), uuid, cqi.a(cqiVar, cqh.b), eznVar);
        this.a = z2;
        this.b = exc;
        this.c = false;
    }
}
