package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aem extends fid implements fjc {
    final /* synthetic */ fiy a;
    private /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aem(fhk fhkVar, fiy fiyVar) {
        super(fhkVar);
        this.a = fiyVar;
    }

    @Override // defpackage.fjc
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((aem) c((aea) obj, (fhk) obj2)).b(ffz.a);
    }

    @Override // defpackage.fhx
    public final Object b(Object obj) throws Throwable {
        fhs fhsVar = fhs.a;
        ffh.c(obj);
        aea aeaVar = (aea) this.b;
        aeaVar.getClass();
        return this.a.a(aeaVar.b());
    }

    @Override // defpackage.fhx
    public final fhk c(Object obj, fhk fhkVar) {
        aem aemVar = new aem(fhkVar, this.a);
        aemVar.b = obj;
        return aemVar;
    }
}
