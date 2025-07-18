package j$.util.stream;

import j$.util.AbstractC0087w;
import j$.util.Spliterator;
import java.util.Comparator;
import java.util.function.Consumer;

/* loaded from: classes2.dex */
final class Y implements Spliterator {
    final boolean a;
    final AbstractC0060b b;
    private C0059a c;
    Spliterator d;
    N e;
    C0059a f;
    long g;
    U h;
    boolean i;

    Y(AbstractC0060b abstractC0060b, C0059a c0059a, boolean z) {
        this.b = abstractC0060b;
        this.c = c0059a;
        this.d = null;
        this.a = z;
    }

    private boolean a() {
        while (this.h.a() == 0) {
            if (this.e.f() || !this.f.getAsBoolean()) {
                if (this.i) {
                    return false;
                }
                this.e.b();
                this.i = true;
            }
        }
        return true;
    }

    final void b() {
        if (this.d == null) {
            this.d = (Spliterator) this.c.get();
            this.c = null;
        }
    }

    @Override // j$.util.Spliterator
    public final int characteristics() {
        b();
        int iZ = W.z(this.b.g()) & W.f;
        return (iZ & 64) != 0 ? (iZ & (-16449)) | (this.d.characteristics() & 16448) : iZ;
    }

    @Override // j$.util.Spliterator
    public final long estimateSize() {
        b();
        return this.d.estimateSize();
    }

    @Override // j$.util.Spliterator
    public final void forEachRemaining(Consumer consumer) {
        if (this.h != null || this.i) {
            while (tryAdvance(consumer)) {
            }
            return;
        }
        consumer.getClass();
        b();
        this.b.p(new C0059a(6, consumer), this.d);
        this.i = true;
    }

    @Override // j$.util.Spliterator
    public final Comparator getComparator() {
        if (AbstractC0087w.c(this, 4)) {
            return null;
        }
        throw new IllegalStateException();
    }

    @Override // j$.util.Spliterator
    public final long getExactSizeIfKnown() {
        b();
        if (W.SIZED.t(this.b.g())) {
            return this.d.getExactSizeIfKnown();
        }
        return -1L;
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i) {
        return AbstractC0087w.c(this, i);
    }

    public final String toString() {
        return String.format("%s[%s]", Y.class.getName(), this.d);
    }

    @Override // j$.util.Spliterator
    public final boolean tryAdvance(Consumer consumer) {
        boolean zA;
        Object obj;
        consumer.getClass();
        U u = this.h;
        if (u != null) {
            long j = this.g + 1;
            this.g = j;
            zA = j < u.a();
            if (!zA) {
                this.g = 0L;
                this.h.clear();
                zA = a();
            }
        } else if (this.i) {
            zA = false;
        } else {
            b();
            U u2 = new U();
            this.h = u2;
            N nQ = this.b.q(new C0059a(4, u2));
            this.e = nQ;
            this.f = new C0059a(5, this);
            this.g = 0L;
            nQ.c(this.d.getExactSizeIfKnown());
            zA = a();
        }
        if (!zA) {
            return zA;
        }
        U u3 = this.h;
        long j2 = this.g;
        if (u3.b != 0) {
            if (j2 >= u3.a()) {
                throw new IndexOutOfBoundsException(Long.toString(j2));
            }
            for (int i = 0; i <= u3.b; i++) {
                long j3 = u3.c[i];
                Object[] objArr = u3.e[i];
                if (j2 < objArr.length + j3) {
                    obj = objArr[(int) (j2 - j3)];
                }
            }
            throw new IndexOutOfBoundsException(Long.toString(j2));
        }
        if (j2 >= u3.a) {
            throw new IndexOutOfBoundsException(Long.toString(j2));
        }
        obj = u3.d[(int) j2];
        consumer.accept(obj);
        return zA;
    }

    @Override // j$.util.Spliterator
    public final Spliterator trySplit() {
        boolean z = this.a;
        if (!z || this.h != null || this.i) {
            return null;
        }
        b();
        Spliterator spliteratorTrySplit = this.d.trySplit();
        if (spliteratorTrySplit == null) {
            return null;
        }
        return new Y(this.b, spliteratorTrySplit, z);
    }

    Y(AbstractC0060b abstractC0060b, Spliterator spliterator, boolean z) {
        this.b = abstractC0060b;
        this.c = null;
        this.d = spliterator;
        this.a = z;
    }
}
