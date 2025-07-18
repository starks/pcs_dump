package defpackage;

import java.net.SocketAddress;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: PG */
/* loaded from: classes.dex */
final class eyo extends eoi {
    public static final Logger f = Logger.getLogger(eyo.class.getName());
    public final eoa g;
    public final Map h;
    public final eyj i;
    public boolean j;
    public exo k;
    public exo l;
    private final boolean m;
    private int n;
    private boolean o;
    private emh p;
    private emh q;
    private final boolean r;
    private evf s;
    private final fbc t;

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public eyo(defpackage.eoa r6) {
        /*
            r5 = this;
            r5.<init>()
            boolean r0 = h()
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L17
            int r0 = defpackage.eyu.b
            java.lang.String r0 = "GRPC_PF_USE_HAPPY_EYEBALLS"
            boolean r0 = defpackage.evt.h(r0, r2)
            if (r0 == 0) goto L17
            r0 = r1
            goto L18
        L17:
            r0 = r2
        L18:
            r5.m = r0
            java.util.HashMap r3 = new java.util.HashMap
            r3.<init>()
            r5.h = r3
            eyj r3 = new eyj
            int r4 = defpackage.cxc.d
            cxc r4 = defpackage.cyp.a
            r3.<init>(r4, r0)
            r5.i = r3
            r5.n = r2
            r5.o = r1
            r0 = 0
            r5.k = r0
            emh r2 = defpackage.emh.IDLE
            r5.p = r2
            emh r2 = defpackage.emh.IDLE
            r5.q = r2
            r5.j = r1
            fbc r1 = new fbc
            r1.<init>()
            r5.t = r1
            r5.l = r0
            boolean r0 = h()
            r5.r = r0
            r5.g = r6
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eyo.<init>(eoa):void");
    }

    static boolean h() {
        return evt.h("GRPC_SERIALIZE_RETRIES", false);
    }

    private final void i() {
        exo exoVar = this.k;
        if (exoVar != null) {
            exoVar.a();
            this.k = null;
        }
    }

    private final void j() {
        if (this.r && this.l == null) {
            if (this.s == null) {
                this.s = new evf();
            }
            long jA = this.s.a();
            this.l = this.g.c().d(new ewf(this, 15), jA, TimeUnit.NANOSECONDS, this.g.d());
        }
    }

    private final void k() {
        if (this.m) {
            exo exoVar = this.k;
            if (exoVar == null || !exoVar.b()) {
                eoa eoaVar = this.g;
                this.k = eoaVar.c().d(new ewf(this, 16), 250L, TimeUnit.MILLISECONDS, eoaVar.d());
            }
        }
    }

    private final void l(emh emhVar, eog eogVar) {
        if (emhVar == this.q && (emhVar == emh.IDLE || emhVar == emh.CONNECTING)) {
            return;
        }
        this.q = emhVar;
        this.g.f(emhVar, eogVar);
    }

    private final boolean m(cxc cxcVar) {
        HashSet<SocketAddress> hashSet = new HashSet(this.h.keySet());
        HashSet hashSet2 = new HashSet();
        for (int i = 0; i < ((cyp) cxcVar).c; i++) {
            hashSet2.addAll(((emv) cxcVar.get(i)).b);
        }
        for (SocketAddress socketAddress : hashSet) {
            if (!hashSet2.contains(socketAddress)) {
                ((eyn) this.h.remove(socketAddress)).a.d();
            }
        }
        return hashSet.isEmpty();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x000f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final java.net.SocketAddress n(defpackage.eof r3) {
        /*
            java.util.List r3 = r3.b()
            r0 = 0
            if (r3 == 0) goto Lf
            int r1 = r3.size()
            r2 = 1
            if (r1 != r2) goto Lf
            goto L10
        Lf:
            r2 = r0
        L10:
            java.lang.String r1 = "%s does not have exactly one group"
            defpackage.clq.J(r2, r1, r3)
            java.lang.Object r3 = r3.get(r0)
            emv r3 = (defpackage.emv) r3
            java.util.List r3 = r3.b
            java.lang.Object r3 = r3.get(r0)
            java.net.SocketAddress r3 = (java.net.SocketAddress) r3
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eyo.n(eof):java.net.SocketAddress");
    }

    @Override // defpackage.eoi
    public final eqo a(eoe eoeVar) {
        eyk eykVar;
        Boolean bool;
        if (this.p == emh.SHUTDOWN) {
            return eqo.i.e("Already shut down");
        }
        Boolean bool2 = (Boolean) eoeVar.b.a(e);
        this.j = bool2 == null || !bool2.booleanValue();
        List<emv> list = eoeVar.a;
        if (list.isEmpty()) {
            List list2 = eoeVar.a;
            eqo eqoVarE = eqo.l.e("NameResolver returned no usable address. addrs=" + String.valueOf(list2) + ", attrs=" + eoeVar.b.toString());
            b(eqoVarE);
            return eqoVarE;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (((emv) it.next()) == null) {
                List list3 = eoeVar.a;
                eqo eqoVarE2 = eqo.l.e("NameResolver returned address list with null endpoint. addrs=" + String.valueOf(list3) + ", attrs=" + eoeVar.b.toString());
                b(eqoVarE2);
                return eqoVarE2;
            }
        }
        this.o = true;
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        for (emv emvVar : list) {
            ArrayList arrayList2 = new ArrayList();
            for (SocketAddress socketAddress : emvVar.b) {
                if (hashSet.add(socketAddress)) {
                    arrayList2.add(socketAddress);
                }
            }
            if (!arrayList2.isEmpty()) {
                arrayList.add(new emv(arrayList2, emvVar.c));
            }
        }
        Object obj = eoeVar.c;
        if ((obj instanceof eyk) && (bool = (eykVar = (eyk) obj).a) != null && bool.booleanValue()) {
            Long l = eykVar.b;
            Collections.shuffle(arrayList, new Random());
        }
        int i = cxc.d;
        cwy cwyVar = new cwy();
        cwyVar.j(arrayList);
        cxc cxcVarG = cwyVar.g();
        emh emhVar = this.p;
        if (emhVar == emh.READY || emhVar == emh.CONNECTING) {
            eyj eyjVar = this.i;
            SocketAddress socketAddressC = eyjVar.c();
            eyjVar.e(cxcVarG);
            if (this.i.h(socketAddressC)) {
                ((eyn) this.h.get(socketAddressC)).a.f(Collections.singletonList(this.i.b()));
                m(cxcVarG);
                return eqo.b;
            }
        } else {
            this.i.e(cxcVarG);
        }
        if (m(cxcVarG)) {
            emh emhVar2 = emh.CONNECTING;
            this.p = emhVar2;
            l(emhVar2, new eyl(eoc.a));
        }
        emh emhVar3 = this.p;
        if (emhVar3 == emh.READY) {
            emh emhVar4 = emh.IDLE;
            this.p = emhVar4;
            l(emhVar4, new eym(this, this));
        } else if (emhVar3 == emh.CONNECTING || emhVar3 == emh.TRANSIENT_FAILURE) {
            i();
            d();
        }
        return eqo.b;
    }

    @Override // defpackage.eoi
    public final void b(eqo eqoVar) {
        if (this.p == emh.SHUTDOWN) {
            return;
        }
        Iterator it = this.h.values().iterator();
        while (it.hasNext()) {
            ((eyn) it.next()).a.d();
        }
        this.h.clear();
        eyj eyjVar = this.i;
        int i = cxc.d;
        eyjVar.e(cyp.a);
        emh emhVar = emh.TRANSIENT_FAILURE;
        this.p = emhVar;
        l(emhVar, new eyl(eoc.b(eqoVar)));
    }

    @Override // defpackage.eoi
    public final void d() {
        if (!this.i.g() || this.p == emh.SHUTDOWN) {
            return;
        }
        eyj eyjVar = this.i;
        Map map = this.h;
        SocketAddress socketAddressC = eyjVar.c();
        eyn eynVar = (eyn) map.get(socketAddressC);
        if (eynVar == null) {
            eyj eyjVar2 = this.i;
            if (!eyjVar2.g()) {
                throw new IllegalStateException("Index is off the end of the address group list");
            }
            Object obj = ((frj) eyjVar2.a.get(eyjVar2.b)).b;
            eyi eyiVar = new eyi(this);
            eoa eoaVar = this.g;
            epl eplVar = new epl((byte[]) null);
            int i = 1;
            emv[] emvVarArr = {new emv(socketAddressC, (elp) obj)};
            dcr.O(1, "arraySize");
            ArrayList arrayList = new ArrayList(cnx.Q(6L));
            Collections.addAll(arrayList, emvVarArr);
            eplVar.d(arrayList);
            eplVar.c(b, eyiVar);
            eplVar.c(eoi.c, Boolean.valueOf(this.r));
            eof eofVarB = eoaVar.b(eplVar.b());
            eyn eynVar2 = new eyn(eofVarB, emh.IDLE);
            eyiVar.a = eynVar2;
            this.h.put(socketAddressC, eynVar2);
            enx enxVar = ((esw) eofVarB).a;
            if (this.j || enxVar.b.a(eoi.d) == null) {
                eynVar2.d = emi.a(emh.READY);
            }
            eofVarB.e(new eyp(this, eynVar2, i));
            eynVar = eynVar2;
        }
        int iOrdinal = eynVar.b.ordinal();
        if (iOrdinal == 0) {
            k();
            return;
        }
        if (iOrdinal != 2) {
            if (iOrdinal != 3) {
                return;
            }
            eynVar.a.c();
            eynVar.b(emh.CONNECTING);
            k();
            return;
        }
        if (!this.r) {
            this.i.f();
            d();
        } else if (!this.i.g()) {
            j();
        } else {
            eynVar.a.c();
            eynVar.b(emh.CONNECTING);
        }
    }

    @Override // defpackage.eoi
    public final void e() {
        f.logp(Level.FINE, "io.grpc.internal.PickFirstLeafLoadBalancer", "shutdown", "Shutting down, currently have {} subchannels created", Integer.valueOf(this.h.size()));
        this.p = emh.SHUTDOWN;
        this.q = emh.SHUTDOWN;
        i();
        exo exoVar = this.l;
        if (exoVar != null) {
            exoVar.a();
            this.l = null;
        }
        this.s = null;
        Iterator it = this.h.values().iterator();
        while (it.hasNext()) {
            ((eyn) it.next()).a.d();
        }
        this.h.clear();
    }

    final void f(eyn eynVar, emi emiVar) {
        emh emhVar;
        if (eynVar == this.h.get(n(eynVar.a)) && (emhVar = emiVar.a) != emh.SHUTDOWN) {
            if (emhVar == emh.IDLE && eynVar.b == emh.READY) {
                this.g.e();
            }
            eynVar.b(emhVar);
            emh emhVar2 = this.p;
            emh emhVar3 = emh.TRANSIENT_FAILURE;
            if (emhVar2 == emhVar3 || this.q == emhVar3) {
                if (emhVar == emh.CONNECTING) {
                    return;
                }
                if (emhVar == emh.IDLE) {
                    d();
                    return;
                }
            }
            int iOrdinal = emhVar.ordinal();
            if (iOrdinal == 0) {
                emh emhVar4 = emh.CONNECTING;
                this.p = emhVar4;
                l(emhVar4, new eyl(eoc.a));
                return;
            }
            if (iOrdinal == 1) {
                exo exoVar = this.l;
                if (exoVar != null) {
                    exoVar.a();
                    this.l = null;
                }
                this.s = null;
                i();
                for (eyn eynVar2 : this.h.values()) {
                    if (!eynVar2.a.equals(eynVar.a)) {
                        eynVar2.a.d();
                    }
                }
                this.h.clear();
                eynVar.b(emh.READY);
                this.h.put(n(eynVar.a), eynVar);
                this.i.h(n(eynVar.a));
                this.p = emh.READY;
                g(eynVar);
                return;
            }
            if (iOrdinal != 2) {
                if (iOrdinal != 3) {
                    throw new IllegalArgumentException("Unsupported state:".concat(emhVar.toString()));
                }
                this.i.d();
                emh emhVar5 = emh.IDLE;
                this.p = emhVar5;
                l(emhVar5, new eym(this, this));
                return;
            }
            if (this.i.g() && this.h.get(this.i.c()) == eynVar) {
                if (this.i.f()) {
                    i();
                    d();
                } else if (this.h.size() >= this.i.a()) {
                    j();
                } else {
                    this.i.d();
                    d();
                }
            }
            if (this.h.size() >= this.i.a()) {
                Iterator it = this.h.values().iterator();
                while (it.hasNext()) {
                    if (!((eyn) it.next()).c) {
                        return;
                    }
                }
                emh emhVar6 = emh.TRANSIENT_FAILURE;
                this.p = emhVar6;
                l(emhVar6, new eyl(eoc.b(emiVar.b)));
                int i = this.n + 1;
                this.n = i;
                if (i >= this.i.a() || this.o) {
                    this.o = false;
                    this.n = 0;
                    this.g.e();
                }
            }
        }
    }

    public final void g(eyn eynVar) {
        if (eynVar.b != emh.READY) {
            return;
        }
        if (this.j || eynVar.a() == emh.READY) {
            l(emh.READY, new enz(eoc.c(eynVar.a)));
            return;
        }
        emh emhVarA = eynVar.a();
        emh emhVar = emh.TRANSIENT_FAILURE;
        if (emhVarA == emhVar) {
            l(emhVar, new eyl(eoc.b(eynVar.d.b)));
        } else if (this.q != emhVar) {
            l(eynVar.a(), new eyl(eoc.a));
        }
    }
}
