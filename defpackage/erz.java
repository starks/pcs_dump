package defpackage;

import android.os.Parcel;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class erz implements fbj {
    protected final erm a;
    protected final elp b;
    final int c;
    protected esi d;
    protected fbh e;
    protected fbk f;
    private InputStream g;
    private int h;
    private int i;
    private ArrayList j;
    private boolean k;
    private int l;
    private int m;
    private erx n;
    private int o;
    private int p;
    private boolean q;
    private boolean r;
    private final erl s;

    public erz(erm ermVar, elp elpVar, int i) {
        this.n = erx.UNINITIALIZED;
        this.a = ermVar;
        this.b = elpVar;
        this.c = i;
    }

    private final void n(eqo eqoVar, eqo eqoVar2, boolean z) {
        if (h()) {
            return;
        }
        boolean z2 = this.n != erx.UNINITIALIZED;
        g(erx.CLOSED);
        if (z2) {
            this.e.i();
        }
        if (!z) {
            erm ermVar = this.a;
            int i = this.c;
            try {
                esj esjVarC = esj.c();
                try {
                    esjVarC.a().writeInt(0);
                    fbc.g(esjVarC.a(), fbc.f(esjVarC.a(), eqoVar) | 8);
                    ermVar.j(i, esjVarC);
                    esjVarC.close();
                } finally {
                }
            } catch (eqp e) {
                erm.b.logp(Level.FINER, "io.grpc.binder.internal.BinderTransport", "sendOutOfBandClose", "Failed sending oob close transaction", (Throwable) e);
            }
        }
        if (z2) {
            i(eqoVar2);
        }
        this.a.k(this.c);
    }

    private final void o() {
        ery eryVar;
        if (this.i == 0) {
            int i = 0;
            int i2 = 0;
            while (i < this.j.size() && (eryVar = (ery) this.j.get(i)) != null) {
                i++;
                i2 += eryVar.c;
                if (eryVar.d) {
                    this.i = i;
                    p(i2);
                    return;
                }
            }
        }
    }

    private final void p(int i) {
        fbh fbhVar = this.e;
        fbhVar.getClass();
        fbhVar.b();
        this.e.c();
        this.o++;
    }

    private final boolean q() {
        return this.g != null || this.i > 0;
    }

    private final boolean r() {
        return this.k && this.h >= this.l;
    }

    @Override // defpackage.fbj
    public final synchronized InputStream a() {
        ert ertVar;
        InputStream inputStream = this.g;
        if (inputStream != null) {
            this.g = null;
        } else if (this.p <= 0 || !q()) {
            inputStream = null;
        } else {
            int i = this.i;
            this.i = 0;
            if (i == 1) {
                ery eryVar = (ery) this.j.remove(0);
                int i2 = eryVar.c;
                InputStream inputStream2 = eryVar.a;
                ertVar = new ert(eryVar.b);
            } else {
                byte[][] bArr = new byte[i][];
                int length = 0;
                for (int i3 = 0; i3 < i; i3++) {
                    byte[] bArr2 = ((ery) this.j.remove(0)).b;
                    bArr[i3] = bArr2;
                    length += bArr2.length;
                }
                ertVar = new ert(bArr, length);
            }
            this.h += i;
            o();
            inputStream = ertVar;
        }
        if (inputStream != null) {
            this.p--;
        } else {
            this.r = false;
            if (r() && !h()) {
                g(erx.ALL_MESSAGES_DELIVERED);
                d();
                return null;
            }
        }
        return inputStream;
    }

    public final void b(eqo eqoVar) {
        n(eqoVar, eqoVar, false);
    }

    final void c(eqo eqoVar) {
        n(eqo.c, eqoVar, false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x0070, code lost:
    
        r4.q = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0073, code lost:
    
        return;
     */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0067 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x003f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0008 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    final void d() {
        /*
            r4 = this;
            boolean r0 = r4.q
            if (r0 == 0) goto L5
            return
        L5:
            r0 = 1
            r4.q = r0
        L8:
            erx r1 = r4.n
            int r1 = r1.ordinal()
            r2 = 3
            r3 = 2
            if (r1 == r3) goto L1e
            if (r1 == r2) goto L15
            goto L70
        L15:
            fbk r1 = r4.f
            if (r1 == 0) goto L70
            boolean r1 = r4.k
            if (r1 == 0) goto L70
            goto L37
        L1e:
            fbk r1 = r4.f
            if (r1 == 0) goto L70
            boolean r1 = r4.r
            if (r1 != 0) goto L70
            boolean r1 = r4.q()
            if (r1 == 0) goto L31
            int r1 = r4.p
            if (r1 == 0) goto L70
            goto L37
        L31:
            boolean r1 = r4.r()
            if (r1 == 0) goto L70
        L37:
            erx r1 = r4.n
            int r1 = r1.ordinal()
            if (r1 == r3) goto L48
            if (r1 != r2) goto L42
            goto L63
        L42:
            java.lang.AssertionError r4 = new java.lang.AssertionError
            r4.<init>()
            throw r4
        L48:
            boolean r1 = r4.r
            if (r1 != 0) goto L8
            boolean r1 = r4.q()
            if (r1 == 0) goto L5a
            r4.r = r0
            fbk r1 = r4.f
            r1.d(r4)
            goto L8
        L5a:
            boolean r1 = r4.k
            if (r1 == 0) goto L8
            erx r1 = defpackage.erx.ALL_MESSAGES_DELIVERED
            r4.g(r1)
        L63:
            boolean r1 = r4.k
            if (r1 == 0) goto L8
            erx r1 = defpackage.erx.SUFFIX_DELIVERED
            r4.g(r1)
            r4.j()
            goto L8
        L70:
            r0 = 0
            r4.q = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.erz.d():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x00a4 A[Catch: eqp -> 0x0125, all -> 0x012d, TryCatch #0 {eqp -> 0x0125, blocks: (B:7:0x0009, B:9:0x0016, B:11:0x0022, B:12:0x002a, B:15:0x002f, B:17:0x0043, B:20:0x004e, B:22:0x0052, B:24:0x005c, B:25:0x005f, B:29:0x0066, B:31:0x006a, B:34:0x0070, B:36:0x0074, B:40:0x007b, B:41:0x0089, B:42:0x0092, B:44:0x00a4, B:45:0x00ad, B:47:0x00b5, B:49:0x00c2, B:50:0x00c8, B:51:0x00d1, B:52:0x00e8, B:54:0x00eb, B:55:0x00ef, B:57:0x00f3, B:59:0x00f7, B:62:0x00ff, B:63:0x0107, B:66:0x0116, B:67:0x0120), top: B:77:0x0009, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00ad A[Catch: eqp -> 0x0125, all -> 0x012d, TryCatch #0 {eqp -> 0x0125, blocks: (B:7:0x0009, B:9:0x0016, B:11:0x0022, B:12:0x002a, B:15:0x002f, B:17:0x0043, B:20:0x004e, B:22:0x0052, B:24:0x005c, B:25:0x005f, B:29:0x0066, B:31:0x006a, B:34:0x0070, B:36:0x0074, B:40:0x007b, B:41:0x0089, B:42:0x0092, B:44:0x00a4, B:45:0x00ad, B:47:0x00b5, B:49:0x00c2, B:50:0x00c8, B:51:0x00d1, B:52:0x00e8, B:54:0x00eb, B:55:0x00ef, B:57:0x00f3, B:59:0x00f7, B:62:0x00ff, B:63:0x0107, B:66:0x0116, B:67:0x0120), top: B:77:0x0009, outer: #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    final synchronized void e(android.os.Parcel r11) {
        /*
            Method dump skipped, instructions count: 304
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.erz.e(android.os.Parcel):void");
    }

    final void f(esi esiVar, fbk fbkVar) {
        this.d = esiVar;
        this.e = esiVar.c;
        this.f = fbkVar;
        if (h()) {
            return;
        }
        g(erx.INITIALIZED);
    }

    protected final void g(erx erxVar) {
        erx erxVar2 = this.n;
        int iOrdinal = erxVar.ordinal();
        if (iOrdinal == 1) {
            clq.M(erxVar2 == erx.UNINITIALIZED, erxVar2, erxVar);
        } else if (iOrdinal == 2) {
            clq.M(erxVar2 == erx.INITIALIZED || erxVar2 == erx.UNINITIALIZED, erxVar2, erxVar);
        } else if (iOrdinal == 3) {
            clq.M(erxVar2 == erx.PREFIX_DELIVERED, erxVar2, erxVar);
        } else if (iOrdinal == 4) {
            clq.M(erxVar2 == erx.ALL_MESSAGES_DELIVERED, erxVar2, erxVar);
        } else if (iOrdinal != 5) {
            throw new AssertionError();
        }
        this.n = erxVar;
    }

    protected final boolean h() {
        return this.n == erx.CLOSED;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [fax, fbk] */
    protected final void i(eqo eqoVar) {
        this.f.a(eqoVar);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [fax, fbk] */
    protected final void j() {
        this.f.b();
    }

    protected final void k(int i, Parcel parcel) {
        fbh fbhVar;
        elp elpVar = this.b;
        String string = parcel.readString();
        epc epcVarA = esd.a(parcel, elpVar);
        fbh fbhVar2 = fbh.a;
        List list = this.s.a;
        if (list.isEmpty()) {
            fbhVar = fbh.a;
        } else {
            int size = list.size();
            fjp[] fjpVarArr = new fjp[size];
            for (int i2 = 0; i2 < size; i2++) {
                fjpVarArr[i2] = ((eqg) list.get(i2)).a();
            }
            fbhVar = new fbh(fjpVarArr);
        }
        esi esiVar = new esi(this.s, this.c, fbhVar, null);
        eqo eqoVarA = this.s.a((i & 16) != 0 ? new esp(this, esiVar, this.b) : new ese(this, esiVar, this.b), string, epcVarA);
        if (!eqoVarA.g()) {
            b(eqoVarA);
            return;
        }
        this.f.getClass();
        if (this.a.l()) {
            this.f.e();
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [fax, fbk] */
    public final void l(eqo eqoVar) {
        if (h()) {
            return;
        }
        g(erx.CLOSED);
        this.e.i();
        this.f.a(eqo.b);
    }

    public final void m() {
        this.p += 2;
        d();
    }

    public final synchronized String toString() {
        StringBuilder sb;
        String simpleName = getClass().getSimpleName();
        boolean z = this.k;
        String strValueOf = String.valueOf(this.n);
        boolean zQ = q();
        fbk fbkVar = this.f;
        sb = new StringBuilder();
        sb.append(simpleName);
        sb.append("[SfxA=");
        sb.append(z);
        sb.append("/De=");
        sb.append(strValueOf);
        sb.append("/Msg=");
        sb.append(zQ);
        sb.append("/Lis=");
        sb.append(fbkVar != null);
        sb.append("]");
        return sb.toString();
    }

    public erz(erl erlVar, elp elpVar, int i) {
        this((erm) erlVar, elpVar, i);
        this.s = erlVar;
    }
}
