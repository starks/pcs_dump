package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public class fvo implements fwd {
    public final fwd b;

    public fvo(fwd fwdVar) {
        this.b = fwdVar;
    }

    @Override // defpackage.fwd
    public final fwh a() {
        return this.b.a();
    }

    @Override // defpackage.fwd
    public void bi(fvk fvkVar, long j) {
        throw null;
    }

    @Override // defpackage.fwd, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.b.close();
    }

    @Override // defpackage.fwd, java.io.Flushable
    public void flush() {
        this.b.flush();
    }

    public final String toString() {
        return getClass().getSimpleName() + "(" + this.b + ")";
    }
}
