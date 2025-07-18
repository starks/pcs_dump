package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bqt implements bqm {
    private final bpz a;
    private final bqm b;
    private final long c;

    public bqt(bpz bpzVar, bqm bqmVar, long j) {
        this.a = bpzVar;
        this.b = bqmVar;
        this.c = j;
    }

    private final void a(int i, String str) {
        asr asrVar = (asr) dfd.a.createBuilder();
        if (!asrVar.a.isMutable()) {
            asrVar.B();
        }
        long j = i;
        dfd dfdVar = (dfd) asrVar.a;
        dfdVar.b |= 1;
        dfdVar.c = j;
        long j2 = this.c;
        if (!asrVar.a.isMutable()) {
            asrVar.B();
        }
        dfd dfdVar2 = (dfd) asrVar.a;
        dfdVar2.b |= 4;
        dfdVar2.d = j2;
        asr asrVar2 = (asr) dfa.a.createBuilder();
        if (!asrVar2.a.isMutable()) {
            asrVar2.B();
        }
        dfa dfaVar = (dfa) asrVar2.a;
        dfd dfdVar3 = (dfd) asrVar.z();
        dfdVar3.getClass();
        dfaVar.e = dfdVar3;
        dfaVar.b |= 64;
        if (str != null) {
            asr asrVar3 = (asr) dfb.a.createBuilder();
            if (!asrVar3.a.isMutable()) {
                asrVar3.B();
            }
            dfb dfbVar = (dfb) asrVar3.a;
            dfbVar.b |= 1;
            dfbVar.c = str;
            if (!asrVar2.a.isMutable()) {
                asrVar2.B();
            }
            dfa dfaVar2 = (dfa) asrVar2.a;
            dfb dfbVar2 = (dfb) asrVar3.z();
            dfbVar2.getClass();
            dfaVar2.c = dfbVar2;
            dfaVar2.b |= 1;
        }
        this.b.j((dfa) asrVar2.z());
    }

    @Override // defpackage.bqm
    public final bqj b(bql bqlVar, dfa dfaVar) {
        return this.b.b(bqlVar, dfaVar);
    }

    @Override // defpackage.bqm
    public final dfa c(dfa dfaVar) {
        return this.b.c(dfaVar);
    }

    @Override // defpackage.bqm
    public final void d() {
        this.b.d();
    }

    @Override // defpackage.bqm
    public final void f(bqk bqkVar, dfa dfaVar, long j) {
        this.b.f(bqkVar, dfaVar, j);
    }

    @Override // defpackage.bqm
    public final void g(dyw dywVar, dfa dfaVar, long j) {
        this.b.g(dywVar, dfaVar, j);
    }

    @Override // defpackage.bqm
    public final void h(ccd ccdVar) {
        i(ccdVar, null);
    }

    @Override // defpackage.bqm
    public final void i(ccd ccdVar, String str) {
        if (this.a.bb() && this.a.ba()) {
            a(ccdVar.a(), str);
        }
    }

    @Override // defpackage.bqm
    public final void j(dfa dfaVar) {
        this.b.j(dfaVar);
    }

    @Override // defpackage.bqm
    public final void k(int i) {
        l(i, null);
    }

    @Override // defpackage.bqm
    public final void l(int i, String str) {
        if (this.a.bb()) {
            a(ccj.a(i), str);
        }
    }
}
