package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class uc implements Iterator {
    private final fiy a;
    private final List b = new ArrayList();
    private Iterator c;

    public uc(Iterator it, fiy fiyVar) {
        this.a = fiyVar;
        this.c = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.c.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        Object next = this.c.next();
        Iterator it = (Iterator) this.a.a(next);
        if (it != null && it.hasNext()) {
            this.b.add(this.c);
            this.c = it;
            return next;
        }
        while (!this.c.hasNext() && !this.b.isEmpty()) {
            this.c = (Iterator) ffh.G(this.b);
            List list = this.b;
            if (list.isEmpty()) {
                throw new NoSuchElementException("List is empty.");
            }
            list.remove(ffh.A(list));
        }
        return next;
    }

    @Override // java.util.Iterator
    public final void remove() {
        a.a();
    }
}
