package defpackage;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
final class cwa extends AbstractSet {
    final /* synthetic */ cwd a;

    public cwa(cwd cwdVar) {
        this.a = cwdVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.a.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.a.containsKey(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        cwd cwdVar = this.a;
        Map mapJ = cwdVar.j();
        return mapJ != null ? mapJ.keySet().iterator() : new cvv(cwdVar);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        Map mapJ = this.a.j();
        return mapJ != null ? mapJ.keySet().remove(obj) : this.a.f(obj) != cwd.a;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.a.size();
    }
}
