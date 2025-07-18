package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: PG */
/* loaded from: classes.dex */
abstract class cre implements Iterator {
    public int a;
    final CharSequence b;
    final crl c;
    final boolean d;
    int e;
    int f;
    private Object g;

    protected cre() {
        this.a = 2;
    }

    public abstract int a(int i);

    public abstract int b(int i);

    protected final /* bridge */ /* synthetic */ Object c() {
        int iB;
        int iA;
        int i = this.e;
        while (true) {
            int i2 = this.e;
            if (i2 == -1) {
                this.a = 3;
                return null;
            }
            iB = b(i2);
            if (iB == -1) {
                iB = this.b.length();
                this.e = -1;
                iA = -1;
            } else {
                iA = a(iB);
                this.e = iA;
            }
            if (iA == i) {
                int i3 = iA + 1;
                this.e = i3;
                if (i3 > this.b.length()) {
                    this.e = -1;
                }
            } else {
                while (i < iB && this.c.b(this.b.charAt(i))) {
                    i++;
                }
                while (iB > i) {
                    int i4 = iB - 1;
                    if (!this.c.b(this.b.charAt(i4))) {
                        break;
                    }
                    iB = i4;
                }
                if (!this.d || i != iB) {
                    break;
                }
                i = this.e;
            }
        }
        int i5 = this.f;
        if (i5 == 1) {
            iB = this.b.length();
            this.e = -1;
            while (iB > i) {
                int i6 = iB - 1;
                if (!this.c.b(this.b.charAt(i6))) {
                    break;
                }
                iB = i6;
            }
        } else {
            this.f = i5 - 1;
        }
        return this.b.subSequence(i, iB).toString();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        clq.F(this.a != 4);
        int i = this.a;
        int i2 = i - 1;
        if (i == 0) {
            throw null;
        }
        if (i2 == 0) {
            return true;
        }
        if (i2 != 2) {
            this.a = 4;
            this.g = c();
            if (this.a != 3) {
                this.a = 1;
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.a = 2;
        Object obj = this.g;
        this.g = null;
        return obj;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    protected cre(csd csdVar, CharSequence charSequence) {
        this();
        this.e = 0;
        this.c = (crl) csdVar.b;
        this.d = csdVar.a;
        this.f = Integer.MAX_VALUE;
        this.b = charSequence;
    }
}
