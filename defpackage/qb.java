package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qb extends qd {
    public int a;
    public pd b;
    private int i;

    public qb(Context context) {
        super(context);
        super.setVisibility(8);
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x000c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0015  */
    @Override // defpackage.qd
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(defpackage.pg r6, boolean r7) {
        /*
            r5 = this;
            int r0 = r5.a
            r5.i = r0
            r1 = 6
            r2 = 5
            r3 = 1
            r4 = 0
            if (r7 == 0) goto L13
            if (r0 != r2) goto L10
        Lc:
            r5.i = r3
            r0 = r3
            goto L1c
        L10:
            if (r0 != r1) goto L1c
            goto L15
        L13:
            if (r0 != r2) goto L19
        L15:
            r5.i = r4
            r0 = r4
            goto L1c
        L19:
            if (r0 != r1) goto L1c
            goto Lc
        L1c:
            boolean r5 = r6 instanceof defpackage.pd
            if (r5 == 0) goto L24
            pd r6 = (defpackage.pd) r6
            r6.a = r0
        L24:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qb.a(pg, boolean):void");
    }

    public final void b(int i) {
        this.b.c = i;
    }

    @Override // defpackage.qd
    protected final void c() {
        pd pdVar = new pd();
        this.b = pdVar;
        this.h = pdVar;
        g();
    }
}
