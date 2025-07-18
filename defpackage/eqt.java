package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class eqt implements Runnable {
    final Runnable a;
    public boolean b;
    public boolean c;

    public eqt(Runnable runnable) {
        this.a = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.b) {
            return;
        }
        this.c = true;
        this.a.run();
    }
}
