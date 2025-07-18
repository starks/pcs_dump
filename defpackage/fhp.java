package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fhp extends fjt implements fjc {
    private final /* synthetic */ int c;
    public static final fhp b = new fhp(1);
    public static final fhp a = new fhp(0);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fhp(int i) {
        super(2);
        this.c = i;
    }

    @Override // defpackage.fjc
    public final /* synthetic */ Object a(Object obj, Object obj2) {
        if (this.c != 0) {
            String str = (String) obj;
            fhn fhnVar = (fhn) obj2;
            str.getClass();
            if (str.length() == 0) {
                return fhnVar.toString();
            }
            return str + ", " + fhnVar;
        }
        fhq fhqVar = (fhq) obj;
        fhn fhnVar2 = (fhn) obj2;
        fhqVar.getClass();
        fhq fhqVarMinusKey = fhqVar.minusKey(fhnVar2.getKey());
        if (fhqVarMinusKey == fhr.a) {
            return fhnVar2;
        }
        fhm fhmVar = (fhm) fhqVarMinusKey.get(fhm.a);
        if (fhmVar == null) {
            return new fhj(fhqVarMinusKey, fhnVar2);
        }
        fhq fhqVarMinusKey2 = fhqVarMinusKey.minusKey(fhm.a);
        return fhqVarMinusKey2 == fhr.a ? new fhj(fhnVar2, fhmVar) : new fhj(new fhj(fhqVarMinusKey2, fhnVar2), fhmVar);
    }
}
