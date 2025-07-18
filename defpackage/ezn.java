package defpackage;

import java.util.ArrayDeque;
import java.util.BitSet;
import java.util.concurrent.Future;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ezn {
    public final Object a;
    public boolean b;
    public Object c;

    public ezn() {
        this.a = new Object();
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.concurrent.Future] */
    public final Future a() {
        this.b = true;
        return this.c;
    }

    final void b(Future future) {
        boolean z;
        synchronized (this.a) {
            z = this.b;
            if (!z) {
                this.c = future;
            }
        }
        if (z) {
            future.cancel(false);
        }
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, java.util.Queue] */
    public final void c(cah cahVar) {
        synchronized (this.a) {
            if (this.c == null) {
                this.c = new ArrayDeque();
            }
            this.c.add(cahVar);
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Queue] */
    public final void d(cag cagVar) {
        cah cahVar;
        synchronized (this.a) {
            if (this.c != null && !this.b) {
                this.b = true;
                while (true) {
                    synchronized (this.a) {
                        cahVar = (cah) this.c.poll();
                        if (cahVar == null) {
                            this.b = false;
                            return;
                        }
                    }
                    cahVar.a(cagVar);
                }
            }
        }
    }

    public ezn(Object obj) {
        this.a = obj;
    }

    public ezn(byte[] bArr) {
        this.b = false;
        this.c = null;
        this.a = null;
        new BitSet();
    }
}
