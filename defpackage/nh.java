package defpackage;

import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nh extends nj implements Iterator {
    final /* synthetic */ nk a;
    private ng b;
    private boolean c = true;

    public nh(nk nkVar) {
        this.a = nkVar;
    }

    @Override // java.util.Iterator
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Map.Entry next() {
        ng ngVar;
        if (this.c) {
            this.c = false;
            ngVar = this.a.b;
        } else {
            ng ngVar2 = this.b;
            ngVar = ngVar2 != null ? ngVar2.c : null;
        }
        this.b = ngVar;
        return this.b;
    }

    @Override // defpackage.nj
    public final void aK(ng ngVar) {
        ng ngVar2 = this.b;
        if (ngVar == ngVar2) {
            ng ngVar3 = ngVar2.d;
            this.b = ngVar3;
            this.c = ngVar3 == null;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.c) {
            return this.a.b != null;
        }
        ng ngVar = this.b;
        return (ngVar == null || ngVar.c == null) ? false : true;
    }
}
