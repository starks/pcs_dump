package defpackage;

import android.view.ViewGroup;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class jr {
    public final js b = new js();
    public boolean c = false;
    public final int d = 1;

    public abstract int a();

    public int c(int i) {
        throw null;
    }

    public abstract km d(ViewGroup viewGroup, int i);

    public abstract void e(km kmVar, int i);

    public long f(int i) {
        return -1L;
    }

    public final void g(boolean z) {
        if (this.b.f()) {
            throw new IllegalStateException("Cannot change whether this adapter has stable IDs while the adapter has registered observers.");
        }
        this.c = z;
    }
}
