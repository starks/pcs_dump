package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public class zx {
    public final aai h = new aai();

    public final void f() {
        aai aaiVar = this.h;
        if (!aaiVar.c) {
            aaiVar.c = true;
            synchronized (aaiVar.d) {
                Iterator it = aaiVar.a.values().iterator();
                while (it.hasNext()) {
                    aai.a((AutoCloseable) it.next());
                }
                Iterator it2 = aaiVar.b.iterator();
                while (it2.hasNext()) {
                    aai.a((AutoCloseable) it2.next());
                }
                aaiVar.b.clear();
            }
        }
        c();
    }

    protected void c() {
    }
}
