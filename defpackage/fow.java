package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fow {
    private final int d;
    private final boolean e;
    private final int f;
    private final ekf h;
    public static final fjs c = new fjs();
    public static final fpc a = new fpc("REMOVE_FROZEN");
    private final fli g = fjp.v(null);
    public final flh b = fjp.u(0);

    public fow(int i, boolean z) {
        this.d = i;
        this.e = z;
        int i2 = i - 1;
        this.f = i2;
        this.h = new ekf(i);
        if (i2 > 1073741823) {
            throw new IllegalStateException("Check failed.");
        }
        if ((i & i2) != 0) {
            throw new IllegalStateException("Check failed.");
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0056, code lost:
    
        return 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int a(java.lang.Object r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
        L4:
            flh r2 = r0.b
            long r2 = r2.b
            r4 = 3458764513820540928(0x3000000000000000, double:1.727233711018889E-77)
            long r4 = r4 & r2
            r6 = 0
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            r5 = 1
            if (r4 == 0) goto L1c
            r0 = 2305843009213693952(0x2000000000000000, double:1.4916681462400413E-154)
            long r0 = r0 & r2
            int r0 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r0 == 0) goto L1b
            r0 = 2
            return r0
        L1b:
            return r5
        L1c:
            r8 = 1073741823(0x3fffffff, double:5.304989472E-315)
            long r8 = r8 & r2
            r10 = 1152921503533105152(0xfffffffc0000000, double:1.2882296003504729E-231)
            long r12 = r2 & r10
            int r4 = r0.f
            r14 = 30
            long r12 = r12 >> r14
            int r12 = (int) r12
            int r13 = r12 + 2
            r13 = r13 & r4
            int r8 = (int) r8
            r9 = r8 & r4
            if (r13 != r9) goto L36
            return r5
        L36:
            boolean r9 = r0.e
            r13 = 1073741823(0x3fffffff, float:1.9999999)
            if (r9 != 0) goto L57
            r9 = r12 & r4
            ekf r15 = r0.h
            fli r9 = r15.f(r9)
            java.lang.Object r9 = r9.a
            if (r9 == 0) goto L57
            int r2 = r0.d
            r3 = 1024(0x400, float:1.435E-42)
            if (r2 < r3) goto L56
            int r12 = r12 - r8
            r3 = r12 & r13
            int r2 = r2 >> 1
            if (r3 <= r2) goto L4
        L56:
            return r5
        L57:
            int r5 = r12 + 1
            r5 = r5 & r13
            flh r8 = r0.b
            long r9 = defpackage.fjs.o(r2, r10)
            r15 = r6
            long r6 = (long) r5
            long r5 = r6 << r14
            long r5 = r5 | r9
            boolean r2 = r8.c(r2, r5)
            if (r2 == 0) goto L4
            r2 = r12 & r4
            ekf r3 = r0.h
            fli r2 = r3.f(r2)
            r2.c(r1)
        L76:
            flh r2 = r0.b
            long r2 = r2.b
            r4 = 1152921504606846976(0x1000000000000000, double:1.2882297539194267E-231)
            long r2 = r2 & r4
            int r2 = (r2 > r15 ? 1 : (r2 == r15 ? 0 : -1))
            if (r2 == 0) goto Lab
            fow r0 = r0.c()
            ekf r2 = r0.h
            int r3 = r0.f
            r3 = r3 & r12
            fli r2 = r2.f(r3)
            java.lang.Object r2 = r2.a
            boolean r3 = r2 instanceof defpackage.fov
            r4 = 0
            if (r3 == 0) goto La8
            fov r2 = (defpackage.fov) r2
            int r2 = r2.a
            if (r2 != r12) goto La8
            ekf r2 = r0.h
            int r3 = r0.f
            r3 = r3 & r12
            fli r2 = r2.f(r3)
            r2.c(r1)
            goto La9
        La8:
            r0 = r4
        La9:
            if (r0 != 0) goto L76
        Lab:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fow.a(java.lang.Object):int");
    }

    public final Object b() {
        long j;
        while (true) {
            long j2 = this.b.b;
            long j3 = 1152921504606846976L;
            if ((j2 & 1152921504606846976L) != 0) {
                return a;
            }
            long j4 = 1073741823;
            int i = this.f;
            int i2 = (int) (j2 & 1073741823);
            int i3 = i2 & i;
            if ((((int) ((1152921503533105152L & j2) >> 30)) & i) == i3) {
                return null;
            }
            Object obj = this.h.f(i3).a;
            if (obj == null) {
                if (this.e) {
                    return null;
                }
            } else {
                if (obj instanceof fov) {
                    return null;
                }
                int i4 = (i2 + 1) & 1073741823;
                if (this.b.c(j2, c.n(j2, i4))) {
                    this.h.f(this.f & i2).c(null);
                    return obj;
                }
                if (this.e) {
                    fow fowVarC = this;
                    while (true) {
                        flh flhVar = fowVarC.b;
                        while (true) {
                            long j5 = flhVar.b;
                            j = j3;
                            long j6 = j5 & j4;
                            boolean z = fmd.a;
                            if ((j5 & j) != 0) {
                                fowVarC = fowVarC.c();
                                break;
                            }
                            if (fowVarC.b.c(j5, c.n(j5, i4))) {
                                fowVarC.h.f(((int) j6) & fowVarC.f).c(null);
                                fowVarC = null;
                                break;
                            }
                            j3 = j;
                            j4 = 1073741823;
                        }
                        if (fowVarC == null) {
                            return obj;
                        }
                        j3 = j;
                        j4 = 1073741823;
                    }
                }
            }
        }
    }

    public final fow c() {
        long j;
        while (true) {
            flh flhVar = this.b;
            j = flhVar.b;
            if ((j & 1152921504606846976L) != 0) {
                break;
            }
            long j2 = j | 1152921504606846976L;
            if (flhVar.c(j, j2)) {
                j = j2;
                break;
            }
        }
        fli fliVar = this.g;
        while (true) {
            fow fowVar = (fow) fliVar.a;
            if (fowVar != null) {
                return fowVar;
            }
            fli fliVar2 = this.g;
            int i = this.d;
            fow fowVar2 = new fow(i + i, this.e);
            long j3 = 1152921503533105152L & j;
            int i2 = (int) (1073741823 & j);
            while (true) {
                int i3 = this.f;
                int i4 = i2 & i3;
                if (i4 != (i3 & ((int) (j3 >> 30)))) {
                    Object fovVar = this.h.f(i4).a;
                    if (fovVar == null) {
                        fovVar = new fov(i2);
                    }
                    fowVar2.h.f(fowVar2.f & i2).c(fovVar);
                    i2++;
                }
            }
            fowVar2.b.b(fjs.o(j, 1152921504606846976L));
            fliVar2.d(null, fowVar2);
        }
    }

    public final boolean d() {
        flh flhVar;
        long j;
        do {
            flhVar = this.b;
            j = flhVar.b;
            if ((j & 2305843009213693952L) != 0) {
                return true;
            }
            if ((1152921504606846976L & j) != 0) {
                return false;
            }
        } while (!flhVar.c(j, 2305843009213693952L | j));
        return true;
    }

    public final boolean e() {
        long j = this.b.b;
        return ((int) (1073741823 & j)) == ((int) ((j & 1152921503533105152L) >> 30));
    }
}
