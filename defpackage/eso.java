package defpackage;

import j$.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes.dex */
final class eso extends fjp {
    public final AtomicReference a;
    private final ConcurrentLinkedQueue b;

    public eso() {
        super((char[]) null);
        this.b = new ConcurrentLinkedQueue();
        this.a = new AtomicReference(null);
    }

    @Override // defpackage.fjp
    public final void S() {
        this.b.offer(new esl(3));
        g();
    }

    @Override // defpackage.fjp
    public final void c() {
        this.b.offer(new esl(0));
        g();
    }

    @Override // defpackage.fjp
    public final void d() {
        this.b.offer(new esl(1));
        g();
    }

    @Override // defpackage.fjp
    public final void e(final Object obj) {
        this.b.offer(new esn() { // from class: esm
            @Override // defpackage.esn
            public final void a(fjp fjpVar) {
                fjpVar.e(obj);
            }
        });
        g();
    }

    @Override // defpackage.fjp
    public final void f() {
        this.b.offer(new esl(2));
        g();
    }

    public final void g() {
        fjp fjpVar = (fjp) this.a.get();
        if (fjpVar == null) {
            return;
        }
        synchronized (this) {
            while (true) {
                esn esnVar = (esn) this.b.poll();
                if (esnVar != null) {
                    esnVar.a(fjpVar);
                }
            }
        }
    }
}
