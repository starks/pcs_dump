package defpackage;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.ref.Reference;
import java.net.Socket;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class frw implements Cloneable {
    public final fqu a;
    public final fsb b;
    public final fqm c;
    public final frv d;
    public frt e;
    public frz f;
    public boolean g;
    public frs h;
    public boolean i;
    public boolean j;
    public boolean k;
    public volatile boolean l;
    public volatile frs m;
    public volatile frz n;
    private final fqx o;
    private final AtomicBoolean p;
    private Object q;

    public frw(fqu fquVar, fqx fqxVar) {
        this.a = fquVar;
        this.o = fqxVar;
        this.b = (fsb) fquVar.y.a;
        Object obj = fquVar.x.a;
        byte[] bArr = frh.a;
        this.c = (fqm) obj;
        frv frvVar = new frv(this);
        frvVar.k(0L, TimeUnit.MILLISECONDS);
        this.d = frvVar;
        this.p = new AtomicBoolean();
        this.k = true;
    }

    private final IOException g(IOException iOException) throws IOException {
        IOException iOException2;
        Socket socketC;
        byte[] bArr = frh.a;
        frz frzVar = this.f;
        if (frzVar != null) {
            synchronized (frzVar) {
                socketC = c();
            }
            if (this.f == null) {
                if (socketC != null) {
                    frh.s(socketC);
                }
            } else if (socketC != null) {
                throw new IllegalStateException("Check failed.");
            }
        }
        if (!this.g && this.d.f()) {
            InterruptedIOException interruptedIOException = new InterruptedIOException("timeout");
            iOException2 = interruptedIOException;
            if (iOException != null) {
                interruptedIOException.initCause(iOException);
                iOException2 = interruptedIOException;
            }
        } else {
            iOException2 = iOException;
        }
        if (iOException != null) {
            iOException2.getClass();
        }
        return iOException2;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x003a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.io.IOException a(defpackage.frs r3, boolean r4, boolean r5, java.io.IOException r6) {
        /*
            r2 = this;
            frs r0 = r2.m
            boolean r3 = defpackage.fjs.c(r3, r0)
            if (r3 != 0) goto L9
            goto L54
        L9:
            monitor-enter(r2)
            r3 = 1
            r0 = 0
            if (r4 == 0) goto L15
            boolean r1 = r2.i     // Catch: java.lang.Throwable -> L13
            if (r1 != 0) goto L1c
            goto L15
        L13:
            r3 = move-exception
            goto L3d
        L15:
            if (r5 == 0) goto L3f
            boolean r5 = r2.j     // Catch: java.lang.Throwable -> L13
            if (r5 == 0) goto L3f
            r5 = r3
        L1c:
            if (r4 == 0) goto L20
            r2.i = r0     // Catch: java.lang.Throwable -> L13
        L20:
            if (r5 == 0) goto L24
            r2.j = r0     // Catch: java.lang.Throwable -> L13
        L24:
            boolean r4 = r2.i     // Catch: java.lang.Throwable -> L13
            if (r4 != 0) goto L2e
            boolean r5 = r2.j     // Catch: java.lang.Throwable -> L13
            if (r5 != 0) goto L2e
            r5 = r3
            goto L2f
        L2e:
            r5 = r0
        L2f:
            if (r4 != 0) goto L3a
            boolean r4 = r2.j     // Catch: java.lang.Throwable -> L13
            if (r4 != 0) goto L3a
            boolean r4 = r2.k     // Catch: java.lang.Throwable -> L13
            if (r4 != 0) goto L3a
            goto L3b
        L3a:
            r3 = r0
        L3b:
            r0 = r5
            goto L40
        L3d:
            monitor-exit(r2)
            throw r3
        L3f:
            r3 = r0
        L40:
            monitor-exit(r2)
            if (r0 == 0) goto L4d
            r4 = 0
            r2.m = r4
            frz r4 = r2.f
            if (r4 == 0) goto L4d
            r4.c()
        L4d:
            if (r3 == 0) goto L54
            java.io.IOException r2 = r2.g(r6)
            return r2
        L54:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.frw.a(frs, boolean, boolean, java.io.IOException):java.io.IOException");
    }

    public final IOException b(IOException iOException) {
        boolean z;
        synchronized (this) {
            z = false;
            if (this.k) {
                this.k = false;
                if (!this.i) {
                    if (!this.j) {
                        z = true;
                    }
                }
            }
        }
        return z ? g(iOException) : iOException;
    }

    public final Socket c() {
        frz frzVar = this.f;
        frzVar.getClass();
        byte[] bArr = frh.a;
        List list = frzVar.j;
        Iterator it = list.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            }
            if (fjs.c(((Reference) it.next()).get(), this)) {
                break;
            }
            i++;
        }
        if (i == -1) {
            throw new IllegalStateException("Check failed.");
        }
        list.remove(i);
        this.f = null;
        if (list.isEmpty()) {
            frzVar.k = System.nanoTime();
            fsb fsbVar = this.b;
            if (frzVar.h) {
                frzVar.l();
                fsbVar.d.remove(frzVar);
                if (fsbVar.d.isEmpty()) {
                    fsbVar.b.a();
                }
                return frzVar.a();
            }
            fsbVar.b.b(fsbVar.c, 0L);
        }
        return null;
    }

    public final /* bridge */ /* synthetic */ Object clone() {
        return new frw(this.a, this.o);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x009c A[Catch: all -> 0x00a0, TRY_ENTER, TryCatch #0 {all -> 0x00a0, blocks: (B:7:0x006b, B:11:0x0077, B:24:0x009c, B:25:0x009f), top: B:34:0x006b }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.frb d() throws java.lang.Throwable {
        /*
            r12 = this;
            java.util.concurrent.atomic.AtomicBoolean r0 = r12.p
            r1 = 0
            r2 = 1
            boolean r0 = r0.compareAndSet(r1, r2)
            if (r0 == 0) goto Lad
            frv r0 = r12.d
            r0.e()
            fup r0 = defpackage.fup.c
            java.lang.Object r0 = r0.h()
            r12.q = r0
            fqu r0 = r12.a     // Catch: java.lang.Throwable -> La2
            fqj r0 = r0.c     // Catch: java.lang.Throwable -> La2
            r0.a(r12)     // Catch: java.lang.Throwable -> La2
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch: java.lang.Throwable -> La2
            r5.<init>()     // Catch: java.lang.Throwable -> La2
            fqu r0 = r12.a     // Catch: java.lang.Throwable -> La2
            java.util.List r0 = r0.d     // Catch: java.lang.Throwable -> La2
            defpackage.ffh.P(r5, r0)     // Catch: java.lang.Throwable -> La2
            fsp r0 = new fsp     // Catch: java.lang.Throwable -> La2
            fqu r3 = r12.a     // Catch: java.lang.Throwable -> La2
            r0.<init>(r3)     // Catch: java.lang.Throwable -> La2
            r5.add(r0)     // Catch: java.lang.Throwable -> La2
            fsf r0 = new fsf     // Catch: java.lang.Throwable -> La2
            fqu r3 = r12.a     // Catch: java.lang.Throwable -> La2
            fqi r3 = r3.j     // Catch: java.lang.Throwable -> La2
            r0.<init>(r3)     // Catch: java.lang.Throwable -> La2
            r5.add(r0)     // Catch: java.lang.Throwable -> La2
            fri r0 = new fri     // Catch: java.lang.Throwable -> La2
            r0.<init>()     // Catch: java.lang.Throwable -> La2
            r5.add(r0)     // Catch: java.lang.Throwable -> La2
            fro r0 = defpackage.fro.a     // Catch: java.lang.Throwable -> La2
            r5.add(r0)     // Catch: java.lang.Throwable -> La2
            fqu r0 = r12.a     // Catch: java.lang.Throwable -> La2
            java.util.List r0 = r0.e     // Catch: java.lang.Throwable -> La2
            defpackage.ffh.P(r5, r0)     // Catch: java.lang.Throwable -> La2
            fsg r0 = new fsg     // Catch: java.lang.Throwable -> La2
            r0.<init>()     // Catch: java.lang.Throwable -> La2
            r5.add(r0)     // Catch: java.lang.Throwable -> La2
            fsm r3 = new fsm     // Catch: java.lang.Throwable -> La2
            fqx r8 = r12.o     // Catch: java.lang.Throwable -> La2
            fqu r0 = r12.a     // Catch: java.lang.Throwable -> La2
            int r9 = r0.t     // Catch: java.lang.Throwable -> La2
            int r10 = r0.u     // Catch: java.lang.Throwable -> La2
            int r11 = r0.v     // Catch: java.lang.Throwable -> La2
            r6 = 0
            r7 = 0
            r4 = r12
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11)     // Catch: java.lang.Throwable -> La0
            r12 = 0
            frb r0 = r3.b(r8)     // Catch: java.lang.Throwable -> L8d java.io.IOException -> L8f
            boolean r3 = r4.l     // Catch: java.lang.Throwable -> L8d java.io.IOException -> L8f
            if (r3 != 0) goto L82
            r4.b(r12)     // Catch: java.lang.Throwable -> La0
            fqu r12 = r4.a
            fqj r12 = r12.c
            r12.b(r4)
            return r0
        L82:
            defpackage.frh.r(r0)     // Catch: java.lang.Throwable -> L8d java.io.IOException -> L8f
            java.io.IOException r0 = new java.io.IOException     // Catch: java.lang.Throwable -> L8d java.io.IOException -> L8f
            java.lang.String r3 = "Canceled"
            r0.<init>(r3)     // Catch: java.lang.Throwable -> L8d java.io.IOException -> L8f
            throw r0     // Catch: java.lang.Throwable -> L8d java.io.IOException -> L8f
        L8d:
            r0 = move-exception
            goto L9a
        L8f:
            r0 = move-exception
            java.io.IOException r0 = r4.b(r0)     // Catch: java.lang.Throwable -> L98
            r0.getClass()     // Catch: java.lang.Throwable -> L98
            throw r0     // Catch: java.lang.Throwable -> L98
        L98:
            r0 = move-exception
            r1 = r2
        L9a:
            if (r1 != 0) goto L9f
            r4.b(r12)     // Catch: java.lang.Throwable -> La0
        L9f:
            throw r0     // Catch: java.lang.Throwable -> La0
        La0:
            r0 = move-exception
            goto La4
        La2:
            r0 = move-exception
            r4 = r12
        La4:
            r12 = r0
            fqu r0 = r4.a
            fqj r0 = r0.c
            r0.b(r4)
            throw r12
        Lad:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "Already Executed"
            r12.<init>(r0)
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.frw.d():frb");
    }

    public final void e(frz frzVar) {
        byte[] bArr = frh.a;
        if (this.f != null) {
            throw new IllegalStateException("Check failed.");
        }
        this.f = frzVar;
        frzVar.j.add(new fru(this, this.q));
    }

    public final void f(boolean z) {
        frs frsVar;
        synchronized (this) {
            if (!this.k) {
                throw new IllegalStateException("released");
            }
        }
        if (z && (frsVar = this.m) != null) {
            frsVar.c.e();
            frsVar.a.a(frsVar, true, true, null);
        }
        this.h = null;
    }
}
