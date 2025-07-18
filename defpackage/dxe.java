package defpackage;

import com.google.fcp.client.http.HttpClientForNative;
import java.net.CookieHandler;
import java.net.HttpURLConnection;
import java.net.ProtocolException;
import java.net.SocketTimeoutException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dxe extends HttpClientForNative.HttpRequestHandle {
    public final dxh a;
    public final dxb b;
    public final int c;
    public final int d;
    public final int e;
    public final boolean f;
    public final boolean g;
    public Future i;
    private final ExecutorService o;
    private final int p;
    private final int q;
    private final double r;
    private final fsc t;
    public Runnable h = new bkp(7);
    public int n = 1;
    private volatile long s = 0;
    public volatile long j = 0;
    public volatile long k = 0;
    public volatile long l = 0;
    public volatile boolean m = false;

    public dxe(dxh dxhVar, fsc fscVar, ExecutorService executorService, dxb dxbVar, int i, int i2, int i3, int i4, int i5, boolean z, boolean z2, double d) {
        this.a = dxhVar;
        this.t = fscVar;
        this.o = executorService;
        this.b = dxbVar;
        this.p = i;
        this.q = i2;
        this.c = i3;
        this.d = i4;
        this.e = i5;
        this.f = z;
        this.g = z2;
        this.r = d;
    }

    private final void s(boolean z) throws dxa {
        if (z) {
            return;
        }
        this.n = 4;
        throw new dxa();
    }

    @Override // com.google.fcp.client.http.HttpClientForNative.HttpRequestHandle, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.t.S(new chg(this, 3));
    }

    public final String g(String str) {
        for (dxf dxfVar : this.a.d) {
            if (clq.T(str, dxfVar.b)) {
                return dxfVar.c;
            }
        }
        return null;
    }

    @Override // com.google.fcp.client.http.HttpClientForNative.HttpRequestHandle
    public final byte[] getTotalSentReceivedBytes() {
        double d = this.m ? this.r : 1.0d;
        asr asrVar = (asr) dxj.a.createBuilder();
        long j = ((long) (this.s * d)) + this.j;
        if (!asrVar.a.isMutable()) {
            asrVar.B();
        }
        ((dxj) asrVar.a).b = j;
        long j2 = ((long) (this.k * d)) + this.l;
        if (!asrVar.a.isMutable()) {
            asrVar.B();
        }
        ((dxj) asrVar.a).c = j2;
        return ((dxj) asrVar.z()).toByteArray();
    }

    public final synchronized void h() {
        if (this.n == 4) {
            throw new dxa();
        }
    }

    public final void i(HttpURLConnection httpURLConnection, long j, String str) throws ProtocolException, dxc {
        String str2;
        int iB = dxg.b(this.a.c);
        if (iB == 0) {
            iB = dxg.h;
        }
        if (iB == 0) {
            throw null;
        }
        switch (iB - 2) {
            case 1:
                str2 = "HEAD";
                break;
            case 2:
                str2 = "GET";
                break;
            case 3:
                str2 = "POST";
                break;
            case 4:
                str2 = "PUT";
                break;
            case 5:
                str2 = "PATCH";
                break;
            case 6:
                str2 = "DELETE";
                break;
            default:
                int iB2 = dxg.b(this.a.c);
                if (iB2 == 0) {
                    iB2 = dxg.h;
                }
                throw new dwx(String.format("unexpected method: %s", Integer.valueOf(dxg.a(iB2))));
        }
        try {
            httpURLConnection.setRequestMethod(str2);
            for (dxf dxfVar : this.a.d) {
                httpURLConnection.addRequestProperty(dxfVar.b, dxfVar.c);
            }
            boolean z = this.g;
            if (z && str == null) {
                httpURLConnection.setRequestProperty("Accept-Encoding", "gzip");
            } else if (!z && str != null) {
                throw new dxc("cannot support Accept-Encoding header");
            }
            int i = this.p;
            if (i >= 0) {
                httpURLConnection.setConnectTimeout(i);
            }
            int i2 = this.q;
            if (i2 >= 0) {
                httpURLConnection.setReadTimeout(i2);
            }
            httpURLConnection.setDoInput(true);
            if (this.a.e) {
                httpURLConnection.setDoOutput(true);
                if (j >= 0) {
                    httpURLConnection.setFixedLengthStreamingMode(j);
                } else {
                    httpURLConnection.setChunkedStreamingMode(this.c);
                }
            } else if (j > 0) {
                throw new dxc("Content-Length > 0 but no request body available");
            }
            httpURLConnection.setUseCaches(false);
            httpURLConnection.setInstanceFollowRedirects(true);
            if (CookieHandler.getDefault() != null) {
                throw new IllegalStateException("must not set a CookieHandler");
            }
            this.s += str2.length() + 1 + this.a.b.length() + 11;
            for (dxf dxfVar2 : this.a.d) {
                this.s += dxfVar2.b.length() + 2 + dxfVar2.c.length() + 2;
            }
            this.s += 2;
        } catch (ProtocolException e) {
            throw new dwx("unexpected ProtocolException", e);
        }
    }

    public final synchronized void j(String str, Exception exc) {
        int i = this.n;
        this.n = 4;
        int i2 = eis.p;
        if (exc instanceof SocketTimeoutException) {
            i2 = eis.e;
        } else if (exc instanceof dxc) {
            i2 = eis.d;
        }
        r(i2, String.format("%s (%s)", str, exc), i);
    }

    public final synchronized void k(byte[] bArr, int i) {
        h();
        s(d(bArr, 0, i));
    }

    public final synchronized void l(long j) {
        if (this.n == 4) {
            return;
        }
        if (j > -1) {
            this.l = j;
        }
        this.n = 4;
        b();
    }

    public final synchronized void m(byte[] bArr) {
        h();
        this.n = 3;
        s(e(bArr));
    }

    public final synchronized void n(byte[] bArr, long j, int[] iArr) {
        h();
        s(f(bArr, j, iArr));
    }

    public final synchronized void o() {
        if (this.n != 1) {
            throw new IllegalStateException("must not call perform() more than once");
        }
        this.n = 2;
        this.i = this.o.submit(new Runnable() { // from class: dwz
            /* JADX WARN: Removed duplicated region for block: B:120:0x0299  */
            /* JADX WARN: Removed duplicated region for block: B:125:0x02b9 A[Catch: IOException -> 0x0334, all -> 0x036d, dxa -> 0x0375, TryCatch #5 {IOException -> 0x0334, blocks: (B:123:0x02ae, B:125:0x02b9, B:148:0x0311, B:166:0x0333, B:165:0x0330, B:126:0x02c3), top: B:209:0x02ae }] */
            /* JADX WARN: Removed duplicated region for block: B:126:0x02c3 A[Catch: IOException -> 0x0334, all -> 0x036d, dxa -> 0x0375, TRY_LEAVE, TryCatch #5 {IOException -> 0x0334, blocks: (B:123:0x02ae, B:125:0x02b9, B:148:0x0311, B:166:0x0333, B:165:0x0330, B:126:0x02c3), top: B:209:0x02ae }] */
            /* JADX WARN: Removed duplicated region for block: B:133:0x02d7  */
            /* JADX WARN: Removed duplicated region for block: B:137:0x02e2 A[Catch: all -> 0x0320, TryCatch #0 {all -> 0x0320, blocks: (B:134:0x02d8, B:137:0x02e2, B:144:0x0302, B:140:0x02f7), top: B:201:0x02d8, outer: #11 }] */
            /* JADX WARN: Removed duplicated region for block: B:144:0x0302 A[Catch: all -> 0x0320, TRY_LEAVE, TryCatch #0 {all -> 0x0320, blocks: (B:134:0x02d8, B:137:0x02e2, B:144:0x0302, B:140:0x02f7), top: B:201:0x02d8, outer: #11 }] */
            /* JADX WARN: Removed duplicated region for block: B:189:0x0371  */
            /* JADX WARN: Removed duplicated region for block: B:217:0x02cb A[EXC_TOP_SPLITTER, SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:251:0x0301 A[SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:252:0x02fd A[SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:25:0x005a A[Catch: all -> 0x0082, TryCatch #2 {all -> 0x0082, blocks: (B:22:0x0051, B:24:0x0058, B:26:0x005c, B:27:0x0060, B:29:0x0068, B:33:0x0071, B:25:0x005a), top: B:205:0x0051 }] */
            /* JADX WARN: Removed duplicated region for block: B:65:0x0104 A[Catch: IOException -> 0x033e, all -> 0x036d, dxa -> 0x0375, TryCatch #17 {IOException -> 0x033e, blocks: (B:49:0x009f, B:52:0x00a9, B:53:0x00b5, B:55:0x00bb, B:57:0x00d9, B:59:0x00df, B:63:0x00f4, B:65:0x0104, B:66:0x0107, B:67:0x013c, B:69:0x0142, B:71:0x014e, B:72:0x0158, B:74:0x015e, B:78:0x0180, B:82:0x018f, B:81:0x018a, B:77:0x0171, B:83:0x019d, B:85:0x01ad, B:87:0x01b9, B:90:0x01d3, B:92:0x01e1, B:94:0x01ef, B:96:0x01fb, B:98:0x020d, B:99:0x0217, B:101:0x021d, B:103:0x0239, B:104:0x023c, B:106:0x024d, B:107:0x0250, B:109:0x0261, B:110:0x0264, B:112:0x0279, B:113:0x027f, B:117:0x028f, B:121:0x029a), top: B:223:0x009f }] */
            /* JADX WARN: Removed duplicated region for block: B:69:0x0142 A[Catch: IOException -> 0x033e, all -> 0x036d, dxa -> 0x0375, TryCatch #17 {IOException -> 0x033e, blocks: (B:49:0x009f, B:52:0x00a9, B:53:0x00b5, B:55:0x00bb, B:57:0x00d9, B:59:0x00df, B:63:0x00f4, B:65:0x0104, B:66:0x0107, B:67:0x013c, B:69:0x0142, B:71:0x014e, B:72:0x0158, B:74:0x015e, B:78:0x0180, B:82:0x018f, B:81:0x018a, B:77:0x0171, B:83:0x019d, B:85:0x01ad, B:87:0x01b9, B:90:0x01d3, B:92:0x01e1, B:94:0x01ef, B:96:0x01fb, B:98:0x020d, B:99:0x0217, B:101:0x021d, B:103:0x0239, B:104:0x023c, B:106:0x024d, B:107:0x0250, B:109:0x0261, B:110:0x0264, B:112:0x0279, B:113:0x027f, B:117:0x028f, B:121:0x029a), top: B:223:0x009f }] */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final void run() throws java.lang.Throwable {
                /*
                    Method dump skipped, instructions count: 899
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.dwz.run():void");
            }
        });
    }

    public final void p() {
        Future future;
        synchronized (this) {
            future = this.i;
            if (future == null) {
                throw new IllegalStateException("must not call waitForCompletion() before perform()");
            }
        }
        try {
            future.get();
        } catch (InterruptedException e) {
            throw new dwx("unexpected interruption", e);
        } catch (CancellationException unused) {
        } catch (ExecutionException e2) {
            throw new dwx("unexpected exception", e2);
        }
    }

    public final synchronized boolean q() {
        return this.n == 4;
    }

    public final void r(int i, String str, int i2) {
        asr asrVar = (asr) eit.a.createBuilder();
        int iA = eis.a(i);
        if (!asrVar.a.isMutable()) {
            asrVar.B();
        }
        ((eit) asrVar.a).b = iA;
        if (!asrVar.a.isMutable()) {
            asrVar.B();
        }
        eit eitVar = (eit) asrVar.a;
        str.getClass();
        eitVar.c = str;
        byte[] byteArray = ((eit) asrVar.z()).toByteArray();
        int i3 = i2 - 1;
        if (i2 == 0) {
            throw null;
        }
        if (i3 == 1) {
            c(byteArray);
        } else {
            if (i3 != 2) {
                return;
            }
            a(byteArray);
        }
    }
}
