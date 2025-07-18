package defpackage;

import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ehb implements Iterator {
    final /* synthetic */ ehd a;
    private int b = -1;
    private boolean c;
    private Iterator d;

    public ehb(ehd ehdVar) {
        this.a = ehdVar;
    }

    private final Iterator a() {
        if (this.d == null) {
            this.d = this.a.c.entrySet().iterator();
        }
        return this.d;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i = this.b + 1;
        ehd ehdVar = this.a;
        if (i >= ehdVar.b) {
            return !ehdVar.c.isEmpty() && a().hasNext();
        }
        return true;
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        this.c = true;
        int i = this.b + 1;
        this.b = i;
        ehd ehdVar = this.a;
        return i < ehdVar.b ? (eha) ehdVar.a[i] : (Map.Entry) a().next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.c) {
            throw new IllegalStateException("remove() was called before next()");
        }
        this.c = false;
        this.a.e();
        int i = this.b;
        ehd ehdVar = this.a;
        if (i >= ehdVar.b) {
            a().remove();
        } else {
            this.b = i - 1;
            ehdVar.c(i);
        }
    }
}
