package defpackage;

import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dbv extends dbx {
    public final int[] a;
    public final int b;
    private final dbg d;
    private final dbg e;

    /* JADX WARN: Removed duplicated region for block: B:25:0x0058  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public dbv(defpackage.dbg r10, defpackage.dbg r11) {
        /*
            r9 = this;
            r9.<init>()
            r9.d = r10
            r9.e = r11
            int r10 = r11.b()
            r11 = 28
            r0 = 0
            r1 = 1
            if (r10 > r11) goto L13
            r11 = r1
            goto L14
        L13:
            r11 = r0
        L14:
            java.lang.String r2 = "metadata size too large"
            defpackage.cnx.U(r11, r2)
            int[] r10 = new int[r10]
            r9.a = r10
            r2 = 0
            r11 = r0
            r4 = r11
        L21:
            int r5 = r10.length
            if (r11 >= r5) goto L61
            dae r5 = r9.d(r11)
            long r6 = r5.d
            long r6 = r6 | r2
            int r2 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r2 != 0) goto L58
            r2 = r0
        L30:
            r3 = -1
            if (r2 >= r4) goto L45
            r8 = r10[r2]
            r8 = r8 & 31
            dae r8 = r9.d(r8)
            boolean r8 = r5.equals(r8)
            if (r8 == 0) goto L42
            goto L46
        L42:
            int r2 = r2 + 1
            goto L30
        L45:
            r2 = r3
        L46:
            if (r2 == r3) goto L58
            boolean r3 = r5.b
            if (r3 == 0) goto L54
            r3 = r10[r2]
            int r5 = r11 + 4
            int r5 = r1 << r5
            r3 = r3 | r5
            goto L55
        L54:
            r3 = r11
        L55:
            r10[r2] = r3
            goto L5d
        L58:
            int r2 = r4 + 1
            r10[r4] = r11
            r4 = r2
        L5d:
            int r11 = r11 + 1
            r2 = r6
            goto L21
        L61:
            r9.b = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dbv.<init>(dbg, dbg):void");
    }

    @Override // defpackage.dbx
    public final int a() {
        return this.b;
    }

    @Override // defpackage.dbx
    public final Set b() {
        return new dbt(this);
    }

    @Override // defpackage.dbx
    public final void c(dbn dbnVar, Object obj) {
        for (int i = 0; i < this.b; i++) {
            int i2 = this.a[i];
            dae daeVarD = d(i2 & 31);
            if (daeVarD.b) {
                dbnVar.b(daeVarD, new dbu(this, daeVarD, i2), obj);
            } else {
                dbnVar.a(daeVarD, daeVarD.c(e(i2)), obj);
            }
        }
    }

    public final dae d(int i) {
        dbg dbgVar = this.d;
        int iB = dbgVar.b();
        return i >= iB ? this.e.c(i - iB) : dbgVar.c(i);
    }

    public final Object e(int i) {
        dbg dbgVar = this.d;
        int iB = dbgVar.b();
        return i >= iB ? this.e.e(i - iB) : dbgVar.e(i);
    }
}
