package defpackage;

import java.net.URI;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.logging.Logger;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class exm extends eol implements enn {
    static final Logger a = Logger.getLogger(exm.class.getName());
    static final eqo b;
    static final eqo c;
    public static final exu d;
    public static final enm e;
    public static final eob f;
    public static final elw g;
    public final AtomicBoolean A;
    public boolean B;
    public volatile boolean C;
    public final etk D;
    public final etl E;
    public final etn F;
    public final elv G;
    public final enl H;
    public final exi I;
    public exu J;
    public final exu K;
    public boolean L;
    public final boolean M;
    public final long N;
    public final long O;
    public final boolean P;
    final evz Q;
    public final ewx R;
    public int S;
    public final fsc T;
    public final fbc U;
    private final String V;
    private final URI W;
    private final epp X;
    private final epi Y;
    private final eyg Z;
    private final exb aa;
    private final exb ab;
    private final emf ac;
    private final long ad;
    private final elu ae;
    private volatile eog af;
    private final Set ag;
    private final CountDownLatch ah;
    private final exv ai;
    private final ezc aj;
    private final exo ak;
    private final fbc al;
    private final fjp am;
    public final eno h;
    public final eub i;
    public final exj j;
    public final Executor k;
    public final fbl l;
    final equ m;
    public final emu n;
    public final csg o;
    public final euj p;
    public final List q;
    public epo r;
    public boolean s;
    public exd t;
    public boolean u;
    public final Set v;
    public Collection w;
    public final Object x;
    public final eut y;
    public final exl z;

    static {
        eqo.l.e("Channel shutdownNow invoked");
        b = eqo.l.e("Channel shutdown invoked");
        c = eqo.l.e("Subchannel shutdown invoked");
        d = new exu(null, new HashMap(), new HashMap(), null, null, null);
        e = new ewt();
        f = new eyh();
        g = new eww();
    }

    public exm(exp expVar, eub eubVar, URI uri, epp eppVar, fbc fbcVar, eyg eygVar, csg csgVar, List list, fbl fblVar) {
        equ equVar = new equ(new ewv(this));
        this.m = equVar;
        this.p = new euj();
        this.v = new HashSet(16, 0.75f);
        this.x = new Object();
        this.ag = new HashSet(1, 0.75f);
        this.z = new exl(this);
        this.A = new AtomicBoolean(false);
        this.ah = new CountDownLatch(1);
        this.S = 1;
        this.J = d;
        this.L = false;
        this.T = new fsc((char[]) null);
        this.am = ems.c;
        exa exaVar = new exa(this);
        this.ai = exaVar;
        this.Q = new exc(this);
        this.R = new ewx(this);
        String str = expVar.l;
        this.V = str;
        eno enoVarB = eno.b("Channel", str);
        this.h = enoVarB;
        fblVar.getClass();
        this.l = fblVar;
        eyg eygVar2 = expVar.g;
        eygVar2.getClass();
        this.Z = eygVar2;
        Executor executor = (Executor) eygVar2.a();
        executor.getClass();
        this.k = executor;
        eyg eygVar3 = expVar.h;
        eygVar3.getClass();
        exb exbVar = new exb(eygVar3);
        this.ab = exbVar;
        eti etiVar = new eti(eubVar, exbVar);
        this.i = etiVar;
        new eti(eubVar, exbVar);
        exj exjVar = new exj(etiVar.b());
        this.j = exjVar;
        etn etnVar = new etn(enoVarB, fblVar.a(), "Channel for '" + str + "'");
        this.F = etnVar;
        etm etmVar = new etm(etnVar, fblVar);
        this.G = etmVar;
        epz epzVar = evt.m;
        boolean z = expVar.u;
        this.P = z;
        exo exoVar = new exo(eok.b(), expVar.m);
        this.ak = exoVar;
        this.W = uri;
        this.X = eppVar;
        epn epnVar = new epn(z, expVar.q, expVar.r, exoVar);
        fjp.P();
        fbc fbcVar2 = new fbc();
        this.al = fbcVar2;
        eph ephVar = new eph();
        ephVar.a = Integer.valueOf(expVar.E.f());
        epzVar.getClass();
        ephVar.b = epzVar;
        ephVar.c = equVar;
        ephVar.e = exjVar;
        ephVar.d = epnVar;
        ephVar.f = etmVar;
        ephVar.g = exbVar;
        ephVar.h = fbcVar2;
        epi epiVar = new epi(ephVar);
        this.Y = epiVar;
        this.r = l(uri, eppVar, epiVar);
        this.aa = new exb(eygVar);
        eut eutVar = new eut(executor, equVar);
        this.y = eutVar;
        eutVar.f = exaVar;
        eutVar.c = new chg(exaVar, 12, null);
        eutVar.d = new chg(exaVar, 13, null);
        eutVar.e = new chg(exaVar, 14, null);
        this.U = fbcVar;
        this.K = null;
        boolean z2 = expVar.w;
        this.M = z2;
        exi exiVar = new exi(this, this.r.a());
        this.I = exiVar;
        this.ae = ebz.x(exiVar, list);
        this.q = new ArrayList(expVar.k);
        csgVar.getClass();
        this.o = csgVar;
        long j = expVar.p;
        if (j == -1) {
            this.ad = -1L;
        } else {
            clq.z(j >= exp.c, "invalid idleTimeoutMillis %s", j);
            this.ad = expVar.p;
        }
        this.aj = new ezc(new ewf(this, 9), equVar, etiVar.b(), new csf());
        emu emuVar = expVar.n;
        emuVar.getClass();
        this.n = emuVar;
        emf emfVar = expVar.o;
        emfVar.getClass();
        this.ac = emfVar;
        this.O = expVar.s;
        this.N = expVar.t;
        ewu ewuVar = new ewu(fblVar);
        this.D = ewuVar;
        this.E = ewuVar.a();
        enl enlVar = expVar.v;
        enlVar.getClass();
        this.H = enlVar;
        enl.b(enlVar.d, this);
        if (z2) {
            return;
        }
        this.L = true;
    }

    static epo l(URI uri, epp eppVar, epi epiVar) {
        epo epoVarA = eppVar.a(uri, epiVar);
        if (epoVarA == null) {
            throw new IllegalArgumentException("cannot create a NameResolver for ".concat(String.valueOf(String.valueOf(uri))));
        }
        fbc fbcVar = new fbc();
        ScheduledExecutorService scheduledExecutorService = epiVar.e;
        if (scheduledExecutorService == null) {
            throw new IllegalStateException("ScheduledExecutorService not set in Builder");
        }
        etg etgVar = new etg(fbcVar, scheduledExecutorService, epiVar.c);
        equ equVar = epiVar.c;
        return new ezz(epoVarA, etgVar);
    }

    @Override // defpackage.elu
    public final elw a(epg epgVar, elt eltVar) {
        return this.ae.a(epgVar, eltVar);
    }

    @Override // defpackage.elu
    public final String b() {
        return this.ae.b();
    }

    @Override // defpackage.enu
    public final eno c() {
        return this.h;
    }

    @Override // defpackage.eol
    public final /* bridge */ /* synthetic */ void d() {
        throw null;
    }

    public final Executor e(elt eltVar) {
        Executor executor = eltVar.c;
        return executor == null ? this.k : executor;
    }

    public final void f(boolean z) {
        ScheduledFuture scheduledFuture;
        ezc ezcVar = this.aj;
        ezcVar.e = false;
        if (!z || (scheduledFuture = ezcVar.f) == null) {
            return;
        }
        scheduledFuture.cancel(false);
        ezcVar.f = null;
    }

    final void g() {
        this.m.c();
        if (this.A.get() || this.u) {
            return;
        }
        if (this.Q.a.isEmpty()) {
            i();
        } else {
            f(false);
        }
        if (this.t == null) {
            this.G.a(2, "Exiting idle mode");
            exd exdVar = new exd(this);
            exdVar.a = new etb(this.ak, exdVar);
            this.t = exdVar;
            this.p.a(emh.CONNECTING);
            this.r.d(new exe(this, exdVar, this.r));
            this.s = true;
        }
    }

    public final void h() {
        if (!this.C && this.A.get() && this.v.isEmpty() && this.ag.isEmpty()) {
            this.G.a(2, "Terminated");
            enl.c(this.H.d, this);
            this.Z.b(this.k);
            this.aa.b();
            this.ab.b();
            this.i.close();
            this.C = true;
            this.ah.countDown();
        }
    }

    public final void i() {
        long j = this.ad;
        if (j == -1) {
            return;
        }
        ezc ezcVar = this.aj;
        long nanos = TimeUnit.MILLISECONDS.toNanos(j);
        long jA = ezcVar.a() + nanos;
        ezcVar.e = true;
        if (jA - ezcVar.d < 0 || ezcVar.f == null) {
            ScheduledFuture scheduledFuture = ezcVar.f;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(false);
            }
            ezcVar.f = ezcVar.a.schedule(new ewf(ezcVar, 20), nanos, TimeUnit.NANOSECONDS);
        }
        ezcVar.d = jA;
    }

    public final void j(boolean z) {
        this.m.c();
        if (z) {
            clq.G(this.s, "nameResolver is not started");
            clq.G(this.t != null, "lbHelper is null");
        }
        epo epoVar = this.r;
        if (epoVar != null) {
            epoVar.c();
            this.s = false;
            if (z) {
                this.r = l(this.W, this.X, this.Y);
            } else {
                this.r = null;
            }
        }
        exd exdVar = this.t;
        if (exdVar != null) {
            etb etbVar = exdVar.a;
            etbVar.b.e();
            etbVar.b = null;
            this.t = null;
        }
        this.af = null;
    }

    public final void k(eog eogVar) {
        this.af = eogVar;
        this.y.b(eogVar);
    }

    public final String toString() {
        crt crtVarB = clq.Q(this).b("logId", this.h.a);
        crtVarB.e("target", this.V);
        return crtVarB.toString();
    }
}
