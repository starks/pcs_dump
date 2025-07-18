package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class euj {
    private ArrayList a = new ArrayList();
    private volatile emh b = emh.IDLE;

    public final void a(emh emhVar) {
        emhVar.getClass();
        if (this.b == emhVar || this.b == emh.SHUTDOWN) {
            return;
        }
        this.b = emhVar;
        if (this.a.isEmpty()) {
            return;
        }
        ArrayList arrayList = this.a;
        this.a = new ArrayList();
        if (arrayList.size() <= 0) {
            return;
        }
        throw null;
    }
}
