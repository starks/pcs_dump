package defpackage;

import java.util.IdentityHashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class eln {
    public elp a;
    public IdentityHashMap b;

    public eln(elp elpVar) {
        this.a = elpVar;
    }

    public final elp a() {
        if (this.b != null) {
            elp elpVar = this.a;
            elp elpVar2 = elp.a;
            for (Map.Entry entry : elpVar.b.entrySet()) {
                if (!this.b.containsKey(entry.getKey())) {
                    this.b.put((elo) entry.getKey(), entry.getValue());
                }
            }
            this.a = new elp(this.b);
            this.b = null;
        }
        return this.a;
    }

    public final void b(elo eloVar, Object obj) {
        if (this.b == null) {
            this.b = new IdentityHashMap(1);
        }
        this.b.put(eloVar, obj);
    }
}
