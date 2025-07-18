package j$.util.stream;

import j$.util.function.Consumer$CC;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Supplier;

/* loaded from: classes2.dex */
final class E implements F {
    Object a;
    final /* synthetic */ Supplier b;
    final /* synthetic */ BiConsumer c;
    final /* synthetic */ BinaryOperator d;

    E(Supplier supplier, BiConsumer biConsumer, BinaryOperator binaryOperator) {
        this.b = supplier;
        this.c = biConsumer;
        this.d = binaryOperator;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        this.c.accept(this.a, obj);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }

    @Override // j$.util.stream.N
    public final /* synthetic */ void b() {
    }

    @Override // j$.util.stream.N
    public final void c(long j) {
        this.a = this.b.get();
    }

    @Override // j$.util.stream.F
    public final void e(F f) {
        this.a = this.d.apply(this.a, ((E) f).a);
    }

    @Override // j$.util.stream.N
    public final /* synthetic */ boolean f() {
        return false;
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        return this.a;
    }
}
