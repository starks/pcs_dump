package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class brk extends RuntimeException {
    public brk(Throwable th) {
        super("unexpected RemoteException", th);
    }
}
