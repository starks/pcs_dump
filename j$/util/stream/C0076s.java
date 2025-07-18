package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.IntFunction;

/* renamed from: j$.util.stream.s, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C0076s implements InterfaceC0073o {
    protected final InterfaceC0073o a;
    protected final InterfaceC0073o b;
    private final long c;

    C0076s(InterfaceC0073o interfaceC0073o, InterfaceC0073o interfaceC0073o2) {
        this.a = interfaceC0073o;
        this.b = interfaceC0073o2;
        this.c = interfaceC0073o.a() + interfaceC0073o2.a();
    }

    @Override // j$.util.stream.InterfaceC0073o
    public final long a() {
        return this.c;
    }

    @Override // j$.util.stream.InterfaceC0073o
    public final Object[] d(IntFunction intFunction) {
        long j = this.c;
        if (j >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        Object[] objArr = (Object[]) intFunction.apply((int) j);
        h(objArr, 0);
        return objArr;
    }

    @Override // j$.util.stream.InterfaceC0073o
    public final void forEach(Consumer consumer) {
        this.a.forEach(consumer);
        this.b.forEach(consumer);
    }

    @Override // j$.util.stream.InterfaceC0073o
    public final InterfaceC0073o g(int i) {
        if (i == 0) {
            return this.a;
        }
        if (i == 1) {
            return this.b;
        }
        throw new IndexOutOfBoundsException();
    }

    @Override // j$.util.stream.InterfaceC0073o
    public final void h(Object[] objArr, int i) {
        objArr.getClass();
        InterfaceC0073o interfaceC0073o = this.a;
        interfaceC0073o.h(objArr, i);
        this.b.h(objArr, i + ((int) interfaceC0073o.a()));
    }

    @Override // j$.util.stream.InterfaceC0073o
    public final int i() {
        return 2;
    }

    @Override // j$.util.stream.InterfaceC0073o
    public final Spliterator spliterator() {
        C0078u c0078u = new C0078u();
        c0078u.a = this;
        return c0078u;
    }

    public final String toString() {
        long j = this.c;
        return j < 32 ? String.format("ConcNode[%s.%s]", this.a, this.b) : String.format("ConcNode[size=%d]", Long.valueOf(j));
    }
}
