package j$.util.stream;

import j$.util.Spliterator;
import java.util.concurrent.CountedCompleter;

/* loaded from: classes2.dex */
class r extends AbstractC0061c {
    protected final AbstractC0060b h;
    protected final C0059a i;
    protected final C0063e j;

    r(AbstractC0060b abstractC0060b, Spliterator spliterator, C0059a c0059a, C0063e c0063e) {
        super(abstractC0060b, spliterator);
        this.h = abstractC0060b;
        this.i = c0059a;
        this.j = c0063e;
    }

    @Override // j$.util.stream.AbstractC0061c
    protected final Object a() {
        InterfaceC0072n interfaceC0072n = (InterfaceC0072n) this.i.apply(this.h.f(this.b));
        AbstractC0060b abstractC0060b = this.h;
        Spliterator spliterator = this.b;
        abstractC0060b.getClass();
        abstractC0060b.c(abstractC0060b.q(interfaceC0072n), spliterator);
        return interfaceC0072n.j();
    }

    @Override // j$.util.stream.AbstractC0061c
    protected final AbstractC0061c c(Spliterator spliterator) {
        return new r(this, spliterator);
    }

    @Override // j$.util.stream.AbstractC0061c, java.util.concurrent.CountedCompleter
    public final void onCompletion(CountedCompleter countedCompleter) {
        AbstractC0061c abstractC0061c = this.d;
        if (abstractC0061c != null) {
            d((InterfaceC0073o) this.j.apply((InterfaceC0073o) ((r) abstractC0061c).b(), (InterfaceC0073o) ((r) this.e).b()));
        }
        super.onCompletion(countedCompleter);
    }

    r(r rVar, Spliterator spliterator) {
        super(rVar, spliterator);
        this.h = rVar.h;
        this.i = rVar.i;
        this.j = rVar.j;
    }
}
