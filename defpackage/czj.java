package defpackage;

import java.util.concurrent.atomic.AtomicLong;

/* compiled from: PG */
/* loaded from: classes.dex */
final class czj extends daj {
    public static final /* synthetic */ int a = 0;
    private static final czy b = new czh();
    private final AtomicLong e = new AtomicLong(-1);

    static daj b(dbg dbgVar, czx czxVar, long j) {
        czi cziVar = (czi) dbgVar.d(czr.d);
        if (cziVar == null) {
            return null;
        }
        czj czjVar = (czj) b.b(czxVar, dbgVar);
        cnx.U(j >= 0, "timestamp cannot be negative");
        long j2 = czjVar.e.get();
        if (j2 >= 0) {
            long nanos = cziVar.b.toNanos(cziVar.a) + j2;
            if (nanos < 0 || j < nanos) {
                return c;
            }
        }
        czjVar.e.compareAndSet(j2, -j);
        return czjVar;
    }

    @Override // defpackage.daj
    public final void a() {
        this.e.set(Math.max(-this.e.get(), 0L));
    }
}
