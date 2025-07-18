package defpackage;

import j$.util.DesugarCollections;
import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ezs implements ety {
    final ezt a;
    public final /* synthetic */ ezv b;

    public ezs(ezv ezvVar, ezt eztVar) {
        this.b = ezvVar;
        this.a = eztVar;
    }

    private static final Integer b(epc epcVar) {
        String str = (String) epcVar.b(ezv.b);
        if (str == null) {
            return null;
        }
        try {
            return Integer.valueOf(str);
        } catch (NumberFormatException unused) {
            return -1;
        }
    }

    @Override // defpackage.ety
    public final void a(eqo eqoVar, etx etxVar, epc epcVar) {
        boolean z;
        ezp ezpVar;
        ezn eznVar;
        synchronized (this.b.m) {
            ezv ezvVar = this.b;
            ezr ezrVar = ezvVar.r;
            ezt eztVar = this.a;
            eztVar.b = true;
            if (ezrVar.c.contains(eztVar)) {
                ArrayList arrayList = new ArrayList(ezrVar.c);
                arrayList.remove(eztVar);
                ezrVar = new ezr(ezrVar.b, DesugarCollections.unmodifiableCollection(arrayList), ezrVar.d, ezrVar.f, ezrVar.g, ezrVar.a, ezrVar.h, ezrVar.e);
            }
            ezvVar.r = ezrVar;
            this.b.q.a(eqoVar.o);
        }
        if (this.b.u.decrementAndGet() == Integer.MIN_VALUE) {
            this.b.h.execute(new ezk(this, 2));
            return;
        }
        ezt eztVar2 = this.a;
        if (eztVar2.c) {
            this.b.q(eztVar2);
            if (this.b.r.f == this.a) {
                this.b.v(eqoVar, etxVar, epcVar);
                return;
            }
            return;
        }
        if (etxVar == etx.MISCARRIED && this.b.t.incrementAndGet() > 1000) {
            this.b.q(this.a);
            if (this.b.r.f == this.a) {
                this.b.v(eqo.k.e("Too many transparent retries. Might be a bug in gRPC").d(new eqr(eqoVar)), etxVar, epcVar);
                return;
            }
            return;
        }
        if (this.b.r.f == null) {
            if (etxVar == etx.MISCARRIED || (etxVar == etx.REFUSED && this.b.s.compareAndSet(false, true))) {
                ezt eztVarA = this.b.a(this.a.d, true);
                if (eztVarA != null) {
                    ezv ezvVar2 = this.b;
                    if (ezvVar2.l) {
                        synchronized (ezvVar2.m) {
                            ezv ezvVar3 = this.b;
                            ezr ezrVar2 = ezvVar3.r;
                            ezt eztVar3 = this.a;
                            ArrayList arrayList2 = new ArrayList(ezrVar2.d);
                            arrayList2.remove(eztVar3);
                            arrayList2.add(eztVarA);
                            ezvVar3.r = new ezr(ezrVar2.b, ezrVar2.c, DesugarCollections.unmodifiableCollection(arrayList2), ezrVar2.f, ezrVar2.g, ezrVar2.a, ezrVar2.h, ezrVar2.e);
                        }
                    }
                    this.b.g.execute(new euy(this, eztVarA, 12));
                    return;
                }
                return;
            }
            if (etxVar == etx.DROPPED) {
                ezv ezvVar4 = this.b;
                if (ezvVar4.l) {
                    ezvVar4.u();
                }
            } else {
                this.b.s.set(true);
                ezv ezvVar5 = this.b;
                if (ezvVar5.l) {
                    Integer numB = b(epcVar);
                    boolean zContains = this.b.k.c.contains(eqoVar.o);
                    boolean z2 = (this.b.p == null || (!zContains && (numB == null || numB.intValue() >= 0))) ? false : !this.b.p.b();
                    if (zContains && !z2 && !eqoVar.g() && numB != null && numB.intValue() > 0) {
                        numB = 0;
                    }
                    ezo ezoVar = new ezo(zContains && !z2, numB);
                    if (ezoVar.a) {
                        ezv ezvVar6 = this.b;
                        Object obj = ezoVar.b;
                        if (obj != null) {
                            if (((Integer) obj).intValue() < 0) {
                                ezvVar6.u();
                            } else {
                                synchronized (ezvVar6.m) {
                                    ezn eznVar2 = ezvVar6.y;
                                    if (eznVar2 != null) {
                                        Future futureA = eznVar2.a();
                                        ezn eznVar3 = new ezn(ezvVar6.m);
                                        ezvVar6.y = eznVar3;
                                        if (futureA != null) {
                                            futureA.cancel(false);
                                        }
                                        eznVar3.b(ezvVar6.i.schedule(new ckp(ezvVar6, eznVar3, 2), r7.intValue(), TimeUnit.MILLISECONDS));
                                    }
                                }
                            }
                        }
                    }
                    synchronized (this.b.m) {
                        ezv ezvVar7 = this.b;
                        ezr ezrVar3 = ezvVar7.r;
                        ezt eztVar4 = this.a;
                        ArrayList arrayList3 = new ArrayList(ezrVar3.d);
                        arrayList3.remove(eztVar4);
                        ezvVar7.r = new ezr(ezrVar3.b, ezrVar3.c, DesugarCollections.unmodifiableCollection(arrayList3), ezrVar3.f, ezrVar3.g, ezrVar3.a, ezrVar3.h, ezrVar3.e);
                        if (ezoVar.a) {
                            ezv ezvVar8 = this.b;
                            if (ezvVar8.w(ezvVar8.r) || !this.b.r.d.isEmpty()) {
                                return;
                            }
                        }
                    }
                } else {
                    ezw ezwVar = ezvVar5.j;
                    long nanos = 0;
                    if (ezwVar == null) {
                        ezpVar = new ezp(false, 0L);
                    } else {
                        boolean zContains2 = ezwVar.f.contains(eqoVar.o);
                        Integer numB2 = b(epcVar);
                        boolean z3 = (this.b.p == null || (!zContains2 && (numB2 == null || numB2.intValue() >= 0))) ? false : !this.b.p.b();
                        ezv ezvVar9 = this.b;
                        if (ezvVar9.j.a <= this.a.d + 1 || z3) {
                            z = false;
                            ezpVar = new ezp(z, nanos);
                        } else {
                            if (numB2 == null) {
                                if (zContains2) {
                                    long j = ezvVar9.z;
                                    double dNextDouble = ezv.e ? (ezv.d.nextDouble() * 0.8d) + 0.4d : ezv.d.nextDouble();
                                    ezv ezvVar10 = this.b;
                                    double d = ezvVar10.z;
                                    ezw ezwVar2 = ezvVar10.j;
                                    ezvVar10.z = Math.min((long) (d * ezwVar2.d), ezwVar2.c);
                                    nanos = (long) (j * dNextDouble);
                                    z = true;
                                }
                                z = false;
                            } else {
                                if (numB2.intValue() >= 0) {
                                    nanos = TimeUnit.MILLISECONDS.toNanos(numB2.intValue());
                                    ezv ezvVar11 = this.b;
                                    ezvVar11.z = ezvVar11.j.b;
                                    z = true;
                                }
                                z = false;
                            }
                            ezpVar = new ezp(z, nanos);
                        }
                    }
                    if (ezpVar.a) {
                        ezt eztVarA2 = this.b.a(this.a.d + 1, false);
                        if (eztVarA2 != null) {
                            synchronized (this.b.m) {
                                ezv ezvVar12 = this.b;
                                eznVar = new ezn(ezvVar12.m);
                                ezvVar12.x = eznVar;
                            }
                            eznVar.b(this.b.i.schedule(new n(this, eznVar, eztVarA2, 11), ezpVar.b, TimeUnit.NANOSECONDS));
                            return;
                        }
                        return;
                    }
                }
            }
        }
        this.b.q(this.a);
        if (this.b.r.f == this.a) {
            this.b.v(eqoVar, etxVar, epcVar);
        }
    }

    @Override // defpackage.ety
    public final void c(epc epcVar) {
        int i;
        int i2;
        if (this.a.d > 0) {
            epcVar.d(ezv.a);
            epcVar.f(ezv.a, String.valueOf(this.a.d));
        }
        this.b.q(this.a);
        if (this.b.r.f == this.a) {
            ezu ezuVar = this.b.p;
            if (ezuVar != null) {
                do {
                    AtomicInteger atomicInteger = ezuVar.d;
                    i = ezuVar.a;
                    i2 = atomicInteger.get();
                    if (i2 == i) {
                        break;
                    }
                } while (!ezuVar.d.compareAndSet(i2, Math.min(ezuVar.c + i2, i)));
            }
            ezv ezvVar = this.b;
            ezvVar.h.execute(new euy(this, epcVar, 10, null));
        }
    }

    @Override // defpackage.fbk
    public final void d(fbj fbjVar) throws IOException {
        ezr ezrVar = this.b.r;
        clq.G(ezrVar.f != null, "Headers should be received prior to messages.");
        if (ezrVar.f != this.a) {
            evt.f(fbjVar);
        } else {
            this.b.h.execute(new euy(this, fbjVar, 13));
        }
    }

    @Override // defpackage.fbk
    public final void e() {
        if (this.b.l()) {
            ezv ezvVar = this.b;
            ezvVar.h.execute(new ezk(this, 3));
        }
    }
}
