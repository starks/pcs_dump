package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aeq {
    public final String a;
    public final String b;
    public final boolean c;
    public final int d;
    public final String e;
    public final int f;
    public final int g;

    /* JADX WARN: Removed duplicated region for block: B:23:0x0062 A[PHI: r3
  0x0062: PHI (r3v2 int) = (r3v1 int), (r3v1 int), (r3v1 int), (r3v3 int), (r3v3 int), (r3v3 int) binds: [B:6:0x0029, B:8:0x0031, B:10:0x0039, B:16:0x004d, B:18:0x0055, B:20:0x005d] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public aeq(java.lang.String r1, java.lang.String r2, boolean r3, int r4, java.lang.String r5, int r6) {
        /*
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            r0.c = r3
            r0.d = r4
            r0.e = r5
            r0.f = r6
            java.util.Locale r1 = java.util.Locale.ROOT
            java.lang.String r1 = r2.toUpperCase(r1)
            r1.getClass()
            java.lang.String r2 = "INT"
            boolean r2 = defpackage.fjz.o(r1, r2)
            if (r2 == 0) goto L22
            r1 = 3
            goto L63
        L22:
            java.lang.String r2 = "CHAR"
            boolean r2 = defpackage.fjz.o(r1, r2)
            r3 = 2
            if (r2 != 0) goto L62
            java.lang.String r2 = "CLOB"
            boolean r2 = defpackage.fjz.o(r1, r2)
            if (r2 != 0) goto L62
            java.lang.String r2 = "TEXT"
            boolean r2 = defpackage.fjz.o(r1, r2)
            if (r2 == 0) goto L3c
            goto L62
        L3c:
            java.lang.String r2 = "BLOB"
            boolean r2 = defpackage.fjz.o(r1, r2)
            if (r2 == 0) goto L46
            r1 = 5
            goto L63
        L46:
            java.lang.String r2 = "REAL"
            boolean r2 = defpackage.fjz.o(r1, r2)
            r3 = 4
            if (r2 != 0) goto L62
            java.lang.String r2 = "FLOA"
            boolean r2 = defpackage.fjz.o(r1, r2)
            if (r2 != 0) goto L62
            java.lang.String r2 = "DOUB"
            boolean r1 = defpackage.fjz.o(r1, r2)
            if (r1 == 0) goto L60
            goto L62
        L60:
            r1 = 1
            goto L63
        L62:
            r1 = r3
        L63:
            r0.g = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aeq.<init>(java.lang.String, java.lang.String, boolean, int, java.lang.String, int):void");
    }

    public final boolean a() {
        return this.d > 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aeq)) {
            return false;
        }
        aeq aeqVar = (aeq) obj;
        if (a() != aeqVar.a() || !fjs.c(this.a, aeqVar.a) || this.c != aeqVar.c) {
            return false;
        }
        String str = this.e;
        String str2 = aeqVar.e;
        if (this.f == 1 && aeqVar.f == 2 && str != null && !up.j(str, str2)) {
            return false;
        }
        if (this.f == 2 && aeqVar.f == 1 && str2 != null && !up.j(str2, str)) {
            return false;
        }
        if (this.f == aeqVar.f) {
            if (str != null) {
                if (!up.j(str, str2)) {
                    return false;
                }
            } else if (str2 != null) {
                return false;
            }
        }
        return this.g == aeqVar.g;
    }

    public final int hashCode() {
        return (((((this.a.hashCode() * 31) + this.g) * 31) + (true != this.c ? 1237 : 1231)) * 31) + this.d;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("\n            |Column {\n            |   name = '");
        sb.append(this.a);
        sb.append("',\n            |   type = '");
        sb.append(this.b);
        sb.append("',\n            |   affinity = '");
        sb.append(this.g);
        sb.append("',\n            |   notNull = '");
        sb.append(this.c);
        sb.append("',\n            |   primaryKeyPosition = '");
        sb.append(this.d);
        sb.append("',\n            |   defaultValue = '");
        String str = this.e;
        if (str == null) {
            str = "undefined";
        }
        sb.append(str);
        sb.append("'\n            |}\n        ");
        return fjs.h(new fkz(fjz.k(fjz.G(sb.toString())), (fiy) new mf(5, (byte[]) null), 0), "\n");
    }
}
