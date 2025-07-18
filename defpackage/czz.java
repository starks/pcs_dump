package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class czz extends Exception {
    public czz(Throwable th, dao daoVar, StackTraceElement[] stackTraceElementArr) {
        super(daoVar.toString(), th);
        setStackTrace(stackTraceElementArr);
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        return this;
    }
}
