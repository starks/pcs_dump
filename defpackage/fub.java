package defpackage;

import java.io.IOException;
import java.net.SocketTimeoutException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fub extends fvj {
    final /* synthetic */ fuc a;

    public fub(fuc fucVar) {
        this.a = fucVar;
    }

    @Override // defpackage.fvj
    protected final void a() {
        this.a.h(fta.i);
        ftv ftvVar = this.a.b;
        synchronized (ftvVar) {
            long j = ftvVar.p;
            long j2 = ftvVar.o;
            if (j >= j2) {
                ftvVar.o = j2 + 1;
                ftvVar.r = System.nanoTime() + 1000000000;
                ftvVar.j.b(new fts(String.valueOf(ftvVar.e).concat(" ping"), ftvVar), 0L);
            }
        }
    }

    @Override // defpackage.fvj
    protected final IOException b(IOException iOException) {
        SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
        if (iOException != null) {
            socketTimeoutException.initCause(iOException);
        }
        return socketTimeoutException;
    }

    public final void c() {
        if (f()) {
            throw b(null);
        }
    }
}
