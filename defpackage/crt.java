package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class crt {
    private final String a;
    private final crs b;
    private crs c;
    private boolean d;

    public crt(String str) {
        crs crsVar = new crs();
        this.b = crsVar;
        this.c = crsVar;
        this.d = false;
        str.getClass();
        this.a = str;
    }

    private final crs h() {
        crs crsVar = new crs();
        this.c.c = crsVar;
        this.c = crsVar;
        return crsVar;
    }

    public final crt a(String str, int i) {
        f(str, String.valueOf(i));
        return this;
    }

    public final crt b(String str, long j) {
        f(str, String.valueOf(j));
        return this;
    }

    public final crt c(String str, boolean z) {
        f(str, String.valueOf(z));
        return this;
    }

    public final void d(Object obj) {
        h().b = obj;
    }

    public final void e(String str, Object obj) {
        crs crsVarH = h();
        crsVarH.b = obj;
        crsVarH.a = str;
    }

    public final void f(String str, Object obj) {
        crr crrVar = new crr();
        this.c.c = crrVar;
        this.c = crrVar;
        crrVar.b = obj;
        crrVar.a = str;
    }

    public final void g() {
        this.d = true;
    }

    public final String toString() {
        boolean z = this.d;
        StringBuilder sb = new StringBuilder(32);
        sb.append(this.a);
        sb.append('{');
        String str = "";
        for (crs crsVar = this.b.c; crsVar != null; crsVar = crsVar.c) {
            boolean z2 = crsVar instanceof crr;
            Object obj = crsVar.b;
            if (z2 || obj != null || !z) {
                sb.append(str);
                String str2 = crsVar.a;
                if (str2 != null) {
                    sb.append(str2);
                    sb.append('=');
                }
                if (obj == null || !obj.getClass().isArray()) {
                    sb.append(obj);
                } else {
                    sb.append((CharSequence) Arrays.deepToString(new Object[]{obj}), 1, r2.length() - 1);
                }
                str = ", ";
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
