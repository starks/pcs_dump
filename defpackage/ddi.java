package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class ddi extends ddg {
    private static final String a;

    static {
        String property;
        try {
            property = System.getProperty("line.separator");
        } catch (SecurityException unused) {
        }
        if (!property.matches("\\n|\\r(?:\\n)?")) {
            property = "\n";
        }
        a = property;
    }

    static int d(String str, int i) {
        while (i < str.length()) {
            int i2 = i + 1;
            if (str.charAt(i) != '%') {
                i = i2;
            } else {
                if (i2 >= str.length()) {
                    throw ddh.c("trailing unquoted '%' character", str, i);
                }
                char cCharAt = str.charAt(i2);
                if (cCharAt != '%' && cCharAt != 'n') {
                    return i;
                }
                i += 2;
            }
        }
        return -1;
    }

    public abstract int a(ddf ddfVar, int i, String str, int i2, int i3, int i4);

    /* JADX WARN: Code restructure failed: missing block: B:45:0x00ad, code lost:
    
        r0 = r14;
        r4 = d(r3, r0.a(r15, r2, r3, r4, r5, r6));
        r14 = r0;
        r1 = r2;
        r0 = r9;
     */
    @Override // defpackage.ddg
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(defpackage.ddf r15) {
        /*
            Method dump skipped, instructions count: 204
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ddi.b(ddf):void");
    }

    @Override // defpackage.ddg
    public final void c(StringBuilder sb, String str, int i, int i2) {
        int i3 = i;
        while (i < i2) {
            int i4 = i + 1;
            if (str.charAt(i) == '%') {
                if (i4 == i2) {
                    break;
                }
                char cCharAt = str.charAt(i4);
                if (cCharAt == '%') {
                    sb.append((CharSequence) str, i3, i4);
                } else if (cCharAt == 'n') {
                    sb.append((CharSequence) str, i3, i);
                    sb.append(a);
                }
                i3 = i + 2;
                i = i3;
            }
            i = i4;
        }
        if (i3 < i2) {
            sb.append((CharSequence) str, i3, i2);
        }
    }
}
