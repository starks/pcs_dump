package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class t extends m {
    public final Object b;
    public final boolean c;
    public final Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public t(defpackage.bw r6, boolean r7, boolean r8) {
        /*
            r5 = this;
            r6.getClass()
            r5.<init>(r6)
            int r0 = r6.h
            r1 = 2
            r2 = 0
            r3 = 1
            r4 = 0
            if (r0 != r1) goto L1e
            if (r7 == 0) goto L31
            ab r7 = r6.a
            z r7 = r7.R
            if (r7 != 0) goto L17
        L16:
            goto L26
        L17:
            java.lang.Object r7 = r7.l
            java.lang.Object r0 = defpackage.ab.e
            if (r7 != r0) goto L2f
            goto L16
        L1e:
            if (r7 == 0) goto L31
            ab r7 = r6.a
            z r7 = r7.R
            if (r7 != 0) goto L28
        L26:
            r7 = r4
            goto L2f
        L28:
            java.lang.Object r7 = r7.j
            java.lang.Object r0 = defpackage.ab.e
            if (r7 != r0) goto L2f
            goto L26
        L2f:
            r2 = r3
            goto L32
        L31:
            r7 = r4
        L32:
            r5.b = r7
            r5.c = r3
            if (r8 == 0) goto L49
            if (r2 == 0) goto L49
            ab r6 = r6.a
            z r6 = r6.R
            if (r6 != 0) goto L41
            goto L49
        L41:
            java.lang.Object r6 = r6.n
            java.lang.Object r7 = defpackage.ab.e
            if (r6 != r7) goto L48
            goto L49
        L48:
            r4 = r6
        L49:
            r5.d = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.t.<init>(bw, boolean, boolean):void");
    }

    private final bo d(Object obj) {
        if (obj == null) {
            return null;
        }
        bg bgVar = bg.a;
        throw new IllegalArgumentException("Transition " + obj + " for fragment " + this.a.a + " is not a valid framework Transition or AndroidX Transition");
    }

    public final bo a() {
        Object obj = this.d;
        bo boVarD = d(this.b);
        bo boVarD2 = d(obj);
        if (boVarD == null || boVarD2 == null || boVarD == boVarD2) {
            return boVarD == null ? boVarD2 : boVarD;
        }
        throw new IllegalArgumentException("Mixing framework transitions and AndroidX transitions is not allowed. Fragment " + this.a.a + " returned Transition " + this.b + " which uses a different Transition  type than its shared element transition " + this.d);
    }

    public final boolean c() {
        return this.d != null;
    }
}
