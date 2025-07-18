package defpackage;

import java.io.Closeable;
import java.io.IOException;
import java.net.Socket;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ftv implements Closeable {
    public static final fui a;
    public static final fwv z = new fwv();
    private long A;
    private long B;
    private final Socket C;
    public final fti c;
    public final String e;
    public int f;
    public int g;
    public boolean h;
    public final frn i;
    public final frm j;
    public final frm k;
    public final frm l;
    public final fuh m;
    public long n;
    public long o;
    public long p;
    public long q;
    public long r;
    public final fui s;
    public fui t;
    public long u;
    public long v;
    public final fud w;
    public final ftn x;
    public final Set y;
    public final boolean b = true;
    public final Map d = new LinkedHashMap();

    static {
        fui fuiVar = new fui();
        fuiVar.g(7, 65535);
        fuiVar.g(5, 16384);
        a = fuiVar;
    }

    public ftv(ftg ftgVar) {
        this.c = ftgVar.g;
        String str = ftgVar.d;
        fvm fvmVar = null;
        if (str == null) {
            fjs.b("connectionName");
            str = null;
        }
        this.e = str;
        this.g = 3;
        frn frnVar = ftgVar.b;
        this.i = frnVar;
        this.j = frnVar.a();
        this.k = frnVar.a();
        this.l = frnVar.a();
        this.m = ftgVar.h;
        fui fuiVar = new fui();
        fuiVar.g(7, 16777216);
        this.s = fuiVar;
        this.t = a;
        this.v = r1.c();
        Socket socket = ftgVar.c;
        if (socket == null) {
            fjs.b("socket");
            socket = null;
        }
        this.C = socket;
        fvl fvlVar = ftgVar.f;
        if (fvlVar == null) {
            fjs.b("sink");
            fvlVar = null;
        }
        this.w = new fud(fvlVar, true);
        fvm fvmVar2 = ftgVar.e;
        if (fvmVar2 == null) {
            fjs.b("source");
        } else {
            fvmVar = fvmVar2;
        }
        this.x = new ftn(this, new fty(fvmVar, true));
        this.y = new LinkedHashSet();
    }

    public static final boolean n(int i) {
        return (i & 1) == 0;
    }

    public final synchronized fuc a(int i) {
        return (fuc) this.d.get(Integer.valueOf(i));
    }

    public final synchronized fuc b(int i) {
        fuc fucVar;
        fucVar = (fuc) this.d.remove(Integer.valueOf(i));
        notifyAll();
        return fucVar;
    }

    public final void c(fta ftaVar, fta ftaVar2, IOException iOException) throws IOException {
        int i;
        Object[] array;
        ftaVar.getClass();
        ftaVar2.getClass();
        byte[] bArr = frh.a;
        try {
            f(ftaVar);
        } catch (IOException unused) {
        }
        synchronized (this) {
            if (this.d.isEmpty()) {
                array = null;
            } else {
                array = this.d.values().toArray(new fuc[0]);
                this.d.clear();
            }
        }
        fuc[] fucVarArr = (fuc[]) array;
        if (fucVarArr != null) {
            for (fuc fucVar : fucVarArr) {
                try {
                    fucVar.g(ftaVar2, iOException);
                } catch (IOException unused2) {
                }
            }
        }
        try {
            this.w.close();
        } catch (IOException unused3) {
        }
        try {
            this.C.close();
        } catch (IOException unused4) {
        }
        this.j.c();
        this.k.c();
        this.l.c();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        c(fta.a, fta.i, null);
    }

    public final void d(IOException iOException) throws IOException {
        c(fta.b, fta.b, iOException);
    }

    public final void e() {
        this.w.d();
    }

    public final void f(fta ftaVar) {
        ftaVar.getClass();
        synchronized (this.w) {
            fjw fjwVar = new fjw();
            synchronized (this) {
                if (this.h) {
                    return;
                }
                this.h = true;
                fjwVar.a = this.f;
                fud fudVar = this.w;
                int i = fjwVar.a;
                byte[] bArr = frh.a;
                fudVar.k(i, ftaVar);
            }
        }
    }

    public final synchronized void g(long j) {
        long j2 = this.A + j;
        this.A = j2;
        long j3 = j2 - this.B;
        if (j3 >= this.s.c() / 2) {
            l(0, j3);
            this.B += j3;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x002d, code lost:
    
        r2 = java.lang.Math.min((int) java.lang.Math.min(r12, r6 - r4), r8.w.a);
        r6 = r2;
        r8.u += r6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void h(int r9, boolean r10, defpackage.fvk r11, long r12) {
        /*
            r8 = this;
            r0 = 0
            int r2 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            r3 = 0
            if (r2 == 0) goto L63
        L7:
            int r2 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r2 <= 0) goto L62
            monitor-enter(r8)
        Lc:
            long r4 = r8.u     // Catch: java.lang.Throwable -> L51 java.lang.InterruptedException -> L53
            long r6 = r8.v     // Catch: java.lang.Throwable -> L51 java.lang.InterruptedException -> L53
            int r2 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r2 < 0) goto L2c
            java.util.Map r2 = r8.d     // Catch: java.lang.Throwable -> L51 java.lang.InterruptedException -> L53
            java.lang.Integer r4 = java.lang.Integer.valueOf(r9)     // Catch: java.lang.Throwable -> L51 java.lang.InterruptedException -> L53
            boolean r2 = r2.containsKey(r4)     // Catch: java.lang.Throwable -> L51 java.lang.InterruptedException -> L53
            if (r2 == 0) goto L24
            r8.wait()     // Catch: java.lang.Throwable -> L51 java.lang.InterruptedException -> L53
            goto Lc
        L24:
            java.io.IOException r9 = new java.io.IOException     // Catch: java.lang.Throwable -> L51 java.lang.InterruptedException -> L53
            java.lang.String r10 = "stream closed"
            r9.<init>(r10)     // Catch: java.lang.Throwable -> L51 java.lang.InterruptedException -> L53
            throw r9     // Catch: java.lang.Throwable -> L51 java.lang.InterruptedException -> L53
        L2c:
            long r6 = r6 - r4
            long r4 = java.lang.Math.min(r12, r6)     // Catch: java.lang.Throwable -> L51
            int r2 = (int) r4     // Catch: java.lang.Throwable -> L51
            fud r4 = r8.w     // Catch: java.lang.Throwable -> L51
            int r4 = r4.a     // Catch: java.lang.Throwable -> L51
            int r2 = java.lang.Math.min(r2, r4)     // Catch: java.lang.Throwable -> L51
            long r4 = r8.u     // Catch: java.lang.Throwable -> L51
            long r6 = (long) r2     // Catch: java.lang.Throwable -> L51
            long r4 = r4 + r6
            r8.u = r4     // Catch: java.lang.Throwable -> L51
            monitor-exit(r8)
            long r12 = r12 - r6
            fud r4 = r8.w
            if (r10 == 0) goto L4c
            int r5 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r5 != 0) goto L4c
            r5 = 1
            goto L4d
        L4c:
            r5 = r3
        L4d:
            r4.c(r5, r9, r11, r2)
            goto L7
        L51:
            r9 = move-exception
            goto L60
        L53:
            java.lang.Thread r9 = java.lang.Thread.currentThread()     // Catch: java.lang.Throwable -> L51
            r9.interrupt()     // Catch: java.lang.Throwable -> L51
            java.io.InterruptedIOException r9 = new java.io.InterruptedIOException     // Catch: java.lang.Throwable -> L51
            r9.<init>()     // Catch: java.lang.Throwable -> L51
            throw r9     // Catch: java.lang.Throwable -> L51
        L60:
            monitor-exit(r8)
            throw r9
        L62:
            return
        L63:
            fud r8 = r8.w
            r8.c(r10, r9, r11, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ftv.h(int, boolean, fvk, long):void");
    }

    public final void i(boolean z2, int i, int i2) throws IOException {
        try {
            this.w.g(z2, i, i2);
        } catch (IOException e) {
            d(e);
        }
    }

    public final void j(int i, fta ftaVar) {
        this.w.h(i, ftaVar);
    }

    public final void k(int i, fta ftaVar) {
        ftaVar.getClass();
        this.j.b(new ftt(this.e + "[" + i + "] writeSynReset", this, i, ftaVar), 0L);
    }

    public final void l(int i, long j) {
        this.j.b(new ftu(this.e + "[" + i + "] windowUpdate", this, i, j), 0L);
    }

    public final synchronized boolean m(long j) {
        if (this.h) {
            return false;
        }
        if (this.p < this.o) {
            if (j >= this.r) {
                return false;
            }
        }
        return true;
    }
}
