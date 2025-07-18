package defpackage;

import java.io.Closeable;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ccu implements Closeable {
    public final ccr a;
    public final Object b = new Object();
    public final List c = new ArrayList();
    public final boolean d;
    public final fsc e;

    public ccu(ccr ccrVar, fsc fscVar, boolean z) {
        this.a = ccrVar;
        this.e = fscVar;
        this.d = z;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.e.S(new bks(this, 13, null));
    }
}
