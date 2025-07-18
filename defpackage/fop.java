package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fop implements Runnable {
    final /* synthetic */ foq a;
    private Runnable b;

    public fop(foq foqVar, Runnable runnable) {
        this.a = foqVar;
        this.b = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = 0;
        while (true) {
            try {
                this.b.run();
            } catch (Throwable th) {
                fme.d(fhr.a, th);
            }
            Runnable runnableC = this.a.c();
            if (runnableC == null) {
                return;
            }
            this.b = runnableC;
            i++;
            if (i >= 16 && this.a.c.e()) {
                foq foqVar = this.a;
                foqVar.c.d(foqVar, this);
                return;
            }
        }
    }
}
