package j$.util.stream;

import j$.util.AbstractC0087w;
import j$.util.Collection;
import java.util.ArrayList;

/* loaded from: classes2.dex */
final class Q extends O {
    private ArrayList d;

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        this.d.add(obj);
    }

    @Override // j$.util.stream.M, j$.util.stream.N
    public final void b() {
        AbstractC0087w.g(this.d, this.b);
        long size = this.d.size();
        N n = this.a;
        n.c(size);
        if (this.c) {
            ArrayList arrayList = this.d;
            int size2 = arrayList.size();
            int i = 0;
            while (i < size2) {
                Object obj = arrayList.get(i);
                i++;
                if (n.f()) {
                    break;
                } else {
                    n.accept(obj);
                }
            }
        } else {
            Collection.EL.a(this.d, new C0059a(3, n));
        }
        n.b();
        this.d = null;
    }

    @Override // j$.util.stream.M, j$.util.stream.N
    public final void c(long j) {
        if (j >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        this.d = j >= 0 ? new ArrayList((int) j) : new ArrayList();
    }
}
