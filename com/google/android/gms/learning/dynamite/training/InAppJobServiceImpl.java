package com.google.android.gms.learning.dynamite.training;

import android.app.job.JobParameters;
import android.app.job.JobService;
import android.content.Intent;
import defpackage.bnb;
import defpackage.bpe;
import defpackage.bpf;
import defpackage.bqk;
import defpackage.brb;
import defpackage.brg;
import defpackage.btu;
import defpackage.btv;
import defpackage.bvq;
import defpackage.ccg;
import defpackage.ccj;
import defpackage.cco;
import defpackage.clq;
import defpackage.cnx;
import defpackage.uq;
import java.util.concurrent.ExecutorService;

/* compiled from: PG */
/* loaded from: classes.dex */
public class InAppJobServiceImpl extends bvq {
    private btv a;

    @Override // defpackage.bvr
    public boolean init(bpf bpfVar, bpf bpfVar2) {
        brg.b();
        this.a = new btv(new brb((JobService) bpe.a(bpfVar)), cnx.v((ExecutorService) bpe.a(bpfVar2)));
        return true;
    }

    @Override // defpackage.bvr
    public void onDestroy() {
        btv btvVar = this.a;
        try {
            btvVar.f(ccj.cd);
            synchronized (btv.b) {
                btu btuVar = btvVar.d;
                if (btuVar != null) {
                    btvVar.d(btuVar, true);
                }
            }
            btvVar.f.close();
            btvVar.f = null;
        } catch (RuntimeException e) {
            btvVar.f(ccj.ce);
            bnb.a(btvVar.c, e);
            throw e;
        }
    }

    @Override // defpackage.bvr
    public int onStartCommand(Intent intent, int i, int i2) {
        return 1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0056, code lost:
    
        if ((r5.c == 13 ? (defpackage.cci) r5.d : defpackage.cci.a).h.isEmpty() != false) goto L22;
     */
    @Override // defpackage.bvr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onStartJob(android.app.job.JobParameters r15) {
        /*
            Method dump skipped, instructions count: 701
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.learning.dynamite.training.InAppJobServiceImpl.onStartJob(android.app.job.JobParameters):boolean");
    }

    @Override // defpackage.bvr
    public boolean onStopJob(JobParameters jobParameters) {
        btv btvVar = this.a;
        int stopReason = jobParameters.getStopReason();
        try {
            btvVar.i.k(ccj.ch);
            synchronized (btv.b) {
                btu btuVar = btvVar.d;
                if (btuVar == null) {
                    return false;
                }
                cco ccoVar = btuVar.c;
                String str = ccoVar.f;
                String str2 = ccoVar.c == 4 ? ((ccg) ccoVar.d).c : null;
                btvVar.i.f(bqk.TRAINING_PROCESS_STOP_REASON, uq.t(btvVar.i, btvVar.g, uq.u(btvVar.c.getPackageName() + "/" + str, clq.N(str2)), btvVar.d.b), stopReason);
                btvVar.d.e.k(ccj.cj);
                btvVar.d(btvVar.d, true);
                return false;
            }
        } catch (Throwable th) {
            btvVar.i.k(ccj.ci);
            bnb.a(btvVar.c, th);
            throw th;
        }
    }

    @Override // defpackage.bvr
    public boolean onUnbind(Intent intent) {
        return false;
    }

    @Override // defpackage.bvr
    public void onRebind(Intent intent) {
    }

    @Override // defpackage.bvr
    public void onTrimMemory(int i) {
    }
}
