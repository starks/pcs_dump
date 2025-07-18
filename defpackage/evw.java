package defpackage;

import java.io.EOFException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLSocketFactory;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class evw extends esu implements fcn {
    private static final enp H;
    public static final eox p;
    public final fbu A;
    public final fcr B;
    public boolean C;
    public final ffh D;
    public fco E;
    public int F;
    public final /* synthetic */ fcb G;
    private final int I;
    private int J;
    private int K;
    private final fcg L;
    public eqo q;
    public epc r;
    public Charset s;
    public boolean t;
    public final Object u;
    public List v;
    public fvk w;
    public boolean x;
    public boolean y;
    public boolean z;

    static {
        evv evvVar = new evv(0);
        H = evvVar;
        p = enq.a(":status", evvVar);
    }

    protected evw(int i, fbh fbhVar, fbn fbnVar, elt eltVar) {
        super(i, fbhVar, fbnVar, null);
        this.s = StandardCharsets.UTF_8;
    }

    public static Charset l(epc epcVar) {
        String str = (String) epcVar.b(evt.h);
        if (str != null) {
            try {
                return Charset.forName(str.split("charset=", 2)[r2.length - 1].trim());
            } catch (Exception unused) {
            }
        }
        return StandardCharsets.UTF_8;
    }

    public static void m(epc epcVar) {
        epcVar.d(p);
        epcVar.d(ens.b);
        epcVar.d(ens.a);
    }

    @Override // defpackage.esu, defpackage.exx
    public final void g(boolean z) {
        if (this.m) {
            this.L.j(this.F, null, etx.PROCESSED, false, null, null);
        } else {
            this.L.j(this.F, null, etx.PROCESSED, false, fdi.CANCEL, null);
        }
        clq.G(this.n, "status should have been reported on deframer closed");
        this.k = true;
        if (this.o && z) {
            h(eqo.k.e("Encountered end-of-stream mid-frame"), true, new epc());
        }
        Runnable runnable = this.l;
        if (runnable != null) {
            runnable.run();
            this.l = null;
        }
    }

    @Override // defpackage.esx
    public final void j(Runnable runnable) {
        synchronized (this.u) {
            runnable.run();
        }
    }

    public final eqo k(epc epcVar) {
        char cCharAt;
        Integer num = (Integer) epcVar.b(p);
        if (num == null) {
            return eqo.k.e("Missing HTTP status code");
        }
        String str = (String) epcVar.b(evt.h);
        if (str != null && str.length() >= 16) {
            String lowerCase = str.toLowerCase(Locale.US);
            if (lowerCase.startsWith("application/grpc") && (lowerCase.length() == 16 || (cCharAt = lowerCase.charAt(16)) == '+' || cCharAt == ';')) {
                return null;
            }
        }
        return evt.a(num.intValue()).a("invalid content-type: ".concat(String.valueOf(str)));
    }

    public final fco n() {
        fco fcoVar;
        synchronized (this.u) {
            fcoVar = this.E;
        }
        return fcoVar;
    }

    @Override // defpackage.exx
    public final void o(int i) {
        int i2 = this.K - i;
        this.K = i2;
        int i3 = this.I;
        if (i2 <= i3 * 0.5f) {
            int i4 = i3 - i2;
            this.J += i4;
            this.K = i2 + i4;
            this.A.i(this.F, i4);
        }
    }

    public final void p(eqo eqoVar, boolean z, epc epcVar) throws EOFException {
        if (this.z) {
            return;
        }
        this.z = true;
        if (!this.C) {
            this.L.j(this.F, eqoVar, etx.PROCESSED, z, fdi.CANCEL, epcVar);
            return;
        }
        fcg fcgVar = this.L;
        fcb fcbVar = this.G;
        fcgVar.x.remove(fcbVar);
        fcgVar.k(fcbVar);
        this.v = null;
        this.w.B();
        this.C = false;
        if (epcVar == null) {
            epcVar = new epc();
        }
        h(eqoVar, true, epcVar);
    }

    @Override // defpackage.exx
    public final void q(Throwable th) throws EOFException {
        p(eqo.c(th), true, new epc());
    }

    public final void r(eqo eqoVar, boolean z, epc epcVar) throws EOFException {
        p(eqoVar, false, epcVar);
    }

    public final void s() {
        clq.F(e() != null);
        synchronized (this.b) {
            clq.G(!this.f, "Already allocated");
            this.f = true;
        }
        super.b();
        fbn fbnVar = this.c;
        fbnVar.b++;
        fbnVar.a.a();
    }

    public final void t(epc epcVar, String str) {
        int i;
        fcb fcbVar = this.G;
        boolean z = fcbVar.j;
        SSLSocketFactory sSLSocketFactory = this.L.v;
        fdk fdkVar = fbw.a;
        epcVar.getClass();
        String str2 = fcbVar.i;
        str2.getClass();
        epcVar.d(evt.h);
        epcVar.d(evt.i);
        epcVar.d(evt.j);
        Charset charset = enq.a;
        ArrayList arrayList = new ArrayList(epcVar.e + 7);
        if (sSLSocketFactory == null) {
            arrayList.add(fbw.b);
        } else {
            arrayList.add(fbw.a);
        }
        if (z) {
            arrayList.add(fbw.d);
        } else {
            arrayList.add(fbw.c);
        }
        String str3 = fcbVar.g;
        arrayList.add(new fdk(fdk.e, str2));
        arrayList.add(new fdk(fdk.c, str));
        arrayList.add(new fdk(evt.j.a, str3));
        arrayList.add(fbw.e);
        arrayList.add(fbw.f);
        Logger logger = fbm.a;
        int iA = epcVar.a();
        byte[][] bArr = new byte[iA][];
        Object[] objArr = epcVar.d;
        if (objArr instanceof byte[][]) {
            System.arraycopy(objArr, 0, bArr, 0, epcVar.a());
        } else {
            for (int i2 = 0; i2 < epcVar.e; i2++) {
                int i3 = i2 + i2;
                bArr[i3] = epcVar.h(i2);
                bArr[i3 + 1] = epcVar.j(i2);
            }
        }
        int i4 = 0;
        for (int i5 = 0; i5 < iA; i5 += 2) {
            byte[] bArr2 = bArr[i5];
            byte[] bArr3 = bArr[i5 + 1];
            if (fbm.a(bArr2, fbm.b)) {
                i = i4 + 2;
                bArr[i4] = bArr2;
                bArr[i4 + 1] = enq.b.h(bArr3).getBytes(StandardCharsets.US_ASCII);
            } else {
                for (byte b : bArr3) {
                    if (b < 32 || b > 126) {
                        fbm.a.logp(Level.WARNING, "io.grpc.internal.TransportFrameUtil", "toHttp2Headers", "Metadata key=" + new String(bArr2, StandardCharsets.US_ASCII) + ", value=" + Arrays.toString(bArr3) + " contains invalid ASCII characters");
                        break;
                    }
                }
                i = i4 + 2;
                bArr[i4] = bArr2;
                bArr[i4 + 1] = bArr3;
            }
            i4 = i;
        }
        if (i4 != iA) {
            bArr = (byte[][]) Arrays.copyOfRange(bArr, 0, i4);
        }
        for (int i6 = 0; i6 < bArr.length; i6 += 2) {
            fvn fvnVarH = fvn.h(bArr[i6]);
            if (fvnVarH.b() != 0 && fvnVarH.a(0) != 58) {
                arrayList.add(new fdk(fvnVarH, fvn.h(bArr[i6 + 1])));
            }
        }
        this.v = arrayList;
        fcg fcgVar = this.L;
        fcb fcbVar2 = this.G;
        eqo eqoVar = fcgVar.r;
        if (eqoVar != null) {
            fcbVar2.k.i(eqoVar, etx.MISCARRIED, true, new epc());
        } else if (fcgVar.m.size() < fcgVar.w) {
            fcgVar.o(fcbVar2);
        } else {
            fcgVar.x.add(fcbVar2);
            fcgVar.m(fcbVar2);
        }
    }

    public final void u(fvk fvkVar, boolean z, int i) throws Throwable {
        Throwable th;
        int i2 = this.J - (((int) fvkVar.b) + i);
        this.J = i2;
        this.K -= i;
        if (i2 < 0) {
            this.A.c(this.F, fdi.FLOW_CONTROL_ERROR);
            this.L.j(this.F, eqo.k.e("Received data size exceeded our receiving window size"), etx.PROCESSED, false, null, null);
            return;
        }
        fck fckVar = new fck(fvkVar);
        eqo eqoVar = this.q;
        boolean z2 = false;
        if (eqoVar != null) {
            Charset charset = this.s;
            eyx eyxVar = eza.a;
            charset.getClass();
            int iF = fckVar.f();
            byte[] bArr = new byte[iF];
            fckVar.k(bArr, 0, iF);
            this.q = eqoVar.a("DATA-----------------------------\n".concat(new String(bArr, charset)));
            fckVar.close();
            if (this.q.p.length() > 1000 || z) {
                r(this.q, false, this.r);
                return;
            }
            return;
        }
        if (!this.t) {
            fckVar.close();
            r(eqo.k.e("headers not received before payload"), false, new epc());
            return;
        }
        int iF2 = fckVar.f();
        try {
            if (this.n) {
                ess.a.logp(Level.INFO, "io.grpc.internal.AbstractClientStream$TransportState", "inboundDataReceived", "Received data on closed stream");
                fckVar.close();
            } else {
                try {
                    this.a.b(fckVar);
                } catch (Throwable th2) {
                    try {
                        q(th2);
                    } catch (Throwable th3) {
                        th = th3;
                        if (!z2) {
                            throw th;
                        }
                        fckVar.close();
                        throw th;
                    }
                }
            }
            if (z) {
                if (iF2 > 0) {
                    this.q = eqo.k.e("Received unexpected EOS on non-empty DATA frame from server");
                } else {
                    this.q = eqo.k.e("Received unexpected EOS on empty DATA frame from server");
                }
                epc epcVar = new epc();
                this.r = epcVar;
                h(this.q, false, epcVar);
            }
        } catch (Throwable th4) {
            th = th4;
            z2 = true;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public evw(fcb fcbVar, int i, fbh fbhVar, Object obj, fbu fbuVar, fcr fcrVar, fcg fcgVar, int i2, elt eltVar) {
        this(i, fbhVar, fcbVar.b, eltVar);
        this.G = fcbVar;
        this.w = new fvk();
        this.x = false;
        this.y = false;
        this.z = false;
        this.C = true;
        this.F = -1;
        this.u = obj;
        this.A = fbuVar;
        this.B = fcrVar;
        this.L = fcgVar;
        this.J = i2;
        this.K = i2;
        this.I = i2;
        int i3 = ffg.a;
        this.D = fff.a;
    }
}
