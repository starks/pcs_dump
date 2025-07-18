package defpackage;

import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes.dex */
class atu implements Function {
    public static ajh a(atc atcVar) {
        asr asrVar = (asr) ajh.a.createBuilder();
        if ((atcVar.b & 1) != 0) {
            Function function = auc.a;
            atk atkVarB = atk.b(atcVar.c);
            if (atkVarB == null) {
                atkVarB = atk.UNKNOWN_COUNT;
            }
            eio eioVar = (eio) function.apply(atkVarB);
            if (!asrVar.a.isMutable()) {
                asrVar.B();
            }
            ajh ajhVar = (ajh) asrVar.a;
            ajhVar.c = eioVar.bG;
            ajhVar.b |= 1;
        }
        return (ajh) asrVar.z();
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function$CC.$default$andThen(this, function);
    }

    @Override // java.util.function.Function
    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        return a((atc) obj);
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function$CC.$default$compose(this, function);
    }
}
