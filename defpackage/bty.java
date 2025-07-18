package defpackage;

import android.util.Log;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bty extends buf {
    private final bqd a;
    private final csm b;
    private final Object c = new Object();
    private boolean d = false;

    public bty(bqd bqdVar, csm csmVar) {
        this.a = bqdVar;
        this.b = csmVar;
    }

    @Override // defpackage.bug
    public final void a() {
        synchronized (this.c) {
            if (this.d) {
                Log.w("brella.ExampleStoreSvc", "IExampleStoreIterator.close called more than once");
            } else {
                this.d = true;
                this.a.close();
            }
        }
    }

    @Override // defpackage.bug
    public final void b(bud budVar) {
        clq.v(budVar != null);
        synchronized (this.c) {
            if (this.d) {
                Log.w("brella.ExampleStoreSvc", "IExampleStoreIterator.next called after close");
            } else {
                this.a.a(new btz(this, budVar, this.b));
            }
        }
    }

    @Override // defpackage.bug
    public final void c(int i) {
        synchronized (this.c) {
            if (this.d) {
                Log.w("brella.ExampleStoreSvc", "IExampleStoreIterator.request called after close");
            } else {
                this.a.b(i);
            }
        }
    }
}
