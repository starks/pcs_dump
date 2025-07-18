package j$.util;

import java.util.function.IntConsumer;

/* loaded from: classes2.dex */
public interface D extends J {
    void forEachRemaining(IntConsumer intConsumer);

    boolean tryAdvance(IntConsumer intConsumer);

    @Override // j$.util.J, j$.util.Spliterator
    D trySplit();
}
