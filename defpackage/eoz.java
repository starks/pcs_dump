package defpackage;

import java.io.InputStream;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class eoz {
    private final eow a;
    private final Object b;
    private volatile byte[] c;

    public eoz(eow eowVar, Object obj) {
        this.a = eowVar;
        this.b = obj;
    }

    public static eow a(eox eoxVar) {
        return (eow) (eow.class.isInstance(eoxVar.c) ? eow.class.cast(eoxVar.c) : null);
    }

    public final InputStream b() {
        return this.a.a(this.b);
    }

    final byte[] c() {
        if (this.c == null) {
            synchronized (this) {
                if (this.c == null) {
                    this.c = epc.i(b());
                }
            }
        }
        return this.c;
    }
}
