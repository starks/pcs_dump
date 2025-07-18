package j$.util;

import java.util.function.Consumer;

/* loaded from: classes2.dex */
public final /* synthetic */ class L implements java.util.Spliterator {
    public final /* synthetic */ Spliterator a;

    private /* synthetic */ L(Spliterator spliterator) {
        this.a = spliterator;
    }

    public static /* synthetic */ java.util.Spliterator a(Spliterator spliterator) {
        if (spliterator == null) {
            return null;
        }
        return spliterator instanceof K ? ((K) spliterator).a : spliterator instanceof J ? I.a((J) spliterator) : new L(spliterator);
    }

    @Override // java.util.Spliterator
    public final /* synthetic */ int characteristics() {
        return this.a.characteristics();
    }

    public final /* synthetic */ boolean equals(Object obj) {
        Spliterator spliterator = this.a;
        if (obj instanceof L) {
            obj = ((L) obj).a;
        }
        return spliterator.equals(obj);
    }

    @Override // java.util.Spliterator
    public final /* synthetic */ long estimateSize() {
        return this.a.estimateSize();
    }

    @Override // java.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        this.a.forEachRemaining(consumer);
    }

    @Override // java.util.Spliterator
    public final /* synthetic */ java.util.Comparator getComparator() {
        return this.a.getComparator();
    }

    @Override // java.util.Spliterator
    public final /* synthetic */ long getExactSizeIfKnown() {
        return this.a.getExactSizeIfKnown();
    }

    @Override // java.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i) {
        return this.a.hasCharacteristics(i);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    @Override // java.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return this.a.tryAdvance(consumer);
    }

    @Override // java.util.Spliterator
    public final /* synthetic */ java.util.Spliterator trySplit() {
        return a(this.a.trySplit());
    }
}
