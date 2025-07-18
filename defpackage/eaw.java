package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class eaw extends eae {
    final /* synthetic */ ebe c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eaw(ebe ebeVar) {
        super(ebeVar);
        this.c = ebeVar;
    }

    @Override // defpackage.eae, defpackage.eaa
    public final /* bridge */ /* synthetic */ eaa a() {
        super.i();
        this.c.j.a(new eao(null));
        return this;
    }

    @Override // defpackage.eaa
    public final String c() {
        return "WaitingToRun";
    }

    @Override // defpackage.eae
    public final eae j() {
        return new eak(this.c);
    }

    @Override // defpackage.eae
    public final int k() {
        return dgu.c;
    }
}
