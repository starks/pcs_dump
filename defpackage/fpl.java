package defpackage;

import java.io.Closeable;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.locks.LockSupport;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fpl implements Executor, Closeable {
    public static final fpc a = new fpc("NOT_IN_STACK");
    public final int b;
    public final int c;
    public final long d;
    public final String e;
    public final flh f;
    public final foz g;
    public final flh h;
    public final ekf i;
    public final ekf j;
    private final flf k;

    public fpl(int i, int i2, long j, String str) {
        this.b = i;
        this.c = i2;
        this.d = j;
        this.e = str;
        if (i <= 0) {
            throw new IllegalArgumentException(a.E(i, "Core pool size ", " should be at least 1"));
        }
        if (i2 < i) {
            throw new IllegalArgumentException(a.D(i, i2, "Max pool size ", " should be greater than or equals to core pool size "));
        }
        if (i2 > 2097150) {
            throw new IllegalArgumentException(a.E(i2, "Max pool size ", " should not exceed maximal supported number of threads 2097150"));
        }
        if (j <= 0) {
            throw new IllegalArgumentException("Idle worker keep alive time " + j + " must be positive");
        }
        this.i = new ekf((char[]) null);
        this.j = new ekf((char[]) null);
        this.f = fjp.u(0L);
        int i3 = i + 1;
        this.g = new foz(i3 + i3);
        this.h = fjp.u(i << 42);
        this.k = fjp.s(false);
    }

    public static final void f(fpr fprVar) {
        try {
            fprVar.run();
        } catch (Throwable th) {
            Thread threadCurrentThread = Thread.currentThread();
            threadCurrentThread.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread, th);
        }
    }

    private final int g() {
        synchronized (this.g) {
            if (c()) {
                return -1;
            }
            long j = this.h.b;
            int i = (int) (j & 2097151);
            int i2 = fjs.i(i - ((int) ((j & 4398044413952L) >> 21)), 0);
            if (i2 >= this.b) {
                return 0;
            }
            if (i >= this.c) {
                return 0;
            }
            int i3 = ((int) (this.h.b & 2097151)) + 1;
            if (this.g.a(i3) != null) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            fpj fpjVar = new fpj(this, i3);
            this.g.b(i3, fpjVar);
            flh flhVar = this.h;
            long jIncrementAndGet = flh.a.incrementAndGet(flhVar);
            fjp fjpVar = flhVar.c;
            flj fljVar = flj.a;
            if (i3 != ((int) (2097151 & jIncrementAndGet))) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            int i4 = i2 + 1;
            fpjVar.start();
            return i4;
        }
    }

    private final fpj h() {
        Thread threadCurrentThread = Thread.currentThread();
        fpj fpjVar = threadCurrentThread instanceof fpj ? (fpj) threadCurrentThread : null;
        if (fpjVar == null || !fjs.c(fpjVar.d, this)) {
            return null;
        }
        return fpjVar;
    }

    private final boolean i(long j) {
        if (fjs.i(((int) (j & 2097151)) - ((int) ((4398044413952L & j) >> 21)), 0) < this.b) {
            int iG = g();
            if (iG == 1) {
                if (this.b > 1) {
                    g();
                }
            } else if (iG <= 0) {
            }
            return true;
        }
        return false;
    }

    private final boolean j() {
        fpj fpjVar;
        do {
            flh flhVar = this.f;
            while (true) {
                long j = flhVar.b;
                fpjVar = (fpj) this.g.a((int) (2097151 & j));
                if (fpjVar != null) {
                    long j2 = 2097152 + j;
                    int iK = k(fpjVar);
                    if (iK >= 0 && this.f.c(j, (j2 & (-2097152)) | iK)) {
                        fpjVar.nextParkedWorker = a;
                        break;
                    }
                } else {
                    fpjVar = null;
                    break;
                }
            }
            if (fpjVar == null) {
                return false;
            }
        } while (!fpjVar.b.c(-1, 0));
        LockSupport.unpark(fpjVar);
        return true;
    }

    private static final int k(fpj fpjVar) {
        int i;
        do {
            Object obj = fpjVar.nextParkedWorker;
            if (obj == a) {
                return -1;
            }
            if (obj == null) {
                return 0;
            }
            fpjVar = (fpj) obj;
            i = fpjVar.indexInArray;
        } while (i == 0);
        return i;
    }

    public final void a(fpj fpjVar, int i, int i2) {
        while (true) {
            long j = this.f.b;
            long j2 = 2097152 + j;
            int iK = (int) (2097151 & j);
            if (iK == i) {
                iK = i2 == 0 ? k(fpjVar) : i2;
            }
            if (iK >= 0 && this.f.c(j, (j2 & (-2097152)) | iK)) {
                return;
            }
        }
    }

    public final void b() {
        if (j() || i(this.h.b)) {
            return;
        }
        j();
    }

    public final boolean c() {
        return this.k.a();
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0075  */
    @Override // java.io.Closeable, java.lang.AutoCloseable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void close() {
        /*
            r8 = this;
            flf r0 = r8.k
            boolean r0 = r0.b()
            if (r0 != 0) goto L9
            return
        L9:
            fpj r0 = r8.h()
            foz r1 = r8.g
            monitor-enter(r1)
            flh r2 = r8.h     // Catch: java.lang.Throwable -> La3
            long r2 = r2.b     // Catch: java.lang.Throwable -> La3
            r4 = 2097151(0x1fffff, double:1.0361303E-317)
            long r2 = r2 & r4
            monitor-exit(r1)
            int r1 = (int) r2
            r2 = 1
            if (r1 <= 0) goto L63
            r3 = r2
        L1e:
            foz r4 = r8.g
            java.lang.Object r4 = r4.a(r3)
            r4.getClass()
            fpj r4 = (defpackage.fpj) r4
            if (r4 == r0) goto L5e
        L2b:
            java.lang.Thread$State r5 = r4.getState()
            java.lang.Thread$State r6 = java.lang.Thread.State.TERMINATED
            if (r5 == r6) goto L3c
            java.util.concurrent.locks.LockSupport.unpark(r4)
            r5 = 10000(0x2710, double:4.9407E-320)
            r4.join(r5)
            goto L2b
        L3c:
            boolean r5 = defpackage.fmd.a
            fpv r4 = r4.a
            ekf r5 = r8.j
            java.lang.Object r6 = r4.b
            fli r6 = (defpackage.fli) r6
            r7 = 0
            java.lang.Object r6 = r6.a(r7)
            fpr r6 = (defpackage.fpr) r6
            if (r6 != 0) goto L50
            goto L53
        L50:
            r5.e(r6)
        L53:
            fpr r6 = r4.b()
            if (r6 != 0) goto L5a
            goto L5e
        L5a:
            r5.e(r6)
            goto L53
        L5e:
            if (r3 == r1) goto L63
            int r3 = r3 + 1
            goto L1e
        L63:
            ekf r1 = r8.j
            r1.d()
            ekf r1 = r8.i
            r1.d()
        L6d:
            if (r0 == 0) goto L75
            fpr r1 = r0.b(r2)
            if (r1 != 0) goto L9f
        L75:
            ekf r1 = r8.i
            java.lang.Object r1 = r1.c()
            fpr r1 = (defpackage.fpr) r1
            if (r1 != 0) goto L9f
            ekf r1 = r8.j
            java.lang.Object r1 = r1.c()
            fpr r1 = (defpackage.fpr) r1
            if (r1 != 0) goto L9f
            if (r0 == 0) goto L90
            int r1 = defpackage.fpk.e
            r0.d(r1)
        L90:
            boolean r0 = defpackage.fmd.a
            flh r0 = r8.f
            r1 = 0
            r0.b(r1)
            flh r8 = r8.h
            r8.b(r1)
            return
        L9f:
            f(r1)
            goto L6d
        La3:
            r8 = move-exception
            monitor-exit(r1)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fpl.close():void");
    }

    public final void d(Runnable runnable, boolean z) {
        fpr fpsVar;
        long jA = fpt.f.a();
        if (runnable instanceof fpr) {
            fpsVar = (fpr) runnable;
            fpsVar.g = jA;
            fpsVar.h = z;
        } else {
            fpsVar = new fps(runnable, jA, z);
        }
        boolean z2 = fpsVar.h;
        long jA2 = z2 ? this.h.a(2097152L) : 0L;
        fpj fpjVarH = h();
        if (fpjVarH != null && fpjVarH.e != fpk.e && (fpsVar.h || fpjVarH.e != fpk.b)) {
            fpjVarH.c = true;
            fpv fpvVar = fpjVarH.a;
            fpsVar = (fpr) ((fli) fpvVar.b).a(fpsVar);
            if (fpsVar == null) {
                fpsVar = null;
            } else if (fpvVar.a() != 127) {
                if (fpsVar.h) {
                    ((flg) fpvVar.e).d();
                }
                int i = ((flg) fpvVar.c).a & 127;
                while (((AtomicReferenceArray) fpvVar.a).get(i) != null) {
                    Thread.yield();
                }
                ((AtomicReferenceArray) fpvVar.a).lazySet(i, fpsVar);
                ((flg) fpvVar.c).d();
                fpsVar = null;
            }
        }
        if (fpsVar != null) {
            if (!(fpsVar.h ? this.j.e(fpsVar) : this.i.e(fpsVar))) {
                throw new RejectedExecutionException(String.valueOf(this.e).concat(" was terminated"));
            }
        }
        if (!z2) {
            b();
        } else {
            if (j() || i(jA2)) {
                return;
            }
            j();
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        d(runnable, false);
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        int length = this.g.array.length();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        for (int i6 = 1; i6 < length; i6++) {
            fpj fpjVar = (fpj) this.g.a(i6);
            if (fpjVar != null) {
                fpv fpvVar = fpjVar.a;
                int iA = ((fli) fpvVar.b).a != null ? fpvVar.a() + 1 : fpvVar.a();
                int i7 = fpjVar.e;
                int i8 = fpk.a;
                int i9 = i7 - 1;
                if (i7 == 0) {
                    throw null;
                }
                if (i9 == 0) {
                    arrayList.add(iA + "c");
                    i++;
                } else if (i9 == 1) {
                    arrayList.add(iA + "b");
                    i2++;
                } else if (i9 == 2) {
                    i3++;
                } else if (i9 == 3) {
                    i4++;
                    if (iA > 0) {
                        arrayList.add(iA + "d");
                    }
                } else {
                    if (i9 != 4) {
                        throw new ffq();
                    }
                    i5++;
                }
            }
        }
        flh flhVar = this.h;
        String str = this.e;
        long j = flhVar.b;
        String strB = fme.b(this);
        int i10 = this.b;
        int i11 = this.c;
        ekf ekfVar = this.i;
        ekf ekfVar2 = this.j;
        long j2 = 2097151 & j;
        long j3 = j & 4398044413952L;
        long j4 = j & 9223367638808264704L;
        return str + "@" + strB + "[Pool Size {core = " + i10 + ", max = " + i11 + "}, Worker States {CPU = " + i + ", blocking = " + i2 + ", parked = " + i3 + ", dormant = " + i4 + ", terminated = " + i5 + "}, running workers queues = " + arrayList + ", global CPU queue size = " + ekfVar.b() + ", global blocking queue size = " + ekfVar2.b() + ", Control State {created workers= " + ((int) j2) + ", blocking tasks = " + ((int) (j3 >> 21)) + ", CPUs acquired = " + (i10 - ((int) (j4 >> 42))) + "}]";
    }
}
