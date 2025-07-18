package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ctg extends cvn {
    final /* synthetic */ cth a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ctg(cth cthVar, cuv cuvVar) {
        super(cuvVar);
        this.a = cthVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.cvn
    protected final /* bridge */ /* synthetic */ Object a(Object obj) {
        cth cthVar = this.a;
        cuv cuvVarF = obj.f();
        if (cuvVarF == cthVar.a) {
            return null;
        }
        return cuvVarF;
    }
}
