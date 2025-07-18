package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class cur extends cvn {
    final /* synthetic */ cus a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cur(cus cusVar, cuv cuvVar) {
        super(cuvVar);
        this.a = cusVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.cvn
    protected final /* bridge */ /* synthetic */ Object a(Object obj) {
        cus cusVar = this.a;
        cuv cuvVarG = obj.g();
        if (cuvVarG == cusVar.a) {
            return null;
        }
        return cuvVarG;
    }
}
