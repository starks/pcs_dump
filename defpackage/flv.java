package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class flv implements fjc {
    private final /* synthetic */ int a;

    @Override // defpackage.fjc
    public final Object a(Object obj, Object obj2) {
        int i = this.a;
        if (i == 0) {
            fhq fhqVar = (fhq) obj;
            fhn fhnVar = (fhn) obj2;
            return fhnVar instanceof fls ? fhqVar.plus(((fls) fhnVar).a()) : fhqVar.plus(fhnVar);
        }
        boolean z = true;
        if (i == 1) {
            fhn fhnVar2 = (fhn) obj2;
            if (!((Boolean) obj).booleanValue() && !(fhnVar2 instanceof fls)) {
                z = false;
            }
            return Boolean.valueOf(z);
        }
        if (i == 2) {
            fhn fhnVar3 = (fhn) obj2;
            if (!(fhnVar3 instanceof fnp)) {
                return obj;
            }
            Integer num = obj instanceof Integer ? (Integer) obj : null;
            int iIntValue = num != null ? num.intValue() : 1;
            return iIntValue == 0 ? fhnVar3 : Integer.valueOf(iIntValue + 1);
        }
        if (i == 3) {
            fnp fnpVar = (fnp) obj;
            fhn fhnVar4 = (fhn) obj2;
            if (fnpVar != null) {
                return fnpVar;
            }
            if (fhnVar4 instanceof fnp) {
                return (fnp) fhnVar4;
            }
            return null;
        }
        fph fphVar = (fph) obj;
        fhn fhnVar5 = (fhn) obj2;
        if (fhnVar5 instanceof fnp) {
            fnp fnpVar2 = (fnp) fhnVar5;
            Object objBe = fnpVar2.be(fphVar.a);
            Object[] objArr = fphVar.b;
            int i2 = fphVar.d;
            objArr[i2] = objBe;
            fnp[] fnpVarArr = fphVar.c;
            fphVar.d = i2 + 1;
            fnpVarArr[i2] = fnpVar2;
        }
        return fphVar;
    }
}
