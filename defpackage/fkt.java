package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fkt implements Iterator {
    final /* synthetic */ fkz a;
    private Object b;
    private int c = -2;

    public fkt(fkz fkzVar) {
        this.a = fkzVar;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [fiy, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v9, types: [fin, java.lang.Object] */
    private final void a() {
        Object objA;
        if (this.c == -2) {
            objA = this.a.b.a();
        } else {
            fkz fkzVar = this.a;
            Object obj = this.b;
            obj.getClass();
            objA = fkzVar.a.a(obj);
        }
        this.b = objA;
        this.c = objA == null ? 0 : 1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.c < 0) {
            a();
        }
        return this.c == 1;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.c < 0) {
            a();
        }
        if (this.c == 0) {
            throw new NoSuchElementException();
        }
        Object obj = this.b;
        obj.getClass();
        this.c = -1;
        return obj;
    }

    @Override // java.util.Iterator
    public final void remove() {
        a.a();
    }
}
