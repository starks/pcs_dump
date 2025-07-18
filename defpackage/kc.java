package defpackage;

import android.support.v7.widget.RecyclerView;
import android.util.SparseArray;
import android.view.View;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kc {
    public final ArrayList a;
    public ArrayList b;
    public final ArrayList c;
    public final List d;
    int e;
    public final /* synthetic */ RecyclerView f;
    ahn g;
    private final int h;

    public kc(RecyclerView recyclerView) {
        this.f = recyclerView;
        ArrayList arrayList = new ArrayList();
        this.a = arrayList;
        this.b = null;
        this.c = new ArrayList();
        this.d = DesugarCollections.unmodifiableList(arrayList);
        this.h = 2;
        this.e = 2;
    }

    public final int a(int i) {
        if (i >= 0 && i < this.f.K.a()) {
            RecyclerView recyclerView = this.f;
            return !recyclerView.K.g ? i : recyclerView.h.a(i);
        }
        throw new IndexOutOfBoundsException("invalid position " + i + ". State item count is " + this.f.K.a() + this.f.j());
    }

    public final View b(int i) {
        return o(i, Long.MAX_VALUE).a;
    }

    final void c(km kmVar, boolean z) {
        RecyclerView.r(kmVar);
        RecyclerView recyclerView = this.f;
        View view = kmVar.a;
        ko koVar = recyclerView.P;
        if (koVar != null) {
            tp tpVarJ = koVar.j();
            ut.j(view, tpVarJ instanceof kn ? (tp) ((kn) tpVarJ).b.remove(view) : null);
        }
        if (z) {
            int size = this.f.o.size();
            for (int i = 0; i < size; i++) {
                ((kd) this.f.o.get(i)).a();
            }
            RecyclerView recyclerView2 = this.f;
            if (recyclerView2.K != null) {
                recyclerView2.U.i(kmVar);
            }
        }
        kmVar.r = null;
        kmVar.q = null;
        ahn ahnVarP = p();
        int i2 = kmVar.f;
        ArrayList arrayList = ahnVarP.g(i2).a;
        int i3 = ((kb) ((SparseArray) ahnVarP.c).get(i2)).b;
        if (arrayList.size() >= 5) {
            vr.b(kmVar.a);
        } else {
            kmVar.l();
            arrayList.add(kmVar);
        }
    }

    public final void d() {
        this.a.clear();
        h();
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, java.util.Set] */
    public final void e() {
        RecyclerView recyclerView;
        jr jrVar;
        ahn ahnVar = this.g;
        if (ahnVar == null || (jrVar = (recyclerView = this.f).m) == null || !recyclerView.s) {
            return;
        }
        ahnVar.b.add(jrVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Set] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, java.util.Set] */
    public final void f(jr jrVar, boolean z) {
        ahn ahnVar = this.g;
        if (ahnVar != null) {
            ahnVar.b.remove(jrVar);
            if (ahnVar.b.size() != 0 || z) {
                return;
            }
            for (int i = 0; i < ((SparseArray) ahnVar.c).size(); i++) {
                SparseArray sparseArray = (SparseArray) ahnVar.c;
                ArrayList arrayList = ((kb) sparseArray.get(sparseArray.keyAt(i))).a;
                for (int i2 = 0; i2 < arrayList.size(); i2++) {
                    vr.b(((km) arrayList.get(i2)).a);
                }
            }
        }
    }

    final void g(View view) {
        km kmVarG = RecyclerView.g(view);
        kmVarG.m = null;
        kmVarG.n = false;
        kmVarG.i();
        k(kmVarG);
    }

    public final void h() {
        int size = this.c.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            } else {
                i(size);
            }
        }
        this.c.clear();
        if (RecyclerView.c) {
            this.f.J.b();
        }
    }

    public final void i(int i) {
        int i2 = RecyclerView.W;
        c((km) this.c.get(i), true);
        this.c.remove(i);
    }

    public final void j(View view) {
        km kmVarG = RecyclerView.g(view);
        if (kmVarG.x()) {
            this.f.removeDetachedView(view, false);
        }
        if (kmVarG.w()) {
            kmVarG.p();
        } else if (kmVarG.B()) {
            kmVarG.i();
        }
        k(kmVarG);
        if (this.f.E == null || kmVarG.u()) {
            return;
        }
        this.f.E.d(kmVarG);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0030  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    final void k(defpackage.km r7) {
        /*
            Method dump skipped, instructions count: 271
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kc.k(km):void");
    }

    final void l(View view) {
        jv jvVar;
        km kmVarG = RecyclerView.g(view);
        if (!kmVarG.q(12) && kmVarG.y() && (jvVar = this.f.E) != null && kmVarG.d().isEmpty() && ((ks) jvVar).f && !kmVarG.t()) {
            if (this.b == null) {
                this.b = new ArrayList();
            }
            kmVarG.o(this, true);
            this.b.add(kmVarG);
            return;
        }
        if (kmVarG.t() && !kmVarG.v()) {
            RecyclerView recyclerView = this.f;
            if (!recyclerView.m.c) {
                throw new IllegalArgumentException("Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool.".concat(String.valueOf(recyclerView.j())));
            }
        }
        kmVarG.o(this, false);
        this.a.add(kmVarG);
    }

    public final void m(km kmVar) {
        if (kmVar.n) {
            this.b.remove(kmVar);
        } else {
            this.a.remove(kmVar);
        }
        kmVar.m = null;
        kmVar.n = false;
        kmVar.i();
    }

    public final void n() {
        jy jyVar = this.f.n;
        this.e = (jyVar != null ? jyVar.y : 0) + 2;
        int size = this.c.size();
        while (true) {
            size--;
            if (size < 0 || this.c.size() <= this.e) {
                return;
            } else {
                i(size);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:115:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x033b  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x0548  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x0554  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01be  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    final defpackage.km o(int r22, long r23) {
        /*
            Method dump skipped, instructions count: 1452
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kc.o(int, long):km");
    }

    public final ahn p() {
        if (this.g == null) {
            this.g = new ahn(null);
            e();
        }
        return this.g;
    }
}
