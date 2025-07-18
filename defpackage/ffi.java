package defpackage;

import java.io.Closeable;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ffi implements Closeable {
    static final ffi a = new ffi(0);
    private final /* synthetic */ int b;

    private ffi(int i) {
        this.b = i;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.b != 0) {
            throw null;
        }
        int i = ffg.a;
    }
}
