package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cbr extends cbx {
    private final String b;

    public cbr(String str) {
        super(str);
        this.b = "brella";
    }

    public static cbx c(String str) {
        return new cbr(str);
    }

    public static cbx d(String str, String str2) {
        return new cbr(str2);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.cbx
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(java.util.logging.Level r3, java.lang.String r4, java.lang.Throwable r5, java.lang.String r6, java.lang.Object... r7) {
        /*
            r2 = this;
            java.util.logging.Level r0 = java.util.logging.Level.SEVERE
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto La
            r3 = 6
            goto L28
        La:
            java.util.logging.Level r0 = java.util.logging.Level.WARNING
            boolean r0 = r3.equals(r0)
            r1 = 5
            if (r0 == 0) goto L15
        L13:
            r3 = r1
            goto L28
        L15:
            java.util.logging.Level r0 = java.util.logging.Level.INFO
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L1f
            r3 = 4
            goto L28
        L1f:
            java.util.logging.Level r0 = java.util.logging.Level.FINE
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L13
            r3 = 3
        L28:
            int r0 = r7.length
            if (r0 <= 0) goto L2f
            java.lang.String r6 = java.lang.String.format(r6, r7)
        L2f:
            if (r5 == 0) goto L49
            java.lang.String r5 = android.util.Log.getStackTraceString(r5)
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r6)
            java.lang.String r6 = "\n"
            r7.append(r6)
            r7.append(r5)
            java.lang.String r6 = r7.toString()
        L49:
            java.lang.String r2 = r2.b
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r2)
            java.lang.String r2 = "."
            r5.append(r2)
            r5.append(r4)
            java.lang.String r2 = r5.toString()
            android.util.Log.println(r3, r2, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cbr.a(java.util.logging.Level, java.lang.String, java.lang.Throwable, java.lang.String, java.lang.Object[]):void");
    }

    @Override // defpackage.cbx
    public final void b(String str) {
    }
}
