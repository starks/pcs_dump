package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class bf {
    int e;
    int f;
    int g;
    int h;
    int i;
    public boolean j;
    public String l;
    int m;
    CharSequence n;
    int o;
    CharSequence p;
    ArrayList q;
    ArrayList r;
    ArrayList t;
    final ArrayList d = new ArrayList();
    public boolean k = true;
    boolean s = false;

    public bf b(ab abVar) {
        throw null;
    }

    public abstract void e();

    public void f(int i, ab abVar, String str, int i2) {
        throw null;
    }

    public abstract void j();

    public final bf k(int i, ab abVar) {
        if (i == 0) {
            throw new IllegalArgumentException("Must use non-zero containerViewId");
        }
        f(i, abVar, null, 2);
        return this;
    }

    final void l(be beVar) {
        this.d.add(beVar);
        beVar.d = this.e;
        beVar.e = this.f;
        beVar.f = this.g;
        beVar.g = this.h;
    }

    public final void m(int i, ab abVar) {
        f(i, abVar, null, 1);
    }

    public final void n() {
        if (this.j) {
            throw new IllegalStateException("This transaction is already being added to the back stack");
        }
        this.k = false;
    }

    public final void o() {
        this.s = true;
    }
}
