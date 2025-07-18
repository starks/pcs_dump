package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class csa extends cre {
    final /* synthetic */ String g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public csa(csd csdVar, CharSequence charSequence, String str) {
        super(csdVar, charSequence);
        this.g = str;
    }

    @Override // defpackage.cre
    public final int a(int i) {
        return i + this.g.length();
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0022, code lost:
    
        r7 = r7 + 1;
     */
    @Override // defpackage.cre
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int b(int r7) {
        /*
            r6 = this;
            java.lang.CharSequence r0 = r6.b
            java.lang.String r1 = r6.g
            int r1 = r1.length()
            int r0 = r0.length()
            int r0 = r0 - r1
        Ld:
            if (r7 > r0) goto L29
            r2 = 0
        L10:
            if (r2 >= r1) goto L28
            java.lang.CharSequence r3 = r6.b
            int r4 = r2 + r7
            java.lang.String r5 = r6.g
            char r3 = r3.charAt(r4)
            char r4 = r5.charAt(r2)
            if (r3 == r4) goto L25
            int r7 = r7 + 1
            goto Ld
        L25:
            int r2 = r2 + 1
            goto L10
        L28:
            return r7
        L29:
            r6 = -1
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.csa.b(int):int");
    }
}
