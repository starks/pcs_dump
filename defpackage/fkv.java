package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fkv extends fkw implements Iterator, fhk {
    public fhk a;
    private int b;
    private Object c;
    private Iterator d;

    private final Throwable c() {
        int i = this.b;
        return i != 4 ? i != 5 ? new IllegalStateException(a.x(i, "Unexpected state of the iterator: ")) : new IllegalStateException("Iterator has failed.") : new NoSuchElementException();
    }

    @Override // defpackage.fkw
    public final Object a(Object obj, fhk fhkVar) {
        this.c = obj;
        this.b = 3;
        this.a = fhkVar;
        fhs fhsVar = fhs.a;
        return fhsVar == fhs.a ? fhsVar : ffz.a;
    }

    @Override // defpackage.fkw
    public final Object b(Iterator it, fhk fhkVar) {
        if (it.hasNext()) {
            this.d = it;
            this.b = 2;
            this.a = fhkVar;
            fhs fhsVar = fhs.a;
            if (fhsVar == fhs.a) {
                return fhsVar;
            }
        }
        return ffz.a;
    }

    @Override // defpackage.fhk
    public final fhq d() {
        return fhr.a;
    }

    @Override // defpackage.fhk
    public final void e(Object obj) throws Throwable {
        ffh.c(obj);
        this.b = 4;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() throws Throwable {
        while (true) {
            int i = this.b;
            if (i != 0) {
                if (i != 1) {
                    if (i == 2 || i == 3) {
                        return true;
                    }
                    if (i == 4) {
                        return false;
                    }
                    throw c();
                }
                Iterator it = this.d;
                it.getClass();
                if (it.hasNext()) {
                    this.b = 2;
                    return true;
                }
                this.d = null;
            }
            this.b = 5;
            fhk fhkVar = this.a;
            fhkVar.getClass();
            this.a = null;
            fhkVar.e(ffz.a);
        }
    }

    @Override // java.util.Iterator
    public final Object next() throws Throwable {
        int i = this.b;
        if (i == 0 || i == 1) {
            if (hasNext()) {
                return next();
            }
            throw new NoSuchElementException();
        }
        if (i == 2) {
            this.b = 1;
            Iterator it = this.d;
            it.getClass();
            return it.next();
        }
        if (i != 3) {
            throw c();
        }
        this.b = 0;
        Object obj = this.c;
        this.c = null;
        return obj;
    }

    @Override // java.util.Iterator
    public final void remove() {
        a.a();
    }
}
