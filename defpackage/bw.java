package defpackage;

import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public class bw {
    public final ab a;
    public boolean b;
    public boolean c;
    public boolean d;
    public boolean e;
    public final List g;
    public int h;
    public int i;
    private final List k;
    private final List j = new ArrayList();
    public boolean f = true;

    public bw(int i, int i2, ab abVar) {
        this.h = i;
        this.i = i2;
        this.a = abVar;
        ArrayList arrayList = new ArrayList();
        this.k = arrayList;
        this.g = arrayList;
    }

    public void a() {
        this.e = false;
        if (this.c) {
            return;
        }
        if (ax.X(2)) {
            toString();
        }
        this.c = true;
        Iterator it = this.j.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
    }

    public void b() {
        this.e = true;
    }

    public final void c(Runnable runnable) {
        this.j.add(runnable);
    }

    public final void d(bt btVar) {
        this.k.add(btVar);
    }

    public final void e(ViewGroup viewGroup) {
        this.e = false;
        if (this.b) {
            return;
        }
        this.b = true;
        if (this.k.isEmpty()) {
            a();
            return;
        }
        for (bt btVar : ffh.L(this.g)) {
            if (!btVar.i) {
                btVar.a(viewGroup);
            }
            btVar.i = true;
        }
    }

    public final void f(bt btVar) {
        if (this.k.remove(btVar) && this.k.isEmpty()) {
            a();
        }
    }

    public final void g(int i, int i2) {
        int i3 = i2 - 1;
        if (i3 == 1) {
            if (this.h == 1) {
                if (ax.X(2)) {
                    Objects.toString(this.a);
                    Objects.toString(a.k(this.i));
                }
                this.h = 2;
                this.i = 2;
                this.f = true;
                return;
            }
            return;
        }
        if (i3 != 2) {
            if (this.h != 1) {
                if (ax.X(2)) {
                    Objects.toString(this.a);
                    Objects.toString(bv.a(this.h));
                    Objects.toString(bv.a(i));
                }
                this.h = i;
                return;
            }
            return;
        }
        if (ax.X(2)) {
            Objects.toString(this.a);
            Objects.toString(bv.a(this.h));
            Objects.toString(a.k(this.i));
        }
        this.h = 1;
        this.i = 3;
        this.f = true;
    }

    public final void h() {
        this.f = false;
    }

    public final String toString() {
        return "Operation {" + Integer.toHexString(System.identityHashCode(this)) + "} {finalState = " + ((Object) bv.a(this.h)) + " lifecycleImpact = " + ((Object) a.k(this.i)) + " fragment = " + this.a + '}';
    }
}
