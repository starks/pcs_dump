package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class anw {
    private final AtomicBoolean a = new AtomicBoolean(false);
    private final djy b;
    private final Executor c;
    private volatile djy d;
    private volatile djy e;

    public anw(String str, Executor executor) {
        this.c = executor;
        djy djyVarB = cnx.B(new IllegalStateException(String.valueOf(str).concat(" is not initialized")));
        this.b = djyVarB;
        this.e = djyVarB;
    }

    /* JADX WARN: Type inference failed for: r4v3, types: [djy, java.lang.Object] */
    public final synchronized djy a(csg csgVar) {
        if (this.e.isDone() && !api.c(this.e)) {
            ?? A = csgVar.a();
            this.d = A;
            this.e = dij.i(this.d, new ayn(this, (Object) A, 1), this.c);
        }
        return this.e;
    }

    public final synchronized void b() {
        this.a.set(false);
        this.e = this.b;
        this.d = null;
    }

    public final synchronized void c(djy djyVar) {
        if (djyVar == this.d) {
            this.a.set(true);
        }
    }
}
