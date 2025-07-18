package defpackage;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class pr {
    public final ph a;
    public final ph d;
    final ArrayList f;
    public qg g;
    private final po h;
    public boolean b = true;
    public boolean c = true;
    public final ArrayList e = new ArrayList();

    public pr(ph phVar) {
        new ArrayList();
        this.g = null;
        this.h = new po();
        this.f = new ArrayList();
        this.a = phVar;
        this.d = phVar;
    }

    private final void e(qa qaVar, int i, ArrayList arrayList) {
        for (pq pqVar : qaVar.h.j) {
            if (pqVar instanceof ps) {
                g((ps) pqVar, i, 0, qaVar.i, arrayList, null);
            } else if (pqVar instanceof qa) {
                g(((qa) pqVar).h, i, 0, qaVar.i, arrayList, null);
            }
        }
        for (pq pqVar2 : qaVar.i.j) {
            if (pqVar2 instanceof ps) {
                g((ps) pqVar2, i, 1, qaVar.h, arrayList, null);
            } else if (pqVar2 instanceof qa) {
                g(((qa) pqVar2).i, i, 1, qaVar.h, arrayList, null);
            }
        }
        if (i == 1) {
            for (pq pqVar3 : ((py) qaVar).a.j) {
                if (pqVar3 instanceof ps) {
                    g((ps) pqVar3, 1, 2, null, arrayList, null);
                }
            }
        }
    }

    private final void f(pg pgVar, int i, int i2, int i3, int i4) {
        po poVar = this.h;
        poVar.k = i;
        poVar.l = i3;
        poVar.c = i2;
        poVar.d = i4;
        this.g.a(pgVar, poVar);
        pgVar.C(this.h.e);
        pgVar.x(this.h.f);
        po poVar2 = this.h;
        pgVar.G = poVar2.h;
        pgVar.u(poVar2.g);
    }

    private final void g(ps psVar, int i, int i2, ps psVar2, ArrayList arrayList, ald aldVar) {
        qa qaVar = psVar.d;
        if (qaVar.l == null) {
            ph phVar = this.a;
            if (qaVar == phVar.i || qaVar == phVar.j) {
                return;
            }
            if (aldVar == null) {
                aldVar = new ald(qaVar);
                arrayList.add(aldVar);
            }
            ald aldVar2 = aldVar;
            qaVar.l = aldVar2;
            ((ArrayList) aldVar2.b).add(qaVar);
            for (pq pqVar : qaVar.h.j) {
                if (pqVar instanceof ps) {
                    g((ps) pqVar, i, 0, psVar2, arrayList, aldVar2);
                }
            }
            for (pq pqVar2 : qaVar.i.j) {
                if (pqVar2 instanceof ps) {
                    g((ps) pqVar2, i, 1, psVar2, arrayList, aldVar2);
                }
            }
            if (i == 1 && (qaVar instanceof py)) {
                for (pq pqVar3 : ((py) qaVar).a.j) {
                    if (pqVar3 instanceof ps) {
                        g((ps) pqVar3, 1, 2, psVar2, arrayList, aldVar2);
                    }
                }
            }
            Iterator it = qaVar.h.k.iterator();
            while (it.hasNext()) {
                g((ps) it.next(), i, 0, psVar2, arrayList, aldVar2);
            }
            Iterator it2 = qaVar.i.k.iterator();
            while (it2.hasNext()) {
                g((ps) it2.next(), i, 1, psVar2, arrayList, aldVar2);
            }
            if (i == 1 && (qaVar instanceof py)) {
                Iterator it3 = ((py) qaVar).a.k.iterator();
                while (it3.hasNext()) {
                    g((ps) it3.next(), 1, 2, psVar2, arrayList, aldVar2);
                }
            }
        }
    }

    public final int a(ph phVar, int i) {
        long jA;
        pr prVar = this;
        ph phVar2 = phVar;
        int size = prVar.f.size();
        int i2 = 0;
        long j = 0;
        long jMax = 0;
        while (i2 < size) {
            ald aldVar = (ald) prVar.f.get(i2);
            Object obj = aldVar.a;
            if (!(obj instanceof pp) ? !(i != 0 ? (obj instanceof py) : (obj instanceof px)) : ((pp) obj).f != i) {
                ps psVar = i == 0 ? phVar2.i.h : phVar2.j.h;
                ps psVar2 = i == 0 ? phVar2.i.i : phVar2.j.i;
                boolean zContains = ((qa) obj).h.k.contains(psVar);
                boolean zContains2 = ((qa) aldVar.a).i.k.contains(psVar2);
                long jA2 = ((qa) aldVar.a).a();
                if (zContains && zContains2) {
                    long jB = aldVar.b(((qa) aldVar.a).h, j);
                    long jA3 = aldVar.a(((qa) aldVar.a).i, j);
                    long j2 = jB - jA2;
                    qa qaVar = (qa) aldVar.a;
                    long j3 = qaVar.i.e;
                    if (j2 >= (-r5)) {
                        j2 += j3;
                    }
                    long j4 = (-jA3) - jA2;
                    long j5 = qaVar.h.e;
                    long j6 = j4 - j5;
                    if (j6 >= j5) {
                        j6 -= j5;
                    }
                    pg pgVar = qaVar.d;
                    float f = i == 0 ? pgVar.af : pgVar.ag;
                    float f2 = 1.0f - f;
                    float f3 = f > 0.0f ? (long) ((j6 / f) + (j2 / f2)) : 0L;
                    jA = (j5 + ((((long) ((f * f3) + 0.5f)) + jA2) + ((long) ((f3 * f2) + 0.5f)))) - j3;
                } else if (zContains) {
                    jA = Math.max(aldVar.b(((qa) aldVar.a).h, r0.e), ((qa) aldVar.a).h.e + jA2);
                } else if (zContains2) {
                    jA = Math.max(-aldVar.a(((qa) aldVar.a).i, r0.e), (-((qa) aldVar.a).i.e) + jA2);
                } else {
                    jA = (r0.h.e + ((qa) aldVar.a).a()) - ((qa) aldVar.a).i.e;
                }
            } else {
                jA = j;
            }
            jMax = Math.max(jMax, jA);
            i2++;
            prVar = this;
            phVar2 = phVar;
            j = 0;
        }
        return (int) jMax;
    }

    public final void b() {
        ArrayList arrayList = this.e;
        arrayList.clear();
        this.d.i.d();
        this.d.j.d();
        arrayList.add(this.d.i);
        arrayList.add(this.d.j);
        ArrayList arrayList2 = this.d.aJ;
        int size = arrayList2.size();
        HashSet hashSet = null;
        for (int i = 0; i < size; i++) {
            pg pgVar = (pg) arrayList2.get(i);
            if (pgVar instanceof pj) {
                arrayList.add(new pv(pgVar));
            } else {
                if (pgVar.I()) {
                    if (pgVar.g == null) {
                        pgVar.g = new pp(pgVar, 0);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(pgVar.g);
                } else {
                    arrayList.add(pgVar.i);
                }
                if (pgVar.J()) {
                    if (pgVar.h == null) {
                        pgVar.h = new pp(pgVar, 1);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(pgVar.h);
                } else {
                    arrayList.add(pgVar.j);
                }
                if (pgVar instanceof pk) {
                    arrayList.add(new pw(pgVar));
                }
            }
        }
        if (hashSet != null) {
            arrayList.addAll(hashSet);
        }
        int size2 = arrayList.size();
        for (int i2 = 0; i2 < size2; i2++) {
            ((qa) arrayList.get(i2)).d();
        }
        int size3 = arrayList.size();
        for (int i3 = 0; i3 < size3; i3++) {
            qa qaVar = (qa) arrayList.get(i3);
            if (qaVar.d != this.d) {
                qaVar.b();
            }
        }
        this.f.clear();
        ald.c = 0;
        e(this.a.i, 0, this.f);
        e(this.a.j, 1, this.f);
        this.b = false;
    }

    public final void c() {
        pr prVar;
        pt ptVar;
        ArrayList arrayList = this.a.aJ;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            pg pgVar = (pg) arrayList.get(i);
            if (pgVar.f) {
                prVar = this;
            } else {
                int[] iArr = pgVar.ar;
                int i2 = iArr[0];
                int i3 = iArr[1];
                int i4 = pgVar.t;
                int i5 = pgVar.u;
                boolean z = i2 == 2 || (i2 == 3 && i4 == 1);
                boolean z2 = i3 == 2 || (i3 == 3 && i5 == 1);
                pt ptVar2 = pgVar.i.e;
                boolean z3 = ptVar2.i;
                pt ptVar3 = pgVar.j.e;
                boolean z4 = ptVar3.i;
                if (z3 && z4) {
                    prVar = this;
                    prVar.f(pgVar, 1, ptVar2.f, 1, ptVar3.f);
                    pgVar.f = true;
                } else {
                    if (z3 && z2) {
                        this.f(pgVar, 1, ptVar2.f, 2, ptVar3.f);
                        if (i3 == 3) {
                            pgVar.j.e.m = pgVar.h();
                        } else {
                            pgVar.j.e.c(pgVar.h());
                            pgVar.f = true;
                        }
                    } else if (z4 && z) {
                        prVar = this;
                        prVar.f(pgVar, 2, ptVar2.f, 1, ptVar3.f);
                        if (i2 == 3) {
                            pgVar.i.e.m = pgVar.j();
                        } else {
                            pgVar.i.e.c(pgVar.j());
                            pgVar.f = true;
                        }
                    }
                    prVar = this;
                }
                if (pgVar.f && (ptVar = pgVar.j.b) != null) {
                    ptVar.c(pgVar.ac);
                }
            }
            i++;
            this = prVar;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x0245  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void d(defpackage.ph r20) {
        /*
            Method dump skipped, instructions count: 769
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pr.d(ph):void");
    }
}
