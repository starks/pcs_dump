package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ffa extends few {
    final /* synthetic */ ffb b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ffa(ffb ffbVar) {
        super(ffbVar);
        this.b = ffbVar;
    }

    @Override // defpackage.few, defpackage.fev, defpackage.eoa
    public final void f(emh emhVar, eog eogVar) {
        super.f(emhVar, eogVar);
        if (this.b.f.i || emhVar != emh.IDLE) {
            return;
        }
        this.b.b.d();
    }
}
