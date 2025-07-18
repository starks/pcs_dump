package defpackage;

import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class me {
    public boolean b = false;
    public final CopyOnWriteArrayList c = new CopyOnWriteArrayList();
    public fin d;

    public abstract void b();

    public void c(lq lqVar) {
        throw null;
    }

    public void d() {
        throw null;
    }

    public final void e(lr lrVar) {
        this.c.add(lrVar);
    }

    public final void f(lr lrVar) {
        this.c.remove(lrVar);
    }

    public final void g(boolean z) {
        this.b = z;
        fin finVar = this.d;
        if (finVar != null) {
            finVar.a();
        }
    }

    public void a() {
    }
}
