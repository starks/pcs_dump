package j$.util.stream;

import j$.util.Spliterator;
import java.util.concurrent.CountedCompleter;
import java.util.concurrent.ForkJoinPool;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.stream.c, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC0061c extends CountedCompleter {
    private static final int g = ForkJoinPool.getCommonPoolParallelism() << 2;
    protected final AbstractC0060b a;
    protected Spliterator b;
    protected long c;
    protected AbstractC0061c d;
    protected AbstractC0061c e;
    private Object f;

    protected AbstractC0061c(AbstractC0060b abstractC0060b, Spliterator spliterator) {
        super(null);
        this.a = abstractC0060b;
        this.b = spliterator;
        this.c = 0L;
    }

    public static long e(long j) {
        long j2 = j / g;
        if (j2 > 0) {
            return j2;
        }
        return 1L;
    }

    protected abstract Object a();

    protected Object b() {
        return this.f;
    }

    protected abstract AbstractC0061c c(Spliterator spliterator);

    @Override // java.util.concurrent.CountedCompleter
    public void compute() {
        Spliterator spliteratorTrySplit;
        Spliterator spliterator = this.b;
        long jEstimateSize = spliterator.estimateSize();
        long jE = this.c;
        if (jE == 0) {
            jE = e(jEstimateSize);
            this.c = jE;
        }
        boolean z = false;
        AbstractC0061c abstractC0061c = this;
        while (jEstimateSize > jE && (spliteratorTrySplit = spliterator.trySplit()) != null) {
            AbstractC0061c abstractC0061cC = abstractC0061c.c(spliteratorTrySplit);
            abstractC0061c.d = abstractC0061cC;
            AbstractC0061c abstractC0061cC2 = abstractC0061c.c(spliterator);
            abstractC0061c.e = abstractC0061cC2;
            abstractC0061c.setPendingCount(1);
            if (z) {
                spliterator = spliteratorTrySplit;
                abstractC0061c = abstractC0061cC;
                abstractC0061cC = abstractC0061cC2;
            } else {
                abstractC0061c = abstractC0061cC2;
            }
            z = !z;
            abstractC0061cC.fork();
            jEstimateSize = spliterator.estimateSize();
        }
        abstractC0061c.d(abstractC0061c.a());
        abstractC0061c.tryComplete();
    }

    protected void d(Object obj) {
        this.f = obj;
    }

    @Override // java.util.concurrent.CountedCompleter, java.util.concurrent.ForkJoinTask
    public Object getRawResult() {
        return this.f;
    }

    @Override // java.util.concurrent.CountedCompleter
    public void onCompletion(CountedCompleter countedCompleter) {
        this.b = null;
        this.e = null;
        this.d = null;
    }

    @Override // java.util.concurrent.CountedCompleter, java.util.concurrent.ForkJoinTask
    protected final void setRawResult(Object obj) {
        if (obj != null) {
            throw new IllegalStateException();
        }
    }

    protected AbstractC0061c(AbstractC0061c abstractC0061c, Spliterator spliterator) {
        super(abstractC0061c);
        this.b = spliterator;
        this.a = abstractC0061c.a;
        this.c = abstractC0061c.c;
    }
}
