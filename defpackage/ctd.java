package defpackage;

import java.util.AbstractSet;

/* compiled from: PG */
/* loaded from: classes.dex */
abstract class ctd extends AbstractSet {
    final /* synthetic */ cuu a;

    public ctd(cuu cuuVar) {
        this.a = cuuVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.a.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.a.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.a.size();
    }
}
