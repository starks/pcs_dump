package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fpn extends fpp {
    public static final fpn c = new fpn();

    private fpn() {
        super(fpt.c, fpt.d, fpt.e, fpt.a);
    }

    @Override // defpackage.fpp, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new UnsupportedOperationException("Dispatchers.Default cannot be closed");
    }

    @Override // defpackage.flx
    public final String toString() {
        return "Dispatchers.Default";
    }
}
