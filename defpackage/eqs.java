package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class eqs implements Runnable {
    final /* synthetic */ Object a;
    final /* synthetic */ Object b;
    final /* synthetic */ Object c;
    private final /* synthetic */ int d;

    public eqs(equ equVar, eqt eqtVar, Runnable runnable, int i) {
        this.d = i;
        this.a = eqtVar;
        this.b = runnable;
        this.c = equVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v7, types: [cqn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, java.lang.Runnable] */
    @Override // java.lang.Runnable
    public final void run() {
        if (this.d == 0) {
            ((equ) this.c).execute(this.a);
        } else {
            if (((cqu) ((fjx) this.b).a) != null) {
                throw null;
            }
            ?? r0 = this.a;
            ?? r2 = this.c;
            cqn cqnVarI = cqa.i(cqa.h(), r0);
            try {
                r2.run();
            } finally {
            }
        }
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.lang.Runnable] */
    public final String toString() {
        if (this.d == 0) {
            return String.valueOf(this.b.toString()).concat("(scheduled in SynchronizationContext)");
        }
        return "propagating=[" + this.c + "]";
    }

    public eqs(fjx fjxVar, cqn cqnVar, Runnable runnable, int i) {
        this.d = i;
        this.b = fjxVar;
        this.a = cqnVar;
        this.c = runnable;
    }
}
