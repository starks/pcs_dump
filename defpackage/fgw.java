package defpackage;

import java.util.ConcurrentModificationException;

/* compiled from: PG */
/* loaded from: classes.dex */
public class fgw {
    public final fgy a;
    public int b;
    public int c = -1;
    private int d;

    public fgw(fgy fgyVar) {
        this.a = fgyVar;
        this.d = fgyVar.f;
        b();
    }

    public final void a() {
        if (this.a.f != this.d) {
            throw new ConcurrentModificationException();
        }
    }

    public final void b() {
        while (true) {
            int i = this.b;
            fgy fgyVar = this.a;
            if (i >= fgyVar.e || fgyVar.d[i] >= 0) {
                return;
            } else {
                this.b = i + 1;
            }
        }
    }

    public final boolean hasNext() {
        return this.b < this.a.e;
    }

    public final void remove() {
        a();
        if (this.c == -1) {
            throw new IllegalStateException("Call next() before removing element from the iterator.");
        }
        this.a.f();
        this.a.g(this.c);
        this.c = -1;
        this.d = this.a.f;
    }
}
