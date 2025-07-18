package j$.util.stream;

import j$.util.Spliterator;
import j$.util.Spliterators;
import j$.util.function.Consumer$CC;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.function.Consumer;

/* loaded from: classes2.dex */
class U implements Consumer, Iterable, j$.lang.a {
    protected int a;
    protected int b;
    protected long[] c;
    protected Object[] d = new Object[16];
    protected Object[][] e;

    U() {
    }

    public final long a() {
        int i = this.b;
        return i == 0 ? this.a : this.c[i] + this.a;
    }

    @Override // java.util.function.Consumer
    public void accept(Object obj) {
        long length;
        int i = this.a;
        Object[] objArr = this.d;
        if (i == objArr.length) {
            if (this.e == null) {
                Object[][] objArr2 = new Object[8][];
                this.e = objArr2;
                this.c = new long[8];
                objArr2[0] = objArr;
            }
            int i2 = this.b;
            int i3 = i2 + 1;
            Object[][] objArr3 = this.e;
            if (i3 >= objArr3.length || objArr3[i3] == null) {
                if (i2 == 0) {
                    length = objArr.length;
                } else {
                    length = objArr3[i2].length + this.c[i2];
                }
                m(length + 1);
            }
            this.a = 0;
            int i4 = this.b + 1;
            this.b = i4;
            this.d = this.e[i4];
        }
        Object[] objArr4 = this.d;
        int i5 = this.a;
        this.a = i5 + 1;
        objArr4[i5] = obj;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }

    public final void clear() {
        Object[][] objArr = this.e;
        if (objArr != null) {
            this.d = objArr[0];
            int i = 0;
            while (true) {
                Object[] objArr2 = this.d;
                if (i >= objArr2.length) {
                    break;
                }
                objArr2[i] = null;
                i++;
            }
            this.e = null;
            this.c = null;
        } else {
            for (int i2 = 0; i2 < this.a; i2++) {
                this.d[i2] = null;
            }
        }
        this.a = 0;
        this.b = 0;
    }

    @Override // java.lang.Iterable, j$.lang.a
    public void forEach(Consumer consumer) {
        for (int i = 0; i < this.b; i++) {
            for (Object obj : this.e[i]) {
                consumer.accept(obj);
            }
        }
        for (int i2 = 0; i2 < this.a; i2++) {
            consumer.accept(this.d[i2]);
        }
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return Spliterators.c(spliterator());
    }

    protected final void m(long j) {
        int i = this.b;
        long length = i == 0 ? this.d.length : this.c[i] + this.e[i].length;
        if (j > length) {
            if (this.e == null) {
                Object[][] objArr = new Object[8][];
                this.e = objArr;
                this.c = new long[8];
                objArr[0] = this.d;
            }
            int i2 = i + 1;
            while (j > length) {
                Object[][] objArr2 = this.e;
                if (i2 >= objArr2.length) {
                    int length2 = objArr2.length * 2;
                    this.e = (Object[][]) Arrays.copyOf(objArr2, length2);
                    this.c = Arrays.copyOf(this.c, length2);
                }
                int iMin = 1 << ((i2 == 0 || i2 == 1) ? 4 : Math.min(i2 + 3, 30));
                this.e[i2] = new Object[iMin];
                long[] jArr = this.c;
                jArr[i2] = jArr[i2 - 1] + r5[r7].length;
                length += iMin;
                i2++;
            }
        }
    }

    @Override // java.lang.Iterable, j$.lang.a, j$.util.Collection
    public Spliterator spliterator() {
        return new T(this, 0, this.b, 0, this.a);
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        forEach(new C0059a(7, arrayList));
        return "SpinedBuffer:" + arrayList.toString();
    }
}
