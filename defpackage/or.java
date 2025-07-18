package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class or extends Throwable {
    public or(String str) {
        super(str);
    }

    @Override // java.lang.Throwable
    public final synchronized Throwable fillInStackTrace() {
        return this;
    }
}
