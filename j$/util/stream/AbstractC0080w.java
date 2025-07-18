package j$.util.stream;

import j$.util.Spliterator;
import j$.util.function.Consumer$CC;
import java.util.concurrent.CountedCompleter;
import java.util.function.Consumer;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.stream.w, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC0080w extends CountedCompleter implements N {
    protected final Spliterator a;
    protected final AbstractC0060b b;
    protected final long c;
    protected long d;
    protected long e;
    protected int f;
    protected int g;

    AbstractC0080w(Spliterator spliterator, AbstractC0060b abstractC0060b, int i) {
        this.a = spliterator;
        this.b = abstractC0060b;
        this.c = AbstractC0061c.e(spliterator.estimateSize());
        this.d = 0L;
        this.e = i;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }

    @Override // j$.util.stream.N
    public final /* synthetic */ void b() {
    }

    @Override // j$.util.stream.N
    public final void c(long j) {
        long j2 = this.e;
        if (j > j2) {
            throw new IllegalStateException("size passed to Sink.begin exceeds array length");
        }
        int i = (int) this.d;
        this.f = i;
        this.g = i + ((int) j2);
    }

    @Override // java.util.concurrent.CountedCompleter
    public final void compute() {
        Spliterator spliteratorTrySplit;
        Spliterator spliterator = this.a;
        AbstractC0080w c0079v = this;
        while (spliterator.estimateSize() > c0079v.c && (spliteratorTrySplit = spliterator.trySplit()) != null) {
            c0079v.setPendingCount(1);
            long jEstimateSize = spliteratorTrySplit.estimateSize();
            C0079v c0079v2 = (C0079v) c0079v;
            new C0079v(c0079v2, spliteratorTrySplit, c0079v.d, jEstimateSize).fork();
            c0079v = new C0079v(c0079v2, spliterator, c0079v.d + jEstimateSize, c0079v.e - jEstimateSize);
        }
        c0079v.b.p(c0079v, spliterator);
        c0079v.propagateCompletion();
    }

    @Override // j$.util.stream.N
    public final /* synthetic */ boolean f() {
        return false;
    }

    AbstractC0080w(C0079v c0079v, Spliterator spliterator, long j, long j2, int i) {
        super(c0079v);
        this.a = spliterator;
        this.b = c0079v.b;
        this.c = c0079v.c;
        this.d = j;
        this.e = j2;
        if (j < 0 || j2 < 0 || (j + j2) - 1 >= i) {
            throw new IllegalArgumentException(String.format("offset and length interval [%d, %d + %d) is not within array size interval [0, %d)", Long.valueOf(j), Long.valueOf(j), Long.valueOf(j2), Integer.valueOf(i)));
        }
    }
}
