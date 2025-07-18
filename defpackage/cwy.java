package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cwy extends cws {
    public cwy() {
        super(4);
    }

    @Override // defpackage.cws, defpackage.cwt
    public final /* synthetic */ void c(Object obj) {
        super.b(obj);
    }

    public final cxc g() {
        this.c = true;
        return cxc.l(this.a, this.b);
    }

    public final void h(Object obj) {
        super.b(obj);
    }

    public final void i(Object... objArr) {
        super.d(objArr);
    }

    public final void j(Iterable iterable) {
        super.e(iterable);
    }

    public final void k(Iterator it) {
        while (it.hasNext()) {
            c(it.next());
        }
    }

    public cwy(int i) {
        super(i);
    }
}
