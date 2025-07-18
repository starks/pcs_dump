package defpackage;

import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fsu extends fss {
    final /* synthetic */ fsy c;
    private final fqq d;
    private long e;
    private boolean f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fsu(fsy fsyVar, fqq fqqVar) {
        super(fsyVar);
        this.c = fsyVar;
        this.d = fqqVar;
        this.e = -1L;
        this.f = true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x007e, code lost:
    
        if (r8.f != false) goto L25;
     */
    @Override // defpackage.fss, defpackage.fwf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long b(defpackage.fvk r9, long r10) throws java.io.IOException {
        /*
            r8 = this;
            java.lang.String r0 = "expected chunk size and optional extensions but was \""
            boolean r1 = r8.a
            if (r1 != 0) goto Lce
            boolean r1 = r8.f
            r2 = -1
            if (r1 != 0) goto Le
            goto La6
        Le:
            long r4 = r8.e
            r6 = 0
            int r1 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r1 == 0) goto L1a
            int r1 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r1 != 0) goto L80
        L1a:
            int r1 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r1 == 0) goto L25
            fsy r1 = r8.c
            fvm r1 = r1.c
            r1.n()
        L25:
            fsy r1 = r8.c     // Catch: java.lang.NumberFormatException -> Lc3
            fvm r1 = r1.c     // Catch: java.lang.NumberFormatException -> Lc3
            long r4 = r1.i()     // Catch: java.lang.NumberFormatException -> Lc3
            r8.e = r4     // Catch: java.lang.NumberFormatException -> Lc3
            fsy r1 = r8.c     // Catch: java.lang.NumberFormatException -> Lc3
            fvm r1 = r1.c     // Catch: java.lang.NumberFormatException -> Lc3
            java.lang.String r1 = r1.n()     // Catch: java.lang.NumberFormatException -> Lc3
            java.lang.CharSequence r1 = defpackage.fjz.i(r1)     // Catch: java.lang.NumberFormatException -> Lc3
            java.lang.String r1 = r1.toString()     // Catch: java.lang.NumberFormatException -> Lc3
            long r4 = r8.e     // Catch: java.lang.NumberFormatException -> Lc3
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 < 0) goto La7
            int r4 = r1.length()     // Catch: java.lang.NumberFormatException -> Lc3
            if (r4 <= 0) goto L53
            java.lang.String r4 = ";"
            boolean r4 = defpackage.fjz.E(r1, r4)     // Catch: java.lang.NumberFormatException -> Lc3
            if (r4 == 0) goto La7
        L53:
            long r0 = r8.e
            int r0 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r0 != 0) goto L7c
            r0 = 0
            r8.f = r0
            fsy r0 = r8.c
            fsr r1 = r0.f
            fqo r1 = r1.b()
            r0.g = r1
            fsy r0 = r8.c
            fqu r1 = r0.a
            r1.getClass()
            fqq r4 = r8.d
            fqo r0 = r0.g
            r0.getClass()
            fqi r1 = r1.j
            defpackage.fsk.a(r1, r4, r0)
            r8.c()
        L7c:
            boolean r0 = r8.f
            if (r0 == 0) goto La6
        L80:
            long r0 = r8.e
            long r10 = java.lang.Math.min(r10, r0)
            long r9 = super.b(r9, r10)
            int r11 = (r9 > r2 ? 1 : (r9 == r2 ? 0 : -1))
            if (r11 == 0) goto L94
            long r0 = r8.e
            long r0 = r0 - r9
            r8.e = r0
            return r9
        L94:
            fsy r9 = r8.c
            frz r9 = r9.b
            r9.e()
            java.net.ProtocolException r9 = new java.net.ProtocolException
            java.lang.String r10 = "unexpected end of stream"
            r9.<init>(r10)
            r8.c()
            throw r9
        La6:
            return r2
        La7:
            java.net.ProtocolException r9 = new java.net.ProtocolException     // Catch: java.lang.NumberFormatException -> Lc3
            long r10 = r8.e     // Catch: java.lang.NumberFormatException -> Lc3
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.NumberFormatException -> Lc3
            r8.<init>(r0)     // Catch: java.lang.NumberFormatException -> Lc3
            r8.append(r10)     // Catch: java.lang.NumberFormatException -> Lc3
            r8.append(r1)     // Catch: java.lang.NumberFormatException -> Lc3
            java.lang.String r10 = "\""
            r8.append(r10)     // Catch: java.lang.NumberFormatException -> Lc3
            java.lang.String r8 = r8.toString()     // Catch: java.lang.NumberFormatException -> Lc3
            r9.<init>(r8)     // Catch: java.lang.NumberFormatException -> Lc3
            throw r9     // Catch: java.lang.NumberFormatException -> Lc3
        Lc3:
            r8 = move-exception
            java.net.ProtocolException r9 = new java.net.ProtocolException
            java.lang.String r8 = r8.getMessage()
            r9.<init>(r8)
            throw r9
        Lce:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "closed"
            r8.<init>(r9)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fsu.b(fvk, long):long");
    }

    @Override // defpackage.fwf, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.a) {
            return;
        }
        if (this.f && !frh.E(this, TimeUnit.MILLISECONDS)) {
            this.c.b.e();
            c();
        }
        d();
    }
}
