package j$.util.stream;

import j$.util.Spliterator;
import java.util.Arrays;
import java.util.Comparator;

/* loaded from: classes2.dex */
final class P extends L {
    private final Comparator l;

    P(L l, Comparator comparator) {
        super(l, W.o | W.n);
        comparator.getClass();
        this.l = comparator;
    }

    @Override // j$.util.stream.AbstractC0060b
    public final InterfaceC0073o k(AbstractC0060b abstractC0060b, Spliterator spliterator, C0063e c0063e) {
        W w = W.SORTED;
        abstractC0060b.getClass();
        w.getClass();
        Object[] objArrD = abstractC0060b.d(spliterator, c0063e).d(c0063e);
        Arrays.sort(objArrD, this.l);
        return new C0074p(objArrD);
    }

    @Override // j$.util.stream.AbstractC0060b
    final boolean l() {
        return true;
    }

    @Override // j$.util.stream.AbstractC0060b
    public final N m(int i, N n) {
        n.getClass();
        W.SORTED.t(i);
        boolean zT = W.SIZED.t(i);
        Comparator comparator = this.l;
        return zT ? new S(n, comparator) : new Q(n, comparator);
    }
}
