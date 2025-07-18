package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class afl extends RuntimeException {
    public final Throwable a;
    public final int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public afl(int i, Throwable th) {
        super(th);
        if (i == 0) {
            throw null;
        }
        this.b = i;
        this.a = th;
    }

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return this.a;
    }
}
