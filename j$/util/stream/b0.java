package j$.util.stream;

import j$.util.AbstractC0087w;
import j$.util.Spliterator;
import java.util.Comparator;
import java.util.function.Consumer;

/* loaded from: classes2.dex */
final class b0 implements Spliterator {
    protected final Spliterator a;
    protected final Spliterator b;
    boolean c = true;
    final boolean d;

    b0(Spliterator spliterator, Spliterator spliterator2) {
        this.a = spliterator;
        this.b = spliterator2;
        this.d = spliterator2.estimateSize() + spliterator.estimateSize() < 0;
    }

    @Override // j$.util.Spliterator
    public final int characteristics() {
        boolean z = this.c;
        Spliterator spliterator = this.b;
        if (z) {
            return this.a.characteristics() & spliterator.characteristics() & (~((this.d ? 16448 : 0) | 5));
        }
        return spliterator.characteristics();
    }

    @Override // j$.util.Spliterator
    public final long estimateSize() {
        boolean z = this.c;
        Spliterator spliterator = this.b;
        if (!z) {
            return spliterator.estimateSize();
        }
        long jEstimateSize = spliterator.estimateSize() + this.a.estimateSize();
        if (jEstimateSize >= 0) {
            return jEstimateSize;
        }
        return Long.MAX_VALUE;
    }

    @Override // j$.util.Spliterator
    public final void forEachRemaining(Consumer consumer) {
        if (this.c) {
            this.a.forEachRemaining(consumer);
        }
        this.b.forEachRemaining(consumer);
    }

    @Override // j$.util.Spliterator
    public final Comparator getComparator() {
        if (this.c) {
            throw new IllegalStateException();
        }
        return this.b.getComparator();
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ long getExactSizeIfKnown() {
        return AbstractC0087w.b(this);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i) {
        return AbstractC0087w.c(this, i);
    }

    @Override // j$.util.Spliterator
    public final boolean tryAdvance(Consumer consumer) {
        boolean z = this.c;
        Spliterator spliterator = this.b;
        if (!z) {
            return spliterator.tryAdvance(consumer);
        }
        boolean zTryAdvance = this.a.tryAdvance(consumer);
        if (zTryAdvance) {
            return zTryAdvance;
        }
        this.c = false;
        return spliterator.tryAdvance(consumer);
    }

    @Override // j$.util.Spliterator
    public final Spliterator trySplit() {
        Spliterator spliteratorTrySplit = this.c ? this.a : this.b.trySplit();
        this.c = false;
        return spliteratorTrySplit;
    }
}
