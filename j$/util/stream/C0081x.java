package j$.util.stream;

import java.util.function.IntFunction;

/* renamed from: j$.util.stream.x, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C0081x extends U implements InterfaceC0073o, InterfaceC0072n {
    @Override // j$.util.stream.N
    public final void b() {
    }

    @Override // j$.util.stream.N
    public final void c(long j) {
        clear();
        m(j);
    }

    @Override // j$.util.stream.InterfaceC0073o
    public final Object[] d(IntFunction intFunction) {
        long jA = a();
        if (jA >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        Object[] objArr = (Object[]) intFunction.apply((int) jA);
        h(objArr, 0);
        return objArr;
    }

    @Override // j$.util.stream.N
    public final /* synthetic */ boolean f() {
        return false;
    }

    @Override // j$.util.stream.InterfaceC0073o
    public final InterfaceC0073o g(int i) {
        throw new IndexOutOfBoundsException();
    }

    @Override // j$.util.stream.InterfaceC0073o
    public final void h(Object[] objArr, int i) {
        long j = i;
        long jA = a() + j;
        if (jA > objArr.length || jA < j) {
            throw new IndexOutOfBoundsException("does not fit");
        }
        if (this.b == 0) {
            System.arraycopy(this.d, 0, objArr, i, this.a);
            return;
        }
        for (int i2 = 0; i2 < this.b; i2++) {
            Object[] objArr2 = this.e[i2];
            System.arraycopy(objArr2, 0, objArr, i, objArr2.length);
            i += this.e[i2].length;
        }
        int i3 = this.a;
        if (i3 > 0) {
            System.arraycopy(this.d, 0, objArr, i, i3);
        }
    }

    @Override // j$.util.stream.InterfaceC0073o
    public final /* synthetic */ int i() {
        return 0;
    }

    @Override // j$.util.stream.InterfaceC0072n
    public final InterfaceC0073o j() {
        return this;
    }
}
