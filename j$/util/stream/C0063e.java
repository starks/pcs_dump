package j$.util.stream;

import j$.util.StringJoiner;
import j$.util.function.BiConsumer$CC;
import j$.util.function.BiFunction$CC;
import j$.util.function.Function$CC;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.Supplier;

/* renamed from: j$.util.stream.e, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C0063e implements BinaryOperator, Function, IntFunction, Supplier, BiConsumer {
    public final /* synthetic */ int a;

    public /* synthetic */ C0063e(int i) {
        this.a = i;
    }

    @Override // java.util.function.BiConsumer
    public void accept(Object obj, Object obj2) {
        switch (this.a) {
            case 5:
                ((List) obj).add(obj2);
                break;
            default:
                ((StringJoiner) obj).add((CharSequence) obj2);
                break;
        }
    }

    public /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
        switch (this.a) {
        }
        return BiConsumer$CC.$default$andThen(this, biConsumer);
    }

    @Override // java.util.function.Function
    public Object apply(Object obj) {
        switch (this.a) {
            case 1:
                Set set = Collectors.a;
                return j$.desugar.sun.nio.fs.g.b(((List) obj).toArray());
            default:
                return ((StringJoiner) obj).toString();
        }
    }

    public /* synthetic */ Function compose(Function function) {
        switch (this.a) {
        }
        return Function$CC.$default$compose(this, function);
    }

    @Override // java.util.function.Supplier
    public Object get() {
        return new ArrayList();
    }

    public /* synthetic */ BiFunction andThen(Function function) {
        switch (this.a) {
        }
        return BiFunction$CC.$default$andThen(this, function);
    }

    @Override // java.util.function.BiFunction
    public Object apply(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                List list = (List) obj;
                Set set = Collectors.a;
                list.addAll((List) obj2);
                return list;
            case 1:
            default:
                return ((StringJoiner) obj).c((StringJoiner) obj2);
            case 2:
                return new C0076s((InterfaceC0073o) obj, (InterfaceC0073o) obj2);
        }
    }

    /* renamed from: andThen, reason: collision with other method in class */
    public /* synthetic */ Function m25andThen(Function function) {
        switch (this.a) {
        }
        return Function$CC.$default$andThen(this, function);
    }

    @Override // java.util.function.IntFunction
    public Object apply(int i) {
        return new Object[i];
    }
}
