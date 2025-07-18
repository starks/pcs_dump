package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class ahc implements Cloneable {
    public ArrayList i;
    public ArrayList j;
    long p;
    public agy q;
    long r;
    public us s;
    private agz[] y;
    private static final Animator[] u = new Animator[0];
    private static final int[] v = {2, 1, 3, 4};
    private static final us C = new us(null, null, null);
    private static final ThreadLocal w = new ThreadLocal();
    private final String x = getClass().getName();
    public long a = -1;
    long b = -1;
    public final ArrayList c = new ArrayList();
    public final ArrayList d = new ArrayList();
    public ahm e = new ahm();
    public ahm f = new ahm();
    ahk g = null;
    public final int[] h = v;
    final ArrayList k = new ArrayList();
    private Animator[] z = u;
    int l = 0;
    private boolean A = false;
    boolean m = false;
    public ahc n = null;
    private ArrayList B = null;
    ArrayList o = new ArrayList();
    public us t = C;

    private static boolean N(ahl ahlVar, ahl ahlVar2, String str) {
        Map map = ahlVar2.a;
        Object obj = ahlVar.a.get(str);
        Object obj2 = map.get(str);
        if (obj == null && obj2 == null) {
            return false;
        }
        if (obj == null || obj2 == null) {
            return true;
        }
        return !obj.equals(obj2);
    }

    private static void f(ahm ahmVar, View view, ahl ahlVar) {
        ((oc) ahmVar.a).put(view, ahlVar);
        int id = view.getId();
        if (id >= 0) {
            if (((SparseArray) ahmVar.b).indexOfKey(id) >= 0) {
                ((SparseArray) ahmVar.b).put(id, null);
            } else {
                ((SparseArray) ahmVar.b).put(id, view);
            }
        }
        int[] iArr = ut.a;
        String strL = un.l(view);
        if (strL != null) {
            if (((oc) ahmVar.d).containsKey(strL)) {
                ((oc) ahmVar.d).put(strL, null);
            } else {
                ((oc) ahmVar.d).put(strL, view);
            }
        }
        if (view.getParent() instanceof ListView) {
            ListView listView = (ListView) view.getParent();
            if (listView.getAdapter().hasStableIds()) {
                long itemIdAtPosition = listView.getItemIdAtPosition(listView.getPositionForView(view));
                nz nzVar = (nz) ahmVar.c;
                if (nzVar.a) {
                    int i = nzVar.d;
                    long[] jArr = nzVar.b;
                    Object[] objArr = nzVar.c;
                    int i2 = 0;
                    for (int i3 = 0; i3 < i; i3++) {
                        Object obj = objArr[i3];
                        if (obj != oa.a) {
                            if (i3 != i2) {
                                jArr[i2] = jArr[i3];
                                objArr[i2] = obj;
                                objArr[i3] = null;
                            }
                            i2++;
                        }
                    }
                    nzVar.a = false;
                    nzVar.d = i2;
                }
                if (of.b(nzVar.b, nzVar.d, itemIdAtPosition) < 0) {
                    view.setHasTransientState(true);
                    ((nz) ahmVar.c).f(itemIdAtPosition, view);
                    return;
                }
                View view2 = (View) ((nz) ahmVar.c).c(itemIdAtPosition);
                if (view2 != null) {
                    view2.setHasTransientState(false);
                    ((nz) ahmVar.c).f(itemIdAtPosition, null);
                }
            }
        }
    }

    private final void g(View view, boolean z) {
        if (view == null) {
            return;
        }
        view.getId();
        if (view.getParent() instanceof ViewGroup) {
            ahl ahlVar = new ahl(view);
            if (z) {
                c(ahlVar);
            } else {
                b(ahlVar);
            }
            ahlVar.c.add(this);
            o(ahlVar);
            if (z) {
                f(this.e, view, ahlVar);
            } else {
                f(this.f, view, ahlVar);
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                g(viewGroup.getChildAt(i), z);
            }
        }
    }

    public static nv h() {
        ThreadLocal threadLocal = w;
        nv nvVar = (nv) threadLocal.get();
        if (nvVar != null) {
            return nvVar;
        }
        nv nvVar2 = new nv();
        threadLocal.set(nvVar2);
        return nvVar2;
    }

    public boolean A() {
        return !this.k.isEmpty();
    }

    public boolean B(ahl ahlVar, ahl ahlVar2) {
        if (ahlVar != null && ahlVar2 != null) {
            String[] strArrE = e();
            if (strArrE != null) {
                for (String str : strArrE) {
                    if (N(ahlVar, ahlVar2, str)) {
                        return true;
                    }
                }
                return false;
            }
            Iterator it = ahlVar.a.keySet().iterator();
            while (it.hasNext()) {
                if (N(ahlVar, ahlVar2, (String) it.next())) {
                    return true;
                }
            }
        }
        return false;
    }

    final boolean C(View view) {
        return (this.c.size() == 0 && this.d.size() == 0) || this.c.contains(Integer.valueOf(view.getId())) || this.d.contains(view);
    }

    public void D(agz agzVar) {
        if (this.B == null) {
            this.B = new ArrayList();
        }
        this.B.add(agzVar);
    }

    public void E(View view) {
        this.d.add(view);
    }

    public void F(agz agzVar) {
        ahc ahcVar;
        ArrayList arrayList = this.B;
        if (arrayList == null) {
            return;
        }
        if (!arrayList.remove(agzVar) && (ahcVar = this.n) != null) {
            ahcVar.F(agzVar);
        }
        if (this.B.size() == 0) {
            this.B = null;
        }
    }

    public void G(View view) {
        this.d.remove(view);
    }

    public void H(long j) {
        this.b = 0L;
    }

    public void K(long j) {
        this.a = j;
    }

    public void L(us usVar) {
        this.s = usVar;
    }

    public void M(us usVar) {
        if (usVar == null) {
            this.t = C;
        } else {
            this.t = usVar;
        }
    }

    public Animator a(ViewGroup viewGroup, ahl ahlVar, ahl ahlVar2) {
        return null;
    }

    public abstract void b(ahl ahlVar);

    public abstract void c(ahl ahlVar);

    public boolean d() {
        throw null;
    }

    public String[] e() {
        return null;
    }

    @Override // 
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public ahc clone() {
        try {
            ahc ahcVar = (ahc) super.clone();
            ahcVar.o = new ArrayList();
            ahcVar.e = new ahm();
            ahcVar.f = new ahm();
            ahcVar.i = null;
            ahcVar.j = null;
            ahcVar.q = null;
            ahcVar.n = this;
            ahcVar.B = null;
            return ahcVar;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    public final ahc j() {
        ahk ahkVar = this.g;
        return ahkVar != null ? ahkVar.j() : this;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x002d, code lost:
    
        if (r3 < 0) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x002f, code lost:
    
        if (r7 == false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0031, code lost:
    
        r5 = r5.j;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0034, code lost:
    
        r5 = r5.i;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x003c, code lost:
    
        return (defpackage.ahl) r5.get(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x003d, code lost:
    
        return null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    final defpackage.ahl k(android.view.View r6, boolean r7) {
        /*
            r5 = this;
            ahk r0 = r5.g
            if (r0 == 0) goto L9
            ahl r5 = r0.k(r6, r7)
            return r5
        L9:
            if (r7 == 0) goto Le
            java.util.ArrayList r0 = r5.i
            goto L10
        Le:
            java.util.ArrayList r0 = r5.j
        L10:
            r1 = 0
            if (r0 != 0) goto L14
            return r1
        L14:
            int r2 = r0.size()
            r3 = 0
        L19:
            if (r3 >= r2) goto L2c
            java.lang.Object r4 = r0.get(r3)
            ahl r4 = (defpackage.ahl) r4
            if (r4 != 0) goto L24
            return r1
        L24:
            android.view.View r4 = r4.b
            if (r4 != r6) goto L29
            goto L2d
        L29:
            int r3 = r3 + 1
            goto L19
        L2c:
            r3 = -1
        L2d:
            if (r3 < 0) goto L3d
            if (r7 == 0) goto L34
            java.util.ArrayList r5 = r5.j
            goto L36
        L34:
            java.util.ArrayList r5 = r5.i
        L36:
            java.lang.Object r5 = r5.get(r3)
            ahl r5 = (defpackage.ahl) r5
            return r5
        L3d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ahc.k(android.view.View, boolean):ahl");
    }

    public final ahl l(View view, boolean z) {
        ahk ahkVar = this.g;
        if (ahkVar != null) {
            return ahkVar.l(view, z);
        }
        return (ahl) ((oc) (z ? this.e : this.f).a).get(view);
    }

    public String m(String str) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(getClass().getSimpleName());
        sb.append("@");
        sb.append(Integer.toHexString(hashCode()));
        sb.append(": ");
        if (this.b != -1) {
            sb.append("dur(");
            sb.append(this.b);
            sb.append(") ");
        }
        if (this.a != -1) {
            sb.append("dly(");
            sb.append(this.a);
            sb.append(") ");
        }
        if (this.c.size() > 0 || this.d.size() > 0) {
            sb.append("tgts(");
            if (this.c.size() > 0) {
                for (int i = 0; i < this.c.size(); i++) {
                    if (i > 0) {
                        sb.append(", ");
                    }
                    sb.append(this.c.get(i));
                }
            }
            if (this.d.size() > 0) {
                for (int i2 = 0; i2 < this.d.size(); i2++) {
                    if (i2 > 0) {
                        sb.append(", ");
                    }
                    sb.append(this.d.get(i2));
                }
            }
            sb.append(")");
        }
        return sb.toString();
    }

    public void n() {
        ArrayList arrayList = this.k;
        int size = arrayList.size();
        Animator[] animatorArr = (Animator[]) arrayList.toArray(this.z);
        this.z = u;
        while (true) {
            size--;
            if (size < 0) {
                this.z = animatorArr;
                t(this, ahb.c, false);
                return;
            } else {
                Animator animator = animatorArr[size];
                animatorArr[size] = null;
                animator.cancel();
            }
        }
    }

    final void p(ViewGroup viewGroup, boolean z) {
        boolean z2;
        q(z);
        if (this.c.size() <= 0 && this.d.size() <= 0) {
            g(viewGroup, z);
            return;
        }
        int i = 0;
        while (true) {
            boolean z3 = true;
            if (i >= this.c.size()) {
                break;
            }
            View viewFindViewById = viewGroup.findViewById(((Integer) this.c.get(i)).intValue());
            if (viewFindViewById != null) {
                ahl ahlVar = new ahl(viewFindViewById);
                if (z) {
                    c(ahlVar);
                } else {
                    b(ahlVar);
                    z3 = false;
                }
                ahlVar.c.add(this);
                o(ahlVar);
                if (z3) {
                    f(this.e, viewFindViewById, ahlVar);
                } else {
                    f(this.f, viewFindViewById, ahlVar);
                }
            }
            i++;
        }
        for (int i2 = 0; i2 < this.d.size(); i2++) {
            View view = (View) this.d.get(i2);
            ahl ahlVar2 = new ahl(view);
            if (z) {
                c(ahlVar2);
                z2 = true;
            } else {
                b(ahlVar2);
                z2 = false;
            }
            ahlVar2.c.add(this);
            o(ahlVar2);
            if (z2) {
                f(this.e, view, ahlVar2);
            } else {
                f(this.f, view, ahlVar2);
            }
        }
    }

    final void q(boolean z) {
        if (z) {
            ((oc) this.e.a).clear();
            ((SparseArray) this.e.b).clear();
            ((nz) this.e.c).e();
        } else {
            ((oc) this.f.a).clear();
            ((SparseArray) this.f.b).clear();
            ((nz) this.f.c).e();
        }
    }

    public void r(ViewGroup viewGroup, ahm ahmVar, ahm ahmVar2, ArrayList arrayList, ArrayList arrayList2) {
        Animator animator;
        View view;
        ahl ahlVar;
        ahl ahlVar2;
        nv nvVarH = h();
        SparseIntArray sparseIntArray = new SparseIntArray();
        int size = arrayList.size();
        agy agyVar = j().q;
        for (int i = 0; i < size; i++) {
            ahl ahlVar3 = (ahl) arrayList.get(i);
            ahl ahlVar4 = (ahl) arrayList2.get(i);
            if (ahlVar3 != null && !ahlVar3.c.contains(this)) {
                ahlVar3 = null;
            }
            if (ahlVar4 != null && !ahlVar4.c.contains(this)) {
                ahlVar4 = null;
            }
            if ((ahlVar3 != null || ahlVar4 != null) && (ahlVar3 == null || ahlVar4 == null || B(ahlVar3, ahlVar4))) {
                Animator animatorA = a(viewGroup, ahlVar3, ahlVar4);
                if (animatorA != null) {
                    if (ahlVar4 != null) {
                        view = ahlVar4.b;
                        String[] strArrE = e();
                        if (strArrE != null) {
                            ahl ahlVar5 = new ahl(view);
                            ahl ahlVar6 = (ahl) ((oc) ahmVar2.a).get(view);
                            animator = animatorA;
                            if (ahlVar6 != null) {
                                int i2 = 0;
                                while (i2 < strArrE.length) {
                                    Map map = ahlVar5.a;
                                    String[] strArr = strArrE;
                                    String str = strArr[i2];
                                    map.put(str, ahlVar6.a.get(str));
                                    i2++;
                                    strArrE = strArr;
                                }
                            }
                            int i3 = nvVarH.f;
                            int i4 = 0;
                            while (true) {
                                if (i4 >= i3) {
                                    ahlVar2 = ahlVar5;
                                    break;
                                }
                                agx agxVar = (agx) nvVarH.get((Animator) nvVarH.d(i4));
                                if (agxVar.c != null && agxVar.a == view) {
                                    if (((String) agxVar.b).equals(this.x) && ((ahl) agxVar.c).equals(ahlVar5)) {
                                        ahlVar2 = ahlVar5;
                                        animator = null;
                                        break;
                                    }
                                }
                                i4++;
                            }
                        } else {
                            animator = animatorA;
                            ahlVar2 = null;
                        }
                        ahlVar = ahlVar2;
                    } else {
                        animator = animatorA;
                        view = ahlVar3.b;
                        ahlVar = null;
                    }
                    View view2 = view;
                    Animator animator2 = animator;
                    if (animator2 != null) {
                        agx agxVar2 = new agx(view2, this.x, this, viewGroup.getWindowId(), ahlVar, animator2);
                        if (agyVar != null) {
                            AnimatorSet animatorSet = new AnimatorSet();
                            animatorSet.play(animator2);
                            animator2 = animatorSet;
                        }
                        nvVarH.put(animator2, agxVar2);
                        this.o.add(animator2);
                    }
                }
            }
        }
        if (sparseIntArray.size() != 0) {
            for (int i5 = 0; i5 < sparseIntArray.size(); i5++) {
                agx agxVar3 = (agx) nvVarH.get((Animator) this.o.get(sparseIntArray.keyAt(i5)));
                ((Animator) agxVar3.f).setStartDelay((sparseIntArray.valueAt(i5) - Long.MAX_VALUE) + ((Animator) agxVar3.f).getStartDelay());
            }
        }
    }

    protected final void s() {
        int i = this.l - 1;
        this.l = i;
        if (i == 0) {
            t(this, ahb.b, false);
            for (int i2 = 0; i2 < ((nz) this.e.c).a(); i2++) {
                View view = (View) ((nz) this.e.c).d(i2);
                if (view != null) {
                    view.setHasTransientState(false);
                }
            }
            for (int i3 = 0; i3 < ((nz) this.f.c).a(); i3++) {
                View view2 = (View) ((nz) this.f.c).d(i3);
                if (view2 != null) {
                    view2.setHasTransientState(false);
                }
            }
            this.m = true;
        }
    }

    public final void t(ahc ahcVar, ahb ahbVar, boolean z) {
        ahc ahcVar2 = this.n;
        if (ahcVar2 != null) {
            ahcVar2.t(ahcVar, ahbVar, z);
        }
        ArrayList arrayList = this.B;
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        int size = this.B.size();
        agz[] agzVarArr = this.y;
        if (agzVarArr == null) {
            agzVarArr = new agz[size];
        }
        this.y = null;
        agz[] agzVarArr2 = (agz[]) this.B.toArray(agzVarArr);
        for (int i = 0; i < size; i++) {
            ahbVar.a(agzVarArr2[i], ahcVar, z);
            agzVarArr2[i] = null;
        }
        this.y = agzVarArr2;
    }

    public final String toString() {
        return m("");
    }

    public void u(View view) {
        if (this.m) {
            return;
        }
        ArrayList arrayList = this.k;
        int size = arrayList.size();
        Animator[] animatorArr = (Animator[]) arrayList.toArray(this.z);
        this.z = u;
        while (true) {
            size--;
            if (size < 0) {
                this.z = animatorArr;
                t(this, ahb.d, false);
                this.A = true;
                return;
            } else {
                Animator animator = animatorArr[size];
                animatorArr[size] = null;
                animator.pause();
            }
        }
    }

    public void v() {
        nv nvVarH = h();
        this.p = 0L;
        for (int i = 0; i < this.o.size(); i++) {
            Animator animator = (Animator) this.o.get(i);
            agx agxVar = (agx) nvVarH.get(animator);
            if (animator != null && agxVar != null) {
                if (this.b >= 0) {
                    ((Animator) agxVar.f).setDuration(0L);
                }
                long j = this.a;
                if (j >= 0) {
                    Animator animator2 = (Animator) agxVar.f;
                    animator2.setStartDelay(j + animator2.getStartDelay());
                }
                this.k.add(animator);
                this.p = Math.max(this.p, animator.getTotalDuration());
            }
        }
        this.o.clear();
    }

    public void w(View view) {
        if (this.A) {
            if (!this.m) {
                ArrayList arrayList = this.k;
                int size = arrayList.size();
                Animator[] animatorArr = (Animator[]) arrayList.toArray(this.z);
                this.z = u;
                while (true) {
                    size--;
                    if (size < 0) {
                        break;
                    }
                    Animator animator = animatorArr[size];
                    animatorArr[size] = null;
                    animator.resume();
                }
                this.z = animatorArr;
                t(this, ahb.e, false);
            }
            this.A = false;
        }
    }

    protected void x() {
        z();
        nv nvVarH = h();
        ArrayList arrayList = this.o;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            Animator animator = (Animator) arrayList.get(i);
            if (nvVarH.containsKey(animator)) {
                z();
                if (animator != null) {
                    animator.addListener(new agv(this, nvVarH));
                    if (this.b >= 0) {
                        animator.setDuration(0L);
                    }
                    long j = this.a;
                    if (j >= 0) {
                        animator.setStartDelay(j + animator.getStartDelay());
                    }
                    animator.addListener(new agw(this));
                    animator.start();
                }
            }
        }
        this.o.clear();
        s();
    }

    public void y(long j, long j2) {
        long j3 = this.p;
        boolean z = j < j2;
        if ((j2 < 0 && j >= 0) || (j2 > j3 && j <= j3)) {
            this.m = false;
            t(this, ahb.a, z);
        }
        ArrayList arrayList = this.k;
        int size = arrayList.size();
        Animator[] animatorArr = (Animator[]) arrayList.toArray(this.z);
        this.z = u;
        for (int i = 0; i < size; i++) {
            Animator animator = animatorArr[i];
            animatorArr[i] = null;
            ((AnimatorSet) animator).setCurrentPlayTime(Math.min(Math.max(0L, j), animator.getTotalDuration()));
        }
        this.z = animatorArr;
        if ((j <= j3 || j2 > j3) && (j >= 0 || j2 < 0)) {
            return;
        }
        if (j > j3) {
            this.m = true;
        }
        t(this, ahb.b, z);
    }

    protected final void z() {
        if (this.l == 0) {
            t(this, ahb.a, false);
            this.m = false;
        }
        this.l++;
    }

    public void I() {
    }

    public void J() {
    }

    public void o(ahl ahlVar) {
    }
}
