package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class etu implements ety {
    public eqo a;
    final /* synthetic */ etv b;
    public final ebz c;

    public etu(etv etvVar, ebz ebzVar) {
        this.b = etvVar;
        this.c = ebzVar;
    }

    @Override // defpackage.ety
    public final void a(eqo eqoVar, etx etxVar, epc epcVar) {
        int i = ffg.a;
        ems emsVarF = this.b.f();
        if (eqoVar.o == eql.CANCELLED && emsVarF != null && emsVarF.e()) {
            eqoVar = this.b.g.b();
            epcVar = new epc();
        }
        this.b.d.execute(new ets(this, ffg.b(), eqoVar, epcVar));
    }

    public final void b(eqo eqoVar) {
        this.a = eqoVar;
        this.b.i.d(eqoVar);
    }

    @Override // defpackage.ety
    public final void c(epc epcVar) {
        int i = ffg.a;
        this.b.d.execute(new etq(this, ffg.b(), epcVar));
    }

    @Override // defpackage.fbk
    public final void d(fbj fbjVar) {
        int i = ffg.a;
        this.b.d.execute(new etr(this, ffg.b(), fbjVar));
    }

    @Override // defpackage.fbk
    public final void e() {
        if (this.b.b.a.a()) {
            return;
        }
        int i = ffg.a;
        this.b.d.execute(new ett(this, ffg.b()));
    }
}
