package defpackage;

import j$.util.DesugarCollections;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ezv implements etw {
    static final eox a = eox.c("grpc-previous-rpc-attempts", epc.b);
    static final eox b = eox.c("grpc-retry-pushback-ms", epc.b);
    public static final eqo c = eqo.c.e("Stream thrown away because RetriableStream committed");
    public static final Random d = new Random();
    public static final boolean e = evt.h("GRPC_EXPERIMENTAL_XDS_RLS_LB", true);
    public boolean A;
    final /* synthetic */ epg B;
    final /* synthetic */ elt C;
    final /* synthetic */ emr D;
    final /* synthetic */ ewx E;
    public fcy F;
    public final fsc G;
    private final epc H;
    private eqo I;
    public final epg f;
    public final Executor g;
    public final Executor h;
    public final ScheduledExecutorService i;
    public final ezw j;
    public final evu k;
    public final boolean l;
    public final Object m;
    public final long n;
    public final long o;
    public final ezu p;
    public final ewa q;
    public volatile ezr r;
    public final AtomicBoolean s;
    public final AtomicInteger t;
    public final AtomicInteger u;
    public long v;
    public ety w;
    public ezn x;
    public ezn y;
    public long z;

    /* JADX WARN: Illegal instructions before constructor call */
    public ezv(ewx ewxVar, epg epgVar, epc epcVar, elt eltVar, ezw ezwVar, evu evuVar, emr emrVar) {
        this.B = epgVar;
        this.C = eltVar;
        this.D = emrVar;
        this.E = ewxVar;
        exm exmVar = ewxVar.b;
        this(epgVar, epcVar, exmVar.T, exmVar.N, exmVar.O, exmVar.e(eltVar), ewxVar.b.i.b(), ezwVar, evuVar, ewxVar.a);
    }

    public final etw A(epc epcVar, ebz ebzVar, int i, boolean z) {
        elt eltVar = this.C;
        ArrayList arrayList = new ArrayList(eltVar.d.size() + 1);
        arrayList.addAll(eltVar.d);
        arrayList.add(ebzVar);
        elr elrVarA = elt.a(eltVar);
        elrVarA.d = DesugarCollections.unmodifiableList(arrayList);
        elt eltVar2 = new elt(elrVarA);
        emb[] embVarArrI = evt.i(eltVar2, epcVar, i, z);
        emr emrVarA = this.D.a();
        try {
            return this.E.b.y.a(this.B, epcVar, eltVar2, embVarArrI);
        } finally {
            this.D.f(emrVarA);
        }
    }

    @Override // defpackage.etw
    public final elp B() {
        throw null;
    }

    public final ezt a(int i, boolean z) {
        int i2;
        do {
            i2 = this.u.get();
            if (i2 < 0) {
                return null;
            }
        } while (!this.u.compareAndSet(i2, i2 + 1));
        ezt eztVar = new ezt(i);
        ezj ezjVar = new ezj(new ezm(this, eztVar));
        epc epcVar = this.H;
        epc epcVar2 = new epc();
        epcVar2.e(epcVar);
        if (i > 0) {
            epcVar2.f(a, String.valueOf(i));
        }
        eztVar.a = A(epcVar2, ezjVar, i, z);
        return eztVar;
    }

    public final Runnable b(ezt eztVar) {
        List list;
        Collection collectionSingleton;
        boolean z;
        Future future;
        Future future2;
        synchronized (this.m) {
            if (this.r.f != null) {
                return null;
            }
            Collection collection = this.r.c;
            ezr ezrVar = this.r;
            clq.G(ezrVar.f == null, "Already committed");
            List list2 = ezrVar.b;
            if (ezrVar.c.contains(eztVar)) {
                list = null;
                collectionSingleton = Collections.singleton(eztVar);
                z = true;
            } else {
                list = list2;
                collectionSingleton = Collections.EMPTY_LIST;
                z = false;
            }
            this.r = new ezr(list, collectionSingleton, ezrVar.d, eztVar, ezrVar.g, z, ezrVar.h, ezrVar.e);
            this.G.m(-this.v);
            ezn eznVar = this.x;
            boolean z2 = eznVar != null ? eznVar.b : false;
            if (eznVar != null) {
                Future futureA = eznVar.a();
                this.x = null;
                future = futureA;
            } else {
                future = null;
            }
            ezn eznVar2 = this.y;
            if (eznVar2 != null) {
                Future futureA2 = eznVar2.a();
                this.y = null;
                future2 = futureA2;
            } else {
                future2 = null;
            }
            return new eze(this, collection, eztVar, future, z2, future2);
        }
    }

    @Override // defpackage.etw
    public final void c(ewa ewaVar) {
        ezr ezrVar;
        synchronized (this.m) {
            ewaVar.b("closed", this.q);
            ezrVar = this.r;
        }
        if (ezrVar.f != null) {
            ewa ewaVar2 = new ewa();
            ezrVar.f.a.c(ewaVar2);
            ewaVar.b("committed", ewaVar2);
            return;
        }
        ewa ewaVar3 = new ewa();
        for (ezt eztVar : ezrVar.c) {
            ewa ewaVar4 = new ewa();
            eztVar.a.c(ewaVar4);
            ewaVar3.a(ewaVar4);
        }
        ewaVar.b("open", ewaVar3);
    }

    @Override // defpackage.etw
    public final void d(eqo eqoVar) {
        ezt eztVar;
        ezt eztVar2 = new ezt(0);
        eztVar2.a = new eyf();
        Runnable runnableB = b(eztVar2);
        if (runnableB != null) {
            synchronized (this.m) {
                this.r = this.r.c(eztVar2);
            }
            runnableB.run();
            v(eqoVar, etx.PROCESSED, new epc());
            return;
        }
        synchronized (this.m) {
            if (this.r.c.contains(this.r.f)) {
                eztVar = this.r.f;
            } else {
                this.I = eqoVar;
                eztVar = null;
            }
            ezr ezrVar = this.r;
            this.r = new ezr(ezrVar.b, ezrVar.c, ezrVar.d, ezrVar.f, true, ezrVar.a, ezrVar.h, ezrVar.e);
        }
        if (eztVar != null) {
            eztVar.a.d(eqoVar);
        }
    }

    @Override // defpackage.etw
    public final void e() {
        r(new ezg(0));
    }

    @Override // defpackage.fbi
    public final void f() {
        ezr ezrVar = this.r;
        if (ezrVar.a) {
            ezrVar.f.a.f();
        } else {
            r(new ezg(1));
        }
    }

    @Override // defpackage.fbi
    public final void g() {
        r(new ezg(2));
    }

    @Override // defpackage.fbi
    public final void h(int i) {
        ezr ezrVar = this.r;
        if (ezrVar.a) {
            ezrVar.f.a.h(i);
        } else {
            r(new ezh(i, 2));
        }
    }

    @Override // defpackage.fbi
    public final void i(eme emeVar) {
        r(new ezf(emeVar, 1));
    }

    @Override // defpackage.etw
    public final void j(ems emsVar) {
        r(new ezf(emsVar, 0));
    }

    @Override // defpackage.fbi
    public final void k(InputStream inputStream) {
        throw new IllegalStateException("RetriableStream.writeMessage() should not be called directly");
    }

    @Override // defpackage.fbi
    public final boolean l() {
        Iterator it = this.r.c.iterator();
        while (it.hasNext()) {
            if (((ezt) it.next()).a.l()) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.etw
    public final void m(emu emuVar) {
        r(new ezf(emuVar, 2));
    }

    @Override // defpackage.etw
    public final void n(int i) {
        r(new ezh(i, 1));
    }

    @Override // defpackage.etw
    public final void o(int i) {
        r(new ezh(i, 0));
    }

    @Override // defpackage.etw
    public final void p(ety etyVar) {
        ezn eznVar;
        ezu ezuVar;
        this.w = etyVar;
        eqo eqoVarX = x();
        if (eqoVarX != null) {
            d(eqoVarX);
            return;
        }
        synchronized (this.m) {
            this.r.b.add(new ezq(this));
        }
        ezt eztVarA = a(0, false);
        if (eztVarA == null) {
            return;
        }
        if (this.l) {
            synchronized (this.m) {
                this.r = this.r.a(eztVarA);
                eznVar = null;
                if (w(this.r) && ((ezuVar = this.p) == null || ezuVar.a())) {
                    eznVar = new ezn(this.m);
                    this.y = eznVar;
                }
            }
            if (eznVar != null) {
                eznVar.b(this.i.schedule(new ckp(this, eznVar, 2), this.k.b, TimeUnit.NANOSECONDS));
            }
        }
        s(eztVarA);
    }

    public final void q(ezt eztVar) {
        Runnable runnableB = b(eztVar);
        if (runnableB != null) {
            this.g.execute(runnableB);
        }
    }

    public final void r(ezl ezlVar) {
        Collection collection;
        synchronized (this.m) {
            if (!this.r.a) {
                this.r.b.add(ezlVar);
            }
            collection = this.r.c;
        }
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            ezlVar.a((ezt) it.next());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0034, code lost:
    
        if (r1 == null) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0036, code lost:
    
        r9.h.execute(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x003b, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x003c, code lost:
    
        if (r4 != false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x003e, code lost:
    
        r10.a.p(new defpackage.ezs(r9, r10));
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0048, code lost:
    
        r0 = r10.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x004e, code lost:
    
        if (r9.r.f != r10) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0050, code lost:
    
        r9 = r9.I;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0053, code lost:
    
        r9 = defpackage.ezv.c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0055, code lost:
    
        r0.d(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0058, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0086, code lost:
    
        r2 = r3.size();
        r5 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x008b, code lost:
    
        if (r5 >= r2) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x008d, code lost:
    
        r6 = (defpackage.ezl) r3.get(r5);
        r6.a(r10);
        r4 = r4 | (r6 instanceof defpackage.ezq);
        r6 = r9.r;
        r8 = r6.f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x009d, code lost:
    
        if (r8 == null) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x009f, code lost:
    
        if (r8 != r10) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00a1, code lost:
    
        r5 = r5 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00a5, code lost:
    
        if (r6.g == false) goto L61;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void s(defpackage.ezt r10) {
        /*
            r9 = this;
            r0 = 0
            r1 = 0
            r2 = r0
            r4 = r2
            r3 = r1
        L5:
            java.lang.Object r5 = r9.m
            monitor-enter(r5)
            ezr r6 = r9.r     // Catch: java.lang.Throwable -> Laa
            ezt r7 = r6.f     // Catch: java.lang.Throwable -> Laa
            if (r7 == 0) goto L12
            if (r7 == r10) goto L12
            monitor-exit(r5)     // Catch: java.lang.Throwable -> Laa
            goto L34
        L12:
            boolean r7 = r6.g     // Catch: java.lang.Throwable -> Laa
            if (r7 == 0) goto L18
            monitor-exit(r5)     // Catch: java.lang.Throwable -> Laa
            goto L34
        L18:
            java.util.List r7 = r6.b     // Catch: java.lang.Throwable -> Laa
            int r7 = r7.size()     // Catch: java.lang.Throwable -> Laa
            if (r2 != r7) goto L59
            ezr r1 = r6.c(r10)     // Catch: java.lang.Throwable -> Laa
            r9.r = r1     // Catch: java.lang.Throwable -> Laa
            boolean r1 = r9.l()     // Catch: java.lang.Throwable -> Laa
            if (r1 != 0) goto L2e
            monitor-exit(r5)     // Catch: java.lang.Throwable -> Laa
            return
        L2e:
            ezk r1 = new ezk     // Catch: java.lang.Throwable -> Laa
            r1.<init>(r9, r0)     // Catch: java.lang.Throwable -> Laa
            monitor-exit(r5)     // Catch: java.lang.Throwable -> Laa
        L34:
            if (r1 == 0) goto L3c
            java.util.concurrent.Executor r9 = r9.h
            r9.execute(r1)
            return
        L3c:
            if (r4 != 0) goto L48
            etw r0 = r10.a
            ezs r1 = new ezs
            r1.<init>(r9, r10)
            r0.p(r1)
        L48:
            etw r0 = r10.a
            ezr r1 = r9.r
            ezt r1 = r1.f
            if (r1 != r10) goto L53
            eqo r9 = r9.I
            goto L55
        L53:
            eqo r9 = defpackage.ezv.c
        L55:
            r0.d(r9)
            return
        L59:
            boolean r7 = r10.b     // Catch: java.lang.Throwable -> Laa
            if (r7 == 0) goto L5f
            monitor-exit(r5)     // Catch: java.lang.Throwable -> Laa
            return
        L5f:
            int r7 = r2 + 128
            java.util.List r8 = r6.b     // Catch: java.lang.Throwable -> Laa
            int r8 = r8.size()     // Catch: java.lang.Throwable -> Laa
            int r7 = java.lang.Math.min(r7, r8)     // Catch: java.lang.Throwable -> Laa
            if (r3 != 0) goto L79
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch: java.lang.Throwable -> Laa
            java.util.List r6 = r6.b     // Catch: java.lang.Throwable -> Laa
            java.util.List r2 = r6.subList(r2, r7)     // Catch: java.lang.Throwable -> Laa
            r3.<init>(r2)     // Catch: java.lang.Throwable -> Laa
            goto L85
        L79:
            r3.clear()     // Catch: java.lang.Throwable -> Laa
            java.util.List r6 = r6.b     // Catch: java.lang.Throwable -> Laa
            java.util.List r2 = r6.subList(r2, r7)     // Catch: java.lang.Throwable -> Laa
            r3.addAll(r2)     // Catch: java.lang.Throwable -> Laa
        L85:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> Laa
            int r2 = r3.size()
            r5 = r0
        L8b:
            if (r5 >= r2) goto La7
            java.lang.Object r6 = r3.get(r5)
            ezl r6 = (defpackage.ezl) r6
            r6.a(r10)
            boolean r6 = r6 instanceof defpackage.ezq
            r4 = r4 | r6
            ezr r6 = r9.r
            ezt r8 = r6.f
            if (r8 == 0) goto La1
            if (r8 != r10) goto La7
        La1:
            boolean r6 = r6.g
            int r5 = r5 + 1
            if (r6 == 0) goto L8b
        La7:
            r2 = r7
            goto L5
        Laa:
            r9 = move-exception
            monitor-exit(r5)     // Catch: java.lang.Throwable -> Laa
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ezv.s(ezt):void");
    }

    public final void u() {
        Future future;
        synchronized (this.m) {
            ezn eznVar = this.y;
            future = null;
            if (eznVar != null) {
                Future futureA = eznVar.a();
                this.y = null;
                future = futureA;
            }
            this.r = this.r.b();
        }
        if (future != null) {
            future.cancel(false);
        }
    }

    public final void v(eqo eqoVar, etx etxVar, epc epcVar) {
        this.F = new fcy(eqoVar, etxVar, epcVar);
        if (this.u.addAndGet(Integer.MIN_VALUE) == Integer.MIN_VALUE) {
            this.h.execute(new bsk(this, eqoVar, etxVar, epcVar, 5));
        }
    }

    public final boolean w(ezr ezrVar) {
        return ezrVar.f == null && ezrVar.e < this.k.a && !ezrVar.h;
    }

    public final eqo x() {
        exl exlVar = this.E.b.z;
        synchronized (exlVar.a) {
            eqo eqoVar = exlVar.c;
            if (eqoVar != null) {
                return eqoVar;
            }
            exlVar.b.add(this);
            return null;
        }
    }

    public final void y() {
        eqo eqoVar;
        exl exlVar = this.E.b.z;
        synchronized (exlVar.a) {
            exlVar.b.remove(this);
            if (exlVar.b.isEmpty()) {
                eqoVar = exlVar.c;
                exlVar.b = new HashSet();
            } else {
                eqoVar = null;
            }
        }
        if (eqoVar != null) {
            exlVar.d.y.d(eqoVar);
        }
    }

    public ezv(epg epgVar, epc epcVar, fsc fscVar, long j, long j2, Executor executor, ScheduledExecutorService scheduledExecutorService, ezw ezwVar, evu evuVar, ezu ezuVar) {
        this.h = new equ(new ezd());
        this.m = new Object();
        this.q = new ewa();
        this.r = new ezr(new ArrayList(8), Collections.EMPTY_LIST, null, null, false, false, false, 0);
        this.s = new AtomicBoolean();
        this.t = new AtomicInteger();
        this.u = new AtomicInteger();
        this.f = epgVar;
        this.G = fscVar;
        this.n = j;
        this.o = j2;
        this.g = executor;
        this.i = scheduledExecutorService;
        this.H = epcVar;
        this.j = ezwVar;
        if (ezwVar != null) {
            this.z = ezwVar.b;
        }
        this.k = evuVar;
        clq.w(ezwVar == null || evuVar == null, "Should not provide both retryPolicy and hedgingPolicy");
        this.l = evuVar != null;
        this.p = ezuVar;
    }
}
