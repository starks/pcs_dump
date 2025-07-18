package defpackage;

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ffc extends eog {
    private final List a;
    private final AtomicInteger b;
    private final int c;

    public ffc(List list, AtomicInteger atomicInteger) {
        clq.w(!list.isEmpty(), "empty list");
        this.a = list;
        this.b = atomicInteger;
        Iterator it = list.iterator();
        int iHashCode = 0;
        while (it.hasNext()) {
            iHashCode += ((eog) it.next()).hashCode();
        }
        this.c = iHashCode;
    }

    @Override // defpackage.eog
    public final eoc a(eod eodVar) {
        return ((eog) this.a.get((this.b.getAndIncrement() & Integer.MAX_VALUE) % this.a.size())).a(eodVar);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ffc)) {
            return false;
        }
        ffc ffcVar = (ffc) obj;
        if (ffcVar == this) {
            return true;
        }
        return this.c == ffcVar.c && this.b == ffcVar.b && this.a.size() == ffcVar.a.size() && new HashSet(this.a).containsAll(ffcVar.a);
    }

    public final int hashCode() {
        return this.c;
    }

    public final String toString() {
        crt crtVarP = clq.P(ffc.class);
        crtVarP.e("subchannelPickers", this.a);
        return crtVarP.toString();
    }
}
