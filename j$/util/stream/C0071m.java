package j$.util.stream;

import j$.util.Spliterator;
import java.util.concurrent.CountedCompleter;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.stream.m, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0071m extends AbstractC0061c {
    protected final AtomicReference h;
    private final C0070l i;

    C0071m(C0070l c0070l, AbstractC0060b abstractC0060b, Spliterator spliterator) {
        super(abstractC0060b, spliterator);
        this.h = new AtomicReference(null);
        this.i = c0070l;
    }

    @Override // j$.util.stream.AbstractC0061c
    protected final Object a() {
        AbstractC0060b abstractC0060b = this.a;
        C0068j c0068j = (C0068j) this.i.b.get();
        abstractC0060b.p(c0068j, this.b);
        boolean z = c0068j.b;
        if (z == this.i.a.b) {
            Boolean boolValueOf = Boolean.valueOf(z);
            AtomicReference atomicReference = this.h;
            while (!atomicReference.compareAndSet(null, boolValueOf) && atomicReference.get() == null) {
            }
        }
        return null;
    }

    @Override // j$.util.stream.AbstractC0061c
    public final Object b() {
        if (((AbstractC0061c) getCompleter()) != null) {
            return super.b();
        }
        Object obj = this.h.get();
        return obj == null ? Boolean.valueOf(!this.i.a.b) : obj;
    }

    @Override // j$.util.stream.AbstractC0061c
    protected final AbstractC0061c c(Spliterator spliterator) {
        return new C0071m(this, spliterator);
    }

    @Override // j$.util.stream.AbstractC0061c, java.util.concurrent.CountedCompleter
    public final void compute() {
        Object obj;
        Spliterator spliteratorTrySplit;
        Spliterator spliterator = this.b;
        long jEstimateSize = spliterator.estimateSize();
        long jE = this.c;
        if (jE == 0) {
            jE = AbstractC0061c.e(jEstimateSize);
            this.c = jE;
        }
        AtomicReference atomicReference = this.h;
        boolean z = false;
        C0071m c0071m = this;
        while (true) {
            obj = atomicReference.get();
            if (obj != null) {
                break;
            }
            CountedCompleter completer = c0071m.getCompleter();
            while (true) {
                C0071m c0071m2 = (C0071m) ((AbstractC0061c) completer);
                if (c0071m2 == null) {
                    break;
                } else {
                    completer = c0071m2.getCompleter();
                }
            }
            if (jEstimateSize <= jE || (spliteratorTrySplit = spliterator.trySplit()) == null) {
                break;
            }
            C0071m c0071m3 = new C0071m(c0071m, spliteratorTrySplit);
            c0071m.d = c0071m3;
            C0071m c0071m4 = new C0071m(c0071m, spliterator);
            c0071m.e = c0071m4;
            c0071m.setPendingCount(1);
            if (z) {
                spliterator = spliteratorTrySplit;
                c0071m = c0071m3;
                c0071m3 = c0071m4;
            } else {
                c0071m = c0071m4;
            }
            z = !z;
            c0071m3.fork();
            jEstimateSize = spliterator.estimateSize();
        }
        c0071m.a();
        obj = null;
        c0071m.d(obj);
        c0071m.tryComplete();
    }

    @Override // j$.util.stream.AbstractC0061c
    protected final void d(Object obj) {
        if (((AbstractC0061c) getCompleter()) != null) {
            super.d(obj);
        } else if (obj != null) {
            AtomicReference atomicReference = this.h;
            while (!atomicReference.compareAndSet(null, obj) && atomicReference.get() == null) {
            }
        }
    }

    @Override // j$.util.stream.AbstractC0061c, java.util.concurrent.CountedCompleter, java.util.concurrent.ForkJoinTask
    public final Object getRawResult() {
        return b();
    }

    C0071m(C0071m c0071m, Spliterator spliterator) {
        super(c0071m, spliterator);
        this.h = c0071m.h;
        this.i = c0071m.i;
    }
}
