package defpackage;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: PG */
/* loaded from: classes.dex */
abstract class cvz implements Iterator {
    int b;
    int c;
    int d = -1;
    final /* synthetic */ cwd e;

    public cvz(cwd cwdVar) {
        this.e = cwdVar;
        this.b = cwdVar.e;
        this.c = cwdVar.a();
    }

    private final void b() {
        if (this.e.e != this.b) {
            throw new ConcurrentModificationException();
        }
    }

    public abstract Object a(int i);

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.c >= 0;
    }

    @Override // java.util.Iterator
    public final Object next() {
        b();
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i = this.c;
        this.d = i;
        Object objA = a(i);
        this.c = this.e.b(this.c);
        return objA;
    }

    @Override // java.util.Iterator
    public final void remove() {
        b();
        dcr.N(this.d >= 0);
        this.b += 32;
        int i = this.d;
        cwd cwdVar = this.e;
        cwdVar.remove(cwdVar.e(i));
        this.c--;
        this.d = -1;
    }
}
