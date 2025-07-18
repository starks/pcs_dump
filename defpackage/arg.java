package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class arg implements eko {
    private final ekr a;
    private final ekr b;
    private final /* synthetic */ int c;

    public arg(ekr ekrVar, ekr ekrVar2, int i) {
        this.c = i;
        this.a = ekrVar;
        this.b = ekrVar2;
    }

    public final aoa a() {
        int i = this.c;
        if (i == 0) {
            return wh.j((fsc) this.a.b(), (Executor) this.b.b());
        }
        if (i == 1) {
            anh anhVar = new anh(((fsc) this.a.b()).ae(aog.DEVICE_PERSONALIZATION_SERVICES, (Executor) this.b.b()));
            aof aofVar = anhVar.h;
            ((aok) aofVar).d.s(new aml(anhVar, 2));
            return anhVar;
        }
        if (i != 2) {
            bfn bfnVar = new bfn(((fsc) this.a.b()).ae(aog.DEVICE_PERSONALIZATION_SERVICES, (Executor) this.b.b()));
            aof aofVar2 = bfnVar.b;
            ((aok) aofVar2).d.s(new aml(bfnVar, 10));
            return bfnVar;
        }
        asu asuVar = new asu(((fsc) this.a.b()).ae(aog.DEVICE_PERSONALIZATION_SERVICES, (Executor) this.b.b()));
        aof aofVar3 = asuVar.d;
        ((aok) aofVar3).d.s(new aml(asuVar, 6));
        return asuVar;
    }

    @Override // defpackage.ffk, defpackage.ffj
    public final /* synthetic */ Object b() {
        int i = this.c;
        return i != 0 ? i != 1 ? i != 2 ? a() : a() : a() : a();
    }
}
