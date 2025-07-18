package defpackage;

import java.util.concurrent.locks.LockSupport;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fpj extends Thread {
    public final fpv a;
    public final flg b;
    public boolean c;
    final /* synthetic */ fpl d;
    public int e;
    private final fjx f;
    private long g;
    private long h;
    private int i;
    public volatile int indexInArray;
    public volatile Object nextParkedWorker;

    public fpj(fpl fplVar, int i) {
        this.d = fplVar;
        setDaemon(true);
        setContextClassLoader(fplVar.getClass().getClassLoader());
        this.a = new fpv();
        this.f = new fjx();
        this.e = fpk.d;
        this.b = fjp.t(0);
        this.nextParkedWorker = fpl.a;
        int iNanoTime = (int) System.nanoTime();
        this.i = iNanoTime == 0 ? 42 : iNanoTime;
        c(i);
    }

    private final fpr e() {
        if (a(2) == 0) {
            fpr fprVar = (fpr) this.d.i.c();
            return fprVar != null ? fprVar : (fpr) this.d.j.c();
        }
        fpr fprVar2 = (fpr) this.d.j.c();
        return fprVar2 != null ? fprVar2 : (fpr) this.d.i.c();
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0072, code lost:
    
        r8 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0088, code lost:
    
        r22 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final defpackage.fpr f(int r25) {
        /*
            Method dump skipped, instructions count: 236
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fpj.f(int):fpr");
    }

    private final boolean g() {
        return this.nextParkedWorker != fpl.a;
    }

    public final int a(int i) {
        int i2 = this.i;
        int i3 = i2 ^ (i2 << 13);
        int i4 = i3 ^ (i3 >> 17);
        int i5 = i4 ^ (i4 << 5);
        this.i = i5;
        int i6 = i - 1;
        return (i6 & i) == 0 ? i6 & i5 : (Integer.MAX_VALUE & i5) % i;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x006d A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.fpr b(boolean r9) {
        /*
            r8 = this;
            int r0 = r8.e
            int r1 = defpackage.fpk.a
            r2 = 0
            r3 = 1
            if (r0 != r1) goto La
            goto L80
        La:
            fpl r0 = r8.d
        Lc:
            flh r1 = r0.h
            long r4 = r1.b
            r6 = 9223367638808264704(0x7ffffc0000000000, double:NaN)
            long r6 = r6 & r4
            r1 = 42
            long r6 = r6 >> r1
            int r1 = (int) r6
            if (r1 != 0) goto L6e
            fpv r9 = r8.a
        L1e:
            java.lang.Object r0 = r9.b
            fli r0 = (defpackage.fli) r0
            java.lang.Object r0 = r0.a
            fpr r0 = (defpackage.fpr) r0
            if (r0 != 0) goto L29
            goto L39
        L29:
            boolean r1 = r0.h
            if (r1 != r3) goto L39
            java.lang.Object r1 = r9.b
            fli r1 = (defpackage.fli) r1
            boolean r1 = r1.d(r0, r2)
            if (r1 == 0) goto L1e
            r2 = r0
            goto L59
        L39:
            java.lang.Object r0 = r9.d
            flg r0 = (defpackage.flg) r0
            int r0 = r0.a
            java.lang.Object r1 = r9.c
            flg r1 = (defpackage.flg) r1
            int r1 = r1.a
        L45:
            if (r0 == r1) goto L59
            java.lang.Object r4 = r9.e
            flg r4 = (defpackage.flg) r4
            int r4 = r4.a
            if (r4 != 0) goto L50
            goto L59
        L50:
            int r1 = r1 + (-1)
            fpr r4 = r9.c(r1, r3)
            if (r4 == 0) goto L45
            r2 = r4
        L59:
            if (r2 != 0) goto L6d
            fpl r9 = r8.d
            ekf r9 = r9.j
            java.lang.Object r9 = r9.c()
            fpr r9 = (defpackage.fpr) r9
            if (r9 != 0) goto L6c
            fpr r8 = r8.f(r3)
            return r8
        L6c:
            return r9
        L6d:
            return r2
        L6e:
            r6 = -4398046511104(0xfffffc0000000000, double:NaN)
            long r6 = r6 + r4
            flh r1 = r0.h
            boolean r1 = r1.c(r4, r6)
            if (r1 == 0) goto Lc
            int r0 = defpackage.fpk.a
            r8.e = r0
        L80:
            if (r9 == 0) goto Lb6
            fpl r9 = r8.d
            int r9 = r9.b
            int r9 = r9 + r9
            int r9 = r8.a(r9)
            if (r9 != 0) goto L8e
            goto L8f
        L8e:
            r3 = 0
        L8f:
            if (r3 == 0) goto L98
            fpr r9 = r8.e()
            if (r9 == 0) goto L98
            return r9
        L98:
            fpv r9 = r8.a
            java.lang.Object r0 = r9.b
            fli r0 = (defpackage.fli) r0
            java.lang.Object r0 = r0.a(r2)
            fpr r0 = (defpackage.fpr) r0
            if (r0 != 0) goto Laa
            fpr r0 = r9.b()
        Laa:
            if (r0 == 0) goto Lad
            return r0
        Lad:
            if (r3 != 0) goto Lbd
            fpr r9 = r8.e()
            if (r9 == 0) goto Lbd
            return r9
        Lb6:
            fpr r9 = r8.e()
            if (r9 == 0) goto Lbd
            return r9
        Lbd:
            r9 = 3
            fpr r8 = r8.f(r9)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fpj.b(boolean):fpr");
    }

    public final void c(int i) {
        String strValueOf = i == 0 ? "TERMINATED" : String.valueOf(i);
        setName(this.d.e + "-worker-" + strValueOf);
        this.indexInArray = i;
    }

    public final boolean d(int i) {
        int i2 = this.e;
        boolean z = i2 == fpk.a;
        if (z) {
            this.d.h.a(4398046511104L);
        }
        if (i2 != i) {
            this.e = i;
        }
        return z;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        loop0: while (true) {
            boolean z = false;
            while (!this.d.c() && this.e != fpk.e) {
                fpr fprVarB = b(this.c);
                long j = -2097152;
                if (fprVarB != null) {
                    this.h = 0L;
                    this.g = 0L;
                    if (this.e == fpk.c) {
                        boolean z2 = fmd.a;
                        this.e = fpk.b;
                    }
                    if (fprVarB.h) {
                        if (d(fpk.b)) {
                            this.d.b();
                        }
                        fpl.f(fprVarB);
                        this.d.h.a(-2097152L);
                        if (this.e != fpk.e) {
                            boolean z3 = fmd.a;
                            this.e = fpk.d;
                        }
                    } else {
                        fpl.f(fprVarB);
                    }
                } else {
                    this.c = false;
                    if (this.h != 0) {
                        if (z) {
                            d(fpk.c);
                            Thread.interrupted();
                            LockSupport.parkNanos(this.h);
                            this.h = 0L;
                        } else {
                            z = true;
                        }
                    } else if (g()) {
                        this.b.b(-1);
                        while (g() && this.b.a == -1 && !this.d.c() && this.e != fpk.e) {
                            d(fpk.c);
                            Thread.interrupted();
                            if (this.g == 0) {
                                this.g = System.nanoTime() + this.d.d;
                            }
                            LockSupport.parkNanos(this.d.d);
                            if (System.nanoTime() - this.g >= 0) {
                                this.g = 0L;
                                fpl fplVar = this.d;
                                synchronized (fplVar.g) {
                                    if (!fplVar.c()) {
                                        if (((int) (fplVar.h.b & 2097151)) > fplVar.b) {
                                            if (this.b.c(-1, 1)) {
                                                int i = this.indexInArray;
                                                c(0);
                                                fplVar.a(this, i, 0);
                                                flh flhVar = fplVar.h;
                                                long andDecrement = flh.a.getAndDecrement(flhVar);
                                                fjp fjpVar = flhVar.c;
                                                flj fljVar = flj.a;
                                                int i2 = (int) (andDecrement & 2097151);
                                                if (i2 != i) {
                                                    Object objA = fplVar.g.a(i2);
                                                    objA.getClass();
                                                    fpj fpjVar = (fpj) objA;
                                                    fplVar.g.b(i, fpjVar);
                                                    fpjVar.c(i);
                                                    fplVar.a(fpjVar, i2, i);
                                                }
                                                fplVar.g.b(i2, null);
                                                this.e = fpk.e;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    } else {
                        fpl fplVar2 = this.d;
                        if (this.nextParkedWorker == fpl.a) {
                            flh flhVar2 = fplVar2.f;
                            while (true) {
                                long j2 = flhVar2.b;
                                int i3 = this.indexInArray;
                                boolean z4 = fmd.a;
                                long j3 = j;
                                this.nextParkedWorker = fplVar2.g.a((int) (j2 & 2097151));
                                if (fplVar2.f.c(j2, ((2097152 + j2) & j3) | i3)) {
                                    break;
                                } else {
                                    j = j3;
                                }
                            }
                        }
                    }
                }
            }
            break loop0;
        }
        d(fpk.e);
    }
}
