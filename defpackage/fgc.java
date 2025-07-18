package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: PG */
/* loaded from: classes.dex */
class fgc implements Iterator {
    public int a;
    final /* synthetic */ fgf b;

    public fgc(fgf fgfVar) {
        this.b = fgfVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.a < this.b.a();
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        fgf fgfVar = this.b;
        int i = this.a;
        this.a = i + 1;
        return fgfVar.get(i);
    }

    @Override // java.util.Iterator
    public final void remove() {
        a.a();
    }
}
