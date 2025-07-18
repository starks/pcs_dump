package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fps extends fpr {
    public final Runnable a;

    public fps(Runnable runnable, long j, boolean z) {
        super(j, z);
        this.a = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.run();
    }

    public final String toString() {
        String strA = fme.a(this.a);
        String strB = fme.b(this.a);
        long j = this.g;
        boolean z = this.h;
        String str = fpt.a;
        return "Task[" + strA + "@" + strB + ", " + j + ", " + (true != z ? "Non-blocking" : "Blocking") + "]";
    }
}
