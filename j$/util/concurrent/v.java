package j$.util.concurrent;

import j$.util.AbstractC0087w;
import j$.util.Spliterator;
import j$.util.Spliterators;
import j$.util.concurrent.ConcurrentLinkedQueue;
import java.util.Comparator;
import java.util.function.Consumer;

/* loaded from: classes2.dex */
final class v implements Spliterator {
    ConcurrentLinkedQueue.Node a;
    int b;
    boolean c;
    final /* synthetic */ ConcurrentLinkedQueue d;

    v(ConcurrentLinkedQueue concurrentLinkedQueue) {
        this.d = concurrentLinkedQueue;
    }

    private ConcurrentLinkedQueue.Node a() {
        ConcurrentLinkedQueue.Node nodeB = this.a;
        if (nodeB == null && !this.c) {
            nodeB = this.d.b();
            this.a = nodeB;
            if (nodeB == null) {
                this.c = true;
            }
        }
        return nodeB;
    }

    @Override // j$.util.Spliterator
    public final int characteristics() {
        return 4368;
    }

    @Override // j$.util.Spliterator
    public final long estimateSize() {
        return Long.MAX_VALUE;
    }

    @Override // j$.util.Spliterator
    public final void forEachRemaining(Consumer consumer) {
        consumer.getClass();
        ConcurrentLinkedQueue.Node nodeA = a();
        if (nodeA != null) {
            this.a = null;
            this.c = true;
            this.d.c(consumer, nodeA);
        }
    }

    @Override // j$.util.Spliterator
    public final Comparator getComparator() {
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

    @Override // j$.util.Spliterator
    public final boolean tryAdvance(Consumer consumer) {
        E e;
        consumer.getClass();
        ConcurrentLinkedQueue.Node nodeA = a();
        if (nodeA == null) {
            return false;
        }
        do {
            e = nodeA.item;
            ConcurrentLinkedQueue.Node node = nodeA.next;
            nodeA = nodeA == node ? this.d.b() : node;
            if (e != 0) {
                break;
            }
        } while (nodeA != null);
        this.a = nodeA;
        if (nodeA == null) {
            this.c = true;
        }
        if (e == 0) {
            return false;
        }
        consumer.accept(e);
        return true;
    }

    @Override // j$.util.Spliterator
    public final Spliterator trySplit() {
        ConcurrentLinkedQueue.Node node;
        ConcurrentLinkedQueue.Node nodeA = a();
        if (nodeA != null && (node = nodeA.next) != null) {
            int iMin = Math.min(this.b + 1, 33554432);
            this.b = iMin;
            Object[] objArr = null;
            int i = 0;
            do {
                Object obj = nodeA.item;
                if (obj != null) {
                    if (objArr == null) {
                        objArr = new Object[iMin];
                    }
                    objArr[i] = obj;
                    i++;
                }
                nodeA = nodeA == node ? this.d.b() : node;
                if (nodeA == null || (node = nodeA.next) == null) {
                    break;
                }
            } while (i < iMin);
            this.a = nodeA;
            if (nodeA == null) {
                this.c = true;
            }
            if (i != 0) {
                return Spliterators.d(objArr, 0, i, 4368);
            }
        }
        return null;
    }
}
