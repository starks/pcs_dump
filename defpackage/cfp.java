package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class cfp implements csg {
    public final /* synthetic */ String a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    private final /* synthetic */ int d;

    public /* synthetic */ cfp(bgr bgrVar, String str, bgk bgkVar, int i) {
        this.d = i;
        this.c = bgrVar;
        this.a = str;
        this.b = bgkVar;
    }

    @Override // defpackage.csg
    public final Object a() {
        if (this.d != 0) {
            Object obj = this.b;
            return new bgp((bgr) this.c, this.a, (bgk) obj);
        }
        int i = ded.b;
        dea deaVarB = den.a.d().b(((String) this.c).getBytes());
        deaVarB.d();
        return ((det) ((fcy) this.b).c).h(deaVarB.b(this.a.getBytes()).l().e());
    }

    public /* synthetic */ cfp(fcy fcyVar, String str, String str2, int i) {
        this.d = i;
        this.b = fcyVar;
        this.c = str;
        this.a = str2;
    }
}
