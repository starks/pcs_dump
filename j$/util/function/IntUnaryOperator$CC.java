package j$.util.function;

import java.util.function.IntUnaryOperator;

/* renamed from: j$.util.function.IntUnaryOperator$-CC, reason: invalid class name */
/* loaded from: classes2.dex */
public final /* synthetic */ class IntUnaryOperator$CC {
    public static IntUnaryOperator $default$andThen(IntUnaryOperator intUnaryOperator, IntUnaryOperator intUnaryOperator2) {
        intUnaryOperator2.getClass();
        return new b(intUnaryOperator, intUnaryOperator2, 0);
    }

    public static IntUnaryOperator $default$compose(IntUnaryOperator intUnaryOperator, IntUnaryOperator intUnaryOperator2) {
        intUnaryOperator2.getClass();
        return new b(intUnaryOperator, intUnaryOperator2, 1);
    }
}
