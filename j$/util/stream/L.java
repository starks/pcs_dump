package j$.util.stream;

import j$.util.Optional;
import j$.util.stream.Collector;
import java.util.Comparator;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

/* loaded from: classes2.dex */
abstract class L extends AbstractC0060b implements Stream {
    @Override // j$.util.stream.Stream
    public final boolean anyMatch(Predicate predicate) {
        EnumC0069k enumC0069k = EnumC0069k.ANY;
        predicate.getClass();
        enumC0069k.getClass();
        return ((Boolean) e(new C0070l(X.REFERENCE, enumC0069k, new C0067i(enumC0069k, predicate)))).booleanValue();
    }

    @Override // j$.util.stream.Stream
    public final Object collect(Collector collector) {
        Collector collector2;
        Object objE;
        if (b() && collector.characteristics().contains(Collector.Characteristics.CONCURRENT) && (!h() || collector.characteristics().contains(Collector.Characteristics.UNORDERED))) {
            objE = collector.c().get();
            forEach(new C0067i(collector.a(), objE));
            collector2 = collector;
        } else {
            collector.getClass();
            Supplier supplierC = collector.c();
            collector2 = collector;
            objE = e(new D(X.REFERENCE, collector.b(), collector.a(), supplierC, collector2));
        }
        return collector2.characteristics().contains(Collector.Characteristics.IDENTITY_FINISH) ? objE : collector2.d().apply(objE);
    }

    @Override // j$.util.stream.Stream
    public final Stream filter(Predicate predicate) {
        predicate.getClass();
        return new I(this, W.r, predicate, 2);
    }

    @Override // j$.util.stream.Stream
    public final Stream flatMap(Function function) {
        function.getClass();
        return new I(this, W.n | W.m | W.r, function, 1);
    }

    public void forEach(Consumer consumer) {
        consumer.getClass();
        e(new C0065g(consumer));
    }

    @Override // j$.util.stream.Stream
    public final Stream map(Function function) {
        function.getClass();
        return new I(this, W.n | W.m, function, 0);
    }

    @Override // j$.util.stream.Stream
    public final Optional reduce(BinaryOperator binaryOperator) {
        binaryOperator.getClass();
        return (Optional) e(new B(X.REFERENCE, binaryOperator));
    }

    @Override // j$.util.stream.Stream
    public final Stream sorted(Comparator comparator) {
        return new P(this, comparator);
    }
}
