package defpackage;

import java.util.concurrent.CancellationException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fnb extends CancellationException implements flt {
    public final transient fna a;

    public fnb(String str, Throwable th, fna fnaVar) {
        super(str);
        this.a = fnaVar;
        if (th != null) {
            initCause(th);
        }
    }

    @Override // defpackage.flt
    public final /* bridge */ /* synthetic */ Throwable a() {
        if (!fmd.b) {
            return null;
        }
        String message = getMessage();
        message.getClass();
        return new fnb(message, this, this.a);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof fnb) {
            fnb fnbVar = (fnb) obj;
            if (fjs.c(fnbVar.getMessage(), getMessage()) && fjs.c(fnbVar.a, this.a) && fjs.c(fnbVar.getCause(), getCause())) {
                return true;
            }
        }
        return false;
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        if (fmd.b) {
            return super.fillInStackTrace();
        }
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    public final int hashCode() {
        String message = getMessage();
        message.getClass();
        int iHashCode = (message.hashCode() * 31) + this.a.hashCode();
        Throwable cause = getCause();
        return (iHashCode * 31) + (cause != null ? cause.hashCode() : 0);
    }

    @Override // java.lang.Throwable
    public final String toString() {
        return super.toString() + "; job=" + this.a;
    }
}
