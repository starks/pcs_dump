package defpackage;

import java.util.AbstractQueue;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
final class cus extends AbstractQueue {
    final cuv a = new cuq();

    @Override // java.util.Queue
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final cuv peek() {
        cuv cuvVar = this.a;
        cuv cuvVar2 = ((cuq) cuvVar).a;
        if (cuvVar2 == cuvVar) {
            return null;
        }
        return cuvVar2;
    }

    @Override // java.util.AbstractQueue, java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        cuv cuvVar = ((cuq) this.a).a;
        while (true) {
            cuv cuvVar2 = this.a;
            if (cuvVar == cuvVar2) {
                cuq cuqVar = (cuq) cuvVar2;
                cuqVar.a = cuvVar2;
                cuqVar.b = cuvVar2;
                return;
            } else {
                cuv cuvVarG = cuvVar.g();
                cuu.f(cuvVar);
                cuvVar = cuvVarG;
            }
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return ((cuv) obj).g() != ctz.a;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean isEmpty() {
        cuv cuvVar = this.a;
        return ((cuq) cuvVar).a == cuvVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new cur(this, peek());
    }

    @Override // java.util.Queue
    public final /* bridge */ /* synthetic */ boolean offer(Object obj) {
        cuv cuvVar = (cuv) obj;
        cuu.d(cuvVar.i(), cuvVar.g());
        cuu.d(((cuq) this.a).b, cuvVar);
        cuu.d(cuvVar, this.a);
        return true;
    }

    @Override // java.util.Queue
    public final /* bridge */ /* synthetic */ Object poll() {
        cuv cuvVar = this.a;
        cuv cuvVar2 = ((cuq) cuvVar).a;
        if (cuvVar2 == cuvVar) {
            return null;
        }
        remove(cuvVar2);
        return cuvVar2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean remove(Object obj) {
        cuv cuvVar = (cuv) obj;
        cuv cuvVarI = cuvVar.i();
        cuv cuvVarG = cuvVar.g();
        cuu.d(cuvVarI, cuvVarG);
        cuu.f(cuvVar);
        return cuvVarG != ctz.a;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        int i = 0;
        for (cuv cuvVarG = ((cuq) this.a).a; cuvVarG != this.a; cuvVarG = cuvVarG.g()) {
            i++;
        }
        return i;
    }
}
