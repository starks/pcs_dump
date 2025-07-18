package defpackage;

import j$.util.concurrent.ConcurrentLinkedQueue;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fsb {
    public final long a;
    public final frm b;
    public final fsa c;
    public final ConcurrentLinkedQueue d;

    public fsb(frn frnVar, TimeUnit timeUnit) {
        frnVar.getClass();
        this.a = timeUnit.toNanos(5L);
        this.b = frnVar.a();
        this.c = new fsa(this, String.valueOf(frh.f).concat(" ConnectionPool"));
        this.d = new ConcurrentLinkedQueue();
    }

    public final boolean a(fpw fpwVar, frw frwVar, List list, boolean z) {
        Iterator it = this.d.iterator();
        it.getClass();
        while (it.hasNext()) {
            frz frzVar = (frz) it.next();
            frzVar.getClass();
            synchronized (frzVar) {
                if (z) {
                    if (!frzVar.i()) {
                        continue;
                    }
                }
                if (frzVar.h(fpwVar, list)) {
                    frwVar.e(frzVar);
                    return true;
                }
            }
        }
        return false;
    }
}
