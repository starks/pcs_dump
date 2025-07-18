package defpackage;

import j$.lang.Iterable$EL;
import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cqc extends cpp implements cps {
    public static final cpq a = new cpr();
    private final Exception b;
    private final boolean c;

    public cqc(UUID uuid, Exception exc, boolean z, ezn eznVar) {
        super("<missing root>", uuid, eznVar);
        this.b = exc;
        this.c = z;
    }

    public static void j(UUID uuid, Exception exc) {
        cxo cxoVarC = cqa.c();
        if (cxoVarC.isEmpty()) {
            return;
        }
        Iterable$EL.forEach(cxoVarC, new cqd(uuid, exc, 1));
    }

    @Override // defpackage.cps
    public final Exception e() {
        return this.b;
    }

    @Override // defpackage.cps
    public final boolean f() {
        return this.c;
    }

    @Override // defpackage.cps
    public final cqn g(String str, cqi cqiVar, boolean z, ezn eznVar) {
        if (z) {
            cqa.f();
        }
        return new cqe(str, this, cqiVar, z, eznVar);
    }

    @Override // defpackage.cqn
    public final cqi h() {
        return cqh.a;
    }

    @Override // defpackage.cqn
    public final cqi i() {
        throw null;
    }

    @Override // defpackage.cqn
    public final cqn k(String str, cqi cqiVar, ezn eznVar) {
        cqa.f();
        return g(str, cqiVar, true, eznVar);
    }
}
