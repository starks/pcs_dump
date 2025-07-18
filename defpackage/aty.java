package defpackage;

import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes.dex */
class aty implements Function {
    public static ajn a(ati atiVar) {
        asr asrVar = (asr) ajn.a.createBuilder();
        if ((atiVar.b & 1) != 0) {
            Function function = aug.a;
            att attVarB = att.b(atiVar.c);
            if (attVarB == null) {
                attVarB = att.UNKNOWN_VALUE;
            }
            eip eipVar = (eip) function.apply(attVarB);
            if (!asrVar.a.isMutable()) {
                asrVar.B();
            }
            ajn ajnVar = (ajn) asrVar.a;
            ajnVar.c = eipVar.D;
            ajnVar.b |= 1;
        }
        if ((atiVar.b & 2) != 0) {
            int i = atiVar.d;
            if (!asrVar.a.isMutable()) {
                asrVar.B();
            }
            ajn ajnVar2 = (ajn) asrVar.a;
            ajnVar2.b |= 2;
            ajnVar2.d = i;
        }
        return (ajn) asrVar.z();
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function$CC.$default$andThen(this, function);
    }

    @Override // java.util.function.Function
    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        return a((ati) obj);
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function$CC.$default$compose(this, function);
    }
}
