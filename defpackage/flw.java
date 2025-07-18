package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class flw {
    public static final fhq a(fhq fhqVar, fhq fhqVar2, final boolean z) {
        boolean zD = d(fhqVar);
        boolean zD2 = d(fhqVar2);
        if (!zD && !zD2) {
            return fhqVar.plus(fhqVar2);
        }
        final fjx fjxVar = new fjx();
        fjxVar.a = fhqVar2;
        fhq fhqVar3 = (fhq) fhqVar.fold(fhr.a, new fjc() { // from class: flu
            @Override // defpackage.fjc
            public final Object a(Object obj, Object obj2) {
                fhq fhqVar4 = (fhq) obj;
                fhn fhnVar = (fhn) obj2;
                if (!(fhnVar instanceof fls)) {
                    return fhqVar4.plus(fhnVar);
                }
                fjx fjxVar2 = fjxVar;
                if (((fhq) fjxVar2.a).get(fhnVar.getKey()) == null) {
                    return fhqVar4.plus(z ? ((fls) fhnVar).a() : (fls) fhnVar);
                }
                fjxVar2.a = ((fhq) fjxVar2.a).minusKey(fhnVar.getKey());
                return fhqVar4.plus(((fls) fhnVar).b());
            }
        });
        if (zD2) {
            fjxVar.a = ((fhq) fjxVar.a).fold(fhr.a, new flv(0));
        }
        return fhqVar3.plus((fhq) fjxVar.a);
    }

    public static final fhq b(fma fmaVar, fhq fhqVar) {
        fhq fhqVarA = a(fmaVar.c(), fhqVar, true);
        fhq fhqVarPlus = fmd.b ? fhqVarA.plus(new fly(fmd.d.incrementAndGet())) : fhqVarA;
        return (fhqVarA == fml.a || fhqVarA.get(fhm.a) != null) ? fhqVarPlus : fhqVarPlus.plus(fml.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [fhk] */
    /* JADX WARN: Type inference failed for: r2v1, types: [fia] */
    /* JADX WARN: Type inference failed for: r2v2, types: [fia] */
    public static final fnt c(fhk fhkVar, fhq fhqVar, Object obj) {
        fnt fntVar = null;
        if (!(fhkVar instanceof fia)) {
            return null;
        }
        if (fhqVar.get(fnu.a) != null) {
            while (true) {
                if ((fhkVar instanceof fmi) || (fhkVar = fhkVar.g()) == 0) {
                    break;
                }
                if (fhkVar instanceof fnt) {
                    fntVar = (fnt) fhkVar;
                    break;
                }
            }
            if (fntVar != null) {
                fntVar.K(fhqVar, obj);
            }
        }
        return fntVar;
    }

    public static final boolean d(fhq fhqVar) {
        return ((Boolean) fhqVar.fold(false, new flv(1))).booleanValue();
    }
}
