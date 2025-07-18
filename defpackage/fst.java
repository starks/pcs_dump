package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fst implements fwd {
    final /* synthetic */ fsy a;
    private final fvq b;
    private boolean c;

    public fst(fsy fsyVar) {
        this.a = fsyVar;
        this.b = new fvq(fsyVar.d.a());
    }

    @Override // defpackage.fwd
    public final fwh a() {
        return this.b;
    }

    @Override // defpackage.fwd
    public final void bi(fvk fvkVar, long j) {
        if (this.c) {
            throw new IllegalStateException("closed");
        }
        if (j == 0) {
            return;
        }
        this.a.d.Q(j);
        this.a.d.t("\r\n");
        this.a.d.bi(fvkVar, j);
        this.a.d.t("\r\n");
    }

    @Override // defpackage.fwd, java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        if (this.c) {
            return;
        }
        this.c = true;
        this.a.d.t("0\r\n\r\n");
        fsy.l(this.b);
        this.a.e = 3;
    }

    @Override // defpackage.fwd, java.io.Flushable
    public final synchronized void flush() {
        if (this.c) {
            return;
        }
        this.a.d.flush();
    }
}
