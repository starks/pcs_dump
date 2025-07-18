package com.google.android.gms.learning.dynamite.training;

import android.content.Context;
import com.google.android.gms.common.api.Status;
import defpackage.bcp;
import defpackage.bkj;
import defpackage.bnb;
import defpackage.bpe;
import defpackage.bpf;
import defpackage.bpz;
import defpackage.bqm;
import defpackage.brg;
import defpackage.btj;
import defpackage.btl;
import defpackage.bvz;
import defpackage.cbq;
import defpackage.cbr;
import defpackage.cbx;
import defpackage.ccj;
import defpackage.cnx;
import defpackage.djy;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public class InAppTrainerCancellerImpl extends bvz {
    private static final cbx c = cbr.d("brella", "InAppTrnCnclImpl");
    public Context a;
    public Executor b;

    /* renamed from: $r8$lambda$d1dCJPVKc-OYD9IH1U6twakfVCc, reason: not valid java name */
    public static /* synthetic */ djy m16$r8$lambda$d1dCJPVKcOYD9IH1U6twakfVCc(InAppTrainerCancellerImpl inAppTrainerCancellerImpl) {
        Status status;
        try {
            brg.b();
            cbq cbqVarB = cbq.b(inAppTrainerCancellerImpl.a.getApplicationContext());
            try {
                if (inAppTrainerCancellerImpl.a((bqm) cbqVarB.c(bqm.class), (bpz) cbqVarB.c(bpz.class))) {
                    status = new Status(17, "InAppTraining API not enabled!");
                    if (cbqVarB != null) {
                        cbqVarB.close();
                    }
                } else {
                    if (cbqVarB != null) {
                        cbqVarB.close();
                    }
                    status = Status.a;
                }
                return cnx.C(status);
            } finally {
            }
        } catch (Throwable th) {
            bnb.a(inAppTrainerCancellerImpl.a.getApplicationContext(), th);
            throw th;
        }
    }

    public final boolean a(bqm bqmVar, bpz bpzVar) {
        if (bpzVar.aY(this.a.getApplicationContext().getPackageName())) {
            return false;
        }
        bqmVar.k(ccj.cM);
        return true;
    }

    @Override // defpackage.bwa
    public void cancelJobsByType(int i, bkj bkjVar) {
        bcp.d(new btj(this, i), bkjVar, this.b, c, this.a);
    }

    @Override // defpackage.bwa
    public boolean init(bpf bpfVar, bpf bpfVar2, bkj bkjVar) {
        try {
            this.a = (Context) bpe.a(bpfVar);
            this.b = (Executor) bpe.a(bpfVar2);
            bcp.d(new btl(this, 1), bkjVar, this.b, c, this.a);
            return true;
        } catch (Error | RuntimeException e) {
            bnb.a(this.a, e);
            throw e;
        }
    }
}
