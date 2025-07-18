package defpackage;

import java.nio.charset.Charset;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: PG */
/* loaded from: classes.dex */
final class etv extends elw {
    public static final double a;
    private static final Logger l = Logger.getLogger(etv.class.getName());
    public final epg b;
    public final ffh c;
    public final Executor d;
    public final etl e;
    public final emr f;
    public etp g;
    public elt h;
    public etw i;
    public final ScheduledExecutorService j;
    public emu k = emu.a;
    private final boolean m;
    private final boolean n;
    private boolean o;
    private boolean p;
    private final ewx q;

    static {
        "gzip".getBytes(Charset.forName("US-ASCII"));
        a = TimeUnit.SECONDS.toNanos(1L);
    }

    public etv(epg epgVar, Executor executor, elt eltVar, ewx ewxVar, ScheduledExecutorService scheduledExecutorService, etl etlVar) {
        emf emfVar = emf.a;
        this.b = epgVar;
        String str = epgVar.b;
        System.identityHashCode(this);
        this.c = ffg.a();
        if (executor == diy.a) {
            this.d = new faa();
            this.m = true;
        } else {
            this.d = new fae(executor);
            this.m = false;
        }
        this.e = etlVar;
        this.f = emr.l();
        epf epfVar = epgVar.a;
        this.n = epfVar == epf.UNARY || epfVar == epf.SERVER_STREAMING;
        this.h = eltVar;
        this.q = ewxVar;
        this.j = scheduledExecutorService;
    }

    public static final void g(ebz ebzVar, eqo eqoVar, epc epcVar) {
        try {
            ebzVar.y(eqoVar, epcVar);
        } catch (RuntimeException e) {
            l.logp(Level.WARNING, "io.grpc.internal.ClientCallImpl", "closeObserver", "Exception thrown by onClose() in ClientCall", (Throwable) e);
        }
    }

    private final void h(Object obj) {
        clq.G(this.i != null, "Not started");
        clq.G(!this.o, "call was cancelled");
        clq.G(!this.p, "call was half-closed");
        try {
            etw etwVar = this.i;
            if (etwVar instanceof ezv) {
                ezv ezvVar = (ezv) etwVar;
                ezr ezrVar = ezvVar.r;
                if (ezrVar.a) {
                    ezrVar.f.a.k(ezvVar.f.b(obj));
                } else {
                    ezvVar.r(new ezi(ezvVar, obj));
                }
            } else {
                etwVar.k(this.b.b(obj));
            }
            if (this.n) {
                return;
            }
            this.i.f();
        } catch (Error e) {
            this.i.d(eqo.c.e("Client sendMessage() failed with Error"));
            throw e;
        } catch (RuntimeException e2) {
            this.i.d(eqo.c.d(e2).e("Failed to stream message"));
        }
    }

    @Override // defpackage.elw
    public final void a(String str, Throwable th) {
        int i = ffg.a;
        if (str == null && th == null) {
            CancellationException cancellationException = new CancellationException("Cancelled without a message or cause");
            l.logp(Level.WARNING, "io.grpc.internal.ClientCallImpl", "cancelInternal", "Cancelling without a message or cause is suboptimal", (Throwable) cancellationException);
            th = cancellationException;
        }
        if (this.o) {
            return;
        }
        this.o = true;
        try {
            if (this.i != null) {
                eqo eqoVar = eqo.c;
                eqo eqoVarE = str != null ? eqoVar.e(str) : eqoVar.e("Call cancelled without message");
                if (th != null) {
                    eqoVarE = eqoVarE.d(th);
                }
                this.i.d(eqoVarE);
            }
            etp etpVar = this.g;
            if (etpVar != null) {
                etpVar.c();
            }
        } finally {
        }
    }

    @Override // defpackage.elw
    public final void b() {
        int i = ffg.a;
        clq.G(this.i != null, "Not started");
        clq.G(!this.o, "call was cancelled");
        clq.G(!this.p, "call already half-closed");
        this.p = true;
        this.i.e();
    }

    @Override // defpackage.elw
    public final void c(int i) {
        int i2 = ffg.a;
        clq.G(this.i != null, "Not started");
        clq.w(true, "Number requested must be non-negative");
        this.i.h(i);
    }

    @Override // defpackage.elw
    public final void d(Object obj) {
        int i = ffg.a;
        h(obj);
    }

