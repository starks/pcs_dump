package defpackage;

import j$.util.concurrent.ConcurrentLinkedQueue;
import j$.util.concurrent.ConcurrentMap;
import java.util.AbstractMap;
import java.util.Collection;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.logging.Logger;

/* compiled from: PG */
/* loaded from: classes.dex */
final class cuu extends AbstractMap implements ConcurrentMap, j$.util.concurrent.ConcurrentMap {
    static final Logger a = Logger.getLogger(cuu.class.getName());
    static final cuj b = new ctb();
    static final Queue c = new ctc();
    public static final /* synthetic */ int y = 0;
    final int d;
    final int e;
    final cua[] f;
    final int g;
    final cro h;
    final cro i;
    final cuc j;
    final cuc k;
    final long l;
    final long m;
    final long n;
    final long o;
    final Queue p;
    final csm q;
    final cto r;
    final csy s;
    Set t;
    Collection u;
    Set v;
    final csu w;
    final cst x;

    /* JADX WARN: Type inference failed for: r1v0, types: [cuu, java.util.AbstractMap] */
    public cuu(csv csvVar, csy csyVar) {
        ?? abstractMap = new AbstractMap();
        int i = csvVar.e;
        abstractMap.g = Math.min(i == -1 ? 4 : i, 65536);
        cuc cucVarB = csvVar.b();
        abstractMap.j = cucVarB;
        abstractMap.k = csvVar.c();
        abstractMap.h = (cro) clq.R(csvVar.m, csvVar.b().a());
        abstractMap.i = (cro) clq.R(csvVar.n, csvVar.c().a());
        long j = (csvVar.j == 0 || csvVar.k == 0) ? 0L : csvVar.q == null ? csvVar.f : csvVar.g;
        abstractMap.l = j;
        abstractMap.w = (csu) clq.R(csvVar.q, csu.a);
        long j2 = csvVar.k;
        abstractMap.m = j2 == -1 ? 0L : j2;
        long j3 = csvVar.j;
        abstractMap.n = j3 == -1 ? 0L : j3;
        abstractMap.o = 0L;
        cst cstVar = (cst) clq.R(csvVar.r, cst.a);
        abstractMap.x = cstVar;
        abstractMap.p = cstVar == cst.a ? c : new ConcurrentLinkedQueue();
        int i2 = 0;
        int i3 = 1;
        boolean z = abstractMap.l() || abstractMap.i();
        csm csmVar = csvVar.o;
        abstractMap.q = csmVar == null ? z ? csm.a : csv.b : csmVar;
        char c2 = (abstractMap.m() || abstractMap.i()) ? (char) 1 : (char) 0;
        boolean z2 = abstractMap.j() || abstractMap.l();
        cto ctoVar = cto.a;
        abstractMap.r = cto.i[(cucVarB != cuc.WEAK ? (char) 0 : (char) 4) | c2 | (true != z2 ? 0 : 2)];
        abstractMap.s = csyVar;
        int iMin = Math.min(16, 1073741824);
        if (abstractMap.h() && !abstractMap.g()) {
            iMin = (int) Math.min(iMin, j);
        }
        int i4 = 0;
        int i5 = 1;
        while (i5 < abstractMap.g && (!abstractMap.h() || i5 * 20 <= abstractMap.l)) {
            i4++;
            i5 += i5;
        }
        abstractMap.e = 32 - i4;
        abstractMap.d = i5 - 1;
        abstractMap.f = new cua[i5];
        int i6 = iMin / i5;
        while (i3 < (i6 * i5 < iMin ? i6 + 1 : i6)) {
            i3 += i3;
        }
        if (abstractMap.h()) {
            long j4 = i5;
            long j5 = abstractMap.l;
            long j6 = (j5 / j4) + 1;
            long j7 = j5 % j4;
            while (true) {
                cua[] cuaVarArr = abstractMap.f;
                if (i2 >= cuaVarArr.length) {
                    return;
                }
                if (i2 == j7) {
                    j6--;
                }
                long j8 = j6;
                cuaVarArr[i2] = new cua(abstractMap, i3, j8, (cso) ((csj) csvVar.p).a);
                i2++;
                j6 = j8;
            }
        } else {
            int i7 = i3;
            cuu cuuVar = abstractMap;
            while (true) {
                cua[] cuaVarArr2 = cuuVar.f;
                if (i2 >= cuaVarArr2.length) {
                    return;
                }
                cuaVarArr2[i2] = new cua(cuuVar, i7, -1L, (cso) ((csj) csvVar.p).a);
                i2++;
                cuuVar = this;
            }
        }
    }

