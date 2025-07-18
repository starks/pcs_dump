package defpackage;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class frd implements Closeable {
    public static final fwv c = new fwv();

    public abstract long a();

    public abstract fvm b();

    public final InputStream c() {
        return b().j();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        frh.r(b());
    }
}
