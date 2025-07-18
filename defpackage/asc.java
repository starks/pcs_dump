package defpackage;

import android.content.Context;
import j$.util.Optional;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class asc implements eko {
    private final ekr a;
    private final ekr b;
    private final ekr c;
    private final /* synthetic */ int d;

    public asc(ekr ekrVar, ekr ekrVar2, ekr ekrVar3, int i) {
        this.d = i;
        this.a = ekrVar;
        this.b = ekrVar2;
        this.c = ekrVar3;
    }

    @Override // defpackage.ffk, defpackage.ffj
    public final /* synthetic */ Object b() {
        int i = this.d;
        if (i == 0) {
            Object obj = ((ekp) this.b).a;
            Set setB = ((ekt) this.a).b();
            ekr ekrVar = this.c;
            ekrVar.getClass();
            return new bot(setB, new ekn(ekrVar));
        }
        if (i == 1) {
            ekr ekrVar2 = this.a;
            aoa aoaVarA = ((arg) this.c).a();
            aor aorVarA = ann.a();
            Context contextB = ((ekg) ekrVar2).b();
            int i2 = sj.a;
            return Optional.of(new arh(aorVarA, contextB, aoaVarA));
        }
        if (i != 2) {
            return new bbf(((ekg) this.a).b(), (ayu) this.c.b(), (fsc) this.b.b());
        }
        fsc fscVar = (fsc) this.c.b();
        Executor executor = (Executor) this.a.b();
        Map mapB = ((ekq) this.b).b();
        cxe cxeVar = new cxe();
        for (Map.Entry entry : mapB.entrySet()) {
            if (((ayt) entry.getValue()).b().isPresent() && !((ayr) ((ayt) entry.getValue()).b().get()).b().isEmpty()) {
                aof aofVarAe = fscVar.ae(((ayr) ((ayt) entry.getValue()).b().get()).a(), executor);
                axi axiVar = (axi) entry.getKey();
                bal balVar = new bal(aofVarAe, new aoe(((ayr) ((ayt) entry.getValue()).b().get()).b(), 0L));
                aof aofVar = balVar.b;
                ((aok) aofVar).d.s(new aml(balVar, 8));
                cxeVar.b(axiVar, balVar);
            }
        }
        return new fsc(cxeVar.e());
    }

    public asc(ekr ekrVar, ekr ekrVar2, ekr ekrVar3, int i, byte[] bArr) {
        this.d = i;
        this.c = ekrVar;
        this.b = ekrVar2;
        this.a = ekrVar3;
    }

    public asc(ekr ekrVar, ekr ekrVar2, ekr ekrVar3, int i, char[] cArr) {
        this.d = i;
        this.c = ekrVar;
        this.a = ekrVar2;
        this.b = ekrVar3;
    }

    public asc(ekr ekrVar, ekr ekrVar2, ekr ekrVar3, int i, short[] sArr) {
        this.d = i;
        this.a = ekrVar;
        this.c = ekrVar2;
        this.b = ekrVar3;
    }
}
