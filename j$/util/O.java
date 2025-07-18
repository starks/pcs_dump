package j$.util;

import java.util.function.Consumer;
import java.util.function.DoubleConsumer;

/* loaded from: classes2.dex */
final class O extends AbstractC0087w implements A {
    @Override // j$.util.A
    public final void forEachRemaining(DoubleConsumer doubleConsumer) {
        doubleConsumer.getClass();
    }

    @Override // j$.util.Spliterator
    public final java.util.Comparator getComparator() {
        throw new IllegalStateException();
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ long getExactSizeIfKnown() {
        return AbstractC0087w.b(this);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i) {
        return AbstractC0087w.c(this, i);
    }

    @Override // j$.util.A
    public final boolean tryAdvance(DoubleConsumer doubleConsumer) {
        doubleConsumer.getClass();
        return false;
    }

    @Override // j$.util.AbstractC0087w, j$.util.A, j$.util.J, j$.util.Spliterator
    public final /* bridge */ /* synthetic */ A trySplit() {
        return null;
    }

    @Override // j$.util.Spliterator
    public final void forEachRemaining(Consumer consumer) {
        if (consumer instanceof DoubleConsumer) {
            forEachRemaining((DoubleConsumer) consumer);
        } else {
            if (W.a) {
                W.a(O.class, "{0} calling Spliterator.OfDouble.forEachRemaining((DoubleConsumer) action::accept)");
                throw null;
            }
            consumer.getClass();
        }
    }

    @Override // j$.util.Spliterator
    public final boolean tryAdvance(Consumer consumer) {
        if (consumer instanceof DoubleConsumer) {
            tryAdvance((DoubleConsumer) consumer);
            return false;
        }
        if (W.a) {
            W.a(O.class, "{0} calling Spliterator.OfDouble.tryAdvance((DoubleConsumer) action::accept)");
            throw null;
        }
        consumer.getClass();
        return false;
    }

    @Override // j$.util.AbstractC0087w, j$.util.A, j$.util.J, j$.util.Spliterator
    public final /* bridge */ /* synthetic */ J trySplit() {
        return null;
    }
}
