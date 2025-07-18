package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class dei {
    private static final def a;

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0022, code lost:
    
        r0 = defpackage.dee.a;
     */
    static {
        /*
            java.lang.String r0 = "os.arch"
            java.lang.String r0 = java.lang.System.getProperty(r0)     // Catch: java.lang.Throwable -> L20
            java.lang.String r1 = "amd64"
            boolean r0 = j$.util.Objects.equals(r0, r1)     // Catch: java.lang.Throwable -> L20
            if (r0 == 0) goto L20
            java.nio.ByteOrder r0 = java.nio.ByteOrder.nativeOrder()     // Catch: java.lang.Throwable -> L20
            java.nio.ByteOrder r1 = java.nio.ByteOrder.LITTLE_ENDIAN     // Catch: java.lang.Throwable -> L20
            boolean r0 = r0.equals(r1)     // Catch: java.lang.Throwable -> L20
            if (r0 == 0) goto L1d
            deh r0 = defpackage.deh.UNSAFE_LITTLE_ENDIAN     // Catch: java.lang.Throwable -> L20
            goto L22
        L1d:
            deh r0 = defpackage.deh.UNSAFE_BIG_ENDIAN     // Catch: java.lang.Throwable -> L20
            goto L22
        L20:
            dee r0 = defpackage.dee.a
        L22:
            defpackage.dei.a = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dei.<clinit>():void");
    }

    static int a(byte[] bArr, int i) {
        int i2 = bArr[i] & 255;
        int i3 = bArr[i + 1] & 255;
        int i4 = bArr[i + 2] & 255;
        return ((bArr[i + 3] & 255) << 24) | (i3 << 8) | i2 | (i4 << 16);
    }

    static long b(byte[] bArr, int i) {
        return a.a(bArr, i);
    }
}
