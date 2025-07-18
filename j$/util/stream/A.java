package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.IntFunction;

/* loaded from: classes2.dex */
abstract class A implements d0 {
    static InterfaceC0072n b(long j, IntFunction intFunction) {
        return (j < 0 || j >= 2147483639) ? new C0081x() : new C0077t(j, intFunction);
    }

    @Override // j$.util.stream.d0
    public Object a(AbstractC0060b abstractC0060b, Spliterator spliterator) {
        F fC = c();
        abstractC0060b.c(abstractC0060b.q(fC), spliterator);
        return fC.get();
    }

    public abstract F c();

    @Override // j$.util.stream.d0
    public Object d(AbstractC0060b abstractC0060b, Spliterator spliterator) {
        return ((F) new G(this, abstractC0060b, spliterator).invoke()).get();
    }

    @Override // j$.util.stream.d0
    public /* synthetic */ int g() {
        return 0;
    }
}
