package defpackage;

import j$.util.DesugarCollections;
import java.net.SocketAddress;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ewn implements enn {
    public final ScheduledExecutorService a;
    public final enl b;
    public final elv c;
    public final boolean d;
    public final List e;
    public final equ f;
    public final ewk g;
    public volatile List h;
    public final csf i;
    public exw j;
    public eui m;
    public volatile exw n;
    public eqo p;
    public volatile elp q;
    public evf r;
    public exo s;
    public exo t;
    public final fbc u;
    private final eno v;
    private final String w;
    private final eub x;
    private final etl y;
    private final fbc z;
    public final Collection k = new ArrayList();
    public final evz l = new ewe(this);
    public volatile emi o = emi.a(emh.IDLE);

    public ewn(enx enxVar, String str, fbc fbcVar, eub eubVar, ScheduledExecutorService scheduledExecutorService, csg csgVar, equ equVar, fbc fbcVar2, enl enlVar, etl etlVar, eno enoVar, elv elvVar, List list) {
        Object obj;
        List list2 = enxVar.a;
        clq.w(!list2.isEmpty(), "addressGroups is empty");
        j(list2);
        List listUnmodifiableList = DesugarCollections.unmodifiableList(new ArrayList(list2));
        this.h = listUnmodifiableList;
        this.g = new ewk(listUnmodifiableList);
        this.w = str;
        this.z = fbcVar;
        this.x = eubVar;
        this.a = scheduledExecutorService;
        this.i = (csf) csgVar.a();
        this.f = equVar;
        this.u = fbcVar2;
        this.b = enlVar;
        this.y = etlVar;
        this.v = enoVar;
        this.c = elvVar;
        this.e = list;
        enw enwVar = eoi.c;
        int i = 0;
        while (true) {
            Object[][] objArr = enxVar.c;
            if (i >= objArr.length) {
                obj = enwVar.a;
                break;
            } else {
                if (enwVar.equals(objArr[i][0])) {
                    obj = enxVar.c[i][1];
                    break;
                }
                i++;
            }
        }
        this.d = ((Boolean) obj).booleanValue();
    }

    public static void j(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            it.next().getClass();
        }
    }

    public static final String k(eqo eqoVar) {
        StringBuilder sb = new StringBuilder();
        sb.append(eqoVar.o);
        if (eqoVar.p != null) {
            sb.append("(");
            sb.append(eqoVar.p);
            sb.append(")");
        }
        if (eqoVar.q != null) {
            sb.append("[");
            sb.append(eqoVar.q);
            sb.append("]");
        }
        return sb.toString();
    }

    public final etz a() {
        exw exwVar = this.n;
        if (exwVar != null) {
            return exwVar;
        }
        this.f.execute(new ewf(this, 1));
        return null;
    }

    public final void b(emh emhVar) {
        this.f.c();
        d(emi.a(emhVar));
    }

    @Override // defpackage.enu
    public final eno c() {
        return this.v;
    }

    public final void d(emi emiVar) {
        this.f.c();
        if (this.o.a != emiVar.a) {
            clq.G(this.o.a != emh.SHUTDOWN, "Cannot transition out of SHUTDOWN to ".concat(emiVar.toString()));
            if (this.d && emiVar.a == emh.TRANSIENT_FAILURE) {
                this.o = emi.a(emh.IDLE);
            } else {
                this.o = emiVar;
            }
            fbc fbcVar = this.u;
            clq.G(true, "listener is null");
            ((exk) fbcVar).a.a(emiVar);
        }
    }

    public final void e() {
        this.f.execute(new ewf(this, 2));
    }

    public final void f(eui euiVar, boolean z) {
        this.f.execute(new ewg(this, euiVar, z));
    }

    public final void g(eqo eqoVar) {
        this.f.execute(new euy(this, eqoVar, 4, null));
    }

    public final void h() {
        eng engVar;
        this.f.c();
        clq.G(this.s == null, "Should have no reconnectTask scheduled");
        ewk ewkVar = this.g;
        if (ewkVar.b == 0 && ewkVar.c == 0) {
            csf csfVar = this.i;
            csfVar.c();
            csfVar.d();
        }
        SocketAddress socketAddressB = this.g.b();
        if (socketAddressB instanceof eng) {
            eng engVar2 = (eng) socketAddressB;
            engVar = engVar2;
            socketAddressB = engVar2.b;
        } else {
            engVar = null;
        }
        elp elpVarA = this.g.a();
        String str = (String) elpVarA.a(emv.a);
        eua euaVar = new eua();
        if (str == null) {
            str = this.w;
        }
        str.getClass();
        euaVar.a = str;
        euaVar.b = elpVarA;
        euaVar.c = null;
        euaVar.d = engVar;
        ewm ewmVar = new ewm();
        ewmVar.a = this.v;
        ewj ewjVar = new ewj(this.x.a(socketAddressB, euaVar, ewmVar), this.y);
        ewmVar.a = ewjVar.c();
        enl.b(this.b.f, ewjVar);
        this.m = ewjVar;
        this.k.add(ewjVar);
        ewjVar.g(new ewl(this, ewjVar));
        this.c.b(2, "Started transport {0}", ewmVar.a);
    }

    public final String toString() {
        crt crtVarB = clq.Q(this).b("logId", this.v.a);
        crtVarB.e("addressGroups", this.h);
        return crtVarB.toString();
    }
}
