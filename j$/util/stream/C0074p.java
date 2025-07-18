package j$.util.stream;

import j$.util.Spliterator;
import j$.util.Spliterators;
import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.IntFunction;

/* renamed from: j$.util.stream.p, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
class C0074p implements InterfaceC0073o {
    final Object[] a;
    int b;

    C0074p(long j, IntFunction intFunction) {
        if (j >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        this.a = (Object[]) intFunction.apply((int) j);
        this.b = 0;
    }

    @Override // j$.util.stream.InterfaceC0073o
    public final long a() {
        return this.b;
    }

    @Override // j$.util.stream.InterfaceC0073o
    public final Object[] d(IntFunction intFunction) {
        Object[] objArr = this.a;
        if (objArr.length == this.b) {
            return objArr;
        }
        throw new IllegalStateException();
    }

    @Override // j$.util.stream.InterfaceC0073o
    public final void forEach(Consumer consumer) {
        for (int i = 0; i < this.b; i++) {
            consumer.accept(this.a[i]);
        }
    }

    @Override // j$.util.stream.InterfaceC0073o
    public final InterfaceC0073o g(int i) {
        throw new IndexOutOfBoundsException();
    }

    @Override // j$.util.stream.InterfaceC0073o
    public final void h(Object[] objArr, int i) {
        System.arraycopy(this.a, 0, objArr, i, this.b);
    }

    @Override // j$.util.stream.InterfaceC0073o
    public final /* synthetic */ int i() {
        return 0;
    }

    @Override // j$.util.stream.InterfaceC0073o
    public final Spliterator spliterator() {
        return Spliterators.d(this.a, 0, this.b, 1040);
    }

    public String toString() {
        Object[] objArr = this.a;
        return String.format("ArrayNode[%d][%s]", Integer.valueOf(objArr.length - this.b), Arrays.toString(objArr));
    }

    C0074p(Object[] objArr) {
        this.a = objArr;
        this.b = objArr.length;
    }
}
