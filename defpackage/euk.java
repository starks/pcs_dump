package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
abstract class euk implements Runnable {
    private final emr a;

    protected euk(emr emrVar) {
        this.a = emrVar;
    }

    public abstract void a();

    @Override // java.lang.Runnable
    public final void run() {
        emr emrVarA = this.a.a();
        try {
            a();
        } finally {
            this.a.f(emrVarA);
        }
    }
}
