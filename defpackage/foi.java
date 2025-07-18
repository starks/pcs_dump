package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class foi extends RuntimeException {
    private final transient fhq a;

    public foi(fhq fhqVar) {
        this.a = fhqVar;
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    @Override // java.lang.Throwable
    public final String getLocalizedMessage() {
        return this.a.toString();
    }
}
