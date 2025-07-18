package defpackage;

import android.content.Context;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.learning.dynamite.training.InAppTrainerCancellerImpl;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class btj implements btq {
    final /* synthetic */ InAppTrainerCancellerImpl a;
    private final int b;

    public btj(InAppTrainerCancellerImpl inAppTrainerCancellerImpl, int i) {
        this.a = inAppTrainerCancellerImpl;
        this.b = i;
    }

    @Override // defpackage.btq
    public final djy a() {
        djy djyVarI;
        try {
            int i = this.b;
            final int i2 = 1;
            if (i != 0 && i != 1 && i != 2 && i != 3) {
                return cnx.C(new Status(10, "Unknown InAppTrainerType!"));
            }
            final Context applicationContext = this.a.a.getApplicationContext();
            cbq cbqVarB = cbq.b(applicationContext);
            try {
                bqm bqmVar = (bqm) cbqVarB.c(bqm.class);
                final bpz bpzVar = (bpz) cbqVarB.c(bpz.class);
                if (this.a.a(bqmVar, bpzVar)) {
                    djyVarI = cnx.C(new Status(17, "InAppTraining API not enabled!"));
                    if (cbqVarB != null) {
                    }
                    return djyVarI;
                }
                bqmVar.k(ccj.dj);
                byte[] bArr = null;
                cbq cbqVarB2 = bpzVar.aS() ? cbq.b(applicationContext) : null;
                final bxh bxhVar = (bxh) cbqVarB.c(bxh.class);
                int i3 = this.b;
                final int i4 = i3 != 0 ? i3 != 1 ? i3 != 3 ? dfg.a : dfg.f : dfg.e : dfg.d;
                final int i5 = 0;
                djyVarI = dhq.i(dhq.i(dij.i(djr.q(bxhVar.d(this.b)), new crp() { // from class: bth
                    @Override // defpackage.crp
                    public final Object a(Object obj) {
                        if (i2 == 0) {
                            cru cruVarD = cru.d(dfi.ERROR_REASON_IO_EXCEPTION);
                            bxhVar.m(i4, cruVarD, crd.a);
                            return new Status(8, "IOException");
                        }
                        boolean zBooleanValue = ((Boolean) obj).booleanValue();
                        int i6 = i4;
                        bxh bxhVar2 = bxhVar;
                        if (!zBooleanValue) {
                            bxhVar2.m(i6, cru.d(dfi.ERROR_REASON_FILE_DELETION), crd.a);
                            return new Status(25001, "Error occurs when deleting output directory!");
                        }
                        crd crdVar = crd.a;
                        bxhVar2.m(i6, crdVar, crdVar);
                        return Status.a;
                    }
                }, diy.a), IOException.class, new crp() { // from class: bth
                    @Override // defpackage.crp
                    public final Object a(Object obj) {
                        if (i5 == 0) {
                            cru cruVarD = cru.d(dfi.ERROR_REASON_IO_EXCEPTION);
                            bxhVar.m(i4, cruVarD, crd.a);
                            return new Status(8, "IOException");
                        }
                        boolean zBooleanValue = ((Boolean) obj).booleanValue();
                        int i6 = i4;
                        bxh bxhVar2 = bxhVar;
                        if (!zBooleanValue) {
                            bxhVar2.m(i6, cru.d(dfi.ERROR_REASON_FILE_DELETION), crd.a);
                            return new Status(25001, "Error occurs when deleting output directory!");
                        }
                        crd crdVar = crd.a;
                        bxhVar2.m(i6, crdVar, crdVar);
                        return Status.a;
                    }
                }, diy.a), RuntimeException.class, new crp() { // from class: bti
                    @Override // defpackage.crp
                    public final Object a(Object obj) {
                        RuntimeException runtimeException = (RuntimeException) obj;
                        bxhVar.m(i4, cru.d(dfi.ERROR_REASON_RUNTIME_EXCEPTION), crd.a);
                        if (!bpzVar.bo()) {
                            throw runtimeException;
                        }
                        bnb.a(applicationContext, runtimeException);
                        throw runtimeException;
                    }
                }, diy.a);
                djyVarI.c(new bks(cbqVarB2, 7, bArr), this.a.b);
                if (cbqVarB == null) {
                    return djyVarI;
                }
                cbqVarB.close();
                return djyVarI;
            } finally {
            }
        } catch (Throwable th) {
            bnb.a(this.a.a.getApplicationContext(), th);
            throw th;
        }
    }
}
