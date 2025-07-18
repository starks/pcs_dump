package defpackage;

import java.util.ConcurrentModificationException;
import java.util.ListIterator;
import java.util.NoSuchElementException;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fgs implements ListIterator {
    private int a;
    private int b = -1;
    private int c;
    private final /* synthetic */ int d;
    private final fgh e;

    public fgs(fgr fgrVar, int i, int i2) {
        this.d = i2;
        this.e = fgrVar;
        this.a = i;
        this.c = fgrVar.modCount;
    }

    private final void a() {
        if (((fgt) this.e).modCount != this.c) {
            throw new ConcurrentModificationException();
        }
    }

    private final void b() {
        if (((fgr) this.e).d.modCount != this.c) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        if (this.d != 0) {
            b();
            int i = this.a;
            this.a = i + 1;
            ((fgr) this.e).add(i, obj);
            this.b = -1;
            this.c = ((fgr) this.e).modCount;
            return;
        }
        a();
        int i2 = this.a;
        this.a = i2 + 1;
        ((fgt) this.e).add(i2, obj);
        this.b = -1;
        this.c = ((fgt) this.e).modCount;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        if (this.d != 0) {
            return this.a < ((fgr) this.e).c;
        }
        return this.a < ((fgt) this.e).c;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        int i = this.d;
        int i2 = this.a;
        return i != 0 ? i2 > 0 : i2 > 0;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        if (this.d != 0) {
            b();
            fgh fghVar = this.e;
            int i = this.a;
            fgr fgrVar = (fgr) fghVar;
            if (i >= fgrVar.c) {
                throw new NoSuchElementException();
            }
            this.a = i + 1;
            this.b = i;
            return fgrVar.a[fgrVar.b + i];
        }
        a();
        fgh fghVar2 = this.e;
        int i2 = this.a;
        fgt fgtVar = (fgt) fghVar2;
        if (i2 >= fgtVar.c) {
            throw new NoSuchElementException();
        }
        this.a = i2 + 1;
        this.b = i2;
        return fgtVar.b[i2];
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        int i = this.d;
        return this.a;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (this.d == 0) {
            a();
            int i = this.a;
            if (i <= 0) {
                throw new NoSuchElementException();
            }
            int i2 = i - 1;
            this.a = i2;
            this.b = i2;
            return ((fgt) this.e).b[i2];
        }
        b();
        int i3 = this.a;
        if (i3 <= 0) {
            throw new NoSuchElementException();
        }
        int i4 = i3 - 1;
        this.a = i4;
        this.b = i4;
        fgr fgrVar = (fgr) this.e;
        return fgrVar.a[fgrVar.b + i4];
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        int i = this.d;
        return this.a - 1;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        if (this.d != 0) {
            b();
            int i = this.b;
            if (i == -1) {
                throw new IllegalStateException("Call next() or previous() before removing element from the iterator.");
            }
            this.e.b(i);
            this.a = this.b;
            this.b = -1;
            this.c = ((fgr) this.e).modCount;
            return;
        }
        a();
        int i2 = this.b;
        if (i2 == -1) {
            throw new IllegalStateException("Call next() or previous() before removing element from the iterator.");
        }
        this.e.b(i2);
        this.a = this.b;
        this.b = -1;
        this.c = ((fgt) this.e).modCount;
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        if (this.d != 0) {
            b();
            int i = this.b;
            if (i == -1) {
                throw new IllegalStateException("Call next() or previous() before replacing element from the iterator.");
            }
            ((fgr) this.e).set(i, obj);
            return;
        }
        a();
        int i2 = this.b;
        if (i2 == -1) {
            throw new IllegalStateException("Call next() or previous() before replacing element from the iterator.");
        }
        ((fgt) this.e).set(i2, obj);
    }

    public fgs(fgt fgtVar, int i, int i2) {
        this.d = i2;
        this.e = fgtVar;
        this.a = i;
        this.c = fgtVar.modCount;
    }
}
