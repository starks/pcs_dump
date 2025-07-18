package defpackage;

import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cbs implements cby {
    private static final Pattern a = Pattern.compile("VmHWM:\\s+(\\d+) kB");

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0035, code lost:
    
        r1 = java.lang.Integer.parseInt(r0.group(1));
     */
    @Override // defpackage.cby
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.cql a() throws java.lang.NumberFormatException, java.io.IOException {
        /*
            r4 = this;
            android.os.Debug$MemoryInfo r4 = new android.os.Debug$MemoryInfo
            r4.<init>()
            android.os.Debug.getMemoryInfo(r4)
            java.io.File r0 = new java.io.File
            java.lang.String r1 = "/proc/self/status"
            r0.<init>(r1)
            r1 = 0
            java.io.BufferedReader r2 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L44
            java.io.FileReader r3 = new java.io.FileReader     // Catch: java.lang.Throwable -> L44
            r3.<init>(r0)     // Catch: java.lang.Throwable -> L44
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L44
        L1a:
            java.lang.String r0 = r2.readLine()     // Catch: java.lang.Throwable -> L3a
            if (r0 == 0) goto L36
            java.util.regex.Pattern r3 = defpackage.cbs.a     // Catch: java.lang.Throwable -> L3a
            java.util.regex.Matcher r0 = r3.matcher(r0)     // Catch: java.lang.Throwable -> L3a
            boolean r3 = r0.find()     // Catch: java.lang.Throwable -> L3a
            if (r3 == 0) goto L1a
            r3 = 1
            java.lang.String r0 = r0.group(r3)     // Catch: java.lang.Throwable -> L3a
            int r0 = java.lang.Integer.parseInt(r0)     // Catch: java.lang.Throwable -> L3a
            r1 = r0
        L36:
            r2.close()     // Catch: java.lang.Throwable -> L44 java.lang.Throwable -> L44
            goto L44
        L3a:
            r0 = move-exception
            r2.close()     // Catch: java.lang.Throwable -> L3f
            goto L43
        L3f:
            r2 = move-exception
            r0.addSuppressed(r2)     // Catch: java.lang.Throwable -> L44 java.lang.Throwable -> L44
        L43:
            throw r0     // Catch: java.lang.Throwable -> L44 java.lang.Throwable -> L44
        L44:
            cql r0 = new cql
            int r2 = r4.nativePss
            int r4 = r4.dalvikPss
            r3 = 0
            r0.<init>(r2, r4, r1, r3)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cbs.a():cql");
    }
}
