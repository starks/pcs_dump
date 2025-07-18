package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class afo implements afe {
    public final Context a;
    public final String b;
    public final afc c;
    public boolean f;
    public final boolean d = false;
    public final boolean e = false;
    private final ffo g = new ffw(new acp(this, 3));

    public afo(Context context, String str, afc afcVar) {
        this.a = context;
        this.b = str;
        this.c = afcVar;
    }

    private final afn a() {
        return (afn) this.g.a();
    }

    @Override // defpackage.afe
    public final afb b() {
        return a().a(true);
    }

    @Override // defpackage.afe
    public final void c(boolean z) {
        if (this.g.b()) {
            a().setWriteAheadLoggingEnabled(z);
        }
        this.f = z;
    }

    @Override // defpackage.afe, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.g.b()) {
            a().close();
        }
    }
}
