package defpackage;

import j$.util.Map;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nv extends oc implements Map, j$.util.Map {
    np a;
    nr b;
    nt c;

    public nv() {
    }

    public final boolean a(Collection collection) {
        int i = this.f;
        for (int i2 = i - 1; i2 >= 0; i2--) {
            if (!collection.contains(d(i2))) {
                e(i2);
            }
        }
        return i != this.f;
    }

    @Override // java.util.Map, j$.util.Map, j$.util.concurrent.ConcurrentMap
    public final /* synthetic */ Object compute(Object obj, BiFunction biFunction) {
        return Map.CC.$default$compute(this, obj, biFunction);
    }

    @Override // java.util.Map, j$.util.Map, j$.util.concurrent.ConcurrentMap
    public final /* synthetic */ Object computeIfAbsent(Object obj, Function function) {
        return Map.CC.$default$computeIfAbsent(this, obj, function);
    }

    @Override // java.util.Map, j$.util.Map, j$.util.concurrent.ConcurrentMap
    public final /* synthetic */ Object computeIfPresent(Object obj, BiFunction biFunction) {
        return Map.CC.$default$computeIfPresent(this, obj, biFunction);
    }

    @Override // java.util.Map
    public final Set entrySet() {
        np npVar = this.a;
        if (npVar != null) {
            return npVar;
        }
        np npVar2 = new np(this);
        this.a = npVar2;
        return npVar2;
    }

    @Override // java.util.Map, j$.util.Map, j$.util.concurrent.ConcurrentMap
    public final /* synthetic */ void forEach(BiConsumer biConsumer) {
        Map.CC.$default$forEach(this, biConsumer);
    }

    @Override // java.util.Map
    public final Set keySet() {
        nr nrVar = this.b;
        if (nrVar != null) {
            return nrVar;
        }
        nr nrVar2 = new nr(this);
        this.b = nrVar2;
        return nrVar2;
    }

    @Override // java.util.Map, j$.util.Map, j$.util.concurrent.ConcurrentMap
    public final /* synthetic */ Object merge(Object obj, Object obj2, BiFunction biFunction) {
        return Map.CC.$default$merge(this, obj, obj2, biFunction);
    }

    @Override // java.util.Map
    public final void putAll(java.util.Map map) {
        h(this.f + map.size());
        for (Map.Entry entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // java.util.Map, j$.util.Map, j$.util.concurrent.ConcurrentMap
    public final /* synthetic */ void replaceAll(BiFunction biFunction) {
        Map.CC.$default$replaceAll(this, biFunction);
    }

    @Override // java.util.Map
    public final Collection values() {
        nt ntVar = this.c;
        if (ntVar != null) {
            return ntVar;
        }
        nt ntVar2 = new nt(this);
        this.c = ntVar2;
        return ntVar2;
    }

    public nv(int i) {
        super(i);
    }

    public nv(oc ocVar) {
        super((byte[]) null);
        int i = ocVar.f;
        h(this.f + i);
        if (this.f != 0) {
            for (int i2 = 0; i2 < i; i2++) {
                put(ocVar.d(i2), ocVar.g(i2));
            }
        } else if (i > 0) {
            ffh.af(ocVar.d, this.d, 0, 0, i);
            ffh.ag(ocVar.e, this.e, 0, 0, i + i);
            this.f = i;
        }
    }
}
