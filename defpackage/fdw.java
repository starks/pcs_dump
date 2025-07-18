package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fdw {
    public String a;
    public String b;
    public int c = -1;

    /* JADX WARN: Code restructure failed: missing block: B:100:?, code lost:
    
        return r16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x008b, code lost:
    
        if ((r12 - r10) == 0) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x008d, code lost:
    
        r3[r7] = (byte) r14;
        r7 = r7 + 1;
        r10 = r12;
        r11 = r16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00d5, code lost:
    
        r16 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x00d7, code lost:
    
        if (r8 == 16) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x00d9, code lost:
    
        if (r9 != (-1)) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x00db, code lost:
    
        return r16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x00dc, code lost:
    
        r0 = r8 - r9;
        java.lang.System.arraycopy(r3, r9, r3, 16 - r0, r0);
        java.util.Arrays.fill(r3, r9, (16 - r8) + r9, (byte) 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x00ec, code lost:
    
        return java.net.InetAddress.getByAddress(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x00f2, code lost:
    
        throw new java.lang.AssertionError();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.net.InetAddress b(java.lang.String r17, int r18) {
        /*
            Method dump skipped, instructions count: 243
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fdw.b(java.lang.String, int):java.net.InetAddress");
    }

    final int a() {
        int i = this.c;
        return i != -1 ? i : fdx.b(this.a);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.a);
        sb.append("://");
        if (this.b.indexOf(58) != -1) {
            sb.append('[');
            sb.append(this.b);
            sb.append(']');
        } else {
            sb.append(this.b);
        }
        int iA = a();
        if (iA != fdx.b(this.a)) {
            sb.append(':');
            sb.append(iA);
        }
        return sb.toString();
    }
}
