package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fsm {
    public final frw a;
    public final frs b;
    public final fqx c;
    public final int d;
    public final int e;
    public final int f;
    private final List g;
    private final int h;
    private int i;

    public fsm(frw frwVar, List list, int i, frs frsVar, fqx fqxVar, int i2, int i3, int i4) {
        this.a = frwVar;
        this.g = list;
        this.h = i;
        this.b = frsVar;
        this.c = fqxVar;
        this.d = i2;
        this.e = i3;
        this.f = i4;
    }

    public static /* synthetic */ fsm c(fsm fsmVar, int i, frs frsVar, fqx fqxVar, int i2) {
        if ((i2 & 1) != 0) {
            i = fsmVar.h;
        }
        int i3 = i;
        if ((i2 & 2) != 0) {
            frsVar = fsmVar.b;
        }
        frs frsVar2 = frsVar;
        if ((i2 & 4) != 0) {
            fqxVar = fsmVar.c;
        }
        fqx fqxVar2 = fqxVar;
        int i4 = fsmVar.d;
        int i5 = fsmVar.e;
        int i6 = fsmVar.f;
        fqxVar2.getClass();
        return new fsm(fsmVar.a, fsmVar.g, i3, frsVar2, fqxVar2, i4, i5, i6);
    }

    public final fqx a() {
        return this.c;
    }

    public final frb b(fqx fqxVar) {
        fqxVar.getClass();
        if (this.h >= this.g.size()) {
            throw new IllegalStateException("Check failed.");
        }
        this.i++;
        frs frsVar = this.b;
        if (frsVar != null) {
            if (!frsVar.b.c(fqxVar.a)) {
                throw new IllegalStateException("network interceptor " + this.g.get(this.h - 1) + " must retain the same host and port");
            }
            if (this.i != 1) {
                throw new IllegalStateException("network interceptor " + this.g.get(this.h - 1) + " must call proceed() exactly once");
            }
        }
        fsm fsmVarC = c(this, this.h + 1, null, fqxVar, 58);
        fqr fqrVar = (fqr) this.g.get(this.h);
        frb frbVarA = fqrVar.a(fsmVarC);
        if (this.b != null && this.h + 1 < this.g.size() && fsmVarC.i != 1) {
            throw new IllegalStateException(a.y(fqrVar, "network interceptor ", " must call proceed() exactly once"));
        }
        if (frbVarA.g != null) {
            return frbVarA;
        }
        throw new IllegalStateException(a.y(fqrVar, "interceptor ", " returned a response with no body"));
    }
}
