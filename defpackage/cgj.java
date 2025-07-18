package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cgj {
    final /* synthetic */ cgk a;
    private final cgm b;

    public cgj(cgk cgkVar, cgm cgmVar) {
        this.a = cgkVar;
        this.b = cgmVar;
    }

    public final void a(cgf cgfVar) {
        Iterator it = this.a.d.iterator();
        boolean z = false;
        while (it.hasNext()) {
            if (clq.s(cgfVar.b) && !z) {
                this.b.a();
                z = true;
            }
        }
    }
}
