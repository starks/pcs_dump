package defpackage;

import j$.util.function.BiFunction$CC;
import java.util.Iterator;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class cvr implements BinaryOperator {
    private final /* synthetic */ int a;

    public /* synthetic */ cvr(int i) {
        this.a = i;
    }

    public final /* synthetic */ BiFunction andThen(Function function) {
        int i = this.a;
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? BiFunction$CC.$default$andThen(this, function) : BiFunction$CC.$default$andThen(this, function) : BiFunction$CC.$default$andThen(this, function) : BiFunction$CC.$default$andThen(this, function) : BiFunction$CC.$default$andThen(this, function);
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Iterable, java.lang.Object] */
    @Override // java.util.function.BiFunction
    public final Object apply(Object obj, Object obj2) {
        int i = this.a;
        if (i == 0) {
            brb brbVar = (brb) obj;
            Iterator it = ((brb) obj2).a.iterator();
            while (it.hasNext()) {
                brbVar.n((cyl) it.next());
            }
            return brbVar;
        }
        if (i == 1) {
            int i2 = cxc.d;
            cwy cwyVar = new cwy();
            cwyVar.j(((aww) obj).b);
            cwyVar.j(((aww) obj2).b);
            return new aww(cwyVar.g());
        }
        if (i != 2) {
            return i != 3 ? ((cxe) obj).a((cxe) obj2) : ((cxm) obj).h((cxm) obj2);
        }
        cwy cwyVar2 = (cwy) obj;
        cwy cwyVar3 = (cwy) obj2;
        cwyVar2.a(cwyVar3.a, cwyVar3.b);
        return cwyVar2;
    }
}
