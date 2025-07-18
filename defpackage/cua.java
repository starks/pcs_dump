package defpackage;

import j$.util.concurrent.ConcurrentLinkedQueue;
import java.lang.ref.ReferenceQueue;
import java.util.Queue;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.locks.ReentrantLock;
import java.util.logging.Level;

/* compiled from: PG */
/* loaded from: classes.dex */
final class cua extends ReentrantLock {
    final cuu a;
    volatile int b;
    long c;
    int d;
    int e;
    volatile AtomicReferenceArray f;
    final long g;
    final ReferenceQueue h;
    final ReferenceQueue i;
    final Queue j;
    final AtomicInteger k = new AtomicInteger();
    final Queue l;
    final Queue m;
    final cso n;

    public cua(cuu cuuVar, int i, long j, cso csoVar) {
        this.a = cuuVar;
        this.g = j;
        this.n = csoVar;
        AtomicReferenceArray atomicReferenceArray = new AtomicReferenceArray(i);
        this.e = (atomicReferenceArray.length() * 3) / 4;
        if (!cuuVar.g()) {
            int i2 = this.e;
            if (i2 == j) {
                this.e = i2 + 1;
            }
        }
        this.f = atomicReferenceArray;
        this.h = cuuVar.n() ? new ReferenceQueue() : null;
        this.i = cuuVar.o() ? new ReferenceQueue() : null;
        this.j = cuuVar.m() ? new ConcurrentLinkedQueue() : cuu.c;
        this.l = cuuVar.j() ? new cus() : cuu.c;
        this.m = cuuVar.m() ? new cth() : cuu.c;
    }

    final void A(Object obj, Object obj2, int i, int i2) {
        this.c -= i;
        if (i2 == 0) {
            throw null;
        }
        int i3 = i2 - 1;
        if (i3 != 0 && i3 != 1) {
            if (i3 != 2 && i3 != 3 && i3 != 4) {
                throw null;
            }
            this.n.a();
        }
        if (this.a.p != cuu.c) {
            this.a.p.offer(new cux(obj, obj2, i2));
        }
    }

    final cuv a(cuv cuvVar, cuv cuvVar2) {
        Object objJ = cuvVar.j();
        if (objJ == null) {
            return null;
        }
        cuj cujVarD = cuvVar.d();
        Object obj = cujVarD.get();
        if (obj == null && cujVarD.f()) {
            return null;
        }
        cuv cuvVarA = this.a.r.a(this, cuvVar, cuvVar2, objJ);
        cuvVarA.p(cujVarD.b(this.i, obj, cuvVarA));
        return cuvVarA;
    }

    final cuv b(Object obj, int i) {
        for (cuv cuvVarE = (cuv) this.f.get((r0.length() - 1) & i); cuvVarE != null; cuvVarE = cuvVarE.e()) {
            if (cuvVarE.a() == i) {
                Object objJ = cuvVarE.j();
                if (objJ == null) {
                    v();
                } else if (this.a.h.c(obj, objJ)) {
                    return cuvVarE;
                }
            }
        }
        return null;
    }

    final cuv c(Object obj, int i, long j) {
        cuv cuvVarB = b(obj, i);
        if (cuvVarB == null) {
            return null;
        }
        if (!this.a.k(cuvVarB, j)) {
            return cuvVarB;
        }
        w(j);
        return null;
    }

    final cuv d(Object obj, int i, cuv cuvVar) {
        return this.a.r.b(this, obj, i, cuvVar);
    }

