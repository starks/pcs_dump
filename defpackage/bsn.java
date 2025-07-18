package defpackage;

import com.google.android.gms.learning.dynamite.training.BrellaInvocationImpl;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bsn extends btf {
    final /* synthetic */ dki a;
    final /* synthetic */ BrellaInvocationImpl b;

    public bsn(BrellaInvocationImpl brellaInvocationImpl, dki dkiVar) {
        this.a = dkiVar;
        this.b = brellaInvocationImpl;
    }

    @Override // defpackage.btg
    public final void a(byte[] bArr) {
        if (this.b.g.get()) {
            try {
                dzl dzlVar = (dzl) efb.parseFrom(dzl.a, bArr, een.a());
                asr asrVar = (asr) bwr.a.createBuilder();
                int i = dzlVar.b ? bwq.b : bwq.c;
                if (!asrVar.a.isMutable()) {
                    asrVar.B();
                }
                ((bwr) asrVar.a).c = bwq.a(i);
                dyf dyfVar = dzlVar.c;
                if (dyfVar == null) {
                    dyfVar = dyf.a;
                }
                if (!asrVar.a.isMutable()) {
                    asrVar.B();
                }
                bwr bwrVar = (bwr) asrVar.a;
                dyfVar.getClass();
                bwrVar.d = dyfVar;
                bwrVar.b |= 1;
                bwr bwrVar2 = (bwr) asrVar.z();
                synchronized (this.b.b) {
                    bvl bvlVar = this.b.f;
                    bvlVar.getClass();
                    BrellaInvocationImpl.a(bvlVar, bwrVar2);
                }
            } catch (efp e) {
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
            cbx r0 = com.google.android.gms.learning.dynamite.training.BrellaInvocationImpl.a
            java.lang.String r1 = "Training ended in unknown state."
            r0.e(r1)
            goto L36
        L11:
            cbx r2 = com.google.android.gms.learning.dynamite.training.BrellaInvocationImpl.a
            if (r4 == 0) goto L16
            r0 = r1
        L16:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            java.lang.String r1 = "Training ended with error (hasRetryWindow=%s). "
            r2.i(r1, r0)
            goto L36
        L24:
            cbx r2 = com.google.android.gms.learning.dynamite.training.BrellaInvocationImpl.a
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bsn.b(byte[], int):void");
    }
}
