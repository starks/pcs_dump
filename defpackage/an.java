package defpackage;

import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
final class an extends me {
    final /* synthetic */ ax a;

    public an(ax axVar) {
        this.a = axVar;
    }

    @Override // defpackage.me
    public final void a() {
        if (ax.X(3)) {
            Objects.toString(this.a);
        }
        ax axVar = this.a;
        if (ax.X(3)) {
            Objects.toString(axVar.f);
        }
        d dVar = axVar.f;
        if (dVar != null) {
            dVar.b = false;
            dVar.d();
            d dVar2 = axVar.f;
            p pVar = new p(axVar, 4);
            if (dVar2.t == null) {
                dVar2.t = new ArrayList();
            }
            dVar2.t.add(pVar);
            axVar.f.j();
            axVar.g = true;
            axVar.W(true);
            axVar.H();
            axVar.g = false;
            axVar.f = null;
        }
    }

    @Override // defpackage.me
    public final void b() {
        if (ax.X(3)) {
            Objects.toString(this.a);
        }
        this.a.I();
    }

    @Override // defpackage.me
    public final void c(lq lqVar) {
        if (ax.X(2)) {
            Objects.toString(this.a);
        }
        ax axVar = this.a;
        d dVar = axVar.f;
        if (dVar != null) {
            ArrayList arrayList = new ArrayList(Collections.singletonList(dVar));
            for (bx bxVar : axVar.j(arrayList, 0, 1)) {
                if (ax.X(2)) {
                    float f = lqVar.a;
                }
                List list = bxVar.c;
                ArrayList arrayList2 = new ArrayList();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    ffh.P(arrayList2, ((bw) it.next()).g);
                }
                List listL = ffh.L(ffh.N(arrayList2));
                int size = listL.size();
                for (int i = 0; i < size; i++) {
                    bt btVar = (bt) listL.get(i);
                    ViewGroup viewGroup = bxVar.a;
                    btVar.e(lqVar);
                }
            }
            ArrayList arrayList3 = this.a.i;
            int size2 = arrayList3.size();
            for (int i2 = 0; i2 < size2; i2++) {
                ((at) arrayList3.get(i2)).d();
            }
        }
    }

    @Override // defpackage.me
    public final void d() {
        if (ax.X(3)) {
            Objects.toString(this.a);
        }
        this.a.E();
        ax axVar = this.a;
        axVar.F(new aw(axVar), false);
    }
}