    final cuv e(cuv cuvVar, cuv cuvVar2) {
        int i = this.b;
        cuv cuvVarE = cuvVar2.e();
        while (cuvVar != cuvVar2) {
            cuv cuvVarA = a(cuvVar, cuvVarE);
            if (cuvVarA != null) {
                cuvVarE = cuvVarA;
            } else {
                r(cuvVar);
                i--;
            }
            cuvVar = cuvVar.e();
        }
        this.b = i;
        return cuvVarE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x016b, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x016c, code lost:
    
        r2.unlock();
        r2.t();
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x0173, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x0174, code lost:
    
        throw r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:?, code lost:
    
        throw r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x005c, code lost:
    
        r0 = r3.d();
        r2 = r0.get();
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0064, code lost:
    
        if (r13 == r0) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0066, code lost:
    
        if (r2 != null) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x006a, code lost:
    
        if (r0 == defpackage.cuu.b) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x006d, code lost:
    
        A(r11, r5, 0, defpackage.cuw.b);
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0073, code lost:
    
        unlock();
        t();
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0079, code lost:
    
        return r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x007a, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x007b, code lost:
    
        r14 = r0;
        r2 = r10;
        r4 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0080, code lost:
    
        r1 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0081, code lost:
    
        r10.d++;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x008b, code lost:
    
        if (r13.f() == false) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x008d, code lost:
    
        if (r1 != null) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x008f, code lost:
    
        r0 = defpackage.cuw.c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0092, code lost:
    
        r0 = defpackage.cuw.b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0094, code lost:
    
        A(r11, r1, r13.a(), r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x009b, code lost:
    
        r14 = r14 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x009d, code lost:
    
        r2 = r10;
        r4 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x009f, code lost:
    
        r2.u(r3, r4, r5, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00a2, code lost:
    
        r10 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00a3, code lost:
    
        r10.b = r14;
        r10.l(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00a8, code lost:
    
        r10.unlock();
        r10.t();
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00ae, code lost:
    
        return r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00af, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00b0, code lost:
    
        r14 = r0;
        r2 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00b4, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0112, code lost:
    
        r10 = r2.n;
        r13.h();
        r10.c();
        r2.lock();
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x011d, code lost:
    
        r10 = r2.f;
        r11 = (r10.length() - 1) & r12;
        r0 = (defpackage.cuv) r10.get(r11);
        r1 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x012d, code lost:
    
        if (r1 != null) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x012f, code lost:
    
        r3 = r1.j();
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0137, code lost:
    
        if (r1.a() != r12) goto L131;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0149, code lost:
    
        if (r1.d() == r13) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x014f, code lost:
    
        if (r13.f() != false) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0151, code lost:
    
        r1.p(r13.a);
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0157, code lost:
    
        r10.set(r11, r2.e(r0, r1));
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x015f, code lost:
    
        r1 = r1.e();
     */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0112  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    final java.lang.Object f(java.lang.Object r11, int r12, defpackage.ctv r13, defpackage.djy r14) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 373
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cua.f(java.lang.Object, int, ctv, djy):java.lang.Object");
    }

    final Object g(cuv cuvVar, long j) {
        if (cuvVar.j() == null) {
            v();
            return null;
        }
        Object obj = cuvVar.d().get();
        if (obj == null) {
            v();
            return null;
        }
        if (!this.a.k(cuvVar, j)) {
            return obj;
        }
        w(j);
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0049, code lost:
    
        r11 = r2.d();
        r0 = r11.get();
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0051, code lost:
    
        if (r0 != null) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0053, code lost:
    
        r9.d++;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x005d, code lost:
    
        if (r11.f() == false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x005f, code lost:
    
        A(r10, null, r11.a(), defpackage.cuw.c);
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0068, code lost:
    
        r1 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x006b, code lost:
    
        r1.u(r2, r10, r12, r5);
        r9 = r1.b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0071, code lost:
    
        r1 = r9;
        r1.u(r2, r10, r12, r5);
        r9 = r1.b + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x007b, code lost:
    
        r1.b = r9;
        r1.l(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0081, code lost:
    
        r1 = r9;
        r3 = r10;
        r4 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0084, code lost:
    
        if (r13 == false) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0086, code lost:
    
        r1.p(r2, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0089, code lost:
    
        r9 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x008b, code lost:
    
        r1.d++;
        r1.A(r3, r0, r11.a(), defpackage.cuw.b);
        r1.u(r2, r3, r4, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x009d, code lost:
    
        r9 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x009e, code lost:
    
        r9.l(r2);
        r9 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00a1, code lost:
    
        r1 = r9;
        r8 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00a4, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00d7, code lost:
    
        r10 = r0;
        r1 = r1;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v11, types: [cua] */
    /* JADX WARN: Type inference failed for: r1v8, types: [cuv] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    final java.lang.Object h(java.lang.Object r10, int r11, java.lang.Object r12, boolean r13) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 223
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cua.h(java.lang.Object, int, java.lang.Object, boolean):java.lang.Object");
    }

    final Object i(cuv cuvVar, Object obj, cuj cujVar) {
        if (!cujVar.g()) {
            throw new AssertionError();
        }
        clq.J(!Thread.holdsLock(cuvVar), "Recursive load of: %s", obj);
        try {
            Object objD = cujVar.d();
            if (objD == null) {
                throw new csx(a.G(obj, "CacheLoader returned null for key ", "."));
            }
            q(cuvVar, this.a.q.a());
            return objD;
        } finally {
            this.n.e();
        }
    }

    final void j() {
        while (true) {
            cuv cuvVar = (cuv) this.j.poll();
            if (cuvVar == null) {
                return;
            }
            if (this.m.contains(cuvVar)) {
                this.m.add(cuvVar);
            }
        }
    }

    final void k() {
        int i = 0;
        if (this.a.n()) {
            int i2 = 0;
            do {
                Object objPoll = this.h.poll();
                if (objPoll == null) {
                    break;
                }
                cuu cuuVar = this.a;
                cuv cuvVar = (cuv) objPoll;
                int iA = cuvVar.a();
                cua cuaVarB = cuuVar.b(iA);
                cuaVarB.lock();
                try {
                    int i3 = cuaVarB.b;
                    AtomicReferenceArray atomicReferenceArray = cuaVarB.f;
                    int length = iA & (atomicReferenceArray.length() - 1);
                    cuv cuvVar2 = (cuv) atomicReferenceArray.get(length);
                    cuv cuvVarE = cuvVar2;
                    while (true) {
                        if (cuvVarE == null) {
                            break;
                        }
                        if (cuvVarE == cuvVar) {
                            cuaVarB.d++;
                            cuv cuvVarY = cuaVarB.y(cuvVar2, cuvVarE, cuvVarE.j(), iA, cuvVarE.d().get(), cuvVarE.d(), cuw.c);
                            int i4 = cuaVarB.b - 1;
                            atomicReferenceArray.set(length, cuvVarY);
                            cuaVarB.b = i4;
                            break;
                        }
                        cuvVarE = cuvVarE.e();
                    }
                    cuaVarB.unlock();
                    cuaVarB.t();
                    i2++;
                } catch (Throwable th) {
                    cuaVarB.unlock();
                    cuaVarB.t();
                    throw th;
                }
            } while (i2 != 16);
        }
        if (this.a.o()) {
            do {
                Object objPoll2 = this.i.poll();
                if (objPoll2 == null) {
                    return;
                }
                cuu cuuVar2 = this.a;
                cuj cujVar = (cuj) objPoll2;
                cuv cuvVarC = cujVar.c();
                int iA2 = cuvVarC.a();
                cua cuaVarB2 = cuuVar2.b(iA2);
                Object objJ = cuvVarC.j();
                cuaVarB2.lock();
                try {
                    int i5 = cuaVarB2.b;
                    AtomicReferenceArray atomicReferenceArray2 = cuaVarB2.f;
                    int length2 = iA2 & (atomicReferenceArray2.length() - 1);
                    cuv cuvVar3 = (cuv) atomicReferenceArray2.get(length2);
                    cuv cuvVarE2 = cuvVar3;
                    while (true) {
                        if (cuvVarE2 != null) {
                            Object objJ2 = cuvVarE2.j();
                            if (cuvVarE2.a() != iA2 || objJ2 == null || !cuaVarB2.a.h.c(objJ, objJ2)) {
                                cuvVarE2 = cuvVarE2.e();
                            } else if (cuvVarE2.d() == cujVar) {
                                cuaVarB2.d++;
                                cuv cuvVarY2 = cuaVarB2.y(cuvVar3, cuvVarE2, objJ2, iA2, cujVar.get(), cujVar, cuw.c);
                                int i6 = cuaVarB2.b - 1;
                                atomicReferenceArray2.set(length2, cuvVarY2);
                                cuaVarB2.b = i6;
                                cuaVarB2.unlock();
                                if (!cuaVarB2.isHeldByCurrentThread()) {
                                }
                            } else {
                                cuaVarB2.unlock();
                                if (!cuaVarB2.isHeldByCurrentThread()) {
                                }
                            }
                        } else {
                            cuaVarB2.unlock();
                            if (!cuaVarB2.isHeldByCurrentThread()) {
                            }
                        }
                    }
                    cuaVarB2.t();
                    i++;
                } finally {
                }
            } while (i != 16);
        }
    }

    final void l(cuv cuvVar) {
        if (this.a.h()) {
            j();
            if (cuvVar.d().a() > this.g && !z(cuvVar, cuvVar.a(), cuw.e)) {
                throw new AssertionError();
            }
            while (this.c > this.g) {
                for (cuv cuvVar2 : this.m) {
                    if (cuvVar2.d().a() > 0) {
                        if (!z(cuvVar2, cuvVar2.a(), cuw.e)) {
                            throw new AssertionError();
                        }
                    }
                }
                throw new AssertionError();
            }
        }
    }

    final void m() {
        AtomicReferenceArray atomicReferenceArray = this.f;
        int length = atomicReferenceArray.length();
        if (length >= 1073741824) {
            return;
        }
        int i = this.b;
        AtomicReferenceArray atomicReferenceArray2 = new AtomicReferenceArray(length + length);
        this.e = (atomicReferenceArray2.length() * 3) / 4;
        int length2 = atomicReferenceArray2.length() - 1;
        for (int i2 = 0; i2 < length; i2++) {
            cuv cuvVarE = (cuv) atomicReferenceArray.get(i2);
            if (cuvVarE != null) {
                cuv cuvVarE2 = cuvVarE.e();
                int iA = cuvVarE.a() & length2;
                if (cuvVarE2 == null) {
                    atomicReferenceArray2.set(iA, cuvVarE);
                } else {
                    cuv cuvVar = cuvVarE;
                    while (cuvVarE2 != null) {
                        int iA2 = cuvVarE2.a() & length2;
                        int i3 = iA2 != iA ? iA2 : iA;
                        if (iA2 != iA) {
                            cuvVar = cuvVarE2;
                        }
                        cuvVarE2 = cuvVarE2.e();
                        iA = i3;
                    }
                    atomicReferenceArray2.set(iA, cuvVar);
                    while (cuvVarE != cuvVar) {
                        int iA3 = cuvVarE.a() & length2;
                        cuv cuvVarA = a(cuvVarE, (cuv) atomicReferenceArray2.get(iA3));
                        if (cuvVarA != null) {
                            atomicReferenceArray2.set(iA3, cuvVarA);
                        } else {
                            r(cuvVarE);
                            i--;
                        }
                        cuvVarE = cuvVarE.e();
                    }
                }
            }
        }
        this.f = atomicReferenceArray2;
        this.b = i;
    }

    final void n(long j) {
        cuv cuvVar;
        cuv cuvVar2;
        j();
        do {
            cuvVar = (cuv) this.l.peek();
            if (cuvVar == null || !this.a.k(cuvVar, j)) {
                do {
                    cuvVar2 = (cuv) this.m.peek();
                    if (cuvVar2 == null || !this.a.k(cuvVar2, j)) {
                        return;
                    }
                } while (z(cuvVar2, cuvVar2.a(), cuw.d));
                throw new AssertionError();
            }
        } while (z(cuvVar, cuvVar.a(), cuw.d));
        throw new AssertionError();
    }

    final void o() {
        if ((this.k.incrementAndGet() & 63) == 0) {
            s(this.a.q.a());
            t();
        }
    }

    final void p(cuv cuvVar, long j) {
        if (this.a.i()) {
            cuvVar.k(j);
        }
        this.m.add(cuvVar);
    }

    final void q(cuv cuvVar, long j) {
        if (this.a.i()) {
            cuvVar.k(j);
        }
        this.j.add(cuvVar);
    }

    final void r(cuv cuvVar) {
        Object objJ = cuvVar.j();
        cuvVar.a();
        A(objJ, cuvVar.d().get(), cuvVar.d().a(), cuw.c);
        this.l.remove(cuvVar);
        this.m.remove(cuvVar);
    }

    final void s(long j) {
        if (tryLock()) {
            try {
                k();
                n(j);
                this.k.set(0);
            } finally {
                unlock();
            }
        }
    }

    final void t() {
        if (isHeldByCurrentThread()) {
            return;
        }
        cuu cuuVar = this.a;
        while (((cux) cuuVar.p.poll()) != null) {
            try {
                cst cstVar = cuuVar.x;
            } catch (Throwable th) {
                cuu.a.logp(Level.WARNING, "com.google.common.cache.LocalCache", "processPendingNotifications", "Exception thrown by removal listener", th);
            }
        }
    }

    final void u(cuv cuvVar, Object obj, Object obj2, long j) {
        cuj cugVar;
        cuu cuuVar = this.a;
        cuj cujVarD = cuvVar.d();
        csu csuVar = cuuVar.w;
        clq.G(true, "Weights must be non-negative");
        int iOrdinal = this.a.k.ordinal();
        if (iOrdinal == 0) {
            cugVar = new cug(obj2);
        } else if (iOrdinal == 1) {
            cugVar = new cub(this.i, obj2, cuvVar);
        } else {
            if (iOrdinal != 2) {
                throw null;
            }
            cugVar = new cuo(this.i, obj2, cuvVar);
        }
        cuvVar.p(cugVar);
        j();
        this.c++;
        if (this.a.i()) {
            cuvVar.k(j);
        }
        if (this.a.l()) {
            cuvVar.q(j);
        }
        this.m.add(cuvVar);
        this.l.add(cuvVar);
        cujVarD.e(obj2);
    }

    final void v() {
        if (tryLock()) {
            try {
                k();
            } finally {
                unlock();
            }
        }
    }

    final void w(long j) {
        if (tryLock()) {
            try {
                n(j);
            } finally {
                unlock();
            }
        }
    }

    final cuv y(cuv cuvVar, cuv cuvVar2, Object obj, int i, Object obj2, cuj cujVar, int i2) {
        A(obj, obj2, cujVar.a(), i2);
        this.l.remove(cuvVar2);
        this.m.remove(cuvVar2);
        if (!cujVar.g()) {
            return e(cuvVar, cuvVar2);
        }
        cujVar.e(null);
        return cuvVar;
    }

    final boolean z(cuv cuvVar, int i, int i2) {
        AtomicReferenceArray atomicReferenceArray = this.f;
        int length = (atomicReferenceArray.length() - 1) & i;
        cuv cuvVar2 = (cuv) atomicReferenceArray.get(length);
        for (cuv cuvVarE = cuvVar2; cuvVarE != null; cuvVarE = cuvVarE.e()) {
            if (cuvVarE == cuvVar) {
                this.d++;
                cuv cuvVarY = y(cuvVar2, cuvVarE, cuvVarE.j(), i, cuvVarE.d().get(), cuvVarE.d(), i2);
                int i3 = this.b - 1;
                atomicReferenceArray.set(length, cuvVarY);
                this.b = i3;
                return true;
            }
        }
        return false;
    }

    static final Object x(Object obj) {
        return obj;
    }
}
