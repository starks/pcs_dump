package defpackage;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ezr {
    final boolean a;
    final List b;
    final Collection c;
    final Collection d;
    public final int e;
    final ezt f;
    final boolean g;
    final boolean h;

    public ezr(List list, Collection collection, Collection collection2, ezt eztVar, boolean z, boolean z2, boolean z3, int i) {
        this.b = list;
        collection.getClass();
        this.c = collection;
        this.f = eztVar;
        this.d = collection2;
        this.g = z;
        this.a = z2;
        this.h = z3;
        this.e = i;
        clq.G(!z2 || list == null, "passThrough should imply buffer is null");
        clq.G((z2 && eztVar == null) ? false : true, "passThrough should imply winningSubstream != null");
        clq.G(!z2 || (collection.size() == 1 && collection.contains(eztVar)) || (collection.size() == 0 && eztVar.b), "passThrough should imply winningSubstream is drained");
        clq.G((z && eztVar == null) ? false : true, "cancelled should imply committed");
    }

    final ezr a(ezt eztVar) {
        Collection collectionUnmodifiableCollection;
        clq.G(!this.h, "hedging frozen");
        clq.G(this.f == null, "already committed");
        Collection collection = this.d;
        if (collection == null) {
            collectionUnmodifiableCollection = Collections.singleton(eztVar);
        } else {
            ArrayList arrayList = new ArrayList(collection);
            arrayList.add(eztVar);
            collectionUnmodifiableCollection = DesugarCollections.unmodifiableCollection(arrayList);
        }
        return new ezr(this.b, this.c, collectionUnmodifiableCollection, this.f, this.g, this.a, this.h, this.e + 1);
    }

    final ezr b() {
        return this.h ? this : new ezr(this.b, this.c, this.d, this.f, this.g, this.a, true, this.e);
    }

    final ezr c(ezt eztVar) {
        Collection collectionUnmodifiableCollection;
        clq.G(!this.a, "Already passThrough");
        if (eztVar.b) {
            collectionUnmodifiableCollection = this.c;
        } else if (this.c.isEmpty()) {
            collectionUnmodifiableCollection = Collections.singletonList(eztVar);
        } else {
            ArrayList arrayList = new ArrayList(this.c);
            arrayList.add(eztVar);
            collectionUnmodifiableCollection = DesugarCollections.unmodifiableCollection(arrayList);
        }
        Collection collection = collectionUnmodifiableCollection;
        ezt eztVar2 = this.f;
        boolean z = eztVar2 != null;
        List list = this.b;
        if (z) {
            clq.G(eztVar2 == eztVar, "Another RPC attempt has already committed");
            list = null;
        }
        return new ezr(list, collection, this.d, this.f, this.g, z, this.h, this.e);
    }
}
