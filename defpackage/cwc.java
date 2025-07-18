package defpackage;

import java.util.AbstractCollection;
import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
final class cwc extends AbstractCollection {
    final /* synthetic */ cwd a;

    public cwc(cwd cwdVar) {
        this.a = cwdVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        this.a.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        cwd cwdVar = this.a;
        Map mapJ = cwdVar.j();
        return mapJ != null ? mapJ.values().iterator() : new cvx(cwdVar);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return this.a.size();
    }
}
