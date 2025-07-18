package defpackage;

import java.util.HashMap;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ciy {
    public Executor a;
    public fcy b;
    private final cji d = cji.a;
    private final HashMap c = new HashMap();

    public final cix a() {
        return new cix(this.a, this.b, this.d, this.c);
    }

    public final void b(cjh cjhVar) {
        HashMap map = this.c;
        String strA = cjhVar.a(1);
        clq.A(!map.containsKey(strA), "There is already a factory registered for the ID %s", strA);
        this.c.put(strA, cjhVar);
    }
}
