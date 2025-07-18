package j$.util.stream;

import j$.util.Spliterator;
import java.util.concurrent.CountedCompleter;

/* loaded from: classes2.dex */
final class G extends AbstractC0061c {
    private final A h;

    G(A a, AbstractC0060b abstractC0060b, Spliterator spliterator) {
        super(abstractC0060b, spliterator);
        this.h = a;
    }

    @Override // j$.util.stream.AbstractC0061c
    protected final Object a() {
        AbstractC0060b abstractC0060b = this.a;
        F fC = this.h.c();
        abstractC0060b.p(fC, this.b);
        return fC;
    }

    @Override // j$.util.stream.AbstractC0061c
    protected final AbstractC0061c c(Spliterator spliterator) {
        return new G(this, spliterator);
    }

    @Override // j$.util.stream.AbstractC0061c, java.util.concurrent.CountedCompleter
    public final void onCompletion(CountedCompleter countedCompleter) {
        AbstractC0061c abstractC0061c = this.d;
        if (abstractC0061c != null) {
            F f = (F) ((G) abstractC0061c).b();
            f.e((F) ((G) this.e).b());
            d(f);
        }
        super.onCompletion(countedCompleter);
    }

    G(G g, Spliterator spliterator) {
        super(g, spliterator);
        this.h = g.h;
    }
}
