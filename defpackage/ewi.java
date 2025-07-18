package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ewi extends evi {
    final /* synthetic */ etw a;
    final /* synthetic */ ewj b;

    public ewi(ewj ewjVar, etw etwVar) {
        this.a = etwVar;
        this.b = ewjVar;
    }

    @Override // defpackage.evi
    protected final etw a() {
        return this.a;
    }

    @Override // defpackage.evi, defpackage.etw
    public final void p(ety etyVar) {
        this.b.a.b();
        a().p(new ewh(this, etyVar));
    }
}
