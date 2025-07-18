package j$.util.stream;

import j$.util.stream.Collector;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Supplier;

/* loaded from: classes2.dex */
final class D extends A {
    final /* synthetic */ BinaryOperator a;
    final /* synthetic */ BiConsumer b;
    final /* synthetic */ Supplier c;
    final /* synthetic */ Collector d;

    D(X x, BinaryOperator binaryOperator, BiConsumer biConsumer, Supplier supplier, Collector collector) {
        this.a = binaryOperator;
        this.b = biConsumer;
        this.c = supplier;
        this.d = collector;
    }

    @Override // j$.util.stream.A
    public final F c() {
        return new E(this.c, this.b, this.a);
    }

    @Override // j$.util.stream.A, j$.util.stream.d0
    public final int g() {
        if (this.d.characteristics().contains(Collector.Characteristics.UNORDERED)) {
            return W.p;
        }
        return 0;
    }
}
