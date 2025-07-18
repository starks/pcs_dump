package defpackage;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
final class s extends bt {
    public final List a;
    public final bw b;
    public final bw c;
    public final bo d;
    public final nv e;
    public final boolean f;
    public Object g;
    private final Object j;
    private final ArrayList k;
    private final ArrayList l;
    private final nv m;
    private final ArrayList n;
    private final ArrayList o;
    private final nv p;
    private final sk q;

    public s(List list, bw bwVar, bw bwVar2, bo boVar, Object obj, ArrayList arrayList, ArrayList arrayList2, nv nvVar, ArrayList arrayList3, ArrayList arrayList4, nv nvVar2, nv nvVar3, boolean z) {
        arrayList3.getClass();
        arrayList4.getClass();
        this.a = list;
        this.b = bwVar;
        this.c = bwVar2;
        this.d = boVar;
        this.j = obj;
        this.k = arrayList;
        this.l = arrayList2;
        this.m = nvVar;
        this.n = arrayList3;
        this.o = arrayList4;
        this.p = nvVar2;
        this.e = nvVar3;
        this.f = z;
        this.q = new sk();
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0193  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final defpackage.ffs g(android.view.ViewGroup r26, defpackage.bw r27, defpackage.bw r28) {
        /*
            Method dump skipped, instructions count: 483
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.s.g(android.view.ViewGroup, bw, bw):ffs");
    }

    private final void h(ArrayList arrayList, View view) {
        if (!(view instanceof ViewGroup)) {
            if (arrayList.contains(view)) {
                return;
            }
            arrayList.add(view);
            return;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int i = uu.a;
        if (viewGroup.isTransitionGroup()) {
            if (arrayList.contains(view)) {
                return;
            }
            arrayList.add(view);
            return;
        }
        int childCount = viewGroup.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = viewGroup.getChildAt(i2);
            if (childAt.getVisibility() == 0) {
                childAt.getClass();
                h(arrayList, childAt);
            }
        }
    }

    private final void i(ArrayList arrayList, ViewGroup viewGroup, fin finVar) {
        bg.a(arrayList, 4);
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = this.l;
        int size = arrayList3.size();
        for (int i = 0; i < size; i++) {
            View view = (View) arrayList3.get(i);
            int[] iArr = ut.a;
            arrayList2.add(un.l(view));
            un.q(view, null);
        }
        if (ax.X(2)) {
            ArrayList arrayList4 = this.k;
            int size2 = arrayList4.size();
            for (int i2 = 0; i2 < size2; i2++) {
                Object obj = arrayList4.get(i2);
                obj.getClass();
                View view2 = (View) obj;
                Objects.toString(view2);
                int[] iArr2 = ut.a;
                un.l(view2);
            }
            ArrayList arrayList5 = this.l;
            int size3 = arrayList5.size();
            for (int i3 = 0; i3 < size3; i3++) {
                Object obj2 = arrayList5.get(i3);
                obj2.getClass();
                View view3 = (View) obj2;
                Objects.toString(view3);
                int[] iArr3 = ut.a;
                un.l(view3);
            }
        }
        finVar.a();
        ArrayList arrayList6 = this.k;
        ArrayList arrayList7 = this.l;
        nv nvVar = this.m;
        int size4 = arrayList7.size();
        ArrayList arrayList8 = new ArrayList();
        for (int i4 = 0; i4 < size4; i4++) {
            View view4 = (View) arrayList6.get(i4);
            int[] iArr4 = ut.a;
            String strL = un.l(view4);
            arrayList8.add(strL);
            if (strL != null) {
                un.q(view4, null);
                String str = (String) nvVar.get(strL);
                int i5 = 0;
                while (true) {
                    if (i5 >= size4) {
                        break;
                    }
                    if (str.equals(arrayList2.get(i5))) {
                        un.q((View) arrayList7.get(i5), strL);
                        break;
                    }
                    i5++;
                }
            }
        }
        ub.b(viewGroup, new bn(size4, arrayList7, arrayList2, arrayList6, arrayList8));
        bg.a(arrayList, 0);
        this.d.m(this.j, this.k, this.l);
    }

    @Override // defpackage.bt
    public final void a(ViewGroup viewGroup) {
        this.q.a();
    }

    @Override // defpackage.bt
    public final void b(ViewGroup viewGroup) {
        if (!viewGroup.isLaidOut()) {
            for (t tVar : this.a) {
                bw bwVar = tVar.a;
                if (ax.X(2)) {
                    Objects.toString(viewGroup);
                    Objects.toString(bwVar);
                }
                tVar.a.f(this);
            }
            return;
        }
        Object obj = this.g;
        if (obj != null) {
            this.d.s(obj);
            if (ax.X(2)) {
                Objects.toString(this.b);
                Objects.toString(this.c);
                return;
            }
            return;
        }
        ffs ffsVarG = g(viewGroup, this.c, this.b);
        Object obj2 = ffsVarG.a;
        Object obj3 = ffsVarG.b;
        List list = this.a;
        ArrayList arrayList = (ArrayList) obj2;
        ArrayList<bw> arrayList2 = new ArrayList(ffh.Q(list));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList2.add(((t) it.next()).a);
        }
        for (bw bwVar2 : arrayList2) {
            this.d.k(bwVar2.a, obj3, this.q, new o(bwVar2, this, 0));
        }
        i(arrayList, viewGroup, new q(this, viewGroup, obj3, 1));
        if (ax.X(2)) {
            Objects.toString(this.b);
            Objects.toString(this.c);
        }
    }

    @Override // defpackage.bt
    public final void c(ViewGroup viewGroup) {
        if (!viewGroup.isLaidOut()) {
            Iterator it = this.a.iterator();
            while (it.hasNext()) {
                bw bwVar = ((t) it.next()).a;
                if (ax.X(2)) {
                    Objects.toString(viewGroup);
                    Objects.toString(bwVar);
                }
            }
            return;
        }
        if (f() && this.j != null && !d()) {
            Log.i("FragmentManager", "Ignoring shared elements transition " + this.j + " between " + this.b + " and " + this.c + " as neither fragment has set a Transition. In order to run a SharedElementTransition, you must also set either an enter or exit transition on a fragment involved in the transaction. The sharedElementTransition will run after the back gesture has been committed.");
        }
        if (d() && f()) {
            fjx fjxVar = new fjx();
            ffs ffsVarG = g(viewGroup, this.c, this.b);
            Object obj = ffsVarG.a;
            Object obj2 = ffsVarG.b;
            List list = this.a;
            ArrayList arrayList = (ArrayList) obj;
            ArrayList<bw> arrayList2 = new ArrayList(ffh.Q(list));
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                arrayList2.add(((t) it2.next()).a);
            }
            for (bw bwVar2 : arrayList2) {
                p pVar = new p(fjxVar, 0);
                bo boVar = this.d;
                ab abVar = bwVar2.a;
                boVar.y(obj2, this.q, pVar, new o(bwVar2, this, 2));
            }
            i(arrayList, viewGroup, new r(this, viewGroup, obj2, fjxVar));
        }
    }

    @Override // defpackage.bt
    public final boolean d() {
        if (!this.d.n()) {
            return false;
        }
        List list = this.a;
        if (!list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                Object obj = ((t) it.next()).b;
                if (obj == null || !this.d.o(obj)) {
                    return false;
                }
            }
        }
        Object obj2 = this.j;
        return obj2 == null || this.d.o(obj2);
    }

    @Override // defpackage.bt
    public final void e(lq lqVar) {
        Object obj = this.g;
        if (obj != null) {
            this.d.v(obj, lqVar.a);
        }
    }

    public final boolean f() {
        List list = this.a;
        if (list.isEmpty()) {
            return true;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (!((t) it.next()).a.a.r) {
                return false;
            }
        }
        return true;
    }
}
