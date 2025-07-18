package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class eav extends eae {
    final /* synthetic */ ebe c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eav(ebe ebeVar) {
        super(ebeVar);
        this.c = ebeVar;
    }

    @Override // defpackage.eae, defpackage.eaa
    public final /* bridge */ /* synthetic */ eaa a() {
        super.i();
        this.c.k.a();
        ebe ebeVar = this.c;
        ebeVar.g.d(new ebc(ebeVar.b));
        asr asrVar = (asr) dhd.a.createBuilder();
        asr asrVar2 = (asr) dhb.a.createBuilder();
        dha dhaVar = dha.a;
        if (!asrVar2.a.isMutable()) {
            asrVar2.B();
        }
        dhb dhbVar = (dhb) asrVar2.a;
        dhaVar.getClass();
        dhbVar.c = dhaVar;
        dhbVar.b = 1;
        if (!asrVar.a.isMutable()) {
            asrVar.B();
        }
        ebe ebeVar2 = this.c;
        dhd dhdVar = (dhd) asrVar.a;
        dhb dhbVar2 = (dhb) asrVar2.z();
        dhbVar2.getClass();
        dhdVar.d = dhbVar2;
        dhdVar.c = 7;
        ebeVar2.d(asrVar);
        this.c.c.e();
        return null;
    }

    @Override // defpackage.eaa
    public final String c() {
        return "Success";
    }

    @Override // defpackage.eae
    public final int k() {
        return dgu.i;
    }
}
