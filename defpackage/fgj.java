package defpackage;

import j$.lang.Iterable$CC;
import j$.util.Collection;
import j$.util.Spliterator;
import j$.util.stream.Stream;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.function.Consumer;
import java.util.function.IntFunction;
import java.util.function.Predicate;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fgj implements Collection, j$.util.Collection {
    private final Object[] a;

    public fgj(Object[] objArr) {
        this.a = objArr;
    }

    @Override // java.util.Collection
    public final boolean add(Object obj) {
        return ffh.am();
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection collection) {
        return ffh.an();
    }

    @Override // java.util.Collection
    public final void clear() {
        a.a();
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0023 A[RETURN] */
    @Override // java.util.Collection
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean contains(java.lang.Object r5) {
        /*
            r4 = this;
            java.lang.Object[] r4 = r4.a
            r0 = 0
            if (r5 != 0) goto L11
            int r5 = r4.length
            r1 = r0
        L7:
            if (r1 >= r5) goto L25
            r2 = r4[r1]
            if (r2 != 0) goto Le
            goto L21
        Le:
            int r1 = r1 + 1
            goto L7
        L11:
            int r1 = r4.length
            r2 = r0
        L13:
            if (r2 >= r1) goto L25
            r3 = r4[r2]
            boolean r3 = defpackage.fjs.c(r5, r3)
            if (r3 != 0) goto L20
            int r2 = r2 + 1
            goto L13
        L20:
            r1 = r2
        L21:
            if (r1 < 0) goto L25
            r4 = 1
            return r4
        L25:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fgj.contains(java.lang.Object):boolean");
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection collection) {
        collection.getClass();
        if (collection.isEmpty()) {
            return true;
        }
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.lang.Iterable, j$.util.Collection, j$.lang.a
    public final /* synthetic */ void forEach(Consumer consumer) {
        Iterable$CC.$default$forEach(this, consumer);
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        return this.a.length == 0;
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new fkr(this.a, 1);
    }

    @Override // java.util.Collection, j$.util.Collection
    public final /* synthetic */ Stream parallelStream() {
        return Collection.CC.$default$parallelStream(this);
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        return ffh.am();
    }

    @Override // java.util.Collection
    public final boolean removeAll(java.util.Collection collection) {
        return ffh.an();
    }

    @Override // java.util.Collection, j$.util.Collection
    public final boolean removeIf(Predicate predicate) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean retainAll(java.util.Collection collection) {
        return ffh.an();
    }

    @Override // java.util.Collection
    public final /* bridge */ int size() {
        return this.a.length;
    }

    @Override // java.util.Collection, java.lang.Iterable, j$.util.Collection, j$.lang.a
    public final /* synthetic */ Spliterator spliterator() {
        return Collection.CC.$default$spliterator(this);
    }

    @Override // java.util.Collection, j$.util.Collection
    public final /* synthetic */ Stream stream() {
        return Collection.CC.$default$stream(this);
    }

    @Override // java.util.Collection, j$.util.Collection
    public final /* synthetic */ Object[] toArray(IntFunction intFunction) {
        return Collection.CC.$default$toArray(this, intFunction);
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        Object[] objArr = this.a;
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length, Object[].class);
        objArrCopyOf.getClass();
        return objArrCopyOf;
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        objArr.getClass();
        return fjo.b(this, objArr);
    }
}
