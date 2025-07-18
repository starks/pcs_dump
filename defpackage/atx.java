package defpackage;

import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes.dex */
class atx implements Function {
    public static ajm a(ath athVar) {
        asr asrVar = (asr) ajm.a.createBuilder();
        if ((athVar.b & 1) != 0) {
            Function function = auf.a;
            atg atgVarB = atg.b(athVar.c);
            if (atgVarB == null) {
                atgVarB = atg.UNKNOWN_TYPE;
            }
            ajl ajlVar = (ajl) function.apply(atgVarB);
            if (!asrVar.a.isMutable()) {
                asrVar.B();
            }
            ajm ajmVar = (ajm) asrVar.a;
            ajmVar.c = ajlVar.g;
            ajmVar.b |= 1;
        }
        if ((athVar.b & 2) != 0) {
            String str = athVar.d;
            if (!asrVar.a.isMutable()) {
                asrVar.B();
            }
            ajm ajmVar2 = (ajm) asrVar.a;
            str.getClass();
            ajmVar2.b |= 2;
            ajmVar2.d = str;
        }
        return (ajm) asrVar.z();
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function$CC.$default$andThen(this, function);
    }

    @Override // java.util.function.Function
    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        return a((ath) obj);
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function$CC.$default$compose(this, function);
    }
}
