package j$.util;

import j$.util.List;
import j$.util.Spliterator;
import java.util.Iterator;
import java.util.function.Consumer;
import java.util.function.LongConsumer;

/* renamed from: j$.util.w, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract /* synthetic */ class AbstractC0087w {
    public static void a(Spliterator.OfLong ofLong, Consumer consumer) {
        if (consumer instanceof LongConsumer) {
            ofLong.forEachRemaining((LongConsumer) consumer);
        } else {
            if (W.a) {
                W.a(ofLong.getClass(), "{0} calling Spliterator.OfLong.forEachRemaining((LongConsumer) action::accept)");
                throw null;
            }
            consumer.getClass();
            ofLong.forEachRemaining((LongConsumer) new C0086v(consumer));
        }
    }

    public static long b(Spliterator spliterator) {
        if ((spliterator.characteristics() & 64) == 0) {
            return -1L;
        }
        return spliterator.estimateSize();
    }

    public static boolean c(Spliterator spliterator, int i) {
        return (spliterator.characteristics() & i) == i;
    }

    public static Spliterator d(java.util.SortedSet sortedSet) {
        return new x(sortedSet, sortedSet);
    }

    public static boolean e(Spliterator.OfLong ofLong, Consumer consumer) {
        if (consumer instanceof LongConsumer) {
            return ofLong.tryAdvance((LongConsumer) consumer);
        }
        if (W.a) {
            W.a(ofLong.getClass(), "{0} calling Spliterator.OfLong.tryAdvance((LongConsumer) action::accept)");
            throw null;
        }
        consumer.getClass();
        return ofLong.tryAdvance((LongConsumer) new C0086v(consumer));
    }

    public static void f(Iterator it, Consumer consumer) {
        if (it instanceof InterfaceC0085u) {
            ((InterfaceC0085u) it).forEachRemaining(consumer);
            return;
        }
        consumer.getClass();
        while (it.hasNext()) {
            consumer.accept(it.next());
        }
    }

    public static /* synthetic */ void g(java.util.List list, java.util.Comparator comparator) {
        if (list instanceof List) {
            ((List) list).sort(comparator);
        } else {
            List.CC.$default$sort(list, comparator);
        }
    }

    public int characteristics() {
        return 16448;
    }

    public long estimateSize() {
        return 0L;
    }

    public void forEachRemaining(Object obj) {
        obj.getClass();
    }

    public boolean tryAdvance(Object obj) {
        obj.getClass();
        return false;
    }

    public Spliterator trySplit() {
        return null;
    }
}
