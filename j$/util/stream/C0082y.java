package j$.util.stream;

/* renamed from: j$.util.stream.y, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C0082y extends AbstractC0083z {
    private final Object[] c;

    C0082y(InterfaceC0073o interfaceC0073o, Object[] objArr) {
        super(interfaceC0073o);
        this.c = objArr;
    }

    @Override // j$.util.stream.AbstractC0083z
    final void a() {
        this.a.h(this.c, this.b);
    }

    @Override // j$.util.stream.AbstractC0083z
    final C0082y b(int i, int i2) {
        return new C0082y(this, this.a.g(i), i2);
    }

    private C0082y(C0082y c0082y, InterfaceC0073o interfaceC0073o, int i) {
        super(c0082y, interfaceC0073o, i);
        this.c = c0082y.c;
    }
}
