package defpackage;

import java.util.AbstractQueue;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
final class cth extends AbstractQueue {
    final cuv a = new ctf();

    @Override // java.util.Queue
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final cuv peek() {
        cuv cuvVar = this.a;
        cuv cuvVar2 = ((ctf) cuvVar).a;
        if (cuvVar2 == cuvVar) {
            return null;
        }
        return cuvVar2;
    }

    @Override // java.util.AbstractQueue, java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        cuv cuvVar = ((ctf) this.a).a;
        while (true) {
            cuv cuvVar2 = this.a;
            if (cuvVar == cuvVar2) {
                ctf ctfVar = (ctf) cuvVar2;
                ctfVar.a = cuvVar2;
                ctfVar.b = cuvVar2;
                return;
            } else {
                cuv cuvVarF = cuvVar.f();
                cuu.e(cuvVar);
                cuvVar = cuvVarF;
            }
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return ((cuv) obj).f() != ctz.a;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean isEmpty() {
        cuv cuvVar = this.a;
        return ((ctf) cuvVar).a == cuvVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new ctg(this, peek());
    }

    @Override // java.util.Queue
    public final /* bridge */ /* synthetic */ boolean offer(Object obj) {
        cuv cuvVar = (cuv) obj;
        cuu.c(cuvVar.h(), cuvVar.f());
        cuu.c(((ctf) this.a).b, cuvVar);
        cuu.c(cuvVar, this.a);
        return true;
    }

    @Override // java.util.Queue
    public final /* bridge */ /* synthetic */ Object poll() {
        cuv cuvVar = this.a;
        cuv cuvVar2 = ((ctf) cuvVar).a;
        if (cuvVar2 == cuvVar) {
            return null;
        }
        remove(cuvVar2);
        return cuvVar2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean remove(Object obj) {
        cuv cuvVar = (cuv) obj;
        cuv cuvVarH = cuvVar.h();
        cuv cuvVarF = cuvVar.f();
        cuu.c(cuvVarH, cuvVarF);
        cuu.e(cuvVar);
        return cuvVarF != ctz.a;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        int i = 0;
        for (cuv cuvVarF = ((ctf) this.a).a; cuvVarF != this.a; cuvVarF = cuvVarF.f()) {
            i++;
        }
        return i;
    }
}
