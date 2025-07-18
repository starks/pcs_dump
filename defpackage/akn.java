package defpackage;

import j$.util.Collection;
import j$.util.DesugarArrays;
import j$.util.function.Function$CC;
import j$.util.stream.Collectors;
import j$.util.stream.Stream;
import java.lang.reflect.Method;
import java.util.Collection;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class akn implements Function {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ akn(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    public final /* synthetic */ Function andThen(Function function) {
        switch (this.b) {
        }
        return Function$CC.$default$andThen(this, function);
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        int i = 0;
        int i2 = 2;
        int i3 = 1;
        switch (this.b) {
            case 0:
                return ako.a((bmr) this.a, (Method) obj);
            case 1:
                bmr bmrVar = (bmr) obj;
                int i4 = ako.a;
                eia eiaVar = (eia) this.a;
                if ((eiaVar.b & 2) == 0) {
                    return bmrVar.toString();
                }
                String str = eiaVar.d;
                if (str.contains("$get")) {
                    return (String) DesugarArrays.stream(str.split(" ")).map(new akn((cxg) DesugarArrays.stream(bmrVar.getClass().getMethods()).filter(new ari(i3)).collect(cvu.a(new alg(i3), new akn(bmrVar, i))), i2)).collect(Collectors.joining(" "));
                }
                return str;
            case 2:
                String str2 = (String) obj;
                int i5 = ako.a;
                if (str2.startsWith("$get")) {
                    cxg cxgVar = (cxg) this.a;
                    if (cxgVar.containsKey(str2.substring(1))) {
                        return (String) cxgVar.get(str2.substring(1));
                    }
                }
                return str2;
            case 3:
                arq arqVar = (arq) obj;
                boolean zB = arqVar.b();
                Object obj2 = this.a;
                return zB ? jt.u(new ark(obj2, arqVar.a(), i2)) : jt.u(new ark(obj2, arqVar.a(), i));
            case 4:
                auz auzVarH = ((ava) obj).h();
                auzVarH.b(((euw) this.a).k());
                return auzVarH.a();
            case 5:
                ava avaVar = (ava) obj;
                auz auzVarH2 = avaVar.h();
                auw auwVarB = avaVar.g().b();
                euw euwVar = (euw) this.a;
                euwVar.n(auwVarB);
                auzVarH2.b(euwVar.k());
                return auzVarH2.a();
            case 6:
                Collection collection = (Collection) obj;
                clq.v(!collection.isEmpty());
                return (aww) Collection.EL.stream(collection).reduce(new cvr(1)).orElseThrow(new bbg(1));
            default:
                Stream streamFilter = Collection.EL.stream(((aww) obj).b).filter(new awv(this.a, i));
                int i6 = cxc.d;
                return new aww((cxc) streamFilter.collect(cvu.a));
        }
    }

    public final /* synthetic */ Function compose(Function function) {
        switch (this.b) {
        }
        return Function$CC.$default$compose(this, function);
    }
}
