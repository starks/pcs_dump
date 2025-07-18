package j$.util;

import java.util.NoSuchElementException;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

/* loaded from: classes2.dex */
public final class Optional<T> {
    private static final Optional b = new Optional();
    private final Object a;

    private Optional() {
        this.a = null;
    }

    public static <T> Optional<T> empty() {
        return b;
    }

    public static <T> Optional<T> of(T t) {
        return new Optional<>(t);
    }

    public static <T> Optional<T> ofNullable(T t) {
        return t == null ? empty() : of(t);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Optional) {
            return Objects.equals(this.a, ((Optional) obj).a);
        }
        return false;
    }

    public <U> Optional<U> flatMap(Function<? super T, ? extends Optional<? extends U>> function) {
        function.getClass();
        if (!isPresent()) {
            return empty();
        }
        Optional<? extends U> optionalApply = function.apply((Object) this.a);
        optionalApply.getClass();
        return optionalApply;
    }

    public T get() {
        T t = (T) this.a;
        if (t != null) {
            return t;
        }
        throw new NoSuchElementException("No value present");
    }

    public int hashCode() {
        return Objects.hashCode(this.a);
    }

    public void ifPresent(Consumer<? super T> consumer) {
        defpackage.a aVar = (Object) this.a;
        if (aVar != null) {
            consumer.accept(aVar);
        }
    }

    public boolean isEmpty() {
        return this.a == null;
    }

    public boolean isPresent() {
        return this.a != null;
    }

    public <U> Optional<U> map(Function<? super T, ? extends U> function) {
        function.getClass();
        return !isPresent() ? empty() : ofNullable(function.apply((Object) this.a));
    }

    public T orElse(T t) {
        T t2 = (T) this.a;
        return t2 != null ? t2 : t;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: X extends java.lang.Throwable */
    public <X extends Throwable> T orElseThrow(Supplier<? extends X> supplier) throws X {
        T t = (T) this.a;
        if (t != null) {
            return t;
        }
        throw supplier.get();
    }

    public final String toString() {
        Object obj = this.a;
        return obj != null ? String.format("Optional[%s]", obj) : "Optional.empty";
    }

    private Optional(Object obj) {
        obj.getClass();
        this.a = obj;
    }
}
