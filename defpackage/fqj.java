package defpackage;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fqj {
    private ExecutorService c;
    private final int a = 64;
    private final int b = 5;
    private final ArrayDeque d = new ArrayDeque();
    private final ArrayDeque e = new ArrayDeque();
    private final ArrayDeque f = new ArrayDeque();

    public final synchronized void a(frw frwVar) {
        this.f.add(frwVar);
    }

    public final void b(frw frwVar) {
        ArrayDeque arrayDeque = this.f;
        synchronized (this) {
            if (!arrayDeque.remove(frwVar)) {
                throw new AssertionError("Call wasn't in-flight!");
            }
        }
        byte[] bArr = frh.a;
        ArrayList arrayList = new ArrayList();
        synchronized (this) {
            Iterator it = this.d.iterator();
            it.getClass();
            if (it.hasNext()) {
                if (this.e.size() < 64) {
                    throw null;
                }
            }
            d();
        }
        if (arrayList.size() <= 0) {
            return;
        }
        c();
        throw null;
    }

    public final synchronized void c() {
        if (this.c == null) {
            this.c = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue(), frh.p(String.valueOf(frh.f).concat(" Dispatcher"), false));
        }
        this.c.getClass();
    }

    public final synchronized void d() {
        this.e.size();
        this.f.size();
    }
}
