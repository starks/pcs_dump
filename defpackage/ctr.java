package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* compiled from: PG */
/* loaded from: classes.dex */
abstract class ctr implements Iterator {
    int a;
    int b = -1;
    cua c;
    AtomicReferenceArray d;
    cuv e;
    cut f;
    cut g;
    final /* synthetic */ cuu h;

    public ctr(cuu cuuVar) {
        this.h = cuuVar;
        this.a = cuuVar.f.length - 1;
        b();
    }

    final cut a() {
        cut cutVar = this.f;
        if (cutVar == null) {
            throw new NoSuchElementException();
        }
        this.g = cutVar;
        b();
        return this.g;
    }

    final void b() {
        this.f = null;
        if (d() || e()) {
            return;
        }
        while (true) {
            int i = this.a;
            if (i < 0) {
                return;
            }
            cuu cuuVar = this.h;
            this.a = i - 1;
            cua cuaVar = cuuVar.f[i];
            this.c = cuaVar;
            if (cuaVar.b != 0) {
                this.d = this.c.f;
                this.b = r0.length() - 1;
                if (e()) {
                    return;
                }
            }
        }
    }

    final boolean c(cuv cuvVar) {
        Object obj;
        boolean z;
        try {
            long jA = this.h.q.a();
            Object objJ = cuvVar.j();
            cuu cuuVar = this.h;
            Object obj2 = null;
            if (cuvVar.j() != null && (obj = cuvVar.d().get()) != null && !cuuVar.k(cuvVar, jA)) {
                obj2 = obj;
            }
            if (obj2 != null) {
                this.f = new cut(this.h, objJ, obj2);
                z = true;
            } else {
                z = false;
            }
            return z;
        } finally {
            this.c.o();
        }
    }

    final boolean d() {
        cuv cuvVar = this.e;
        if (cuvVar == null) {
            return false;
        }
        while (true) {
            this.e = cuvVar.e();
            cuv cuvVar2 = this.e;
            if (cuvVar2 == null) {
                return false;
            }
            if (c(cuvVar2)) {
                return true;
            }
            cuvVar = this.e;
        }
    }

    final boolean e() {
        while (true) {
            int i = this.b;
            if (i < 0) {
                return false;
            }
            AtomicReferenceArray atomicReferenceArray = this.d;
            this.b = i - 1;
            cuv cuvVar = (cuv) atomicReferenceArray.get(i);
            this.e = cuvVar;
            if (cuvVar != null && (c(cuvVar) || d())) {
                return true;
            }
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f != null;
    }

    @Override // java.util.Iterator
    public final void remove() {
        clq.F(this.g != null);
        this.h.remove(this.g.a);
        this.g = null;
    }
}
