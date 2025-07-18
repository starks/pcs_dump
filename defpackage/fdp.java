package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fdp {
    private static final String[] a = {"DATA", "HEADERS", "PRIORITY", "RST_STREAM", "SETTINGS", "PUSH_PROMISE", "PING", "GOAWAY", "WINDOW_UPDATE", "CONTINUATION"};
    private static final String[] b = new String[64];
    private static final String[] c = new String[256];

    static {
        for (int i = 0; i < 256; i++) {
            c[i] = String.format("%8s", Integer.toBinaryString(i)).replace(' ', '0');
        }
        String[] strArr = b;
        strArr[0] = "";
        strArr[1] = "END_STREAM";
        int[] iArr = {1};
        strArr[8] = "PADDED";
        for (int i2 = 0; i2 <= 0; i2++) {
            int i3 = iArr[i2];
            String[] strArr2 = b;
            strArr2[i3 | 8] = String.valueOf(strArr2[i3]).concat("|PADDED");
        }
        String[] strArr3 = b;
        strArr3[4] = "END_HEADERS";
        strArr3[32] = "PRIORITY";
        strArr3[36] = "END_HEADERS|PRIORITY";
        int[] iArr2 = {4, 32, 36};
        for (int i4 = 0; i4 < 3; i4++) {
            int i5 = iArr2[i4];
            for (int i6 = 0; i6 <= 0; i6++) {
                int i7 = iArr[i6];
                int i8 = i7 | i5;
                String[] strArr4 = b;
                strArr4[i8] = strArr4[i7] + "|" + strArr4[i5];
                strArr4[i8 | 8] = strArr4[i7] + "|" + strArr4[i5] + "|PADDED";
            }
        }
        for (int i9 = 0; i9 < 64; i9++) {
            String[] strArr5 = b;
            if (strArr5[i9] == null) {
                strArr5[i9] = c[i9];
            }
        }
    }

    fdp() {
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0068  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String a(boolean r5, int r6, int r7, byte r8, byte r9) {
        /*
            r0 = 10
            if (r8 >= r0) goto L9
            java.lang.String[] r0 = defpackage.fdp.a
            r0 = r0[r8]
            goto L17
        L9:
            java.lang.Byte r0 = java.lang.Byte.valueOf(r8)
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            java.lang.String r1 = "0x%02x"
            java.lang.String r0 = java.lang.String.format(r1, r0)
        L17:
            r1 = 1
            if (r9 != 0) goto L1d
            java.lang.String r8 = ""
            goto L6c
        L1d:
            r2 = 2
            if (r8 == r2) goto L68
            r2 = 3
            if (r8 == r2) goto L68
            r2 = 4
            if (r8 == r2) goto L5e
            r3 = 6
            if (r8 == r3) goto L5e
            r3 = 7
            if (r8 == r3) goto L68
            r3 = 8
            if (r8 == r3) goto L68
            r3 = 64
            if (r9 >= r3) goto L39
            java.lang.String[] r3 = defpackage.fdp.b
            r3 = r3[r9]
            goto L3d
        L39:
            java.lang.String[] r3 = defpackage.fdp.c
            r3 = r3[r9]
        L3d:
            r4 = 5
            if (r8 != r4) goto L4d
            r8 = r9 & 4
            if (r8 == 0) goto L5c
            java.lang.String r8 = "HEADERS"
            java.lang.String r9 = "PUSH_PROMISE"
            java.lang.String r8 = r3.replace(r8, r9)
            goto L6c
        L4d:
            if (r8 != 0) goto L5c
            r8 = r9 & 32
            if (r8 == 0) goto L5c
            java.lang.String r8 = "PRIORITY"
            java.lang.String r9 = "COMPRESSED"
            java.lang.String r8 = r3.replace(r8, r9)
            goto L6c
        L5c:
            r8 = r3
            goto L6c
        L5e:
            if (r9 != r1) goto L63
            java.lang.String r8 = "ACK"
            goto L6c
        L63:
            java.lang.String[] r8 = defpackage.fdp.c
            r8 = r8[r9]
            goto L6c
        L68:
            java.lang.String[] r8 = defpackage.fdp.c
            r8 = r8[r9]
        L6c:
            java.util.Locale r9 = java.util.Locale.US
            if (r1 == r5) goto L73
            java.lang.String r5 = ">>"
            goto L75
        L73:
            java.lang.String r5 = "<<"
        L75:
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            java.lang.Object[] r5 = new java.lang.Object[]{r5, r6, r7, r0, r8}
            java.lang.String r6 = "%s 0x%08x %5d %-13s %s"
            java.lang.String r5 = java.lang.String.format(r9, r6, r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fdp.a(boolean, int, int, byte, byte):java.lang.String");
    }
}
