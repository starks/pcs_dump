package defpackage;

import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
class cvf implements Iterator {
    final Iterator a;
    final Collection b;
    final /* synthetic */ cvg c;

    public cvf(cvg cvgVar, Iterator it) {
        this.c = cvgVar;
        this.b = cvgVar.b;
        this.a = it;
    }

    final void a() {
        this.c.b();
        if (this.c.b != this.b) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        a();
        return this.a.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        a();
        return this.a.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.a.remove();
        cvg cvgVar = this.c;
        cvj cvjVar = cvgVar.e;
        cvjVar.b--;
        cvgVar.c();
    }

    public cvf(cvg cvgVar) {
        this.c = cvgVar;
        this.b = cvgVar.b;
        Collection collection = cvgVar.b;
        this.a = collection instanceof List ? ((List) collection).listIterator() : collection.iterator();
    }
}
