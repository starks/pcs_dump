package j$.util.stream;

import j$.util.Optional;
import j$.util.Spliterators;
import java.util.Comparator;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

/* loaded from: classes2.dex */
public interface Stream<T> extends InterfaceC0062d {

    /* renamed from: j$.util.stream.Stream$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
        /* JADX WARN: Multi-variable type inference failed */
        public static <T> Stream<T> concat(Stream<? extends T> stream, Stream<? extends T> stream2) {
            stream.getClass();
            stream2.getClass();
            AbstractC0060b abstractC0060b = (AbstractC0060b) Z.a(new b0(stream.spliterator(), stream2.spliterator()), stream.b() || stream2.b());
            abstractC0060b.j(new a0(1, stream, stream2));
            return (Stream) abstractC0060b;
        }

        public static <T> Stream<T> ofNullable(T t) {
            if (t == null) {
                return Z.a(Spliterators.b(), false);
            }
            c0 c0Var = new c0();
            c0Var.b = t;
            c0Var.a = -2;
            return Z.a(c0Var, false);
        }
    }

    boolean anyMatch(Predicate<? super T> predicate);

    <R, A> R collect(Collector<? super T, A, R> collector);

    Stream<T> filter(Predicate<? super T> predicate);

    <R> Stream<R> flatMap(Function<? super T, ? extends Stream<? extends R>> function);

    void forEach(Consumer<? super T> consumer);

    <R> Stream<R> map(Function<? super T, ? extends R> function);

    Optional<T> reduce(BinaryOperator<T> binaryOperator);

    Stream<T> sorted(Comparator<? super T> comparator);
}
