package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aek extends fid implements fjc {
    int a;
    final /* synthetic */ add b;
    final /* synthetic */ boolean c;
    final /* synthetic */ boolean d;
    final /* synthetic */ fiy e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aek(fhk fhkVar, add addVar, boolean z, boolean z2, fiy fiyVar) {
        super(fhkVar);
        this.b = addVar;
        this.c = z;
        this.d = z2;
        this.e = fiyVar;
    }

    @Override // defpackage.fjc
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((aek) c((fma) obj, (fhk) obj2)).b(ffz.a);
    }

    @Override // defpackage.fhx
    public final Object b(Object obj) throws Throwable {
        fhs fhsVar = fhs.a;
        int i = this.a;
        ffh.c(obj);
        if (i != 0) {
            return obj;
        }
        add addVar = this.b;
        boolean z = this.c;
        aen aenVar = new aen(this.d, z, addVar, null, this.e);
        this.a = 1;
        Object objD = addVar.d(z, aenVar, this);
        return objD == fhsVar ? fhsVar : objD;
    }

    @Override // defpackage.fhx
    public final fhk c(Object obj, fhk fhkVar) {
        return new aek(fhkVar, this.b, this.c, this.d, this.e);
    }
}