    static void c(cuv cuvVar, cuv cuvVar2) {
        cuvVar.l(cuvVar2);
        cuvVar2.n(cuvVar);
    }

    static void d(cuv cuvVar, cuv cuvVar2) {
        cuvVar.m(cuvVar2);
        cuvVar2.o(cuvVar);
    }

    static void e(cuv cuvVar) {
        ctz ctzVar = ctz.a;
        cuvVar.l(ctzVar);
        cuvVar.n(ctzVar);
    }

    static void f(cuv cuvVar) {
        ctz ctzVar = ctz.a;
        cuvVar.m(ctzVar);
        cuvVar.o(ctzVar);
    }

    final int a(Object obj) {
        int iA = this.h.a(obj);
        int i = iA + ((iA << 15) ^ (-12931));
        int i2 = i ^ (i >>> 10);
        int i3 = i2 + (i2 << 3);
        int i4 = i3 ^ (i3 >>> 6);
        int i5 = i4 + (i4 << 2) + (i4 << 14);
        return i5 ^ (i5 >>> 16);
    }

    final cua b(int i) {
        return this.f[(i >>> this.e) & this.d];
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        cua[] cuaVarArr = this.f;
        int length = cuaVarArr.length;
        for (int i = 0; i < length; i++) {
            cua cuaVar = cuaVarArr[i];
            if (cuaVar.b != 0) {
                cuaVar.lock();
                try {
                    cuaVar.s(cuaVar.a.q.a());
                    AtomicReferenceArray atomicReferenceArray = cuaVar.f;
                    for (int i2 = 0; i2 < atomicReferenceArray.length(); i2++) {
                        for (cuv cuvVarE = (cuv) atomicReferenceArray.get(i2); cuvVarE != null; cuvVarE = cuvVarE.e()) {
                            if (cuvVarE.d().f()) {
                                Object objJ = cuvVarE.j();
                                Object obj = cuvVarE.d().get();
                                int i3 = (objJ == null || obj == null) ? cuw.c : cuw.a;
                                cuvVarE.a();
                                cuaVar.A(objJ, obj, cuvVarE.d().a(), i3);
                            }
                        }
                    }
                    for (int i4 = 0; i4 < atomicReferenceArray.length(); i4++) {
                        atomicReferenceArray.set(i4, null);
                    }
                    if (cuaVar.a.n()) {
                        while (cuaVar.h.poll() != null) {
                        }
                    }
                    if (cuaVar.a.o()) {
                        while (cuaVar.i.poll() != null) {
                        }
                    }
                    cuaVar.l.clear();
                    cuaVar.m.clear();
                    cuaVar.k.set(0);
                    cuaVar.d++;
                    cuaVar.b = 0;
                } finally {
                    cuaVar.unlock();
                    cuaVar.t();
                }
            }
        }
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.concurrent.ConcurrentMap, j$.util.Map
    public final /* synthetic */ Object compute(Object obj, BiFunction biFunction) {
        return ConcurrentMap.CC.$default$compute(this, obj, biFunction);
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.concurrent.ConcurrentMap, j$.util.Map
    public final /* synthetic */ Object computeIfAbsent(Object obj, Function function) {
        return ConcurrentMap.CC.$default$computeIfAbsent(this, obj, function);
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.concurrent.ConcurrentMap, j$.util.Map
    public final /* synthetic */ Object computeIfPresent(Object obj, BiFunction biFunction) {
        return ConcurrentMap.CC.$default$computeIfPresent(this, obj, biFunction);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        if (obj == null) {
            return false;
        }
        int iA = a(obj);
        cua cuaVarB = b(iA);
        try {
            if (cuaVarB.b == 0) {
                return false;
            }
            cuv cuvVarC = cuaVarB.c(obj, iA, cuaVarB.a.q.a());
            if (cuvVarC == null) {
                return false;
            }
            return cuvVarC.d().get() != null;
        } finally {
            cuaVarB.o();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x004f, code lost:
    
        r15 = r15 + 1;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0 */
    /* JADX WARN: Type inference failed for: r12v1, types: [int] */
    /* JADX WARN: Type inference failed for: r12v3 */
    /* JADX WARN: Type inference failed for: r14v1, types: [java.util.concurrent.atomic.AtomicReferenceArray] */
    /* JADX WARN: Type inference failed for: r15v1, types: [int] */
    /* JADX WARN: Type inference failed for: r15v3 */
    /* JADX WARN: Type inference failed for: r15v4 */
    @Override // java.util.AbstractMap, java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean containsValue(java.lang.Object r20) {
        /*
            r19 = this;
            r0 = r19
            r1 = r20
            r2 = 0
            if (r1 != 0) goto L8
            return r2
        L8:
            csm r3 = r0.q
            cua[] r4 = r0.f
            long r5 = r3.a()
            r7 = -1
            r3 = r2
        L13:
            r9 = 3
            if (r3 >= r9) goto L6e
            int r9 = r4.length
            r10 = 0
            r12 = r2
        L1a:
            if (r12 >= r9) goto L5f
            r13 = r4[r12]
            int r14 = r13.b
            java.util.concurrent.atomic.AtomicReferenceArray r14 = r13.f
            r15 = r2
            r16 = r15
        L25:
            int r2 = r14.length()
            if (r15 >= r2) goto L52
            java.lang.Object r2 = r14.get(r15)
            cuv r2 = (defpackage.cuv) r2
        L31:
            r17 = r3
            if (r2 == 0) goto L4f
            java.lang.Object r3 = r13.g(r2, r5)
            r18 = r2
            if (r3 == 0) goto L48
            cro r2 = r0.i
            boolean r2 = r2.c(r1, r3)
            if (r2 != 0) goto L46
            goto L48
        L46:
            r0 = 1
            return r0
        L48:
            cuv r2 = r18.e()
            r3 = r17
            goto L31
        L4f:
            int r15 = r15 + 1
            goto L25
        L52:
            r17 = r3
            int r2 = r13.d
            long r2 = (long) r2
            long r10 = r10 + r2
            int r12 = r12 + 1
            r2 = r16
            r3 = r17
            goto L1a
        L5f:
            r16 = r2
            r17 = r3
            int r2 = (r10 > r7 ? 1 : (r10 == r7 ? 0 : -1))
            if (r2 != 0) goto L68
            goto L70
        L68:
            int r3 = r17 + 1
            r7 = r10
            r2 = r16
            goto L13
        L6e:
            r16 = r2
        L70:
            return r16
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cuu.containsValue(java.lang.Object):boolean");
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        Set set = this.v;
        if (set != null) {
            return set;
        }
        ctq ctqVar = new ctq(this);
        this.v = ctqVar;
        return ctqVar;
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.concurrent.ConcurrentMap, j$.util.Map
    public final /* synthetic */ void forEach(BiConsumer biConsumer) {
        ConcurrentMap.CC.$default$forEach(this, biConsumer);
    }

    final boolean g() {
        return this.w != csu.a;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        long jA;
        cuv cuvVarC;
        Object objX = null;
        if (obj == null) {
            return null;
        }
        int iA = a(obj);
        cua cuaVarB = b(iA);
        try {
            if (cuaVarB.b != 0 && (cuvVarC = cuaVarB.c(obj, iA, (jA = cuaVarB.a.q.a()))) != null) {
                Object obj2 = cuvVarC.d().get();
                if (obj2 != null) {
                    cuaVarB.q(cuvVarC, jA);
                    cuvVarC.j();
                    csy csyVar = cuaVarB.a.s;
                    objX = cua.x(obj2);
                } else {
                    cuaVarB.v();
                }
            }
            return objX;
        } finally {
            cuaVarB.o();
        }
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.concurrent.ConcurrentMap, j$.util.Map
    public final Object getOrDefault(Object obj, Object obj2) {
        Object obj3 = get(obj);
        return obj3 != null ? obj3 : obj2;
    }

    final boolean h() {
        return this.l >= 0;
    }

    final boolean i() {
        return this.m > 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean isEmpty() {
        cua[] cuaVarArr = this.f;
        long j = 0;
        for (cua cuaVar : cuaVarArr) {
            if (cuaVar.b != 0) {
                return false;
            }
            j += r7.d;
        }
        if (j == 0) {
            return true;
        }
        for (cua cuaVar2 : cuaVarArr) {
            if (cuaVar2.b != 0) {
                return false;
            }
            j -= r8.d;
        }
        return j == 0;
    }

    final boolean j() {
        return this.n > 0;
    }

    final boolean k(cuv cuvVar, long j) {
        cuvVar.getClass();
        if (!i() || j - cuvVar.b() < this.m) {
            return j() && j - cuvVar.c() >= this.n;
        }
        return true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        Set set = this.t;
        if (set != null) {
            return set;
        }
        ctt cttVar = new ctt(this);
        this.t = cttVar;
        return cttVar;
    }

    final boolean l() {
        return j();
    }

    final boolean m() {
        return i() || h();
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.concurrent.ConcurrentMap, j$.util.Map
    public final /* synthetic */ Object merge(Object obj, Object obj2, BiFunction biFunction) {
        return ConcurrentMap.CC.$default$merge(this, obj, obj2, biFunction);
    }

    final boolean n() {
        return this.j != cuc.STRONG;
    }

    final boolean o() {
        return this.k != cuc.STRONG;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        obj.getClass();
        obj2.getClass();
        int iA = a(obj);
        return b(iA).h(obj, iA, obj2, false);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void putAll(Map map) {
        for (Map.Entry entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.Map
    public final Object putIfAbsent(Object obj, Object obj2) {
        obj.getClass();
        obj2.getClass();
        int iA = a(obj);
        return b(iA).h(obj, iA, obj2, true);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0045, code lost:
    
        r7 = r3.d();
        r6 = r7.get();
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x004d, code lost:
    
        if (r6 == null) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x004f, code lost:
    
        r11 = defpackage.cuw.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0051, code lost:
    
        r8 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0057, code lost:
    
        if (r7.f() == false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0059, code lost:
    
        r11 = defpackage.cuw.c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x005c, code lost:
    
        r1.d++;
        r11 = r1.y(r2, r3, r4, r5, r6, r7, r8);
        r0 = r1.b - 1;
        r10.set(r9, r11);
        r1.b = r0;
        r0 = r6;
     */
    @Override // java.util.AbstractMap, java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object remove(java.lang.Object r11) {
        /*
            r10 = this;
            r0 = 0
            if (r11 != 0) goto L4
            return r0
        L4:
            int r5 = r10.a(r11)
            cua r1 = r10.b(r5)
            r1.lock()
            cuu r10 = r1.a     // Catch: java.lang.Throwable -> L7d
            csm r10 = r10.q     // Catch: java.lang.Throwable -> L7d
            long r2 = r10.a()     // Catch: java.lang.Throwable -> L7d
            r1.s(r2)     // Catch: java.lang.Throwable -> L7d
            int r10 = r1.b     // Catch: java.lang.Throwable -> L7d
            java.util.concurrent.atomic.AtomicReferenceArray r10 = r1.f     // Catch: java.lang.Throwable -> L7d
            int r2 = r10.length()     // Catch: java.lang.Throwable -> L7d
            int r2 = r2 + (-1)
            r9 = r5 & r2
            java.lang.Object r2 = r10.get(r9)     // Catch: java.lang.Throwable -> L7d
            cuv r2 = (defpackage.cuv) r2     // Catch: java.lang.Throwable -> L7d
            r3 = r2
        L2d:
            if (r3 == 0) goto L76
            java.lang.Object r4 = r3.j()     // Catch: java.lang.Throwable -> L7d
            int r6 = r3.a()     // Catch: java.lang.Throwable -> L7d
            if (r6 != r5) goto L71
            if (r4 == 0) goto L71
            cuu r6 = r1.a     // Catch: java.lang.Throwable -> L7d
            cro r6 = r6.h     // Catch: java.lang.Throwable -> L7d
            boolean r6 = r6.c(r11, r4)     // Catch: java.lang.Throwable -> L7d
            if (r6 == 0) goto L71
            cuj r7 = r3.d()     // Catch: java.lang.Throwable -> L7d
            java.lang.Object r6 = r7.get()     // Catch: java.lang.Throwable -> L7d
            if (r6 == 0) goto L53
            int r11 = defpackage.cuw.a     // Catch: java.lang.Throwable -> L7d
        L51:
            r8 = r11
            goto L5c
        L53:
            boolean r11 = r7.f()     // Catch: java.lang.Throwable -> L7d
            if (r11 == 0) goto L76
            int r11 = defpackage.cuw.c     // Catch: java.lang.Throwable -> L7d
            goto L51
        L5c:
            int r11 = r1.d     // Catch: java.lang.Throwable -> L7d
            int r11 = r11 + 1
            r1.d = r11     // Catch: java.lang.Throwable -> L7d
            cuv r11 = r1.y(r2, r3, r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L7d
            int r0 = r1.b     // Catch: java.lang.Throwable -> L7d
            int r0 = r0 + (-1)
            r10.set(r9, r11)     // Catch: java.lang.Throwable -> L7d
            r1.b = r0     // Catch: java.lang.Throwable -> L7d
            r0 = r6
            goto L76
        L71:
            cuv r3 = r3.e()     // Catch: java.lang.Throwable -> L7d
            goto L2d
        L76:
            r1.unlock()
            r1.t()
            return r0
        L7d:
            r0 = move-exception
            r10 = r0
            r1.unlock()
            r1.t()
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cuu.remove(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0045, code lost:
    
        r7 = r3.d();
        r12 = r7.get();
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x004d, code lost:
    
        if (r12 != null) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0053, code lost:
    
        if (r7.f() == false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0055, code lost:
    
        r14 = r1.b;
        r1.d++;
        r14 = r1.y(r2, r3, r4, r5, null, r7, defpackage.cuw.c);
        r15 = r1.b - 1;
        r13.set(r0, r14);
        r1.b = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x006e, code lost:
    
        r1.d++;
        r1.A(r14, r12, r7.a(), defpackage.cuw.b);
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x007d, code lost:
    
        r7 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0081, code lost:
    
        r1.u(r7, r14, r15, r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0084, code lost:
    
        r1 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0086, code lost:
    
        r1.l(r7);
        r9 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x008b, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x008c, code lost:
    
        r1 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x009f, code lost:
    
        r13 = r0;
        r1.unlock();
        r1.t();
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00a6, code lost:
    
        throw r13;
     */
    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object replace(java.lang.Object r14, java.lang.Object r15) throws java.lang.Throwable {
        /*
            r13 = this;
            r14.getClass()
            r15.getClass()
            int r5 = r13.a(r14)
            cua r1 = r13.b(r5)
            r1.lock()
            cuu r13 = r1.a     // Catch: java.lang.Throwable -> L9e
            csm r13 = r13.q     // Catch: java.lang.Throwable -> L9e
            long r10 = r13.a()     // Catch: java.lang.Throwable -> L9e
            r1.s(r10)     // Catch: java.lang.Throwable -> L9e
            java.util.concurrent.atomic.AtomicReferenceArray r13 = r1.f     // Catch: java.lang.Throwable -> L9e
            int r0 = r13.length()     // Catch: java.lang.Throwable -> L9e
            int r0 = r0 + (-1)
            r0 = r0 & r5
            java.lang.Object r2 = r13.get(r0)     // Catch: java.lang.Throwable -> L9e
            cuv r2 = (defpackage.cuv) r2     // Catch: java.lang.Throwable -> L9e
            r3 = r2
        L2c:
            r9 = 0
            if (r3 == 0) goto L97
            java.lang.Object r4 = r3.j()     // Catch: java.lang.Throwable -> L9e
            int r6 = r3.a()     // Catch: java.lang.Throwable -> L9e
            if (r6 != r5) goto L8e
            if (r4 == 0) goto L8e
            cuu r6 = r1.a     // Catch: java.lang.Throwable -> L9e
            cro r6 = r6.h     // Catch: java.lang.Throwable -> L9e
            boolean r6 = r6.c(r14, r4)     // Catch: java.lang.Throwable -> L9e
            if (r6 == 0) goto L8e
            cuj r7 = r3.d()     // Catch: java.lang.Throwable -> L9e
            java.lang.Object r12 = r7.get()     // Catch: java.lang.Throwable -> L9e
            if (r12 != 0) goto L6e
            boolean r14 = r7.f()     // Catch: java.lang.Throwable -> L9e
            if (r14 == 0) goto L97
            int r14 = r1.b     // Catch: java.lang.Throwable -> L9e
            int r14 = r1.d     // Catch: java.lang.Throwable -> L9e
            int r14 = r14 + 1
            r1.d = r14     // Catch: java.lang.Throwable -> L9e
            int r8 = defpackage.cuw.c     // Catch: java.lang.Throwable -> L9e
            r6 = 0
            cuv r14 = r1.y(r2, r3, r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L9e
            int r15 = r1.b     // Catch: java.lang.Throwable -> L9e
            int r15 = r15 + (-1)
            r13.set(r0, r14)     // Catch: java.lang.Throwable -> L9e
            r1.b = r15     // Catch: java.lang.Throwable -> L9e
            goto L97
        L6e:
            int r13 = r1.d     // Catch: java.lang.Throwable -> L9e
            int r13 = r13 + 1
            r1.d = r13     // Catch: java.lang.Throwable -> L9e
            int r13 = r7.a()     // Catch: java.lang.Throwable -> L9e
            int r0 = defpackage.cuw.b     // Catch: java.lang.Throwable -> L9e
            r1.A(r14, r12, r13, r0)     // Catch: java.lang.Throwable -> L9e
            r8 = r14
            r9 = r15
            r6 = r1
            r7 = r3
            r6.u(r7, r8, r9, r10)     // Catch: java.lang.Throwable -> L8b
            r1 = r6
            r3 = r7
            r1.l(r3)     // Catch: java.lang.Throwable -> L9e
            r9 = r12
            goto L97
        L8b:
            r0 = move-exception
            r1 = r6
            goto L9f
        L8e:
            r8 = r14
            r9 = r15
            cuv r3 = r3.e()     // Catch: java.lang.Throwable -> L9e
            r14 = r8
            r15 = r9
            goto L2c
        L97:
            r1.unlock()
            r1.t()
            return r9
        L9e:
            r0 = move-exception
        L9f:
            r13 = r0
            r1.unlock()
            r1.t()
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cuu.replace(java.lang.Object, java.lang.Object):java.lang.Object");
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.concurrent.ConcurrentMap, j$.util.Map
    public final /* synthetic */ void replaceAll(BiFunction biFunction) {
        ConcurrentMap.CC.$default$replaceAll(this, biFunction);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        long jMax = 0;
        for (int i = 0; i < this.f.length; i++) {
            jMax += Math.max(0, r7[i].b);
        }
        return cnx.Q(jMax);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection values() {
        Collection collection = this.u;
        if (collection != null) {
            return collection;
        }
        cuk cukVar = new cuk(this);
        this.u = cukVar;
        return cukVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0048, code lost:
    
        r7 = r3.d();
        r11 = r7.get();
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0058, code lost:
    
        if (r1.a.i.c(r12, r11) == false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x005a, code lost:
    
        r12 = defpackage.cuw.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x005c, code lost:
    
        r6 = r11;
        r8 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x005f, code lost:
    
        if (r11 != null) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0065, code lost:
    
        if (r7.f() == false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0067, code lost:
    
        r12 = defpackage.cuw.c;
        r11 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x006b, code lost:
    
        r1.d++;
        r11 = r1.y(r2, r3, r4, r5, r6, r7, r8);
        r2 = r1.b - 1;
        r10.set(r9, r11);
        r1.b = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0080, code lost:
    
        if (r8 != defpackage.cuw.a) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0082, code lost:
    
        r0 = true;
     */
    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean remove(java.lang.Object r11, java.lang.Object r12) {
        /*
            r10 = this;
            r0 = 0
            if (r11 == 0) goto L98
            if (r12 != 0) goto L7
            goto L98
        L7:
            int r5 = r10.a(r11)
            cua r1 = r10.b(r5)
            r1.lock()
            cuu r10 = r1.a     // Catch: java.lang.Throwable -> L8f
            csm r10 = r10.q     // Catch: java.lang.Throwable -> L8f
            long r2 = r10.a()     // Catch: java.lang.Throwable -> L8f
            r1.s(r2)     // Catch: java.lang.Throwable -> L8f
            int r10 = r1.b     // Catch: java.lang.Throwable -> L8f
            java.util.concurrent.atomic.AtomicReferenceArray r10 = r1.f     // Catch: java.lang.Throwable -> L8f
            int r2 = r10.length()     // Catch: java.lang.Throwable -> L8f
            int r2 = r2 + (-1)
            r9 = r5 & r2
            java.lang.Object r2 = r10.get(r9)     // Catch: java.lang.Throwable -> L8f
            cuv r2 = (defpackage.cuv) r2     // Catch: java.lang.Throwable -> L8f
            r3 = r2
        L30:
            if (r3 == 0) goto L83
            java.lang.Object r4 = r3.j()     // Catch: java.lang.Throwable -> L8f
            int r6 = r3.a()     // Catch: java.lang.Throwable -> L8f
            if (r6 != r5) goto L8a
            if (r4 == 0) goto L8a
            cuu r6 = r1.a     // Catch: java.lang.Throwable -> L8f
            cro r6 = r6.h     // Catch: java.lang.Throwable -> L8f
            boolean r6 = r6.c(r11, r4)     // Catch: java.lang.Throwable -> L8f
            if (r6 == 0) goto L8a
            cuj r7 = r3.d()     // Catch: java.lang.Throwable -> L8f
            java.lang.Object r11 = r7.get()     // Catch: java.lang.Throwable -> L8f
            cuu r6 = r1.a     // Catch: java.lang.Throwable -> L8f
            cro r6 = r6.i     // Catch: java.lang.Throwable -> L8f
            boolean r12 = r6.c(r12, r11)     // Catch: java.lang.Throwable -> L8f
            if (r12 == 0) goto L5f
            int r12 = defpackage.cuw.a     // Catch: java.lang.Throwable -> L8f
        L5c:
            r6 = r11
            r8 = r12
            goto L6b
        L5f:
            if (r11 != 0) goto L83
            boolean r11 = r7.f()     // Catch: java.lang.Throwable -> L8f
            if (r11 == 0) goto L83
            int r12 = defpackage.cuw.c     // Catch: java.lang.Throwable -> L8f
            r11 = 0
            goto L5c
        L6b:
            int r11 = r1.d     // Catch: java.lang.Throwable -> L8f
            r12 = 1
            int r11 = r11 + r12
            r1.d = r11     // Catch: java.lang.Throwable -> L8f
            cuv r11 = r1.y(r2, r3, r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L8f
            int r2 = r1.b     // Catch: java.lang.Throwable -> L8f
            int r2 = r2 + (-1)
            r10.set(r9, r11)     // Catch: java.lang.Throwable -> L8f
            r1.b = r2     // Catch: java.lang.Throwable -> L8f
            int r10 = defpackage.cuw.a     // Catch: java.lang.Throwable -> L8f
            if (r8 != r10) goto L83
            r0 = r12
        L83:
            r1.unlock()
            r1.t()
            return r0
        L8a:
            cuv r3 = r3.e()     // Catch: java.lang.Throwable -> L8f
            goto L30
        L8f:
            r0 = move-exception
            r10 = r0
            r1.unlock()
            r1.t()
            throw r10
        L98:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cuu.remove(java.lang.Object, java.lang.Object):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0050, code lost:
    
        r15 = r8;
        r9 = r6;
        r8 = r4.d();
        r13 = r8.get();
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x005d, code lost:
    
        if (r13 != null) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0063, code lost:
    
        if (r8.f() == false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0065, code lost:
    
        r0 = r2.b;
        r2.d++;
        r0 = r2.y(r7, r4, r5, r9, null, r8, defpackage.cuw.c);
        r3 = r2.b - 1;
        r10.set(r11, r0);
        r2.b = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0088, code lost:
    
        if (r2.a.i.c(r19, r13) == false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x008a, code lost:
    
        r2.d++;
        r2.A(r3, r13, r8.a(), defpackage.cuw.b);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0098, code lost:
    
        r2 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x009c, code lost:
    
        r2.u(r2, r3, r20, r15);
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x009f, code lost:
    
        r2 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00a1, code lost:
    
        r2.l(r2);
        r1 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00a6, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00a7, code lost:
    
        r2 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00a9, code lost:
    
        r2.p(r4, r15);
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00c5, code lost:
    
        r2.unlock();
        r2.t();
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00cb, code lost:
    
        throw r0;
     */
    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean replace(java.lang.Object r18, java.lang.Object r19, java.lang.Object r20) throws java.lang.Throwable {
        /*
            r17 = this;
            r3 = r18
            r0 = r19
            r3.getClass()
            r20.getClass()
            r1 = 0
            if (r0 != 0) goto Le
            return r1
        Le:
            int r6 = r17.a(r18)
            r2 = r17
            cua r2 = r2.b(r6)
            r2.lock()
            cuu r4 = r2.a     // Catch: java.lang.Throwable -> Lc4
            csm r4 = r4.q     // Catch: java.lang.Throwable -> Lc4
            long r4 = r4.a()     // Catch: java.lang.Throwable -> Lc4
            r2.s(r4)     // Catch: java.lang.Throwable -> Lc4
            java.util.concurrent.atomic.AtomicReferenceArray r10 = r2.f     // Catch: java.lang.Throwable -> Lc4
            int r7 = r10.length()     // Catch: java.lang.Throwable -> Lc4
            int r7 = r7 + (-1)
            r11 = r6 & r7
            java.lang.Object r7 = r10.get(r11)     // Catch: java.lang.Throwable -> Lc4
            cuv r7 = (defpackage.cuv) r7     // Catch: java.lang.Throwable -> Lc4
            r8 = r4
            r4 = r7
        L38:
            if (r4 == 0) goto Lbd
            java.lang.Object r5 = r4.j()     // Catch: java.lang.Throwable -> Lc4
            int r12 = r4.a()     // Catch: java.lang.Throwable -> Lc4
            if (r12 != r6) goto Lad
            if (r5 == 0) goto Lad
            cuu r12 = r2.a     // Catch: java.lang.Throwable -> Lc4
            cro r12 = r12.h     // Catch: java.lang.Throwable -> Lc4
            boolean r12 = r12.c(r3, r5)     // Catch: java.lang.Throwable -> Lc4
            if (r12 == 0) goto Lad
            r12 = r5
            r15 = r8
            r9 = r6
            r5 = r15
            cuj r8 = r4.d()     // Catch: java.lang.Throwable -> Lc4
            java.lang.Object r13 = r8.get()     // Catch: java.lang.Throwable -> Lc4
            r14 = 1
            if (r13 != 0) goto L80
            boolean r0 = r8.f()     // Catch: java.lang.Throwable -> Lc4
            if (r0 == 0) goto Lbd
            int r0 = r2.b     // Catch: java.lang.Throwable -> Lc4
            int r0 = r2.d     // Catch: java.lang.Throwable -> Lc4
            int r0 = r0 + r14
            r2.d = r0     // Catch: java.lang.Throwable -> Lc4
            r6 = r9
            int r9 = defpackage.cuw.c     // Catch: java.lang.Throwable -> Lc4
            r3 = r7
            r7 = 0
            r5 = r12
            cuv r0 = r2.y(r3, r4, r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> Lc4
            int r3 = r2.b     // Catch: java.lang.Throwable -> Lc4
            int r3 = r3 + (-1)
            r10.set(r11, r0)     // Catch: java.lang.Throwable -> Lc4
            r2.b = r3     // Catch: java.lang.Throwable -> Lc4
            goto Lbd
        L80:
            cuu r7 = r2.a     // Catch: java.lang.Throwable -> Lc4
            cro r7 = r7.i     // Catch: java.lang.Throwable -> Lc4
            boolean r0 = r7.c(r0, r13)     // Catch: java.lang.Throwable -> Lc4
            if (r0 == 0) goto La9
            int r0 = r2.d     // Catch: java.lang.Throwable -> Lc4
            int r0 = r0 + r14
            r2.d = r0     // Catch: java.lang.Throwable -> Lc4
            int r0 = r8.a()     // Catch: java.lang.Throwable -> Lc4
            int r1 = defpackage.cuw.b     // Catch: java.lang.Throwable -> Lc4
            r2.A(r3, r13, r0, r1)     // Catch: java.lang.Throwable -> Lc4
            r1 = r2
            r2 = r4
            r4 = r20
            r1.u(r2, r3, r4, r5)     // Catch: java.lang.Throwable -> La6
            r4 = r2
            r2 = r1
            r2.l(r4)     // Catch: java.lang.Throwable -> Lc4
            r1 = r14
            goto Lbd
        La6:
            r0 = move-exception
            r2 = r1
            goto Lc5
        La9:
            r2.p(r4, r5)     // Catch: java.lang.Throwable -> Lc4
            goto Lbd
        Lad:
            r15 = r8
            r9 = r6
            r5 = r15
            r3 = r7
            cuv r4 = r4.e()     // Catch: java.lang.Throwable -> Lc4
            r15 = r5
            r6 = r9
            r8 = r15
            r7 = r3
            r3 = r18
            goto L38
        Lbd:
            r2.unlock()
            r2.t()
            return r1
        Lc4:
            r0 = move-exception
        Lc5:
            r2.unlock()
            r2.t()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cuu.replace(java.lang.Object, java.lang.Object, java.lang.Object):boolean");
    }
}
