package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class adm implements fiy {
    private final /* synthetic */ int a;

    public /* synthetic */ adm(int i) {
        this.a = i;
    }

    @Override // defpackage.fiy
    public final Object a(Object obj) {
        int i = this.a;
        if (i == 0) {
            afa afaVar = (afa) obj;
            zl zlVar = adu.f;
            afaVar.getClass();
            fhd fhdVar = new fhd();
            while (afaVar.k()) {
                fhdVar.add(Integer.valueOf((int) afaVar.b(0)));
            }
            return ffh.p(fhdVar);
        }
        if (i == 1) {
            afa afaVar2 = (afa) obj;
            afaVar2.getClass();
            return Boolean.valueOf(afaVar2.k());
        }
        if (i != 2) {
            fhn fhnVar = (fhn) obj;
            if (fhnVar instanceof fmt) {
                return (fmt) fhnVar;
            }
            return null;
        }
        fhn fhnVar2 = (fhn) obj;
        if (fhnVar2 instanceof flx) {
            return (flx) fhnVar2;
        }
        return null;
    }
}
