package defpackage;

import j$.util.Optional;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ank implements eko {
    private final ekr a;
    private final ekr b;
    private final /* synthetic */ int c;

    public ank(ekr ekrVar, ekr ekrVar2, int i) {
        this.c = i;
        this.a = ekrVar;
        this.b = ekrVar2;
    }

    @Override // defpackage.ffk, defpackage.ffj
    public final /* synthetic */ Object b() {
        int i = this.c;
        if (i == 0) {
            aoa aoaVarA = ((arg) this.a).a();
            return ((ang) aoaVarA.b()).g() ? Optional.of(new aou(ann.a(), aoaVarA, 1)) : Optional.empty();
        }
        if (i == 1) {
            akw akwVar = new akw(((fsc) this.a.b()).ae(aog.DEVICE_PERSONALIZATION_SERVICES, (Executor) this.b.b()));
            ((aok) akwVar.i).d.s(new aml(akwVar, 1));
            return akwVar;
        }
        if (i == 2) {
            return new avs(((ekg) this.b).b(), ((avt) this.a).b());
        }
        if (i != 3) {
            return new bnz(((ekg) this.b).b(), (djz) this.a.b());
        }
        bam bamVar = new bam(((fsc) this.a.b()).ae(aog.DEVICE_PERSONALIZATION_SERVICES, (Executor) this.b.b()));
        ((aok) bamVar.d).d.s(new aml(bamVar, 9));
        return bamVar;
    }

    public ank(ekr ekrVar, ekr ekrVar2, int i, char[] cArr) {
        this.c = i;
        this.b = ekrVar;
        this.a = ekrVar2;
    }
}