    @Override // defpackage.elw
    public final void e(ebz ebzVar, epc epcVar) {
        etw ezvVar;
        ScheduledExecutorService scheduledExecutorService;
        elt eltVar;
        int i = ffg.a;
        clq.G(this.i == null, "Already started");
        clq.G(!this.o, "call was cancelled");
        if (this.f.i()) {
            this.i = eyf.a;
            this.d.execute(new eto(this, ebzVar));
            return;
        }
        exs exsVar = (exs) this.h.f(exs.a);
        if (exsVar != null) {
            Long l2 = exsVar.b;
            if (l2 != null) {
                ems emsVarG = ems.g(l2.longValue(), TimeUnit.NANOSECONDS, ems.c);
                ems emsVar = this.h.b;
                if (emsVar == null || emsVarG.compareTo(emsVar) < 0) {
                    elr elrVarA = elt.a(this.h);
                    elrVarA.a = emsVarG;
                    this.h = new elt(elrVarA);
                }
            }
            Boolean bool = exsVar.c;
            if (bool != null) {
                if (bool.booleanValue()) {
                    elr elrVarA2 = elt.a(this.h);
                    elrVarA2.e = Boolean.TRUE;
                    eltVar = new elt(elrVarA2);
                } else {
                    elr elrVarA3 = elt.a(this.h);
                    elrVarA3.e = Boolean.FALSE;
                    eltVar = new elt(elrVarA3);
                }
                this.h = eltVar;
            }
            Integer num = exsVar.d;
            if (num != null) {
                elt eltVar2 = this.h;
                Integer num2 = eltVar2.e;
                if (num2 != null) {
                    this.h = eltVar2.c(Math.min(num2.intValue(), exsVar.d.intValue()));
                } else {
                    this.h = eltVar2.c(num.intValue());
                }
            }
            Integer num3 = exsVar.e;
            if (num3 != null) {
                elt eltVar3 = this.h;
                Integer num4 = eltVar3.f;
                if (num4 != null) {
                    this.h = eltVar3.d(Math.min(num4.intValue(), exsVar.e.intValue()));
                } else {
                    this.h = eltVar3.d(num3.intValue());
                }
            }
        }
        emd emdVar = emc.a;
        emu emuVar = this.k;
        epcVar.d(evt.g);
        epcVar.d(evt.c);
        if (emdVar != emc.a) {
            epcVar.f(evt.c, emdVar.c());
        }
        epcVar.d(evt.d);
        byte[] bArr = emuVar.b;
        if (bArr.length != 0) {
            epcVar.f(evt.d, bArr);
        }
        epcVar.d(evt.e);
        epcVar.d(evt.f);
        ems emsVarF = f();
        boolean z = emsVarF != null && emsVarF.equals(this.f.b());
        etp etpVar = new etp(this, emsVarF, z);
        this.g = etpVar;
        if (emsVarF == null || etpVar.c > 0) {
            ewx ewxVar = this.q;
            epg epgVar = this.b;
            elt eltVar4 = this.h;
            emr emrVar = this.f;
            if (ewxVar.b.P) {
                exs exsVar2 = (exs) eltVar4.f(exs.a);
                ezvVar = new ezv(ewxVar, epgVar, epcVar, eltVar4, exsVar2 == null ? null : exsVar2.f, exsVar2 != null ? exsVar2.g : null, emrVar);
            } else {
                emb[] embVarArrI = evt.i(eltVar4, epcVar, 0, false);
                emr emrVarA = emrVar.a();
                try {
                    ezvVar = ewxVar.b.y.a(epgVar, epcVar, eltVar4, embVarArrI);
                } finally {
                    emrVar.f(emrVarA);
                }
            }
            this.i = ezvVar;
        } else {
            emb[] embVarArrI2 = evt.i(this.h, epcVar, 0, false);
            String str = true != z ? "CallOptions" : "Context";
            Long l3 = (Long) this.h.f(emb.a);
            double d = this.g.c;
            double d2 = a;
            this.i = new evg(eqo.f.e(String.format("ClientCall started after %s deadline was exceeded %.9f seconds ago. Name resolution delay %.9f seconds.", str, Double.valueOf(d / d2), Double.valueOf(l3 == null ? 0.0d : l3.longValue() / d2))), embVarArrI2);
        }
        if (this.m) {
            this.i.g();
        }
        Integer num5 = this.h.e;
        if (num5 != null) {
            this.i.n(num5.intValue());
        }
        Integer num6 = this.h.f;
        if (num6 != null) {
            this.i.o(num6.intValue());
        }
        if (emsVarF != null) {
            this.i.j(emsVarF);
        }
        this.i.i(emdVar);
        this.i.m(this.k);
        this.e.b();
        this.i.p(new etu(this, ebzVar));
        etp etpVar2 = this.g;
        if (etpVar2.e) {
            return;
        }
        if (etpVar2.b && !etpVar2.a && (scheduledExecutorService = etpVar2.f.j) != null) {
            etpVar2.d = scheduledExecutorService.schedule(new ewr(etpVar2), etpVar2.c, TimeUnit.NANOSECONDS);
        }
        etpVar2.f.f.d(etpVar2, diy.a);
        if (etpVar2.e) {
            etpVar2.c();
        }
    }

    public final ems f() {
        ems emsVar = this.h.b;
        ems emsVarB = this.f.b();
        if (emsVar != null) {
            if (emsVarB != null) {
                emsVar.c(emsVarB);
                if (true != emsVar.d(emsVarB)) {
                }
            }
            return emsVar;
        }
        return emsVarB;
    }

    public final String toString() {
        crt crtVarQ = clq.Q(this);
        crtVarQ.e("method", this.b);
        return crtVarQ.toString();
    }
}
