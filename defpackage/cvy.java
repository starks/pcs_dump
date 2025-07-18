package defpackage;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
final class cvy extends AbstractSet {
    final /* synthetic */ cwd a;

    public cvy(cwd cwdVar) {
        this.a = cwdVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.a.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        Map mapJ = this.a.j();
        if (mapJ != null) {
            return mapJ.entrySet().contains(obj);
        }
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            int iD = this.a.d(entry.getKey());
            if (iD != -1 && a.g(this.a.h(iD), entry.getValue())) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return this.a.i();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        Map mapJ = this.a.j();
        if (mapJ != null) {
            return mapJ.entrySet().remove(obj);
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        cwd cwdVar = this.a;
        if (cwdVar.o()) {
            return false;
        }
        int iC = cwdVar.c();
        Object key = entry.getKey();
        Object value = entry.getValue();
        cwd cwdVar2 = this.a;
        int I = dcr.I(key, value, iC, cwdVar2.g(), cwdVar2.p(), cwdVar2.q(), cwdVar2.r());
        if (I == -1) {
            return false;
        }
        this.a.m(I, iC);
        r9.f--;
        this.a.k();
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.a.size();
    }
}
