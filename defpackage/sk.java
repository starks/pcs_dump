package defpackage;

/* compiled from: PG */
@Deprecated
/* loaded from: classes.dex */
public final class sk {
    public boolean a;
    public boolean b;
    public bsp c;

    public final void a() {
        synchronized (this) {
            if (this.a) {
                return;
            }
            this.a = true;
            this.b = true;
            bsp bspVar = this.c;
            if (bspVar != null) {
                try {
                    bspVar.d();
                } catch (Throwable th) {
                    synchronized (this) {
                        this.b = false;
                        notifyAll();
                        throw th;
                    }
                }
            }
            synchronized (this) {
                this.b = false;
                notifyAll();
            }
        }
    }
}
