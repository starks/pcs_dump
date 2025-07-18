package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fky implements Iterator {
    final /* synthetic */ fkz a;
    private final Iterator b;

    /* JADX WARN: Type inference failed for: r1v1, types: [fku, java.lang.Object] */
    public fky(fkz fkzVar) {
        this.a = fkzVar;
        this.b = fkzVar.a.a();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.b.hasNext();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [fiy, java.lang.Object] */
    @Override // java.util.Iterator
    public final Object next() {
        return this.a.b.a(this.b.next());
    }

    @Override // java.util.Iterator
    public final void remove() {
        a.a();
    }
}
