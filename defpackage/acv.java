package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class acv {
    public boolean a;
    public final Object b;
    public final Object c;
    public final Object d;

    public acv(Executor executor, fin finVar) {
        executor.getClass();
        this.d = finVar;
        this.b = new Object();
        this.c = new ArrayList();
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Iterable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, java.util.List] */
    public final void a() {
        synchronized (this.b) {
            this.a = true;
            Iterator it = this.c.iterator();
            while (it.hasNext()) {
                ((fin) it.next()).a();
            }
            this.c.clear();
        }
    }

    public acv(int i) {
        this.b = new ReentrantLock();
        this.c = new long[i];
        this.d = new boolean[i];
    }
}
