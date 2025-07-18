package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes.dex */
final class btt extends btf {
    final /* synthetic */ dki a;
    final /* synthetic */ String b;
    final /* synthetic */ String c;
    final /* synthetic */ btw d;
    final /* synthetic */ byte[] e;
    final /* synthetic */ btv f;

    public btt(btv btvVar, dki dkiVar, String str, String str2, btw btwVar, byte[] bArr) {
        this.a = dkiVar;
        this.b = str;
        this.c = str2;
        this.d = btwVar;
        this.e = bArr;
        this.f = btvVar;
    }

    @Override // defpackage.btg
    public final void a(byte[] bArr) throws Throwable {
        if (this.f.g.br(this.b)) {
            try {
                dzl dzlVar = (dzl) efb.parseFrom(dzl.a, bArr, een.a());
                btv btvVar = this.f;
                dyf dyfVar = dzlVar.c;
                if (dyfVar == null) {
                    dyfVar = dyf.a;
                }
                dyf dyfVar2 = dyfVar;
                Context context = btvVar.c;
                btv btvVar2 = this.f;
                new fpv(context, dyfVar2, btvVar2.i, btvVar2.g, btv.a).j(this.c, this.d, this.e, dzlVar.b);
            } catch (efp e) {
                btv.a.f(e, "Could not parse TaskResultInfo proto");
                throw new IllegalStateException(e);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0024  */
    @Override // defpackage.btg
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(byte[] r4, int r5) {
        /*
            r3 = this;
            r0 = 0
            r1 = 1
            if (r5 == 0) goto L24
            if (r5 == r1) goto L11
            r2 = 2
            if (r5 == r2) goto L24
            cbx r0 = defpackage.btv.a
            java.lang.String r1 = "Training ended in unknown state."
            r0.e(r1)
            goto L36
        L11:
            cbx r2 = defpackage.btv.a
            if (r4 == 0) goto L16
            r0 = r1
        L16:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            java.lang.String r1 = "Training ended with error (hasRetryWindow=%s). "
            r2.i(r1, r0)
            goto L36
        L24:
            cbx r2 = defpackage.btv.a
            if (r4 == 0) goto L29
            r0 = r1
        L29:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            java.lang.String r1 = "Training ended with success (hasRetryWindow=%s)."
            r2.g(r1, r0)
        L36:
            dki r3 = r3.a
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            crv r0 = new crv
            r0.<init>(r4, r5)
            r3.d(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.btt.b(byte[], int):void");
    }
}
