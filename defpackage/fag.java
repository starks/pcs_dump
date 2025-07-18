package defpackage;

import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fag extends eqc {
    private static final Logger e = Logger.getLogger(fag.class.getName());
    public final epg a;
    public final ffh b;
    public final emk c;
    public volatile boolean d;
    private final faw f;
    private final byte[] g;
    private final emu h;
    private final etl i;
    private boolean j;
    private boolean k;
    private eme l;
    private boolean m;

    public fag(faw fawVar, epg epgVar, epc epcVar, emk emkVar, emu emuVar, etl etlVar, ffh ffhVar) {
        this.f = fawVar;
        this.a = epgVar;
        this.c = emkVar;
        this.g = (byte[]) epcVar.b(evt.d);
        this.h = emuVar;
        this.i = etlVar;
        etlVar.b();
        this.b = ffhVar;
    }

    private final void j(Throwable th) {
        e.logp(Level.WARNING, "io.grpc.internal.ServerCallImpl", "handleInternalError", "Cancelling the stream because of internal error", th);
        this.f.d(th instanceof eqr ? ((eqr) th).a : eqo.k.d(th).e("Internal error so cancelling stream."));
        this.i.a(false);
    }

    private final void k(Object obj) {
        clq.G(this.j, "sendHeaders has not been called");
        clq.G(!this.k, "call is closed");
        epg epgVar = this.a;
        if (epgVar.a.b() && this.m) {
            j(new eqr(eqo.k.e("Too many responses")));
            return;
        }
        this.m = true;
        try {
            this.f.k(epgVar.e.a(obj));
        } catch (Error e2) {
            a(eqo.c.e("Server sendMessage() failed with Error"), new epc());
            throw e2;
        } catch (RuntimeException e3) {
            j(e3);
        }
    }

    @Override // defpackage.eqc
    public final void a(eqo eqoVar, epc epcVar) {
        int i = ffg.a;
        clq.G(!this.k, "call already closed");
        try {
            this.k = true;
            if (eqoVar.g() && this.a.a.b() && !this.m) {
                j(new eqr(eqo.k.e("Completed without a response")));
            } else {
                this.f.e(eqoVar, epcVar);
            }
        } finally {
            this.i.a(eqoVar.g());
        }
    }

    @Override // defpackage.eqc
    public final void c() {
        int i = ffg.a;
        this.f.h(2);
    }

    @Override // defpackage.eqc
    public final epg d() {
        return this.a;
    }

    @Override // defpackage.eqc
    public final void e(Object obj) {
        int i = ffg.a;
        k(obj);
    }

    @Override // defpackage.eqc
    public final elp f() {
        return this.f.a();
    }

    @Override // defpackage.eqc
    public final void g(epc epcVar) {
        byte[] bArr;
        int i = ffg.a;
        clq.G(!this.j, "sendHeaders has already been called");
        clq.G(!this.k, "call is closed");
        epcVar.d(evt.g);
        epcVar.d(evt.c);
        if (this.l != null && (bArr = this.g) != null) {
            Iterator it = evt.k.e(new String(bArr, evt.a)).iterator();
            while (true) {
                if (!it.hasNext()) {
                    this.l = emc.a;
                    break;
                } else if (a.g(it.next(), "identity")) {
                    break;
                }
            }
        } else {
            this.l = emc.a;
        }
        epcVar.f(evt.c, "identity");
        epcVar.d(evt.d);
        byte[] bArr2 = this.h.b;
        if (bArr2.length != 0) {
            epcVar.f(evt.d, bArr2);
        }
        this.j = true;
        this.f.m(epcVar);
    }

    @Override // defpackage.eqc
    public final boolean h() {
        return this.d;
    }

    @Override // defpackage.eqc
    public final boolean i() {
        if (this.k) {
            return false;
        }
        return this.f.l();
    }
}
