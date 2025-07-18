package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ftf {
    public static final ftf a = new ftf();
    public static final fvn b;
    private static final String[] c;
    private static final String[] d;
    private static final String[] e;

    static {
        fvn fvnVar = fvn.a;
        b = fwv.h("PRI * HTTP/2.0\r\n\r\nSM\r\n\r\n");
        c = new String[]{"DATA", "HEADERS", "PRIORITY", "RST_STREAM", "SETTINGS", "PUSH_PROMISE", "PING", "GOAWAY", "WINDOW_UPDATE", "CONTINUATION"};
        d = new String[64];
        String[] strArr = new String[256];
        for (int i = 0; i < 256; i++) {
            strArr[i] = fjz.A(frh.j("%8s", Integer.toBinaryString(i)), ' ', '0');
        }
        e = strArr;
        String[] strArr2 = d;
        strArr2[0] = "";
        strArr2[1] = "END_STREAM";
        int[] iArr = {1};
        strArr2[8] = "PADDED";
        for (int i2 = 0; i2 <= 0; i2++) {
            int i3 = iArr[i2];
            String[] strArr3 = d;
            strArr3[i3 | 8] = String.valueOf(strArr3[i3]).concat("|PADDED");
        }
        String[] strArr4 = d;
        strArr4[4] = "END_HEADERS";
        strArr4[32] = "PRIORITY";
        strArr4[36] = "END_HEADERS|PRIORITY";
        int[] iArr2 = {4, 32, 36};
        for (int i4 = 0; i4 < 3; i4++) {
            int i5 = iArr2[i4];
            for (int i6 = 0; i6 <= 0; i6++) {
                int i7 = iArr[i6];
                int i8 = i7 | i5;
                String[] strArr5 = d;
                strArr5[i8] = strArr5[i7] + "|" + strArr5[i5];
                strArr5[i8 | 8] = strArr5[i7] + "|" + strArr5[i5] + "|PADDED";
            }
        }
        int length = d.length;
        for (int i9 = 0; i9 < 64; i9++) {
            String[] strArr6 = d;
            if (strArr6[i9] == null) {
                strArr6[i9] = e[i9];
            }
        }
    }

    private ftf() {
    }

    public static final String b(int i) {
        String[] strArr = c;
        int length = strArr.length;
        return i < 10 ? strArr[i] : frh.j("0x%02x", Integer.valueOf(i));
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0059  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String a(boolean r5, int r6, int r7, int r8, int r9) {
        /*
            r4 = this;
            java.lang.String r4 = b(r8)
            r0 = 1
            if (r9 != 0) goto La
            java.lang.String r8 = ""
            goto L5d
        La:
            r1 = 2
            if (r8 == r1) goto L59
            r1 = 3
            if (r8 == r1) goto L59
            r1 = 4
            if (r8 == r1) goto L4f
            r2 = 6
            if (r8 == r2) goto L4f
            r2 = 7
            if (r8 == r2) goto L59
            r2 = 8
            if (r8 == r2) goto L59
            java.lang.String[] r2 = defpackage.ftf.d
            int r3 = r2.length
            r3 = 64
            if (r9 >= r3) goto L2a
            r2 = r2[r9]
            r2.getClass()
            goto L2e
        L2a:
            java.lang.String[] r2 = defpackage.ftf.e
            r2 = r2[r9]
        L2e:
            r3 = 5
            if (r8 != r3) goto L3e
            r8 = r9 & 4
            if (r8 == 0) goto L4d
            java.lang.String r8 = "HEADERS"
            java.lang.String r9 = "PUSH_PROMISE"
            java.lang.String r8 = defpackage.fjz.B(r2, r8, r9)
            goto L5d
        L3e:
            if (r8 != 0) goto L4d
            r8 = r9 & 32
            if (r8 == 0) goto L4d
            java.lang.String r8 = "PRIORITY"
            java.lang.String r9 = "COMPRESSED"
            java.lang.String r8 = defpackage.fjz.B(r2, r8, r9)
            goto L5d
        L4d:
            r8 = r2
            goto L5d
        L4f:
            if (r9 != r0) goto L54
            java.lang.String r8 = "ACK"
            goto L5d
        L54:
            java.lang.String[] r8 = defpackage.ftf.e
            r8 = r8[r9]
            goto L5d
        L59:
            java.lang.String[] r8 = defpackage.ftf.e
            r8 = r8[r9]
        L5d:
            if (r0 == r5) goto L62
            java.lang.String r5 = ">>"
            goto L64
        L62:
            java.lang.String r5 = "<<"
        L64:
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            java.lang.Object[] r4 = new java.lang.Object[]{r5, r6, r7, r4, r8}
            java.lang.String r5 = "%s 0x%08x %5d %-13s %s"
            java.lang.String r4 = defpackage.frh.j(r5, r4)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ftf.a(boolean, int, int, int, int):java.lang.String");
    }
}
