package j$.util.stream;

import j$.util.Spliterator;
import java.util.concurrent.CountedCompleter;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.stream.h, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0066h extends CountedCompleter {
    private Spliterator a;
    private final N b;
    private final AbstractC0060b c;
    private long d;

    C0066h(AbstractC0060b abstractC0060b, Spliterator spliterator, N n) {
        super(null);
        this.b = n;
        this.c = abstractC0060b;
        this.a = spliterator;
        this.d = 0L;
    }

    @Override // java.util.concurrent.CountedCompleter
    public final void compute() {
        Spliterator spliteratorTrySplit;
        Spliterator spliterator = this.a;
        long jEstimateSize = spliterator.estimateSize();
        long jE = this.d;
        if (jE == 0) {
            jE = AbstractC0061c.e(jEstimateSize);
            this.d = jE;
        }
        boolean zT = W.SHORT_CIRCUIT.t(this.c.g());
        N n = this.b;
        boolean z = false;
        C0066h c0066h = this;
        while (true) {
            if (zT && n.f()) {
                break;
            }
            if (jEstimateSize <= jE || (spliteratorTrySplit = spliterator.trySplit()) == null) {
                break;
            }
            C0066h c0066h2 = new C0066h(c0066h, spliteratorTrySplit);
            c0066h.addToPendingCount(1);
            if (z) {
                spliterator = spliteratorTrySplit;
            } else {
                C0066h c0066h3 = c0066h;
                c0066h = c0066h2;
                c0066h2 = c0066h3;
            }
            z = !z;
            c0066h.fork();
            c0066h = c0066h2;
            jEstimateSize = spliterator.estimateSize();
        }
        c0066h.c.c(n, spliterator);
        c0066h.a = null;
        c0066h.propagateCompletion();
    }

    C0066h(C0066h c0066h, Spliterator spliterator) {
        super(c0066h);
        this.a = spliterator;
        this.b = c0066h.b;
        this.d = c0066h.d;
        this.c = c0066h.c;
    }
}
