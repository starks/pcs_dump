package defpackage;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bx {
    public static final a f = new a();
    public final ViewGroup a;
    public final List b;
    public final List c;
    public boolean d;
    public boolean e;

    public bx(ViewGroup viewGroup, byte[] bArr) {
        this(viewGroup);
    }

    public static final bx c(ViewGroup viewGroup, ax axVar) {
        viewGroup.getClass();
        a aVarAh = axVar.ah();
        aVarAh.getClass();
        return a.m(viewGroup, aVarAh);
    }

    private final void k(Map map, View view) {
        int[] iArr = ut.a;
        String strL = un.l(view);
        if (strL != null) {
            map.put(strL, view);
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = viewGroup.getChildAt(i);
                if (childAt.getVisibility() == 0) {
                    childAt.getClass();
                    k(map, childAt);
                }
            }
        }
    }

    private static void l(nv nvVar, Collection collection) {
        Set setEntrySet = nvVar.entrySet();
        mf mfVar = new mf(collection, 1);
        Iterator it = setEntrySet.iterator();
        while (it.hasNext()) {
            if (!((Boolean) mfVar.a(it.next())).booleanValue()) {
                it.remove();
            }
        }
    }

    public final bw a(ab abVar) {
        Object next;
        Iterator it = this.b.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            bw bwVar = (bw) next;
            if (fjs.c(bwVar.a, abVar) && !bwVar.b) {
                break;
            }
        }
        return (bw) next;
    }

    public final bw b(ab abVar) {
        Object next;
        Iterator it = this.c.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            bw bwVar = (bw) next;
            if (fjs.c(bwVar.a, abVar) && !bwVar.b) {
                break;
            }
        }
        return (bw) next;
    }

    public final void d(bw bwVar) {
        bwVar.getClass();
        if (bwVar.f) {
            int i = bwVar.h;
            ab abVar = bwVar.a;
            bv.b(i, abVar.D(), this.a);
            bwVar.h();
        }
    }

    public final void e(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ffh.P(arrayList, ((bw) it.next()).g);
        }
        List listL = ffh.L(ffh.N(arrayList));
        int size = listL.size();
        for (int i = 0; i < size; i++) {
            ((bt) listL.get(i)).b(this.a);
        }
        int size2 = list.size();
        for (int i2 = 0; i2 < size2; i2++) {
            d((bw) list.get(i2));
        }
        List listL2 = ffh.L(list);
        int size3 = listL2.size();
        for (int i3 = 0; i3 < size3; i3++) {
            bw bwVar = (bw) listL2.get(i3);
            if (bwVar.g.isEmpty()) {
                bwVar.a();
            }
        }
    }

    public final void f() {
        ax.X(2);
        boolean zIsAttachedToWindow = this.a.isAttachedToWindow();
        synchronized (this.b) {
            h();
            g(this.b);
            List<bw> listM = ffh.M(this.c);
            Iterator it = listM.iterator();
            while (it.hasNext()) {
                ((bw) it.next()).d = false;
            }
            for (bw bwVar : listM) {
                if (ax.X(2)) {
                    if (!zIsAttachedToWindow) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("Container ");
                        sb.append(this.a);
                        sb.append(" is not attached to window. ");
                    }
                    Objects.toString(bwVar);
                }
                bwVar.e(this.a);
            }
            List<bw> listM2 = ffh.M(this.b);
            Iterator it2 = listM2.iterator();
            while (it2.hasNext()) {
                ((bw) it2.next()).d = false;
            }
            for (bw bwVar2 : listM2) {
                if (ax.X(2)) {
                    if (!zIsAttachedToWindow) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("Container ");
                        sb2.append(this.a);
                        sb2.append(" is not attached to window. ");
                    }
                    Objects.toString(bwVar2);
                }
                bwVar2.e(this.a);
            }
        }
    }

    public final void g(List list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ((bw) list.get(i)).b();
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ffh.P(arrayList, ((bw) it.next()).g);
        }
        List listL = ffh.L(ffh.N(arrayList));
        int size2 = listL.size();
        for (int i2 = 0; i2 < size2; i2++) {
            bt btVar = (bt) listL.get(i2);
            ViewGroup viewGroup = this.a;
            if (!btVar.h) {
                btVar.c(viewGroup);
            }
            btVar.h = true;
        }
    }

    public final void h() {
        for (bw bwVar : this.b) {
            if (bwVar.i == 2) {
                bwVar.g(a.j(bwVar.a.D().getVisibility()), 1);
            }
        }
    }

    public final void i(int i, int i2, bc bcVar) {
        synchronized (this.b) {
            ab abVar = bcVar.a;
            abVar.getClass();
            bw bwVarA = a(abVar);
            if (bwVarA == null) {
                ab abVar2 = bcVar.a;
                if (abVar2.r) {
                    abVar2.getClass();
                    bwVarA = b(abVar2);
                } else {
                    bwVarA = null;
                }
            }
            if (bwVarA != null) {
                bwVarA.g(i, i2);
                return;
            }
            bu buVar = new bu(i, i2, bcVar);
            this.b.add(buVar);
            buVar.c(new o(this, buVar, 4));
            buVar.c(new o(this, buVar, 5));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:132:0x0360 A[LOOP:17: B:130:0x035a->B:132:0x0360, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void j(java.util.List r28, boolean r29) {
        /*
            Method dump skipped, instructions count: 1048
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bx.j(java.util.List, boolean):void");
    }

    public bx(ViewGroup viewGroup) {
        this.a = viewGroup;
        this.b = new ArrayList();
        this.c = new ArrayList();
    }
}
