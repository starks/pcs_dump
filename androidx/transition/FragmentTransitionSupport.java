package androidx.transition;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import defpackage.ab;
import defpackage.agr;
import defpackage.ags;
import defpackage.agt;
import defpackage.agu;
import defpackage.agy;
import defpackage.ahc;
import defpackage.ahg;
import defpackage.ahk;
import defpackage.bo;
import defpackage.bsp;
import defpackage.sk;
import defpackage.us;
import java.util.ArrayList;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public class FragmentTransitionSupport extends bo {
    private static boolean z(ahc ahcVar) {
        return (w(ahcVar.c) && w(null) && w(null)) ? false : true;
    }

    @Override // defpackage.bo
    public final Object a(Object obj) {
        if (obj != null) {
            return ((ahc) obj).clone();
        }
        return null;
    }

    @Override // defpackage.bo
    public final Object b(Object obj, Object obj2, Object obj3) {
        ahc ahcVar = (ahc) obj;
        ahc ahcVar2 = (ahc) obj2;
        ahc ahcVar3 = (ahc) obj3;
        if (ahcVar != null && ahcVar2 != null) {
            ahk ahkVar = new ahk();
            ahkVar.N(ahcVar);
            ahkVar.N(ahcVar2);
            ahkVar.O();
            ahcVar = ahkVar;
        } else if (ahcVar == null) {
            ahcVar = ahcVar2 != null ? ahcVar2 : null;
        }
        if (ahcVar3 == null) {
            return ahcVar;
        }
        ahk ahkVar2 = new ahk();
        if (ahcVar != null) {
            ahkVar2.N(ahcVar);
        }
        ahkVar2.N(ahcVar3);
        return ahkVar2;
    }

    @Override // defpackage.bo
    public final Object c(Object obj) {
        if (obj == null) {
            return null;
        }
        ahk ahkVar = new ahk();
        ahkVar.N((ahc) obj);
        return ahkVar;
    }

    @Override // defpackage.bo
    public final void d(Object obj, View view) {
        ((ahc) obj).E(view);
    }

    @Override // defpackage.bo
    public final void e(Object obj, ArrayList arrayList) {
        ahc ahcVar = (ahc) obj;
        if (ahcVar == null) {
            return;
        }
        int i = 0;
        if (ahcVar instanceof ahk) {
            ahk ahkVar = (ahk) ahcVar;
            int iF = ahkVar.f();
            while (i < iF) {
                e(ahkVar.g(i), arrayList);
                i++;
            }
            return;
        }
        if (z(ahcVar) || !w(ahcVar.d)) {
            return;
        }
        int size = arrayList.size();
        while (i < size) {
            ahcVar.E((View) arrayList.get(i));
            i++;
        }
    }

    @Override // defpackage.bo
    public final void f(ViewGroup viewGroup, Object obj) {
        ahc ahcVar = (ahc) obj;
        if (ahg.b.contains(viewGroup) || !viewGroup.isLaidOut()) {
            return;
        }
        ahg.b.add(viewGroup);
        if (ahcVar == null) {
            ahcVar = ahg.a;
        }
        ahc ahcVarClone = ahcVar.clone();
        ahg.c(viewGroup, ahcVarClone);
        us.h(viewGroup);
        ahg.b(viewGroup, ahcVarClone);
    }

    public final void g(Object obj, ArrayList arrayList, ArrayList arrayList2) {
        ahc ahcVar = (ahc) obj;
        int i = 0;
        if (ahcVar instanceof ahk) {
            ahk ahkVar = (ahk) ahcVar;
            int iF = ahkVar.f();
            while (i < iF) {
                g(ahkVar.g(i), arrayList, arrayList2);
                i++;
            }
            return;
        }
        if (z(ahcVar)) {
            return;
        }
        ArrayList arrayList3 = ahcVar.d;
        if (arrayList3.size() != arrayList.size() || !arrayList3.containsAll(arrayList)) {
            return;
        }
        int size = arrayList2 == null ? 0 : arrayList2.size();
        while (i < size) {
            ahcVar.E((View) arrayList2.get(i));
            i++;
        }
        int size2 = arrayList.size();
        while (true) {
            size2--;
            if (size2 < 0) {
                return;
            } else {
                ahcVar.G((View) arrayList.get(size2));
            }
        }
    }

    @Override // defpackage.bo
    public final void h(Object obj, View view, ArrayList arrayList) {
        ((ahc) obj).D(new agr(view, arrayList));
    }

    @Override // defpackage.bo
    public final void i(Object obj, Rect rect) {
        ((ahc) obj).L(new agu());
    }

    @Override // defpackage.bo
    public final void j(Object obj, View view) {
        if (view != null) {
            x(view, new Rect());
            ((ahc) obj).L(new agu());
        }
    }

    @Override // defpackage.bo
    public final void k(ab abVar, Object obj, sk skVar, Runnable runnable) {
        y(obj, skVar, null, runnable);
    }

    @Override // defpackage.bo
    public final void l(Object obj, View view, ArrayList arrayList) {
        ahk ahkVar = (ahk) obj;
        ArrayList arrayList2 = ahkVar.d;
        arrayList2.clear();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            u(arrayList2, (View) arrayList.get(i));
        }
        arrayList2.add(view);
        arrayList.add(view);
        e(ahkVar, arrayList);
    }

    @Override // defpackage.bo
    public final void m(Object obj, ArrayList arrayList, ArrayList arrayList2) {
        ahk ahkVar = (ahk) obj;
        if (ahkVar != null) {
            ahkVar.d.clear();
            ahkVar.d.addAll(arrayList2);
            g(ahkVar, arrayList, arrayList2);
        }
    }

    @Override // defpackage.bo
    public final boolean n() {
        return true;
    }

    @Override // defpackage.bo
    public final boolean o(Object obj) {
        boolean zD = ((ahc) obj).d();
        if (!zD) {
            Objects.toString(obj);
        }
        return zD;
    }

    @Override // defpackage.bo
    public final Object p(Object obj, Object obj2) {
        ahk ahkVar = new ahk();
        if (obj != null) {
            ahkVar.N((ahc) obj);
        }
        ahkVar.N((ahc) obj2);
        return ahkVar;
    }

    @Override // defpackage.bo
    public final void q(Object obj, Object obj2, ArrayList arrayList, Object obj3, ArrayList arrayList2) {
        ((ahc) obj).D(new ags(this, obj2, arrayList, obj3, arrayList2));
    }

    @Override // defpackage.bo
    public final Object r(ViewGroup viewGroup, Object obj) {
        ahc ahcVar = (ahc) obj;
        if (ahg.b.contains(viewGroup) || !viewGroup.isLaidOut()) {
            return null;
        }
        if (!ahcVar.d()) {
            throw new IllegalArgumentException("The Transition must support seeking.");
        }
        ahg.b.add(viewGroup);
        ahc ahcVarClone = ahcVar.clone();
        ahk ahkVar = new ahk();
        ahkVar.N(ahcVarClone);
        ahg.c(viewGroup, ahkVar);
        us.h(viewGroup);
        ahg.b(viewGroup, ahkVar);
        viewGroup.invalidate();
        ahkVar.q = new agy(ahkVar);
        ahkVar.D(ahkVar.q);
        return ahkVar.q;
    }

    @Override // defpackage.bo
    public final void s(Object obj) {
        ((agy) obj).i();
    }

    @Override // defpackage.bo
    public final void t(Object obj, Runnable runnable) {
        ((agy) obj).j(runnable);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0051  */
    @Override // defpackage.bo
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void v(java.lang.Object r11, float r12) {
        /*
            r10 = this;
            agy r11 = (defpackage.agy) r11
            boolean r10 = r11.b
            if (r10 == 0) goto L6c
            long r0 = r11.h()
            float r10 = (float) r0
            float r12 = r12 * r10
            long r0 = (long) r12
            r2 = 0
            int r10 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            r4 = 1
            if (r10 != 0) goto L16
            r0 = r4
        L16:
            long r6 = r11.h()
            int r10 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            r6 = -1
            if (r10 != 0) goto L25
            long r0 = r11.h()
            long r0 = r0 + r6
        L25:
            xk r10 = r11.e
            if (r10 != 0) goto L64
            long r8 = r11.a
            int r10 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r10 == 0) goto L6c
            boolean r10 = r11.c
            if (r10 != 0) goto L59
            int r10 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r10 != 0) goto L3c
            int r10 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r10 <= 0) goto L3d
            goto L4d
        L3c:
            r2 = r0
        L3d:
            long r0 = r11.h()
            int r10 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r10 != 0) goto L4c
            int r10 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r10 >= 0) goto L4c
            long r6 = r0 + r4
            goto L4d
        L4c:
            r6 = r2
        L4d:
            int r10 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r10 == 0) goto L58
            ahc r10 = r11.h
            r10.y(r6, r8)
            r11.a = r6
        L58:
            r0 = r6
        L59:
            ahn r10 = r11.f
            long r11 = android.view.animation.AnimationUtils.currentAnimationTimeMillis()
            float r0 = (float) r0
            r10.a(r11, r0)
            return
        L64:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "setCurrentPlayTimeMillis() called after animation has been started"
            r10.<init>(r11)
            throw r10
        L6c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.transition.FragmentTransitionSupport.v(java.lang.Object, float):void");
    }

    @Override // defpackage.bo
    public final void y(Object obj, sk skVar, Runnable runnable, Runnable runnable2) {
        ahc ahcVar = (ahc) obj;
        bsp bspVar = new bsp(runnable, ahcVar, runnable2);
        synchronized (skVar) {
            while (skVar.b) {
                try {
                    skVar.wait();
                } catch (InterruptedException unused) {
                }
            }
            if (skVar.c != bspVar) {
                skVar.c = bspVar;
                if (skVar.a) {
                    bspVar.d();
                }
            }
        }
        ahcVar.D(new agt(runnable2));
    }
}
