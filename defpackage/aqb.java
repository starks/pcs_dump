package defpackage;

import android.os.RemoteException;

/* compiled from: PG */
/* loaded from: classes.dex */
final class aqb implements bqd {
    private final apo a;

    public aqb(apo apoVar) {
        this.a = apoVar;
    }

    @Override // defpackage.bqd
    public final void a(bqc bqcVar) {
        try {
            this.a.a(new app(bqcVar));
        } catch (RemoteException e) {
            ((czl) ((czl) ((czl) aqc.a.e()).h(e)).i("com/google/android/apps/miphone/astrea/fl/brella/api/StartQueryCallback$ExampleStoreIteratorImpl", "next", '5', "StartQueryCallback.java")).p("RemoteException thrown in passing iterator callback.");
        }
    }

    @Override // defpackage.bqd, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // defpackage.bqd
    public final void b(int i) {
    }
}
