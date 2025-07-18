package defpackage;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
class cws extends cwt {
    Object[] a;
    int b;
    boolean c;

    public cws(int i) {
        dcr.O(i, "initialCapacity");
        this.a = new Object[i];
        this.b = 0;
    }

    private final void g(int i) {
        int length = this.a.length;
        int iF = f(length, this.b + i);
        if (iF > length || this.c) {
            this.a = Arrays.copyOf(this.a, iF);
            this.c = false;
        }
    }

    final void a(Object[] objArr, int i) {
        dcr.n(objArr, i);
        g(i);
        System.arraycopy(objArr, 0, this.a, this.b, i);
        this.b += i;
    }

    public final void b(Object obj) {
        obj.getClass();
        g(1);
        Object[] objArr = this.a;
        int i = this.b;
        this.b = i + 1;
        objArr[i] = obj;
    }

    @Override // defpackage.cwt
    public /* bridge */ /* synthetic */ void c(Object obj) {
        throw null;
    }

    public final void d(Object... objArr) {
        a(objArr, objArr.length);
    }

    public final void e(Iterable iterable) {
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            g(collection.size());
            if (collection instanceof cwu) {
                this.b = ((cwu) collection).a(this.a, this.b);
                return;
            }
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            c(it.next());
        }
    }
}
