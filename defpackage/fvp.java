package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public class fvp implements fwf {
    public final fwf b;

    public fvp(fwf fwfVar) {
        this.b = fwfVar;
    }

    @Override // defpackage.fwf
    public final fwh a() {
        return this.b.a();
    }

    @Override // defpackage.fwf
    public long b(fvk fvkVar, long j) {
        throw null;
    }

    @Override // defpackage.fwf, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.b.close();
    }

    public final String toString() {
        return getClass().getSimpleName() + "(" + this.b + ")";
    }
}
