package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class dkd extends dia implements Runnable {
    private final Runnable a;

    public dkd(Runnable runnable) {
        runnable.getClass();
        this.a = runnable;
    }

    @Override // defpackage.dif
    protected final String a() {
        return "task=[" + this.a.toString() + "]";
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.a.run();
        } catch (Throwable th) {
            e(th);
            throw th;
        }
    }
}
