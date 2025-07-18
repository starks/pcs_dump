package j$.util;

/* loaded from: classes2.dex */
public interface J extends Spliterator {
    void forEachRemaining(Object obj);

    boolean tryAdvance(Object obj);

    @Override // j$.util.Spliterator
    J trySplit();
}
