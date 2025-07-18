package j$.util;

import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* loaded from: classes2.dex */
final class P extends AbstractC0087w implements D {
    @Override // j$.util.D
    public final void forEachRemaining(IntConsumer intConsumer) {
        intConsumer.getClass();
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

    @Override // j$.util.D
    public final boolean tryAdvance(IntConsumer intConsumer) {
        intConsumer.getClass();
        return false;
    }

    @Override // j$.util.AbstractC0087w, j$.util.A, j$.util.J, j$.util.Spliterator
    public final /* bridge */ /* synthetic */ D trySplit() {
        return null;
    }

    @Override // j$.util.Spliterator
    public final void forEachRemaining(Consumer consumer) {
        if (consumer instanceof IntConsumer) {
            forEachRemaining((IntConsumer) consumer);
        } else {
            if (W.a) {
                W.a(P.class, "{0} calling Spliterator.OfInt.forEachRemaining((IntConsumer) action::accept)");
                throw null;
            }
            consumer.getClass();
        }
    }

    @Override // j$.util.Spliterator
    public final boolean tryAdvance(Consumer consumer) {
        if (consumer instanceof IntConsumer) {
            tryAdvance((IntConsumer) consumer);
            return false;
        }
        if (W.a) {
            W.a(P.class, "{0} calling Spliterator.OfInt.tryAdvance((IntConsumer) action::accept)");
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
