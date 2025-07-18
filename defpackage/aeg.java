package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aeg extends fid implements fjc {
    int a;
    final /* synthetic */ Object b;
    final /* synthetic */ Object c;
    private final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aeg(add addVar, fiy fiyVar, fhk fhkVar, int i) {
        super(fhkVar);
        this.d = i;
        this.b = addVar;
        this.c = fiyVar;
    }

    @Override // defpackage.fjc
    public final /* synthetic */ Object a(Object obj, Object obj2) {
        if (this.d != 0) {
            return ((aeg) c((fma) obj, (fhk) obj2)).b(ffz.a);
        }
        return ((aeg) c((fma) obj, (fhk) obj2)).b(ffz.a);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [fiy, java.lang.Object] */
    @Override // defpackage.fhx
    public final Object b(Object obj) throws Throwable {
        if (this.d == 0) {
            fhs fhsVar = fhs.a;
            if (this.a != 0) {
                ffh.c(obj);
                return obj;
            }
            ffh.c(obj);
            Object obj2 = this.b;
            ?? r2 = this.c;
            this.a = 1;
            Object objV = un.v((add) obj2, false, true, r2, this);
            return objV == fhsVar ? fhsVar : objV;
        }
        fhs fhsVar2 = fhs.a;
        if (this.a != 0) {
            ffh.c(obj);
        } else {
            ffh.c(obj);
            Object obj3 = this.b;
            this.a = 1;
            obj = ((adu) obj3).b(this);
            if (obj == fhsVar2) {
                return fhsVar2;
            }
        }
        return ffz.a;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [fiy, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v2, types: [fin, java.lang.Object] */
    @Override // defpackage.fhx
    public final fhk c(Object obj, fhk fhkVar) {
        if (this.d != 0) {
            return new aeg((adu) this.b, (fin) this.c, fhkVar, 1);
        }
        return new aeg((add) this.b, (fiy) this.c, fhkVar, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aeg(adu aduVar, fin finVar, fhk fhkVar, int i) {
        super(fhkVar);
        this.d = i;
        this.b = aduVar;
        this.c = finVar;
    }
}
