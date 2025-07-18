package defpackage;

import android.os.RemoteException;

/* compiled from: PG */
/* loaded from: classes.dex */
final class brn implements bqd {
    final /* synthetic */ bug a;
    private final bro b = new bro();

    public brn(bug bugVar) {
        this.a = bugVar;
    }

    @Override // defpackage.bqd
    public final void a(bqc bqcVar) {
        this.b.c(bqcVar);
        try {
            this.a.b(this.b);
        } catch (RemoteException e) {
            throw new AssertionError(e);
        }
    }

    @Override // defpackage.bqd
    public final void b(int i) {
        try {
            this.a.c(i);
        } catch (RemoteException e) {
            throw new AssertionError(e);
        }
    }

    @Override // defpackage.bqd, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        try {
            this.a.a();
        } catch (RemoteException e) {
            throw new AssertionError(e);
        }
    }
}
