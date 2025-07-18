package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aec implements adx, acw {
    public final ady a;
    private adl b;

    public aec(ady adyVar) {
        this.a = adyVar;
    }

    @Override // defpackage.acw
    public final Object a(String str, fiy fiyVar, fhk fhkVar) throws Exception {
        aef aefVarB = this.a.b(str);
        try {
            Object objA = fiyVar.a(aefVarB);
            fjp.w(aefVarB, null);
            return objA;
        } finally {
        }
    }

    @Override // defpackage.adx
    public final ady b() {
        return this.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:46:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v5, types: [afb] */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r8v0, types: [fjc] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object c(defpackage.adl r7, defpackage.fjc r8, defpackage.fhk r9) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r9 instanceof defpackage.aeb
            if (r0 == 0) goto L13
            r0 = r9
            aeb r0 = (defpackage.aeb) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            aeb r0 = new aeb
            r0.<init>(r6, r9)
        L18:
            java.lang.Object r9 = r0.b
            fhs r1 = defpackage.fhs.a
            int r2 = r0.d
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L37
            if (r2 != r4) goto L2f
            java.lang.Object r6 = r0.a
            aec r7 = r0.e
            defpackage.ffh.c(r9)     // Catch: java.lang.Throwable -> L2c defpackage.adw -> L90
            goto L79
        L2c:
            r8 = move-exception
            goto L91
        L2f:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L37:
            defpackage.ffh.c(r9)
            ady r9 = r6.a
            afb r9 = r9.a
            boolean r2 = r9.h()
            if (r2 != 0) goto L46
            r6.b = r7
        L46:
            adl r2 = defpackage.adl.a
            int r7 = r7.ordinal()
            if (r7 == 0) goto L61
            if (r7 == r4) goto L5d
            r2 = 2
            if (r7 != r2) goto L57
            r9.c()
            goto L64
        L57:
            ffq r6 = new ffq
            r6.<init>()
            throw r6
        L5d:
            r9.d()
            goto L64
        L61:
            r9.e()
        L64:
            aea r7 = new aea     // Catch: java.lang.Throwable -> L89 defpackage.adw -> L8e
            r7.<init>(r6)     // Catch: java.lang.Throwable -> L89 defpackage.adw -> L8e
            r0.e = r6     // Catch: java.lang.Throwable -> L89 defpackage.adw -> L8e
            r0.a = r9     // Catch: java.lang.Throwable -> L89 defpackage.adw -> L8e
            r0.d = r4     // Catch: java.lang.Throwable -> L89 defpackage.adw -> L8e
            java.lang.Object r7 = r8.a(r7, r0)     // Catch: java.lang.Throwable -> L89 defpackage.adw -> L8e
            if (r7 == r1) goto L88
            r5 = r7
            r7 = r6
            r6 = r9
            r9 = r5
        L79:
            r6.g()     // Catch: java.lang.Throwable -> L2c defpackage.adw -> L90
            r6.f()
            boolean r6 = r6.h()
            if (r6 != 0) goto L87
            r7.b = r3
        L87:
            return r9
        L88:
            return r1
        L89:
            r7 = move-exception
            r8 = r7
            r7 = r6
            r6 = r9
            goto L91
        L8e:
            r7 = r6
            r6 = r9
        L90:
            throw r3     // Catch: java.lang.Throwable -> L2c
        L91:
            r6.f()
            boolean r6 = r6.h()
            if (r6 != 0) goto L9c
            r7.b = r3
        L9c:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aec.c(adl, fjc, fhk):java.lang.Object");
    }

    public final Object d(adl adlVar, fjc fjcVar, fhk fhkVar) {
        return c(adlVar, fjcVar, fhkVar);
    }

    public final Object e() {
        return Boolean.valueOf(this.a.a.h());
    }
}
