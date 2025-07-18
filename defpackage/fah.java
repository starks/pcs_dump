package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fah implements Runnable {
    private final emk a;
    private final Throwable b;

    public fah(emk emkVar, Throwable th) {
        this.a = emkVar;
        this.b = th;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.j(this.b);
    }
}
