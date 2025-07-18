package defpackage;

import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class ni extends nj implements Iterator {
    ng a;
    ng b;

    public ni(ng ngVar, ng ngVar2) {
        this.a = ngVar2;
        this.b = ngVar;
    }

    private final ng d() {
        ng ngVar = this.b;
        ng ngVar2 = this.a;
        if (ngVar == ngVar2 || ngVar2 == null) {
            return null;
        }
        return b(ngVar);
    }

    public abstract ng a(ng ngVar);

    @Override // defpackage.nj
    public final void aK(ng ngVar) {
        if (this.a == ngVar && ngVar == this.b) {
            this.b = null;
            this.a = null;
        }
        ng ngVar2 = this.a;
        if (ngVar2 == ngVar) {
            this.a = a(ngVar2);
        }
        if (this.b == ngVar) {
            this.b = d();
        }
    }

    public abstract ng b(ng ngVar);

    @Override // java.util.Iterator
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final Map.Entry next() {
        ng ngVar = this.b;
        this.b = d();
        return ngVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.b != null;
    }
}
