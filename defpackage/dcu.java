package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dcu implements Iterator {
    final /* synthetic */ dcv a;
    private int b = 0;

    public dcu(dcv dcvVar) {
        this.a = dcvVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.b < this.a.size();
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.b;
        if (i >= this.a.size()) {
            throw new NoSuchElementException();
        }
        dcv dcvVar = this.a;
        Object obj = dcvVar.b.b[dcvVar.b() + i];
        this.b = i + 1;
        return obj;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
