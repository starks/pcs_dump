package defpackage;

import java.io.IOException;
import java.net.ConnectException;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.Socket;
import java.net.SocketException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class frz extends fti {
    public static final /* synthetic */ int l = 0;
    public final fre a;
    public Socket b;
    public Socket c;
    public fqn d;
    public ftv e;
    public fvm f;
    public fvl g;
    public boolean h;
    public int i;
    public final List j;
    public long k;
    private fqv n;
    private boolean o;
    private int p;
    private int q;
    private int r;

    public frz(fre freVar) {
        freVar.getClass();
        this.a = freVar;
        this.r = 1;
        this.j = new ArrayList();
        this.k = Long.MAX_VALUE;
    }

    private final void m(int i, int i2) throws IOException {
        Socket socket;
        int i3;
        fre freVar = this.a;
        Proxy proxy = freVar.b;
        Proxy.Type type = proxy.type();
        if (type != null && ((i3 = fry.a[type.ordinal()]) == 1 || i3 == 2)) {
            socket = freVar.a.b.createSocket();
            socket.getClass();
        } else {
            socket = new Socket(proxy);
        }
        this.b = socket;
        socket.setSoTimeout(i2);
        try {
            fup.c.f(socket, this.a.c, i);
            try {
                this.f = new fvz(fvu.b(socket));
                this.g = fwv.f(fvu.a(socket));
            } catch (NullPointerException e) {
                if (fjs.c(e.getMessage(), "throw with null exception")) {
                    throw new IOException(e);
                }
            }
        } catch (ConnectException e2) {
            InetSocketAddress inetSocketAddress = this.a.c;
            Objects.toString(inetSocketAddress);
            ConnectException connectException = new ConnectException("Failed to connect to ".concat(inetSocketAddress.toString()));
            connectException.initCause(e2);
            throw connectException;
        }
    }

    private final void n() throws SocketException {
        Socket socket = this.c;
        socket.getClass();
        fvm fvmVar = this.f;
        fvmVar.getClass();
        fvl fvlVar = this.g;
        fvlVar.getClass();
        socket.setSoTimeout(0);
        ftg ftgVar = new ftg(frn.a);
        ftgVar.c = socket;
        ftgVar.d = frh.f + " " + this.a.a.h.c;
        ftgVar.e = fvmVar;
        ftgVar.f = fvlVar;
        ftgVar.g = this;
        ftv ftvVar = new ftv(ftgVar);
        this.e = ftvVar;
        this.r = ftv.a.d();
        frn frnVar = frn.a;
        frnVar.getClass();
        ftvVar.w.b();
        ftvVar.w.i(ftvVar.s);
        if (ftvVar.s.c() != 65535) {
            ftvVar.w.j(0, r1 - 65535);
        }
        frnVar.a().b(new frl(ftvVar.e, ftvVar.x), 0L);
    }

    public final Socket a() {
        Socket socket = this.c;
        socket.getClass();
        return socket;
    }

    public final void b() throws IOException {
        Socket socket = this.b;
        if (socket != null) {
            frh.s(socket);
        }
    }

    public final synchronized void c() {
        this.p++;
    }

    public final synchronized void d() {
        this.o = true;
    }

    public final synchronized void e() {
        this.h = true;
    }

    @Override // defpackage.fti
    public final void f(fuc fucVar) {
        fucVar.g(fta.h, null);
    }

    public final synchronized void g(frw frwVar, IOException iOException) {
        if (iOException instanceof fuj) {
            fuj fujVar = (fuj) iOException;
            if (fujVar.a == fta.h) {
                int i = this.q + 1;
                this.q = i;
                if (i > 1) {
                    this.h = true;
                    this.i++;
                }
            } else if (fujVar.a != fta.i || !frwVar.l) {
                this.h = true;
                this.i++;
            }
        } else if (!i() || (iOException instanceof fsz)) {
            this.h = true;
            if (this.p == 0) {
                fqu fquVar = frwVar.a;
                fre freVar = this.a;
                if (freVar.b.type() != Proxy.Type.DIRECT) {
                    fpw fpwVar = freVar.a;
                    fpwVar.g.connectFailed(fpwVar.h.e(), freVar.b.address(), iOException);
                }
                fquVar.w.b(freVar);
                this.i++;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x00b7 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean h(defpackage.fpw r6, java.util.List r7) {
        /*
            r5 = this;
            byte[] r0 = defpackage.frh.a
            java.util.List r0 = r5.j
            int r0 = r0.size()
            int r1 = r5.r
            r2 = 0
            if (r0 >= r1) goto Ld5
            boolean r0 = r5.h
            if (r0 == 0) goto L13
            goto Ld5
        L13:
            fre r0 = r5.a
            fpw r0 = r0.a
            boolean r0 = r0.a(r6)
            if (r0 == 0) goto Ld5
            fqq r0 = r6.h
            fre r1 = r5.a
            fpw r1 = r1.a
            fqq r1 = r1.h
            java.lang.String r0 = r0.c
            java.lang.String r1 = r1.c
            boolean r0 = defpackage.fjs.c(r0, r1)
            r1 = 1
            if (r0 == 0) goto L31
            return r1
        L31:
            ftv r0 = r5.e
            if (r0 != 0) goto L36
            return r2
        L36:
            if (r7 == 0) goto Ld5
            boolean r0 = r7.isEmpty()
            if (r0 == 0) goto L40
            goto Ld5
        L40:
            java.util.Iterator r7 = r7.iterator()
        L44:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto Ld5
            java.lang.Object r0 = r7.next()
            fre r0 = (defpackage.fre) r0
            java.net.Proxy r3 = r0.b
            java.net.Proxy$Type r3 = r3.type()
            java.net.Proxy$Type r4 = java.net.Proxy.Type.DIRECT
            if (r3 != r4) goto L44
            fre r3 = r5.a
            java.net.Proxy r3 = r3.b
            java.net.Proxy$Type r3 = r3.type()
            java.net.Proxy$Type r4 = java.net.Proxy.Type.DIRECT
            if (r3 != r4) goto L44
            fre r3 = r5.a
            java.net.InetSocketAddress r0 = r0.c
            java.net.InetSocketAddress r3 = r3.c
            boolean r0 = defpackage.fjs.c(r3, r0)
            if (r0 == 0) goto L44
            javax.net.ssl.HostnameVerifier r7 = r6.d
            fvd r0 = defpackage.fvd.a
            if (r7 != r0) goto Ld5
            fqq r7 = r6.h
            fre r0 = r5.a
            int r3 = r7.d
            fpw r0 = r0.a
            fqq r0 = r0.h
            int r4 = r0.d
            if (r3 == r4) goto L87
            goto Ld5
        L87:
            java.lang.String r3 = r7.c
            java.lang.String r0 = r0.c
            boolean r0 = defpackage.fjs.c(r3, r0)
            if (r0 == 0) goto L92
            goto Lb7
        L92:
            boolean r0 = r5.o
            if (r0 != 0) goto Ld5
            fqn r0 = r5.d
            if (r0 == 0) goto Ld5
            java.util.List r0 = r0.a()
            boolean r3 = r0.isEmpty()
            if (r3 != 0) goto Ld5
            java.lang.String r7 = r7.c
            fvd r3 = defpackage.fvd.a
            java.lang.Object r0 = r0.get(r2)
            r0.getClass()
            java.security.cert.X509Certificate r0 = (java.security.cert.X509Certificate) r0
            boolean r7 = r3.a(r7, r0)
            if (r7 == 0) goto Ld5
        Lb7:
            fqc r7 = r6.e     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> Ld5
            r7.getClass()     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> Ld5
            fqq r6 = r6.h     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> Ld5
            java.lang.String r6 = r6.c     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> Ld5
            fqn r5 = r5.d     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> Ld5
            r5.getClass()     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> Ld5
            java.util.List r5 = r5.a()     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> Ld5
            r5.getClass()     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> Ld5
            frx r0 = new frx     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> Ld5
            r0.<init>(r7, r5, r6, r1)     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> Ld5
            r7.a(r6, r0)     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> Ld5
            return r1
        Ld5:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.frz.h(fpw, java.util.List):boolean");
    }

    public final boolean i() {
        return this.e != null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x0280, code lost:
    
        if (r8.f == null) goto L102;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x0282, code lost:
    
        r9 = r4.getEnabledProtocols();
        r9.getClass();
        r9 = defpackage.frh.z(r9, r8.f, defpackage.fhe.b);
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x0292, code lost:
    
        r9 = r4.getEnabledProtocols();
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x0296, code lost:
    
        r11 = r4.getSupportedCipherSuites();
        r11.getClass();
        r12 = defpackage.fqd.a;
        r13 = defpackage.frh.a;
        r14 = r11.length;
        r15 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x02a5, code lost:
    
        if (r15 >= r14) goto L249;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x02ad, code lost:
    
        if (r12.compare(r11[r15], "TLS_FALLBACK_SCSV") != 0) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x02b0, code lost:
    
        r15 = r15 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x02b3, code lost:
    
        r15 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x02b4, code lost:
    
        if (r6 == false) goto L114;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x02b7, code lost:
    
        if (r15 == (-1)) goto L114;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x02b9, code lost:
    
        r7.getClass();
        r5 = r11[r15];
        r5.getClass();
        r6 = java.util.Arrays.copyOf(r7, r7.length + 1);
        r6.getClass();
        r7 = (java.lang.String[]) r6;
        r7[defpackage.ffh.Z(r7)] = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x02d6, code lost:
    
        r5 = new defpackage.fqe(r8).a((java.lang.String[]) java.util.Arrays.copyOf(r7, r7.length)).c((java.lang.String[]) java.util.Arrays.copyOf(r9, r9.length)).e();
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x02f9, code lost:
    
        if (r5.b() == null) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x02fb, code lost:
    
        r4.setEnabledProtocols(r5.f);
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x0304, code lost:
    
        if (r5.a() == null) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x0306, code lost:
    
        r4.setEnabledCipherSuites(r5.e);
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x030d, code lost:
    
        if (r8.d == false) goto L123;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x030f, code lost:
    
        defpackage.fup.c.c(r4, r0.h.c, r0.i);
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x031a, code lost:
    
        r4.startHandshake();
        r5 = r4.getSession();
        r6 = defpackage.fqn.d;
        r5.getClass();
        r6 = r6.H(r5);
        r7 = r0.d;
        r7.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x0337, code lost:
    
        if (r7.verify(r0.h.c, r5) != false) goto L131;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x0339, code lost:
    
        r5 = r6.a();
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x0341, code lost:
    
        if (r5.isEmpty() != false) goto L129;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x0343, code lost:
    
        r5 = r5.get(0);
        r5.getClass();
        r5 = (java.security.cert.X509Certificate) r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x03a4, code lost:
    
        throw new javax.net.ssl.SSLPeerUnverifiedException(defpackage.fjz.G("\n              |Hostname " + r0.h.c + " not verified:\n              |    certificate: " + defpackage.fqc.d.j(r5) + "\n              |    DN: " + r5.getSubjectDN().getName() + "\n              |    subjectAltNames: " + defpackage.ffh.H(defpackage.fvd.b(r5, 7), defpackage.fvd.b(r5, 2)) + "\n              "));
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x03b6, code lost:
    
        throw new javax.net.ssl.SSLPeerUnverifiedException(defpackage.a.z(r0.h.c, "Hostname ", " not verified (no certificates)"));
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x03b7, code lost:
    
        r5 = r0.e;
        r5.getClass();
        r17.d = new defpackage.fqn(r6.a, r6.b, r6.c, new defpackage.frx(r5, r6, r0, 0));
        r5.a(r0.h.c, new defpackage.acp(r17, 6));
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x03de, code lost:
    
        if (r8.d == false) goto L134;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x03e0, code lost:
    
        r0 = defpackage.fup.c.a(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x03e7, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x03e8, code lost:
    
        r17.c = r4;
        r17.f = new defpackage.fvz(defpackage.fvu.b(r4));
        r17.g = defpackage.fwv.f(defpackage.fvu.a(r4));
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x03ff, code lost:
    
        if (r0 == null) goto L157;
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x0409, code lost:
    
        if (defpackage.fjs.c(r0, defpackage.fqv.a.g) == false) goto L140;
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x040b, code lost:
    
        r0 = defpackage.fqv.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x0416, code lost:
    
        if (defpackage.fjs.c(r0, defpackage.fqv.b.g) == false) goto L143;
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x0418, code lost:
    
        r0 = defpackage.fqv.b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x0423, code lost:
    
        if (defpackage.fjs.c(r0, defpackage.fqv.e.g) == false) goto L146;
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x0425, code lost:
    
        r0 = defpackage.fqv.e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x0430, code lost:
    
        if (defpackage.fjs.c(r0, defpackage.fqv.d.g) == false) goto L149;
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x0432, code lost:
    
        r0 = defpackage.fqv.d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x043d, code lost:
    
        if (defpackage.fjs.c(r0, defpackage.fqv.c.g) == false) goto L152;
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x043f, code lost:
    
        r0 = defpackage.fqv.c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x044a, code lost:
    
        if (defpackage.fjs.c(r0, defpackage.fqv.f.g) == false) goto L155;
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x044c, code lost:
    
        r0 = defpackage.fqv.f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x045a, code lost:
    
        throw new java.io.IOException("Unexpected protocol: ".concat(r0));
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x045b, code lost:
    
        r0 = defpackage.fqv.b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x045d, code lost:
    
        r17.n = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x045f, code lost:
    
        defpackage.fup.c.i(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x0468, code lost:
    
        if (r17.n != defpackage.fqv.d) goto L162;
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x046a, code lost:
    
        n();
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x0473, code lost:
    
        if (r17.a.a() == false) goto L169;
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x0477, code lost:
    
        if (r17.b == null) goto L167;
     */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x0486, code lost:
    
        throw new defpackage.fsd(new java.net.ProtocolException("Too many tunnel connections attempted: 21"));
     */
    /* JADX WARN: Code restructure failed: missing block: B:169:0x0487, code lost:
    
        r17.k = java.lang.System.nanoTime();
     */
    /* JADX WARN: Code restructure failed: missing block: B:170:0x048d, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:171:0x048e, code lost:
    
        r5 = r2.d;
        r6 = r2.a;
        r7 = r4.getEnabledProtocols();
        r7.getClass();
        r7 = java.util.Arrays.toString(r7);
        r7.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:172:0x04c6, code lost:
    
        throw new java.net.UnknownServiceException("Unable to find acceptable protocols. isFallback=" + r5 + ", modes=" + r6 + ", supported protocols=" + r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:173:0x04c7, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:175:0x04c9, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:176:0x04ca, code lost:
    
        r4 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:177:0x04cb, code lost:
    
        if (r4 != null) goto L178;
     */
    /* JADX WARN: Code restructure failed: missing block: B:178:0x04cd, code lost:
    
        defpackage.fup.c.i(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:179:0x04d2, code lost:
    
        if (r4 != null) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:180:0x04d4, code lost:
    
        defpackage.frh.s(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:181:0x04d7, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x01cb, code lost:
    
        throw new java.io.IOException("TLS tunnel buffered too many bytes!");
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x01d4, code lost:
    
        if (r17.b != null) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x01e6, code lost:
    
        r0 = r17.a.a;
        r4 = r0.c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x01ec, code lost:
    
        if (r4 != null) goto L223;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x01f6, code lost:
    
        if (r0.i.contains(defpackage.fqv.e) == false) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x01f8, code lost:
    
        r17.c = r17.b;
        r17.n = defpackage.fqv.e;
        n();
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0205, code lost:
    
        r17.c = r17.b;
        r17.n = defpackage.fqv.b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x020f, code lost:
    
        r6 = r17.b;
        r7 = r0.h;
        r4 = r4.createSocket(r6, r7.c, r7.d, true);
        r4.getClass();
        r4 = (javax.net.ssl.SSLSocket) r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0221, code lost:
    
        r6 = r2.b;
        r7 = r2.a.size();
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0229, code lost:
    
        if (r6 >= r7) goto L245;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x022b, code lost:
    
        r8 = (defpackage.fqf) r2.a.get(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0237, code lost:
    
        if (r8.c(r4) == false) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0239, code lost:
    
        r2.b = r6 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x023e, code lost:
    
        r6 = r6 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0241, code lost:
    
        r8 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0242, code lost:
    
        if (r8 == null) goto L171;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0244, code lost:
    
        r6 = r2.b;
        r7 = r2.a.size();
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x024c, code lost:
    
        if (r6 >= r7) goto L247;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x025a, code lost:
    
        if (((defpackage.fqf) r2.a.get(r6)).c(r4) == false) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x025c, code lost:
    
        r6 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x025e, code lost:
    
        r6 = r6 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0261, code lost:
    
        r6 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0262, code lost:
    
        r2.c = r6;
        r6 = r2.d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0268, code lost:
    
        if (r8.e == null) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x026a, code lost:
    
        r7 = r4.getEnabledCipherSuites();
        r7.getClass();
        r7 = defpackage.frh.z(r7, r8.e, defpackage.fqd.a);
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x027a, code lost:
    
        r7 = r4.getEnabledCipherSuites();
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void j(int r18, int r19, int r20, boolean r21, defpackage.frw r22, defpackage.fqm r23) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 1353
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.frz.j(int, int, int, boolean, frw, fqm):void");
    }

    @Override // defpackage.fti
    public final synchronized void k(fui fuiVar) {
        fuiVar.getClass();
        this.r = fuiVar.d();
    }

    public final void l() {
        this.h = true;
    }

    public final String toString() {
        fqn fqnVar = this.d;
        String str = fqnVar != null ? fqnVar.b : "none";
        fre freVar = this.a;
        fqv fqvVar = this.n;
        StringBuilder sb = new StringBuilder("Connection{");
        fqq fqqVar = freVar.a.h;
        sb.append(fqqVar.c);
        sb.append(":");
        sb.append(fqqVar.d);
        sb.append(", proxy=");
        sb.append(freVar.b);
        sb.append(" hostAddress=");
        sb.append(freVar.c);
        sb.append(" cipherSuite=");
        sb.append(str);
        sb.append(" protocol=");
        sb.append(fqvVar);
        sb.append("}");
        return sb.toString();
    }
}
