package j$.util.stream;

import j$.util.Spliterator;

/* renamed from: j$.util.stream.l, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C0070l implements d0 {
    final EnumC0069k a;
    final C0067i b;

    C0070l(X x, EnumC0069k enumC0069k, C0067i c0067i) {
        this.a = enumC0069k;
        this.b = c0067i;
    }

    @Override // j$.util.stream.d0
    public final Object a(AbstractC0060b abstractC0060b, Spliterator spliterator) {
        C0068j c0068j = (C0068j) this.b.get();
        abstractC0060b.c(abstractC0060b.q(c0068j), spliterator);
        return Boolean.valueOf(c0068j.b);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // j$.util.stream.d0
    public final Object d(AbstractC0060b abstractC0060b, Spliterator spliterator) {
        return (Boolean) new C0071m(this, abstractC0060b, spliterator).invoke();
    }

    @Override // j$.util.stream.d0
    public final int g() {
        return W.s | W.p;
    }
}
