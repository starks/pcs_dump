package j$.util.function;

import j$.desugar.sun.nio.fs.n;
import java.util.function.Function;

/* renamed from: j$.util.function.Function$-CC, reason: invalid class name */
/* loaded from: classes2.dex */
public final /* synthetic */ class Function$CC {
    public static Function $default$andThen(Function function, Function function2) {
        function2.getClass();
        return new a(function, function2, 0);
    }

    public static Function $default$compose(Function function, Function function2) {
        function2.getClass();
        return new a(function, function2, 1);
    }

    public static <T> Function<T, T> identity() {
        return new n();
    }
}
