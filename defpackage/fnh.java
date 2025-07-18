package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.CancellationException;

/* compiled from: PG */
/* loaded from: classes.dex */
public class fnh implements fna {
    private final fli a;
    private final fli b;

    public fnh(boolean z) {
        this.a = fjp.v(z ? fni.g : fni.f);
        this.b = fjp.v(null);
    }

    private final void K(fnl fnlVar, Throwable th) throws Throwable {
        fnlVar.j(4);
        Object objF = fnlVar.f();
        objF.getClass();
        flr flrVar = null;
        for (fou fouVarH = (fou) objF; !fjs.c(fouVarH, fnlVar); fouVarH = fouVarH.h()) {
            if (fouVarH instanceof fne) {
                fne fneVar = (fne) fouVarH;
                if (fneVar.c()) {
                    try {
                        fneVar.b(th);
                    } catch (Throwable th2) {
                        if (flrVar != null) {
                            ffh.a(flrVar, th2);
                        } else {
                            flrVar = new flr(a.B(this, fouVarH, "Exception in completion handler ", " for "), th2);
                        }
                    }
                }
            }
        }
        if (flrVar != null) {
            i(flrVar);
        }
        N(th);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [fmw] */
    private final void L(fmn fmnVar) {
        fnl fnlVar = new fnl();
        if (!fmnVar.a) {
            fnlVar = new fmw(fnlVar);
        }
        this.a.d(fmnVar, fnlVar);
    }

    private final void M(fne fneVar) {
        fnl fnlVar = new fnl();
        fnlVar.d.b(fneVar);
        fnlVar.c.b(fneVar);
        while (true) {
            if (fneVar.f() != fneVar) {
                break;
            } else if (fneVar.c.d(fneVar, fnlVar)) {
                fnlVar.k(fneVar);
                break;
            }
        }
        this.a.d(fneVar, fneVar.h());
    }

    private final boolean N(Throwable th) {
        if (bh()) {
            return true;
        }
        boolean z = th instanceof CancellationException;
        flo floVarX = x();
        return (floVarX == null || floVarX == fnm.a) ? z : floVarX.a(th) || z;
    }

    private static final String O(Object obj) {
        if (!(obj instanceof fng)) {
            return obj instanceof fmx ? ((fmx) obj).bc() ? "Active" : "New" : obj instanceof flq ? "Cancelled" : "Completed";
        }
        fng fngVar = (fng) obj;
        return fngVar.g() ? "Cancelling" : fngVar.h() ? "Completing" : "Active";
    }

    private final Object e(Object obj, Object obj2) throws Throwable {
        if (!(obj instanceof fmx)) {
            return fni.a;
        }
        if (((obj instanceof fmn) || (obj instanceof fne)) && !(obj instanceof flp) && !(obj2 instanceof flq)) {
            fmx fmxVar = (fmx) obj;
            boolean z = fmd.a;
            if (!this.a.d(fmxVar, fni.a(obj2))) {
                return fni.c;
            }
            k(obj2);
            l(fmxVar, obj2);
            return obj2;
        }
        fmx fmxVar2 = (fmx) obj;
        fnl fnlVarJ = j(fmxVar2);
        if (fnlVarJ == null) {
            return fni.c;
        }
        Throwable th = null;
        fng fngVar = fmxVar2 instanceof fng ? (fng) fmxVar2 : null;
        if (fngVar == null) {
            fngVar = new fng(fnlVarJ, null);
        }
        fjx fjxVar = new fjx();
        synchronized (fngVar) {
            if (fngVar.h()) {
                return fni.a;
            }
            fngVar.b.c();
            if (fngVar != fmxVar2 && !this.a.d(fmxVar2, fngVar)) {
                return fni.c;
            }
            boolean z2 = fmd.a;
            boolean zG = fngVar.g();
            flq flqVar = obj2 instanceof flq ? (flq) obj2 : null;
            if (flqVar != null) {
                fngVar.e(flqVar.a);
            }
            Throwable thD = fngVar.d();
            boolean z3 = !zG;
            Boolean.valueOf(z3).getClass();
            if (true == z3) {
                th = thD;
            }
            fjxVar.a = th;
            Throwable th2 = (Throwable) fjxVar.a;
            if (th2 != null) {
                K(fnlVarJ, th2);
            }
            flp flpVarY = y(fnlVarJ);
            if (flpVarY != null && I(fngVar, flpVarY, obj2)) {
                return fni.b;
            }
            fnlVarJ.j(2);
            flp flpVarY2 = y(fnlVarJ);
            return (flpVarY2 == null || !I(fngVar, flpVarY2, obj2)) ? s(fngVar, obj2) : fni.b;
        }
    }

    private final Throwable h(Object obj) {
        if (obj != null && !(obj instanceof Throwable)) {
            return ((fnh) obj).v();
        }
        Throwable th = (Throwable) obj;
        return th != null ? th : new fnb(a(), null, this);
    }

    private final fnl j(fmx fmxVar) {
        fnl fnlVarBb = fmxVar.bb();
        if (fnlVarBb != null) {
            return fnlVarBb;
        }
        if (fmxVar instanceof fmn) {
            return new fnl();
        }
        if (fmxVar instanceof fne) {
            M((fne) fmxVar);
            return null;
        }
        Objects.toString(fmxVar);
        throw new IllegalStateException("State should have list: ".concat(String.valueOf(fmxVar)));
    }

    private final void l(fmx fmxVar, Object obj) throws Throwable {
        flo floVarX = x();
        if (floVarX != null) {
            floVarX.d();
            D(fnm.a);
        }
        flr flrVar = null;
        flq flqVar = obj instanceof flq ? (flq) obj : null;
        Throwable th = flqVar != null ? flqVar.a : null;
        if (fmxVar instanceof fne) {
            try {
                ((fne) fmxVar).b(th);
                return;
            } catch (Throwable th2) {
                i(new flr(a.B(this, fmxVar, "Exception in completion handler ", " for "), th2));
                return;
            }
        }
        fnl fnlVarBb = fmxVar.bb();
        if (fnlVarBb != null) {
            fnlVarBb.j(1);
            Object objF = fnlVarBb.f();
            objF.getClass();
            for (fou fouVarH = (fou) objF; !fjs.c(fouVarH, fnlVarBb); fouVarH = fouVarH.h()) {
                if (fouVarH instanceof fne) {
                    try {
                        ((fne) fouVarH).b(th);
                    } catch (Throwable th3) {
                        if (flrVar != null) {
                            ffh.a(flrVar, th3);
                        } else {
                            flrVar = new flr(a.B(this, fouVarH, "Exception in completion handler ", " for "), th3);
                        }
                    }
                }
            }
            if (flrVar != null) {
                i(flrVar);
            }
        }
    }

    protected final void A(fna fnaVar) {
        boolean z = fmd.a;
        if (fnaVar == null) {
            D(fnm.a);
            return;
        }
        fnaVar.r();
        flo floVarQ = fnaVar.q(this);
        D(floVarQ);
        if (H()) {
            floVarQ.d();
            D(fnm.a);
        }
    }

    public final void C(fne fneVar) {
        Object objT;
        Object objF;
        fou fouVar;
        foy foyVar;
        do {
            objT = t();
            if (!(objT instanceof fne)) {
                if (!(objT instanceof fmx) || ((fmx) objT).bb() == null) {
                    return;
                }
                do {
                    objF = fneVar.f();
                    if (objF instanceof foy) {
                        fou fouVar2 = ((foy) objF).a;
                        return;
                    }
                    if (objF == fneVar) {
                        return;
                    }
                    objF.getClass();
                    fouVar = (fou) objF;
                    foyVar = (foy) fouVar.e.a;
                    if (foyVar == null) {
                        foyVar = new foy(fouVar);
                        fouVar.e.b(foyVar);
                    }
                } while (!fneVar.c.d(objF, foyVar));
                fouVar.g();
                return;
            }
            if (objT != fneVar) {
                return;
            }
        } while (!this.a.d(objT, fni.g));
    }

    public final void D(flo floVar) {
        this.b.c(floVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0076  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean E(java.lang.Object r8) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 237
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fnh.E(java.lang.Object):boolean");
    }

    public boolean F(Throwable th) {
        if (th instanceof CancellationException) {
            return true;
        }
        return E(th) && aZ();
    }

    protected boolean G(Throwable th) {
        return false;
    }

    public final boolean H() {
        return !(t() instanceof fmx);
    }

    public final boolean I(fng fngVar, flp flpVar, Object obj) {
        do {
            fnh fnhVar = flpVar.a;
            fnf fnfVar = new fnf(this, fngVar, flpVar, obj);
            if ((fnhVar instanceof fnh ? fnhVar.z(false, fnfVar) : fnhVar.n(false, false, new fnd(fnfVar, 0))) != fnm.a) {
                return true;
            }
            flpVar = y(flpVar);
        } while (flpVar != null);
        return false;
    }

    public final void J(fnh fnhVar) throws Throwable {
        E(fnhVar);
    }

    protected String a() {
        return "Job was cancelled";
    }

    public boolean aZ() {
        return true;
    }

    public String b() {
        return fme.a(this);
    }

    public boolean ba() {
        return false;
    }

    protected boolean bh() {
        return false;
    }

    @Override // defpackage.fhq
    public final Object fold(Object obj, fjc fjcVar) {
        return fjp.D(this, obj, fjcVar);
    }

    @Override // defpackage.fhn, defpackage.fhq
    public final fhn get(fho fhoVar) {
        return fjp.E(this, fhoVar);
    }

    @Override // defpackage.fhn
    public final fho getKey() {
        return fna.c;
    }

    @Override // defpackage.fna
    public final CancellationException m() {
        Object objT = t();
        if (!(objT instanceof fng)) {
            if (!(objT instanceof fmx)) {
                return objT instanceof flq ? w(((flq) objT).a, null) : new fnb(String.valueOf(fme.a(this)).concat(" has completed normally"), null, this);
            }
            toString();
            throw new IllegalStateException("Job is still new or active: ".concat(toString()));
        }
        Throwable thD = ((fng) objT).d();
        if (thD != null) {
            return w(thD, String.valueOf(fme.a(this)).concat(" is cancelling"));
        }
        toString();
        throw new IllegalStateException("Job is still new or active: ".concat(toString()));
    }

    @Override // defpackage.fhq
    public final fhq minusKey(fho fhoVar) {
        return fjp.F(this, fhoVar);
    }

    @Override // defpackage.fna
    public final fmm n(boolean z, boolean z2, fiy fiyVar) {
        return z(false, new fmz(fiyVar));
    }

    @Override // defpackage.fna
    public final void o(CancellationException cancellationException) throws Throwable {
        if (cancellationException == null) {
            cancellationException = new fnb(a(), null, this);
        }
        E(cancellationException);
    }

    @Override // defpackage.fna
    public final boolean p() {
        Object objT = t();
        return (objT instanceof fmx) && ((fmx) objT).bc();
    }

    @Override // defpackage.fhq
    public final fhq plus(fhq fhqVar) {
        return fjp.G(this, fhqVar);
    }

    @Override // defpackage.fna
    public final flo q(fnh fnhVar) {
        flp flpVar = new flp(fnhVar);
        flpVar.b = this;
        while (true) {
            Object objT = t();
            if (objT instanceof fmn) {
                fmn fmnVar = (fmn) objT;
                if (!fmnVar.a) {
                    L(fmnVar);
                } else if (this.a.d(objT, flpVar)) {
                    break;
                }
            } else {
                if (!(objT instanceof fmx)) {
                    Object objT2 = t();
                    flq flqVar = objT2 instanceof flq ? (flq) objT2 : null;
                    flpVar.b(flqVar != null ? flqVar.a : null);
                    return fnm.a;
                }
                fnl fnlVarBb = ((fmx) objT).bb();
                if (fnlVarBb == null) {
                    objT.getClass();
                    M((fne) objT);
                } else if (!fnlVarBb.l(flpVar, 7)) {
                    boolean zL = fnlVarBb.l(flpVar, 3);
                    Object objT3 = t();
                    if (objT3 instanceof fng) {
                        thD = ((fng) objT3).d();
                    } else {
                        boolean z = fmd.a;
                        flq flqVar2 = objT3 instanceof flq ? (flq) objT3 : null;
                        if (flqVar2 != null) {
                            thD = flqVar2.a;
                        }
                    }
                    flpVar.b(thD);
                    if (!zL) {
                        return fnm.a;
                    }
                    boolean z2 = fmd.a;
                    return flpVar;
                }
            }
        }
        return flpVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0039  */
    @Override // defpackage.fna
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void r() {
        /*
            r5 = this;
        L0:
            java.lang.Object r0 = r5.t()
            boolean r1 = r0 instanceof defpackage.fmn
            r2 = -1
            r3 = 0
            r4 = 1
            if (r1 == 0) goto L22
            r1 = r0
            fmn r1 = (defpackage.fmn) r1
            boolean r1 = r1.a
            if (r1 == 0) goto L13
            goto L39
        L13:
            fli r1 = r5.a
            fmn r3 = defpackage.fni.g
            boolean r0 = r1.d(r0, r3)
            if (r0 != 0) goto L1e
            goto L3a
        L1e:
            r5.B()
            goto L37
        L22:
            boolean r1 = r0 instanceof defpackage.fmw
            if (r1 == 0) goto L39
            fli r1 = r5.a
            r3 = r0
            fmw r3 = (defpackage.fmw) r3
            fnl r3 = r3.a
            boolean r0 = r1.d(r0, r3)
            if (r0 != 0) goto L34
            goto L3a
        L34:
            r5.B()
        L37:
            r2 = r4
            goto L3a
        L39:
            r2 = r3
        L3a:
            if (r2 == 0) goto L3f
            if (r2 == r4) goto L3f
            goto L0
        L3f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fnh.r():void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Object s(fng fngVar, Object obj) throws Throwable {
        ArrayList<Throwable> arrayList;
        Object next;
        Throwable fnbVar;
        boolean z = fmd.a;
        Throwable th = null;
        flq flqVar = obj instanceof flq ? (flq) obj : null;
        Throwable th2 = flqVar != null ? flqVar.a : null;
        synchronized (fngVar) {
            fngVar.g();
            Object objC = fngVar.c();
            if (objC == null) {
                arrayList = new ArrayList(4);
            } else if (objC instanceof Throwable) {
                ArrayList arrayList2 = new ArrayList(4);
                arrayList2.add(objC);
                arrayList = arrayList2;
            } else {
                if (!(objC instanceof ArrayList)) {
                    Objects.toString(objC);
                    throw new IllegalStateException("State is ".concat(objC.toString()));
                }
                arrayList = (ArrayList) objC;
            }
            Throwable thD = fngVar.d();
            if (thD != null) {
                arrayList.add(0, thD);
            }
            if (th2 != null && !fjs.c(th2, thD)) {
                arrayList.add(th2);
            }
            fngVar.f(fni.e);
            if (!arrayList.isEmpty()) {
                Iterator it = arrayList.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    if (!(((Throwable) next) instanceof CancellationException)) {
                        break;
                    }
                }
                Throwable th3 = (Throwable) next;
                if (th3 == null) {
                    fnbVar = (Throwable) arrayList.get(0);
                    if (fnbVar instanceof fnr) {
                        Iterator it2 = arrayList.iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                break;
                            }
                            Object next2 = it2.next();
                            Throwable th4 = (Throwable) next2;
                            if (th4 != fnbVar && (th4 instanceof fnr)) {
                                th = next2;
                                break;
                            }
                        }
                        th = th;
                        if (th == null) {
                            th = fnbVar;
                        }
                    } else {
                        th = fnbVar;
                    }
                } else {
                    th = th3;
                }
            } else if (fngVar.g()) {
                fnbVar = new fnb(a(), null, this);
                th = fnbVar;
            }
            if (th != null && arrayList.size() > 1) {
                Set setNewSetFromMap = Collections.newSetFromMap(new IdentityHashMap(arrayList.size()));
                Throwable thB = !fmd.c ? th : fpb.b(th);
                for (Throwable thB2 : arrayList) {
                    if (fmd.c) {
                        thB2 = fpb.b(thB2);
                    }
                    if (thB2 != th && thB2 != thB && !(thB2 instanceof CancellationException) && setNewSetFromMap.add(thB2)) {
                        ffh.a(th, thB2);
                    }
                }
            }
        }
        if (th != null && th != th2) {
            obj = new flq(th);
        }
        if (th != null && (N(th) || G(th))) {
            obj.getClass();
            ((flq) obj).b.b();
        }
        k(obj);
        this.a.d(fngVar, fni.a(obj));
        l(fngVar, obj);
        return obj;
    }

    public final Object t() {
        return this.a.a;
    }

    public final String toString() {
        return (b() + "{" + O(t()) + "}") + "@" + fme.b(this);
    }

    public final Object u(Object obj) {
        Object objE;
        do {
            objE = e(t(), obj);
            if (objE == fni.a) {
                String strB = a.B(obj, this, "Job ", " is already complete or completing, but is being completed with ");
                flq flqVar = obj instanceof flq ? (flq) obj : null;
                throw new IllegalStateException(strB, flqVar != null ? flqVar.a : null);
            }
        } while (objE == fni.c);
        return objE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v11, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Throwable] */
    public final CancellationException v() {
        CancellationException cancellationExceptionD;
        Object objT = t();
        if (objT instanceof fng) {
            cancellationExceptionD = ((fng) objT).d();
        } else if (objT instanceof flq) {
            cancellationExceptionD = ((flq) objT).a;
        } else {
            if (objT instanceof fmx) {
                Objects.toString(objT);
                throw new IllegalStateException("Cannot be cancelling child in this state: ".concat(String.valueOf(objT)));
            }
            cancellationExceptionD = null;
        }
        CancellationException cancellationException = cancellationExceptionD instanceof CancellationException ? cancellationExceptionD : null;
        return cancellationException == null ? new fnb("Parent job is ".concat(O(objT)), cancellationExceptionD, this) : cancellationException;
    }

    protected final CancellationException w(Throwable th, String str) {
        CancellationException fnbVar = th instanceof CancellationException ? (CancellationException) th : null;
        if (fnbVar == null) {
            if (str == null) {
                str = a();
            }
            fnbVar = new fnb(str, th, this);
        }
        return fnbVar;
    }

    public final flo x() {
        return (flo) this.b.a;
    }

    public final flp y(fou fouVar) {
        while (fouVar.bd()) {
            fouVar = fouVar.i();
        }
        while (true) {
            fouVar = fouVar.h();
            if (!fouVar.bd()) {
                if (fouVar instanceof flp) {
                    return (flp) fouVar;
                }
                if (fouVar instanceof fnl) {
                    return null;
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x005b, code lost:
    
        return defpackage.fnm.a;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.fmm z(boolean r4, defpackage.fne r5) {
        /*
            r3 = this;
            r5.b = r3
        L2:
            java.lang.Object r4 = r3.t()
            boolean r0 = r4 instanceof defpackage.fmn
            if (r0 == 0) goto L1e
            r0 = r4
            fmn r0 = (defpackage.fmn) r0
            boolean r1 = r0.a
            if (r1 == 0) goto L1a
            fli r0 = r3.a
            boolean r4 = r0.d(r4, r5)
            if (r4 == 0) goto L2
            goto L58
        L1a:
            r3.L(r0)
            goto L2
        L1e:
            boolean r0 = r4 instanceof defpackage.fmx
            if (r0 == 0) goto L59
            r0 = r4
            fmx r0 = (defpackage.fmx) r0
            fnl r1 = r0.bb()
            if (r1 != 0) goto L34
            r4.getClass()
            fne r4 = (defpackage.fne) r4
            r3.M(r4)
            goto L2
        L34:
            boolean r4 = r5.c()
            if (r4 == 0) goto L51
            boolean r4 = r0 instanceof defpackage.fng
            r2 = 0
            if (r4 == 0) goto L42
            fng r0 = (defpackage.fng) r0
            goto L43
        L42:
            r0 = r2
        L43:
            if (r0 == 0) goto L49
            java.lang.Throwable r2 = r0.d()
        L49:
            if (r2 != 0) goto L59
            r4 = 5
            boolean r4 = r1.l(r5, r4)
            goto L56
        L51:
            r4 = 1
            boolean r4 = r1.l(r5, r4)
        L56:
            if (r4 == 0) goto L2
        L58:
            return r5
        L59:
            fnm r3 = defpackage.fnm.a
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fnh.z(boolean, fne):fmm");
    }

    protected void B() {
    }

    protected void f(Object obj) {
    }

    public void i(Throwable th) throws Throwable {
        throw th;
    }

    protected void k(Object obj) {
    }
}
