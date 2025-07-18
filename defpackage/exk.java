package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class exk extends fbc {
    final /* synthetic */ eoh a;
    final /* synthetic */ esw b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public exk(esw eswVar, eoh eohVar) {
        super(null);
        this.a = eohVar;
        this.b = eswVar;
    }

    @Override // defpackage.fbc
    public final void a(ewn ewnVar) {
        this.b.i.v.remove(ewnVar);
        enl.c(this.b.i.H.e, ewnVar);
        this.b.i.h();
    }
}
