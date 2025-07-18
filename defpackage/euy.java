package defpackage;

import java.io.IOException;
import java.net.SocketAddress;
import java.util.LinkedHashSet;
import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class euy implements Runnable {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ euy(eva evaVar, epl eplVar, int i) {
        this.c = i;
        this.b = evaVar;
        this.a = eplVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v115, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r0v169, types: [fbj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, java.util.List] */
    @Override // java.lang.Runnable
    public final void run() throws InterruptedException, TimeoutException, BrokenBarrierException {
        exw exwVar;
        ezu ezuVar;
        ezn eznVar = null;
        switch (this.c) {
            case 0:
                epl eplVar = new epl();
                eva evaVar = (eva) this.a;
                eplVar.a = eqq.b(eqo.l.e("Unable to resolve host ".concat(String.valueOf(evaVar.a.j))).d((Throwable) this.b));
                evaVar.b.T(eplVar.a());
                return;
            case 1:
                ((eva) this.b).b.T(((epl) this.a).a());
                return;
            case 2:
                ((fuu) this.a).g();
                return;
            case 3:
                ?? r0 = this.b;
                ewk ewkVar = ((ewn) this.a).g;
                SocketAddress socketAddressB = ((ewn) this.a).g.b();
                ewkVar.a = r0;
                ewkVar.c();
                ((ewn) this.a).h = this.b;
                if (((ewn) this.a).o.a == emh.READY || ((ewn) this.a).o.a == emh.CONNECTING) {
                    Object obj = this.a;
                    int i = 0;
                    while (true) {
                        ewk ewkVar2 = ((ewn) obj).g;
                        if (i < ewkVar2.a.size()) {
                            int iIndexOf = ((emv) ewkVar2.a.get(i)).b.indexOf(socketAddressB);
                            if (iIndexOf == -1) {
                                i++;
                            } else {
                                ewkVar2.b = i;
                                ewkVar2.c = iIndexOf;
                            }
                        } else if (((ewn) this.a).o.a == emh.READY) {
                            Object obj2 = this.a;
                            exwVar = ((ewn) obj2).n;
                            ((ewn) obj2).n = null;
                            ((ewn) this.a).g.c();
                            ((ewn) this.a).b(emh.IDLE);
                        } else {
                            ((ewn) this.a).m.d(eqo.l.e("InternalSubchannel closed pending transport due to address change"));
                            ((ewn) this.a).m = null;
                            ((ewn) this.a).g.c();
                            ((ewn) this.a).h();
                        }
                    }
                    exwVar = null;
                } else {
                    exwVar = null;
                }
                if (exwVar != null) {
                    ewn ewnVar = (ewn) this.a;
                    if (ewnVar.t != null) {
                        ewnVar.j.d(eqo.l.e("InternalSubchannel closed transport early due to address change"));
                        ((ewn) this.a).t.a();
                        ewn ewnVar2 = (ewn) this.a;
                        ewnVar2.t = null;
                        ewnVar2.j = null;
                    }
                    ewn ewnVar3 = (ewn) this.a;
                    ewnVar3.j = exwVar;
                    ewnVar3.t = ewnVar3.f.d(new ewf(this, 0), 5L, TimeUnit.SECONDS, ((ewn) this.a).a);
                    return;
                }
                return;
            case 4:
                if (((ewn) this.b).o.a == emh.SHUTDOWN) {
                    return;
                }
                ewn ewnVar4 = (ewn) this.b;
                ewnVar4.p = (eqo) this.a;
                Object obj3 = this.b;
                exw exwVar2 = ewnVar4.n;
                ewn ewnVar5 = (ewn) obj3;
                eui euiVar = ewnVar5.m;
                ewnVar5.n = null;
                ((ewn) this.b).m = null;
                ((ewn) this.b).b(emh.SHUTDOWN);
                ((ewn) this.b).g.c();
                if (((ewn) this.b).k.isEmpty()) {
                    ((ewn) this.b).e();
                }
                ewn ewnVar6 = (ewn) this.b;
                ewnVar6.f.c();
                exo exoVar = ewnVar6.s;
                if (exoVar != null) {
                    exoVar.a();
                    ewnVar6.s = null;
                    ewnVar6.r = null;
                }
                exo exoVar2 = ((ewn) this.b).t;
                if (exoVar2 != null) {
                    exoVar2.a();
                    ((ewn) this.b).j.d((eqo) this.a);
                    ewn ewnVar7 = (ewn) this.b;
                    ewnVar7.t = null;
                    ewnVar7.j = null;
                }
                if (exwVar2 != null) {
                    exwVar2.d((eqo) this.a);
                }
                if (euiVar != null) {
                    euiVar.d((eqo) this.a);
                    return;
                }
                return;
            case 5:
                if (((ewl) this.b).c.o.a == emh.SHUTDOWN) {
                    return;
                }
                Object obj4 = this.b;
                ewl ewlVar = (ewl) obj4;
                eui euiVar2 = ewlVar.a;
                if (((ewl) obj4).c.n == euiVar2) {
                    ewlVar.c.n = null;
                    ((ewl) this.b).c.g.c();
                    ((ewl) this.b).c.b(emh.IDLE);
                    return;
                }
                ewn ewnVar8 = ewlVar.c;
                if (ewnVar8.m == euiVar2) {
                    clq.J(ewnVar8.o.a == emh.CONNECTING, "Expected state is CONNECTING, actual state is %s", ((ewl) this.b).c.o.a);
                    ewk ewkVar3 = ((ewl) this.b).c.g;
                    emv emvVar = (emv) ewkVar3.a.get(ewkVar3.b);
                    int i2 = ewkVar3.c + 1;
                    ewkVar3.c = i2;
                    if (i2 >= emvVar.b.size()) {
                        ewkVar3.b++;
                        ewkVar3.c = 0;
                    }
                    ewk ewkVar4 = ((ewl) this.b).c.g;
                    if (ewkVar4.b < ewkVar4.a.size()) {
                        ((ewl) this.b).c.h();
                        return;
                    }
                    ((ewl) this.b).c.m = null;
                    ((ewl) this.b).c.g.c();
                    Object obj5 = this.b;
                    Object obj6 = this.a;
                    ewn ewnVar9 = ((ewl) obj5).c;
                    ewnVar9.f.c();
                    eqo eqoVar = (eqo) obj6;
                    clq.w(!eqoVar.g(), "The error status must not be OK");
                    ewnVar9.d(new emi(emh.TRANSIENT_FAILURE, eqoVar));
                    if (ewnVar9.d) {
                        return;
                    }
                    if (ewnVar9.r == null) {
                        ewnVar9.r = new evf();
                    }
                    long jA = ewnVar9.r.a() - ewnVar9.i.a(TimeUnit.NANOSECONDS);
                    ewnVar9.c.b(2, "TRANSIENT_FAILURE ({0}). Will reconnect after {1} ns", ewn.k(eqoVar), Long.valueOf(jA));
                    clq.G(ewnVar9.s == null, "previous reconnectTask is not done");
                    ewnVar9.s = ewnVar9.f.d(new chg(ewnVar9, 20, null), jA, TimeUnit.NANOSECONDS, ewnVar9.a);
                    return;
                }
                return;
            case 6:
                ((exe) this.b).h((eqo) this.a);
                return;
            case 7:
                if (((exi) this.b).a.get() != exm.e) {
                    ((exh) this.a).j();
                    return;
                }
                exm exmVar = ((exi) this.b).c;
                if (exmVar.w == null) {
                    exmVar.w = new LinkedHashSet();
                    exm exmVar2 = ((exi) this.b).c;
                    exmVar2.Q.c(exmVar2.x, true);
                }
                ((exi) this.b).c.w.add(this.a);
                return;
            case 8:
                this.b.run();
                Object obj7 = this.a;
                ((exh) obj7).f.c.m.execute(new ewf(obj7, 13));
                return;
            case 9:
                synchronized (((ezv) ((ckp) this.a).b).m) {
                    Object obj8 = this.a;
                    if (((ezn) ((ckp) obj8).a).b) {
                        z = true;
                    } else {
                        Object obj9 = ((ckp) obj8).b;
                        ((ezv) obj9).r = ((ezv) obj9).r.a((ezt) this.b);
                        Object obj10 = ((ckp) this.a).b;
                        if (((ezv) obj10).w(((ezv) obj10).r) && ((ezuVar = ((ezv) ((ckp) this.a).b).p) == null || ezuVar.a())) {
                            Object obj11 = ((ckp) this.a).b;
                            eznVar = new ezn(((ezv) obj11).m);
                            ((ezv) obj11).y = eznVar;
                        } else {
                            Object obj12 = ((ckp) this.a).b;
                            ((ezv) obj12).r = ((ezv) obj12).r.b();
                            ((ezv) ((ckp) this.a).b).y = null;
                        }
                    }
                }
                if (z) {
                    Object obj13 = this.b;
                    ((ezt) obj13).a.p(new ezs((ezv) ((ckp) this.a).b, (ezt) obj13));
                    ((ezt) this.b).a.d(eqo.c.e("Unneeded hedging"));
                    return;
                } else {
                    if (eznVar != null) {
                        Object obj14 = ((ckp) this.a).b;
                        ckp ckpVar = new ckp(obj14, eznVar, 2);
                        ezv ezvVar = (ezv) obj14;
                        eznVar.b(ezvVar.i.schedule(ckpVar, ezvVar.k.b, TimeUnit.NANOSECONDS));
                    }
                    ((ezv) ((ckp) this.a).b).s((ezt) this.b);
                    return;
                }
            case 10:
                ((ezs) this.b).b.w.c((epc) this.a);
                return;
            case 11:
                ((ezs) ((n) this.a).a).b.s((ezt) this.b);
                return;
            case 12:
                ((ezs) this.a).b.s((ezt) this.b);
                return;
            case 13:
                ((ezs) this.a).b.w.d(this.b);
                return;
            default:
                try {
                    try {
                        ((CyclicBarrier) this.b).await(1000L, TimeUnit.MILLISECONDS);
                        ((CountDownLatch) this.a).await();
                        return;
                    } catch (BrokenBarrierException | TimeoutException unused) {
                        return;
                    }
                } catch (InterruptedException unused2) {
                    Thread.currentThread().interrupt();
                    return;
                }
        }
    }

    public /* synthetic */ euy(eva evaVar, IOException iOException, int i) {
        this.c = i;
        this.a = evaVar;
        this.b = iOException;
    }

    public euy(fuu fuuVar, Throwable th, int i) {
        this.c = i;
        this.a = fuuVar;
        this.b = th;
    }

    public euy(Object obj, Object obj2, int i) {
        this.c = i;
        this.b = obj2;
        this.a = obj;
    }

    public euy(Object obj, Object obj2, int i, byte[] bArr) {
        this.c = i;
        this.a = obj2;
        this.b = obj;
    }

    public euy(CyclicBarrier cyclicBarrier, CountDownLatch countDownLatch, int i) {
        this.c = i;
        this.b = cyclicBarrier;
        this.a = countDownLatch;
    }
}
