package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class fnd extends fjr implements fiy {
    private final /* synthetic */ int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fnd(Object obj, int i) {
        super(1, obj, fne.class, "invoke", "invoke(Ljava/lang/Throwable;)V");
        this.e = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0076  */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v9, types: [java.util.Set] */
    @Override // defpackage.fiy
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final /* synthetic */ java.lang.Object a(java.lang.Object r9) {
        /*
            r8 = this;
            int r0 = r8.e
            if (r0 == 0) goto L8e
            java.util.Set r9 = (java.util.Set) r9
            r9.getClass()
            java.lang.Object r8 = r8.b
            acs r8 = (defpackage.acs) r8
            java.util.concurrent.locks.ReentrantLock r0 = r8.d
            r0.lock()
            java.util.Map r8 = r8.c     // Catch: java.lang.Throwable -> L89
            java.util.Collection r8 = r8.values()     // Catch: java.lang.Throwable -> L89
            java.util.List r8 = defpackage.ffh.L(r8)     // Catch: java.lang.Throwable -> L89
            r0.unlock()
            java.util.Iterator r8 = r8.iterator()
        L23:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L86
            java.lang.Object r0 = r8.next()
            ahm r0 = (defpackage.ahm) r0
            java.lang.Object r1 = r0.a
            int[] r1 = (int[]) r1
            int r2 = r1.length
            if (r2 == 0) goto L76
            r3 = 0
            r4 = 1
            if (r2 == r4) goto L67
            fhd r1 = new fhd
            r1.<init>()
            java.lang.Object r2 = r0.a
            int[] r2 = (int[]) r2
            int r4 = r2.length
            r5 = r3
        L45:
            if (r3 >= r4) goto L62
            r6 = r2[r3]
            int r7 = r5 + 1
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            boolean r6 = r9.contains(r6)
            if (r6 == 0) goto L5e
            java.lang.Object r6 = r0.c
            java.lang.String[] r6 = (java.lang.String[]) r6
            r5 = r6[r5]
            r1.add(r5)
        L5e:
            int r3 = r3 + 1
            r5 = r7
            goto L45
        L62:
            java.util.Set r1 = defpackage.ffh.p(r1)
            goto L78
        L67:
            r1 = r1[r3]
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            boolean r1 = r9.contains(r1)
            if (r1 == 0) goto L76
            java.lang.Object r1 = r0.d
            goto L78
        L76:
            fgo r1 = defpackage.fgo.a
        L78:
            boolean r2 = r1.isEmpty()
            if (r2 != 0) goto L23
            java.lang.Object r0 = r0.b
            acq r0 = (defpackage.acq) r0
            r0.a(r1)
            goto L23
        L86:
            ffz r8 = defpackage.ffz.a
            return r8
        L89:
            r8 = move-exception
            r0.unlock()
            throw r8
        L8e:
            java.lang.Throwable r9 = (java.lang.Throwable) r9
            java.lang.Object r8 = r8.b
            fne r8 = (defpackage.fne) r8
            r8.b(r9)
            ffz r8 = defpackage.ffz.a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fnd.a(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fnd(Object obj, int i, byte[] bArr) {
        super(1, obj, acs.class, "notifyInvalidatedObservers", "notifyInvalidatedObservers(Ljava/util/Set;)V");
        this.e = i;
    }
}
