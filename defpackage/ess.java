package defpackage;

import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class ess extends esv implements etw, eyd {
    public static final Logger a = Logger.getLogger(ess.class.getName());
    public final fbn b;
    public final boolean c;
    private final evn e;
    private final boolean f;
    private epc g;
    private volatile boolean h;

    protected ess(ffh ffhVar, fbh fbhVar, fbn fbnVar, epc epcVar, elt eltVar, boolean z) {
        fbnVar.getClass();
        this.b = fbnVar;
        this.c = !Boolean.TRUE.equals(eltVar.f(evt.n));
        this.f = false;
        this.e = new eye(this, ffhVar, fbhVar);
        this.g = epcVar;
    }

    @Override // defpackage.esv
    protected /* bridge */ /* synthetic */ esu a() {
        throw null;
    }

    @Override // defpackage.esv
    protected final evn b() {
        return this.e;
    }

    @Override // defpackage.etw
    public final void c(ewa ewaVar) {
        ewaVar.b("remote_addr", B().a(ene.a));
    }

    @Override // defpackage.etw
    public final void d(eqo eqoVar) {
        clq.w(!eqoVar.g(), "Should not cancel with OK status");
        this.h = true;
        s().c(eqoVar);
    }

    @Override // defpackage.etw
    public final void e() {
        if (r().m) {
            return;
        }
        r().m = true;
        b().a();
    }

    @Override // defpackage.etw
    public final void j(ems emsVar) {
        this.g.d(evt.b);
        this.g.f(evt.b, Long.valueOf(Math.max(0L, emsVar.b(TimeUnit.NANOSECONDS))));
    }

    @Override // defpackage.esv, defpackage.fbi
    public final boolean l() {
        return super.l() && !this.h;
    }

    @Override // defpackage.etw
    public final void m(emu emuVar) {
        esu esuVarR = r();
        clq.G(esuVarR.i == null, "Already called start");
        emuVar.getClass();
        esuVarR.j = emuVar;
    }

    @Override // defpackage.etw
    public final void n(int i) {
        r().a.e(i);
    }

    @Override // defpackage.etw
    public final void o(int i) {
        this.e.c(i);
    }

    @Override // defpackage.etw
    public final void p(ety etyVar) {
        esu esuVarR = r();
        clq.G(esuVarR.i == null, "Already called setListener");
        esuVarR.i = etyVar;
        s().d(this.g, null);
        this.g = null;
    }

    @Override // defpackage.eyd
    public final void q(fcm fcmVar, boolean z, boolean z2, int i) {
        fvk fvkVar;
        clq.w(fcmVar != null || z, "null frame before EOS");
        fuu fuuVarS = s();
        int i2 = ffg.a;
        if (fcmVar == null) {
            fvkVar = fcb.e;
        } else {
            fvkVar = fcmVar.a;
            int i3 = (int) fvkVar.b;
            if (i3 > 0) {
                ((esv) fuuVarS.a).t(i3);
            }
        }
        evw evwVar = ((fcb) fuuVarS.a).k;
        eox eoxVar = evw.p;
        synchronized (evwVar.u) {
            evw evwVar2 = ((fcb) fuuVarS.a).k;
            if (!evwVar2.z) {
                if (evwVar2.C) {
                    evwVar2.w.bi(fvkVar, (int) fvkVar.b);
                    evwVar2.x |= z;
                    evwVar2.y |= z2;
                } else {
                    clq.G(evwVar2.F != -1, "streamId should be set");
                    evwVar2.B.a(z, evwVar2.E, fvkVar, z2);
                }
            }
            fbn fbnVar = ((ess) fuuVarS.a).b;
            if (i != 0) {
                fbnVar.f += i;
                fbnVar.a.a();
            }
        }
    }

    protected abstract esu r();

    protected abstract fuu s();
}
