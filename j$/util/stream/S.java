package j$.util.stream;

import java.util.Arrays;

/* loaded from: classes2.dex */
final class S extends O {
    private Object[] d;
    private int e;

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        Object[] objArr = this.d;
        int i = this.e;
        this.e = i + 1;
        objArr[i] = obj;
    }

    @Override // j$.util.stream.M, j$.util.stream.N
    public final void b() {
        int i = 0;
        Arrays.sort(this.d, 0, this.e, this.b);
        long j = this.e;
        N n = this.a;
        n.c(j);
        if (this.c) {
            while (i < this.e && !n.f()) {
                n.accept(this.d[i]);
                i++;
            }
        } else {
            while (i < this.e) {
                n.accept(this.d[i]);
                i++;
            }
        }
        n.b();
        this.d = null;
    }

    @Override // j$.util.stream.M, j$.util.stream.N
    public final void c(long j) {
        if (j >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        this.d = new Object[(int) j];
    }
}
