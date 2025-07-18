package defpackage;

import java.io.Closeable;
import java.io.Flushable;

/* compiled from: PG */
/* loaded from: classes.dex */
public interface fwd extends Closeable, Flushable {
    fwh a();

    void bi(fvk fvkVar, long j);

    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();

    void flush();
}
