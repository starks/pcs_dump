package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public class zh {
    public static final Object a = new Object();
    public final Object b = new Object();
    public final nk c = new nk();
    int d = 0;
    public boolean e;
    public volatile Object f;
    private volatile Object g;
    private int h;
    private boolean i;
    private boolean j;
    private final Runnable k;

    public zh() {
        Object obj = a;
        this.f = obj;
        this.k = new ls(this, 8, null);
        this.g = obj;
        this.h = -1;
    }

    public static void b(String str) {
        if (!mz.a().c()) {
            throw new IllegalStateException(a.z(str, "Cannot invoke ", " on a background thread"));
        }
    }

    private final void k(zg zgVar) {
        if (zgVar.d) {
            if (!zgVar.a()) {
                zgVar.d(false);
                return;
            }
            int i = zgVar.e;
            int i2 = this.h;
            if (i < i2) {
                zgVar.e = i2;
                zgVar.c.a(this.g);
            }
        }
    }

    public final Object a() {
        Object obj = this.g;
        if (obj != a) {
            return obj;
        }
        return null;
    }

    final void c(zg zgVar) {
        if (this.i) {
            this.j = true;
            return;
        }
        this.i = true;
        while (true) {
            this.j = false;
            if (zgVar != null) {
                k(zgVar);
            } else {
                nh nhVarE = this.c.e();
                while (nhVarE.hasNext()) {
                    k((zg) nhVarE.next().getValue());
                    if (this.j) {
                        break;
                    }
                }
            }
            if (!this.j) {
                this.i = false;
                return;
            }
            zgVar = null;
        }
    }

    public final void d(yz yzVar, zj zjVar) {
        b("observe");
        if (yzVar.E().a() == yv.DESTROYED) {
            return;
        }
        zf zfVar = new zf(this, yzVar, zjVar);
        zg zgVar = (zg) this.c.f(zjVar, zfVar);
        if (zgVar != null && !zgVar.c(yzVar)) {
            throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
        }
        if (zgVar != null) {
            return;
        }
        yzVar.E().b(zfVar);
    }

    protected void g(Object obj) {
        Object obj2;
        Object obj3;
        synchronized (this.b) {
            obj2 = this.f;
            obj3 = a;
            this.f = obj;
        }
        if (obj2 != obj3) {
            return;
        }
        mz.a().b(this.k);
    }

    public void h(zj zjVar) {
        b("removeObserver");
        zg zgVar = (zg) this.c.b(zjVar);
        if (zgVar == null) {
            return;
        }
        zgVar.b();
        zgVar.d(false);
    }

    public void i(Object obj) {
        b("setValue");
        this.h++;
        this.g = obj;
        c(null);
    }

    public final boolean j() {
        return this.d > 0;
    }

    protected void e() {
    }

    protected void f() {
    }
}
