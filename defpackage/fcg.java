package defpackage;

import j$.util.DesugarCollections;
import java.io.EOFException;
import java.net.InetSocketAddress;
import java.nio.charset.Charset;
import java.util.Deque;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.logging.Logger;
import javax.net.SocketFactory;
import javax.net.ssl.SSLSocketFactory;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fcg implements eui, fbt, fcp {
    private static final Map I;
    public static final Logger a;
    public boolean A;
    public long B;
    public long C;
    public final Runnable D;
    public final int E;
    public final fbn F;
    final eng G;
    int H;
    private final eno J;
    private int K;
    private final fae L;
    private final ScheduledExecutorService M;
    private final int N;
    private boolean O;
    private boolean P;
    private final evz Q;
    public final InetSocketAddress b;
    public final String c;
    public final String d;
    public final Random e = new Random();
    public final csg f;
    public final int g;
    public final fdv h;
    public exv i;
    public fbu j;
    public fcr k;
    public final Object l;
    public final Map m;
    public final Executor n;
    public int o;
    public fcf p;
    public elp q;
    public eqo r;
    public evy s;
    public boolean t;
    public final SocketFactory u;
    public SSLSocketFactory v;
    public int w;
    public final Deque x;
    public final fcu y;
    public ewq z;

    static {
        EnumMap enumMap = new EnumMap(fdi.class);
        enumMap.put((EnumMap) fdi.NO_ERROR, (fdi) eqo.k.e("No error: A GRPC status of OK should have been sent"));
        enumMap.put((EnumMap) fdi.PROTOCOL_ERROR, (fdi) eqo.k.e("Protocol error"));
        enumMap.put((EnumMap) fdi.INTERNAL_ERROR, (fdi) eqo.k.e("Internal error"));
        enumMap.put((EnumMap) fdi.FLOW_CONTROL_ERROR, (fdi) eqo.k.e("Flow control error"));
        enumMap.put((EnumMap) fdi.STREAM_CLOSED, (fdi) eqo.k.e("Stream closed"));
        enumMap.put((EnumMap) fdi.FRAME_TOO_LARGE, (fdi) eqo.k.e("Frame too large"));
        enumMap.put((EnumMap) fdi.REFUSED_STREAM, (fdi) eqo.l.e("Refused stream"));
        enumMap.put((EnumMap) fdi.CANCEL, (fdi) eqo.c.e("Cancelled"));
        enumMap.put((EnumMap) fdi.COMPRESSION_ERROR, (fdi) eqo.k.e("Compression error"));
        enumMap.put((EnumMap) fdi.CONNECT_ERROR, (fdi) eqo.k.e("Connect error"));
        enumMap.put((EnumMap) fdi.ENHANCE_YOUR_CALM, (fdi) eqo.h.e("Enhance your calm"));
        enumMap.put((EnumMap) fdi.INADEQUATE_SECURITY, (fdi) eqo.g.e("Inadequate security"));
        I = DesugarCollections.unmodifiableMap(enumMap);
        a = Logger.getLogger(fcg.class.getName());
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [fbl, java.lang.Object] */
    public fcg(fby fbyVar, InetSocketAddress inetSocketAddress, String str, elp elpVar, csg csgVar, fdv fdvVar, eng engVar, Runnable runnable) {
        Object obj = new Object();
        this.l = obj;
        this.m = new HashMap();
        this.w = 0;
        this.x = new LinkedList();
        this.Q = new fcc(this);
        this.H = 30000;
        inetSocketAddress.getClass();
        this.b = inetSocketAddress;
        this.c = str;
        this.N = fbyVar.e;
        this.g = 65535;
        Executor executor = fbyVar.a;
        executor.getClass();
        this.n = executor;
        this.L = new fae(fbyVar.a);
        ScheduledExecutorService scheduledExecutorService = fbyVar.b;
        scheduledExecutorService.getClass();
        this.M = scheduledExecutorService;
        this.K = 3;
        this.u = SocketFactory.getDefault();
        this.v = fbyVar.c;
        fcu fcuVar = fbyVar.d;
        fcuVar.getClass();
        this.y = fcuVar;
        csgVar.getClass();
        this.f = csgVar;
        this.h = fdvVar;
        Charset charset = evt.a;
        this.d = "grpc-java-okhttp/1.71.0-SNAPSHOT";
        this.G = engVar;
        this.D = runnable;
        this.E = Integer.MAX_VALUE;
        this.F = new fbn(fbyVar.h.a);
        this.J = eno.a(getClass(), inetSocketAddress.toString());
        elp elpVar2 = elp.a;
        eln elnVar = new eln(elp.a);
        elnVar.b(evo.b, elpVar);
        this.q = elnVar.a();
        synchronized (obj) {
        }
    }

    static eqo f(fdi fdiVar) {
        eqo eqoVar = (eqo) I.get(fdiVar);
        if (eqoVar != null) {
            return eqoVar;
        }
        return eqo.d.e("Unknown http2 error code: " + fdiVar.s);
    }

    public static String h(fwf fwfVar) throws EOFException {
        fvk fvkVar = new fvk();
        while (fwfVar.b(fvkVar, 1L) != -1) {
            if (fvkVar.c(fvkVar.b - 1) == 10) {
                return fvkVar.n();
            }
        }
        throw new EOFException("\\n not found: ".concat(fvkVar.u().d()));
    }

    private final void s() {
        if (this.r == null || !this.m.isEmpty() || !this.x.isEmpty() || this.t) {
            return;
        }
        this.t = true;
        ewq ewqVar = this.z;
        if (ewqVar != null) {
            ewqVar.e();
        }
        evy evyVar = this.s;
        if (evyVar != null) {
            Throwable thI = i();
            synchronized (evyVar) {
                if (!evyVar.d) {
                    evyVar.d = true;
                    evyVar.e = thI;
                    Map map = evyVar.c;
                    evyVar.c = null;
                    for (Map.Entry entry : map.entrySet()) {
                        evy.b((fuu) entry.getKey(), (Executor) entry.getValue(), thI);
                    }
                }
            }
            this.s = null;
        }
        if (!this.O) {
            this.O = true;
            this.j.j(fdi.NO_ERROR, new byte[0]);
        }
        this.j.close();
    }

    @Override // defpackage.etz
    public final /* bridge */ /* synthetic */ etw a(epg epgVar, epc epcVar, elt eltVar, emb[] embVarArr) {
        fcb fcbVar;
        fbh fbhVar = new fbh(embVarArr);
        for (emb embVar : embVarArr) {
        }
        synchronized (this.l) {
            fcbVar = new fcb(epgVar, epcVar, this.j, this, this.k, this.l, this.N, this.g, this.c, this.d, fbhVar, this.F, eltVar);
        }
        return fcbVar;
    }

    @Override // defpackage.fbt
    public final void b(Throwable th) {
        n(0, fdi.INTERNAL_ERROR, eqo.l.d(th));
    }

    @Override // defpackage.enu
    public final eno c() {
        return this.J;
    }

    @Override // defpackage.exw
    public final void d(eqo eqoVar) {
        synchronized (this.l) {
            if (this.r != null) {
                return;
            }
            this.r = eqoVar;
            this.i.d(eqoVar);
            s();
        }
    }

    @Override // defpackage.exw
    public final void e(eqo eqoVar) {
        d(eqoVar);
        synchronized (this.l) {
            Iterator it = this.m.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                it.remove();
                ((fcb) entry.getValue()).k.h(eqoVar, false, new epc());
                k((fcb) entry.getValue());
            }
            for (fcb fcbVar : this.x) {
                fcbVar.k.i(eqoVar, etx.MISCARRIED, true, new epc());
                k(fcbVar);
            }
            this.x.clear();
            s();
        }
    }

    @Override // defpackage.exw
    public final void g(exv exvVar) {
        this.i = exvVar;
        if (this.A) {
            ewq ewqVar = new ewq(new fsc(this), this.M, this.B, this.C);
            this.z = ewqVar;
            ewqVar.d();
        }
        fbs fbsVar = new fbs(this.L, this);
        fbq fbqVar = new fbq(fbsVar, this.h.f(fwv.f(fbsVar)));
        synchronized (this.l) {
            this.j = new fbu(this, fbqVar);
            this.k = new fcr(this, this.j);
        }
        CountDownLatch countDownLatch = new CountDownLatch(1);
        CountDownLatch countDownLatch2 = new CountDownLatch(1);
        CyclicBarrier cyclicBarrier = new CyclicBarrier(2);
        this.L.execute(new fce(this, countDownLatch, cyclicBarrier, fbsVar, countDownLatch2));
        this.n.execute(new euy(cyclicBarrier, countDownLatch2, 14));
        try {
            synchronized (this.l) {
                this.j.e();
                fdu fduVar = new fdu();
                fduVar.d(7, this.g);
                this.j.h(fduVar);
            }
            countDownLatch.countDown();
            this.L.execute(new ezk(this, 8));
        } catch (Throwable th) {
            countDownLatch.countDown();
            throw th;
        }
    }

    public final Throwable i() {
        synchronized (this.l) {
            eqo eqoVar = this.r;
            if (eqoVar != null) {
                return new eqp(eqoVar);
            }
            return new eqp(eqo.l.e("Connection closed"));
        }
    }

    public final void j(int i, eqo eqoVar, etx etxVar, boolean z, fdi fdiVar, epc epcVar) {
        synchronized (this.l) {
            fcb fcbVar = (fcb) this.m.remove(Integer.valueOf(i));
            if (fcbVar != null) {
                if (fdiVar != null) {
                    this.j.c(i, fdi.CANCEL);
                }
                if (eqoVar != null) {
                    evw evwVar = fcbVar.k;
                    if (epcVar == null) {
                        epcVar = new epc();
                    }
                    evwVar.i(eqoVar, etxVar, z, epcVar);
                }
                if (!q()) {
                    s();
                }
                k(fcbVar);
            }
        }
    }

    public final void k(fcb fcbVar) {
        if (this.P && this.x.isEmpty() && this.m.isEmpty()) {
            this.P = false;
            ewq ewqVar = this.z;
            if (ewqVar != null) {
                ewqVar.c();
            }
        }
        if (fcbVar.c) {
            this.Q.c(fcbVar, false);
        }
    }

    public final void l(fdi fdiVar, String str) {
        n(0, fdiVar, f(fdiVar).a(str));
    }

    public final void m(fcb fcbVar) {
        if (!this.P) {
            this.P = true;
            ewq ewqVar = this.z;
            if (ewqVar != null) {
                ewqVar.b();
            }
        }
        if (fcbVar.c) {
            this.Q.c(fcbVar, true);
        }
    }

    public final void n(int i, fdi fdiVar, eqo eqoVar) {
        synchronized (this.l) {
            if (this.r == null) {
                this.r = eqoVar;
                this.i.d(eqoVar);
            }
            if (fdiVar != null && !this.O) {
                this.O = true;
                this.j.j(fdiVar, new byte[0]);
            }
            Iterator it = this.m.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                if (((Integer) entry.getKey()).intValue() > i) {
                    it.remove();
                    ((fcb) entry.getValue()).k.i(eqoVar, etx.REFUSED, false, new epc());
                    k((fcb) entry.getValue());
                }
            }
            for (fcb fcbVar : this.x) {
                fcbVar.k.i(eqoVar, etx.MISCARRIED, true, new epc());
                k(fcbVar);
            }
            this.x.clear();
            s();
        }
    }

    public final void o(fcb fcbVar) {
        clq.G(fcbVar.k.F == -1, "StreamId already assigned");
        this.m.put(Integer.valueOf(this.K), fcbVar);
        m(fcbVar);
        evw evwVar = fcbVar.k;
        int i = this.K;
        clq.H(evwVar.F == -1, "the stream has been started with id %s", i);
        evwVar.F = i;
        fcr fcrVar = evwVar.B;
        evwVar.E = new fco(fcrVar, i, fcrVar.c, evwVar);
        evwVar.G.k.s();
        if (evwVar.C) {
            evwVar.A.k(evwVar.G.j, evwVar.F, evwVar.v);
            for (fjp fjpVar : evwVar.G.h.b) {
            }
            evwVar.v = null;
            fvk fvkVar = evwVar.w;
            if (fvkVar.b > 0) {
                evwVar.B.a(evwVar.x, evwVar.E, fvkVar, evwVar.y);
            }
            evwVar.C = false;
        }
        if ((fcbVar.u() != epf.UNARY && fcbVar.u() != epf.SERVER_STREAMING) || fcbVar.j) {
            this.j.g();
        }
        int i2 = this.K;
        if (i2 < 2147483645) {
            this.K = i2 + 2;
        } else {
            this.K = Integer.MAX_VALUE;
            n(Integer.MAX_VALUE, fdi.NO_ERROR, eqo.l.e("Stream ids exhausted"));
        }
    }

    final boolean p(int i) {
        boolean z;
        synchronized (this.l) {
            z = false;
            if (i < this.K && (i & 1) == 1) {
                z = true;
            }
        }
        return z;
    }

    public final boolean q() {
        boolean z = false;
        while (!this.x.isEmpty() && this.m.size() < this.w) {
            o((fcb) this.x.poll());
            z = true;
        }
        return z;
    }

    @Override // defpackage.fcp
    public final fco[] r() {
        fco[] fcoVarArr;
        synchronized (this.l) {
            fcoVarArr = new fco[this.m.size()];
            Iterator it = this.m.values().iterator();
            int i = 0;
            while (it.hasNext()) {
                fcoVarArr[i] = ((fcb) it.next()).k.n();
                i++;
            }
        }
        return fcoVarArr;
    }

    public final String toString() {
        crt crtVarB = clq.Q(this).b("logId", this.J.a);
        crtVarB.e("address", this.b);
        return crtVarB.toString();
    }
}
