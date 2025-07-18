package j$.util.stream;

import j$.util.AbstractC0087w;
import j$.util.Spliterator;
import java.util.ArrayDeque;
import java.util.Comparator;
import java.util.function.Consumer;

/* renamed from: j$.util.stream.u, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C0078u implements Spliterator {
    InterfaceC0073o a;
    int b;
    Spliterator c;
    Spliterator d;
    ArrayDeque e;

    protected static InterfaceC0073o a(ArrayDeque arrayDeque) {
        while (true) {
            InterfaceC0073o interfaceC0073o = (InterfaceC0073o) arrayDeque.pollFirst();
            if (interfaceC0073o == null) {
                return null;
            }
            if (interfaceC0073o.i() != 0) {
                for (int i = interfaceC0073o.i() - 1; i >= 0; i--) {
                    arrayDeque.addFirst(interfaceC0073o.g(i));
                }
            } else if (interfaceC0073o.a() > 0) {
                return interfaceC0073o;
            }
        }
    }

    protected final ArrayDeque b() {
        ArrayDeque arrayDeque = new ArrayDeque(8);
        int i = this.a.i();
        while (true) {
            i--;
            if (i < this.b) {
                return arrayDeque;
            }
            arrayDeque.addFirst(this.a.g(i));
        }
    }

    @Override // j$.util.Spliterator
    public final int characteristics() {
        return 64;
    }

    @Override // j$.util.Spliterator
    public final long estimateSize() {
        long jA = 0;
        if (this.a == null) {
            return 0L;
        }
        Spliterator spliterator = this.c;
        if (spliterator != null) {
            return spliterator.estimateSize();
        }
        for (int i = this.b; i < this.a.i(); i++) {
            jA += this.a.g(i).a();
        }
        return jA;
    }

    @Override // j$.util.Spliterator
    public final void forEachRemaining(Consumer consumer) {
        if (this.a == null) {
            return;
        }
        if (this.d != null) {
            while (tryAdvance(consumer)) {
            }
            return;
        }
        Spliterator spliterator = this.c;
        if (spliterator != null) {
            spliterator.forEachRemaining(consumer);
            return;
        }
        ArrayDeque arrayDequeB = b();
        while (true) {
            InterfaceC0073o interfaceC0073oA = a(arrayDequeB);
            if (interfaceC0073oA == null) {
                this.a = null;
                return;
            }
            interfaceC0073oA.forEach(consumer);
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
        InterfaceC0073o interfaceC0073oA;
        if (this.a == null) {
            return false;
        }
        if (this.d == null) {
            Spliterator spliterator = this.c;
            if (spliterator == null) {
                ArrayDeque arrayDequeB = b();
                this.e = arrayDequeB;
                InterfaceC0073o interfaceC0073oA2 = a(arrayDequeB);
                if (interfaceC0073oA2 == null) {
                    this.a = null;
                    return false;
                }
                this.d = interfaceC0073oA2.spliterator();
            } else {
                this.d = spliterator;
            }
        }
        boolean zTryAdvance = this.d.tryAdvance(consumer);
        if (!zTryAdvance) {
            if (this.c == null && (interfaceC0073oA = a(this.e)) != null) {
                Spliterator spliterator2 = interfaceC0073oA.spliterator();
                this.d = spliterator2;
                return spliterator2.tryAdvance(consumer);
            }
            this.a = null;
        }
        return zTryAdvance;
    }

    @Override // j$.util.Spliterator
    public final Spliterator trySplit() {
        InterfaceC0073o interfaceC0073o = this.a;
        if (interfaceC0073o == null || this.d != null) {
            return null;
        }
        Spliterator spliterator = this.c;
        if (spliterator != null) {
            return spliterator.trySplit();
        }
        if (this.b < interfaceC0073o.i() - 1) {
            InterfaceC0073o interfaceC0073o2 = this.a;
            int i = this.b;
            this.b = i + 1;
            return interfaceC0073o2.g(i).spliterator();
        }
        InterfaceC0073o interfaceC0073oG = this.a.g(this.b);
        this.a = interfaceC0073oG;
        if (interfaceC0073oG.i() == 0) {
            Spliterator spliterator2 = this.a.spliterator();
            this.c = spliterator2;
            return spliterator2.trySplit();
        }
        InterfaceC0073o interfaceC0073o3 = this.a;
        this.b = 1;
        return interfaceC0073o3.g(0).spliterator();
    }
}
