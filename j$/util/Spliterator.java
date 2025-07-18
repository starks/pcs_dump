package j$.util;

import java.util.function.Consumer;
import java.util.function.LongConsumer;

/* loaded from: classes2.dex */
public interface Spliterator<T> {

    public interface OfLong extends J {
        void forEachRemaining(LongConsumer longConsumer);

        boolean tryAdvance(LongConsumer longConsumer);

        @Override // j$.util.J, j$.util.Spliterator
        OfLong trySplit();
    }

    int characteristics();

    long estimateSize();

    void forEachRemaining(Consumer consumer);

    java.util.Comparator getComparator();

    long getExactSizeIfKnown();

    boolean hasCharacteristics(int i);

    boolean tryAdvance(Consumer consumer);

    Spliterator trySplit();
}
