package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bbv implements eko {
    private final ekr a;
    private final ekr b;
    private final ekr c;
    private final ekr d;
    private final ekr e;
    private final /* synthetic */ int f;

    public bbv(ekr ekrVar, ekr ekrVar2, ekr ekrVar3, ekr ekrVar4, ekr ekrVar5, int i) {
        this.f = i;
        this.a = ekrVar;
        this.b = ekrVar2;
        this.c = ekrVar3;
        this.d = ekrVar4;
        this.e = ekrVar5;
    }

    @Override // defpackage.ffk, defpackage.ffj
    public final /* synthetic */ Object b() {
        int i = this.f;
        if (i == 0) {
            return new bbu((aoa) this.a.b(), (bbd) this.b.b(), ((alc) this.c).a(), (djz) this.d.b(), ann.a());
        }
        if (i != 1) {
            ekr ekrVar = this.a;
            return new bdj(bdg.b(), (Executor) ekrVar.b(), ((avn) this.b).b(), (auh) this.d.b(), ann.a());
        }
        ekr ekrVar2 = this.a;
        ekr ekrVar3 = this.d;
        return new arp(((aqn) this.c).b(), ((ekt) ekrVar3).b(), (Executor) ekrVar2.b(), ((ekg) this.e).b(), (auh) this.b.b());
    }

    public bbv(ekr ekrVar, ekr ekrVar2, ekr ekrVar3, ekr ekrVar4, ekr ekrVar5, int i, byte[] bArr) {
        this.f = i;
        this.c = ekrVar;
        this.d = ekrVar2;
        this.a = ekrVar3;
        this.e = ekrVar4;
        this.b = ekrVar5;
    }

    public bbv(ekr ekrVar, ekr ekrVar2, ekr ekrVar3, ekr ekrVar4, ekr ekrVar5, int i, char[] cArr) {
        this.f = i;
        this.c = ekrVar;
        this.a = ekrVar2;
        this.b = ekrVar3;
        this.d = ekrVar4;
        this.e = ekrVar5;
    }
}
