package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ffd extends fez {
    private final AtomicInteger l;
    private eog m;

    public ffd(eoa eoaVar) {
        super(eoaVar);
        this.l = new AtomicInteger(new Random().nextInt());
        this.m = new enz(eoc.a);
    }

    private final eog h(Collection collection) {
        ArrayList arrayList = new ArrayList();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(((fex) it.next()).d);
        }
        return new ffc(arrayList, this.l);
    }

    private final void i(emh emhVar, eog eogVar) {
        if (emhVar == this.k && eogVar.equals(this.m)) {
            return;
        }
        this.h.f(emhVar, eogVar);
        this.k = emhVar;
        this.m = eogVar;
    }

    @Override // defpackage.fez
    protected final fex f(Object obj) {
        return new ffb(this, obj, this.j);
    }

    @Override // defpackage.fez
    protected final void g() {
        ArrayList arrayList = new ArrayList();
        for (fex fexVar : this.g) {
            if (fexVar.c == emh.READY) {
                arrayList.add(fexVar);
            }
        }
        if (!arrayList.isEmpty()) {
            i(emh.READY, h(arrayList));
            return;
        }
        Iterator it = this.g.iterator();
        while (it.hasNext()) {
            emh emhVar = ((fex) it.next()).c;
            if (emhVar == emh.CONNECTING || emhVar == emh.IDLE) {
                i(emh.CONNECTING, new enz(eoc.a));
                return;
            }
        }
        i(emh.TRANSIENT_FAILURE, h(this.g));
    }
}
