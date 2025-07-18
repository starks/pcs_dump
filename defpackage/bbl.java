package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class bbl implements dis {
    public final /* synthetic */ bbq a;
    public final /* synthetic */ String b;
    public final /* synthetic */ efb c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ csd e;
    private final /* synthetic */ int f;

    public /* synthetic */ bbl(bbq bbqVar, csd csdVar, efb efbVar, Object obj, String str, int i) {
        this.f = i;
        this.a = bbqVar;
        this.e = csdVar;
        this.c = efbVar;
        this.d = obj;
        this.b = str;
    }

    @Override // defpackage.dis
    public final djy a(Object obj) {
        if (this.f != 0) {
            bcf bcfVar = (bcf) obj;
            String str = this.b;
            Object obj2 = this.d;
            efb efbVar = this.c;
            return this.a.e(this.e, (ayd) efbVar, (bbc) obj2, str, bcfVar);
        }
        bas basVar = (bas) obj;
        String str2 = this.b;
        Object obj3 = this.d;
        efb efbVar2 = this.c;
        return this.a.f(this.e, (axv) efbVar2, (bbp) obj3, str2, basVar);
    }
}
