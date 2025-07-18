package j$.util.stream;

import java.util.function.BinaryOperator;

/* loaded from: classes2.dex */
final class B extends A {
    final /* synthetic */ BinaryOperator a;

    B(X x, BinaryOperator binaryOperator) {
        this.a = binaryOperator;
    }

    @Override // j$.util.stream.A
    public final F c() {
        return new C(this.a);
    }
}
