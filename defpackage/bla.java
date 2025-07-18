package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class bla {
    public Object d;
    public boolean e = false;
    final /* synthetic */ blg f;

    public bla(blg blgVar, Object obj) {
        this.f = blgVar;
        this.d = obj;
    }

    protected abstract void b();

    protected abstract void d();

    public final void e() {
        synchronized (this) {
            this.d = null;
        }
    }

    public final void f() {
        e();
        synchronized (this.f.h) {
            this.f.h.remove(this);
        }
    }
}
