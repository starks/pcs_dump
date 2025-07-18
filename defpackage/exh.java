package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class exh extends eur {
    final emr c;
    final epg d;
    final elt e;
    final /* synthetic */ exi f;
    private final long g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public exh(exi exiVar, emr emrVar, epg epgVar, elt eltVar) {
        super(exiVar.c.e(eltVar), exiVar.c.j, eltVar.b);
        this.f = exiVar;
        this.c = emrVar;
        this.d = epgVar;
        this.e = eltVar;
        this.g = System.nanoTime();
    }

    @Override // defpackage.eur
    protected final void f() {
        this.f.c.m.execute(new ewf(this, 13));
    }

    final void j() {
        eum eumVar;
        emr emrVarA = this.c.a();
        try {
            elw elwVarC = this.f.c(this.d, this.e.e(emb.a, Long.valueOf(System.nanoTime() - this.g)));
            synchronized (this) {
                if (this.b != null) {
                    eumVar = null;
                } else {
                    super.i(elwVarC);
                    eumVar = new eum(this, this.a);
                }
            }
            if (eumVar == null) {
                exi exiVar = this.f;
                exiVar.c.m.execute(new ewf(this, 13));
            } else {
                exi exiVar2 = this.f;
                exiVar2.c.e(this.e).execute(new euy(this, eumVar, 8));
            }
        } finally {
            this.c.f(emrVarA);
        }
    }
}
