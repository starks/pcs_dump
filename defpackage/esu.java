package defpackage;

import java.util.logging.Level;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class esu implements esx, exx {
    public eul a;
    public final Object b;
    public final fbn c;
    public final eya d;
    public int e;
    public boolean f;
    public boolean g;
    public final fbh h;
    public ety i;
    public emu j;
    public boolean k;
    public Runnable l;
    public volatile boolean m;
    public boolean n;
    public boolean o;
    private int p;
    private boolean q;

    protected esu(int i, fbh fbhVar, fbn fbnVar, byte[] bArr) {
        this(i, fbhVar, fbnVar);
        this.j = emu.a;
        this.k = false;
        this.h = fbhVar;
    }

    @Override // defpackage.exx
    public final void a(fbj fbjVar) {
        e().d(fbjVar);
    }

    public final void b() {
        boolean zD;
        synchronized (this.b) {
            zD = d();
            if (!zD && esv.d.isLoggable(Level.FINEST)) {
                esv.d.logp(Level.FINEST, "io.grpc.internal.AbstractStream$TransportState", "notifyIfReady", "Stream not ready so skip notifying listener.\ndetails: allocated/deallocated:{0}/{3}, sent queued: {1}, ready thresh: {2}", new Object[]{Boolean.valueOf(this.f), Integer.valueOf(this.e), Integer.valueOf(this.p), Boolean.valueOf(this.g)});
            }
        }
        if (zD) {
            e().e();
        }
    }

    public final void c(int i) {
        boolean z;
        synchronized (this.b) {
            clq.G(this.f, "onStreamAllocated was not called, but it seems the stream is active");
            int i2 = this.e;
            int i3 = this.p;
            int i4 = i2 - i;
            this.e = i4;
            z = false;
            if (i2 >= i3 && i4 < i3) {
                z = true;
            }
        }
        if (z) {
            b();
        }
    }

    public final boolean d() {
        boolean z;
        synchronized (this.b) {
            z = false;
            if (this.f && this.e < this.p && !this.g) {
                z = true;
            }
        }
        return z;
    }

    protected final /* synthetic */ fbk e() {
        return this.i;
    }

    public final void f(eqo eqoVar, etx etxVar, epc epcVar) {
        if (this.q) {
            return;
        }
        this.q = true;
        this.h.i();
        fbn fbnVar = this.c;
        if (eqoVar.g()) {
            fbnVar.c++;
        } else {
            fbnVar.d++;
        }
        this.i.a(eqoVar, etxVar, epcVar);
    }

    @Override // defpackage.exx
    public void g(boolean z) {
        throw null;
    }

    public final void h(eqo eqoVar, boolean z, epc epcVar) {
        i(eqoVar, etx.PROCESSED, z, epcVar);
    }

    public final void i(eqo eqoVar, etx etxVar, boolean z, epc epcVar) {
        eqoVar.getClass();
        epcVar.getClass();
        if (this.n) {
            if (!z) {
                return;
            } else {
                z = true;
            }
        }
        this.n = true;
        this.o = eqoVar.g();
        synchronized (this.b) {
            this.g = true;
        }
        if (this.k) {
            this.l = null;
            f(eqoVar, etxVar, epcVar);
            return;
        }
        this.l = new bsk(this, eqoVar, etxVar, epcVar, 3);
        if (z) {
            this.a.close();
        } else {
            this.a.a();
        }
    }

    protected esu(int i, fbh fbhVar, fbn fbnVar) {
        this.b = new Object();
        this.c = fbnVar;
        eya eyaVar = new eya(this, emc.a, i, fbhVar, fbnVar);
        this.d = eyaVar;
        this.a = eyaVar;
        this.p = 32768;
    }
}
