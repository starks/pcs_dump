package j$.util;

import java.util.function.DoubleConsumer;

/* loaded from: classes2.dex */
public interface A extends J {
    void forEachRemaining(DoubleConsumer doubleConsumer);

    boolean tryAdvance(DoubleConsumer doubleConsumer);

    @Override // j$.util.J, j$.util.Spliterator
    A trySplit();
}
