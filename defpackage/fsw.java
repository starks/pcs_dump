package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fsw implements fwd {
    final /* synthetic */ fsy a;
    private final fvq b;
    private boolean c;

    public fsw(fsy fsyVar) {
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
        frh.C(fvkVar.b, j);
        this.a.d.bi(fvkVar, j);
    }

    @Override // defpackage.fwd, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.c) {
            return;
        }
        this.c = true;
        fsy.l(this.b);
        this.a.e = 3;
    }

    @Override // defpackage.fwd, java.io.Flushable
    public final void flush() {
        if (this.c) {
            return;
        }
        this.a.d.flush();
    }
}
