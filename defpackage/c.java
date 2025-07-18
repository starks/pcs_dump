package defpackage;

import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class c {
    private static final Object a = new Object();

    /* JADX WARN: Code restructure failed: missing block: B:19:0x003a, code lost:
    
        r1 = r3.getAttributeValue(null, "application_locales");
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0059 A[Catch: all -> 0x0068, TryCatch #4 {, blocks: (B:5:0x0005, B:21:0x0043, B:28:0x0053, B:30:0x0059, B:31:0x005e, B:34:0x0062, B:35:0x0065, B:36:0x0066, B:6:0x000b, B:7:0x0018, B:11:0x0022, B:17:0x002e, B:19:0x003a, B:25:0x0049), top: B:50:0x0005, inners: #3, #5 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String a(android.content.Context r7) {
        /*
            java.lang.Object r0 = defpackage.c.a
            monitor-enter(r0)
            java.lang.String r1 = ""
            java.lang.String r2 = "android.support.v7.app.AppCompatDelegate.application_locales_record_file"
            java.io.FileInputStream r2 = r7.openFileInput(r2)     // Catch: java.io.FileNotFoundException -> L66 java.lang.Throwable -> L68
            org.xmlpull.v1.XmlPullParser r3 = android.util.Xml.newPullParser()     // Catch: java.lang.Throwable -> L47 java.lang.Throwable -> L49
            java.lang.String r4 = "UTF-8"
            r3.setInput(r2, r4)     // Catch: java.lang.Throwable -> L47 java.lang.Throwable -> L49
            int r4 = r3.getDepth()     // Catch: java.lang.Throwable -> L47 java.lang.Throwable -> L49
        L18:
            int r5 = r3.next()     // Catch: java.lang.Throwable -> L47 java.lang.Throwable -> L49
            r6 = 1
            if (r5 == r6) goto L41
            r6 = 3
            if (r5 != r6) goto L29
            int r5 = r3.getDepth()     // Catch: java.lang.Throwable -> L47 java.lang.Throwable -> L49
            if (r5 <= r4) goto L41
            r5 = r6
        L29:
            if (r5 == r6) goto L18
            r6 = 4
            if (r5 == r6) goto L18
            java.lang.String r5 = r3.getName()     // Catch: java.lang.Throwable -> L47 java.lang.Throwable -> L49
            java.lang.String r6 = "locales"
            boolean r5 = r5.equals(r6)     // Catch: java.lang.Throwable -> L47 java.lang.Throwable -> L49
            if (r5 == 0) goto L18
            java.lang.String r4 = "application_locales"
            r5 = 0
            java.lang.String r1 = r3.getAttributeValue(r5, r4)     // Catch: java.lang.Throwable -> L47 java.lang.Throwable -> L49
        L41:
            if (r2 == 0) goto L53
        L43:
            r2.close()     // Catch: java.io.IOException -> L53 java.lang.Throwable -> L68
            goto L53
        L47:
            r7 = move-exception
            goto L60
        L49:
            java.lang.String r3 = "AppLocalesStorageHelper"
            java.lang.String r4 = "Reading app Locales : Unable to parse through file :androidx.appcompat.app.AppCompatDelegate.application_locales_record_file"
            android.util.Log.w(r3, r4)     // Catch: java.lang.Throwable -> L47
            if (r2 == 0) goto L53
            goto L43
        L53:
            boolean r2 = r1.isEmpty()     // Catch: java.lang.Throwable -> L68
            if (r2 == 0) goto L5e
            java.lang.String r2 = "android.support.v7.app.AppCompatDelegate.application_locales_record_file"
            r7.deleteFile(r2)     // Catch: java.lang.Throwable -> L68
        L5e:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L68
            return r1
        L60:
            if (r2 == 0) goto L65
            r2.close()     // Catch: java.io.IOException -> L65 java.lang.Throwable -> L68
        L65:
            throw r7     // Catch: java.lang.Throwable -> L68
        L66:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L68
            return r1
        L68:
            r7 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L68
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.c.a(android.content.Context):java.lang.String");
    }

    static /* synthetic */ void b(bw bwVar, s sVar) {
        if (ax.X(2)) {
            Objects.toString(bwVar);
        }
        bwVar.f(sVar);
    }
}
