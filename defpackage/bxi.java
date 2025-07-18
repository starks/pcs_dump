package defpackage;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bxi {
    private static final cbx a = cbr.d("brella", "JobSchdlrDlgt");
    private final JobScheduler b;
    private final bxj c;
    private final bqm d;

    public bxi(JobScheduler jobScheduler, bxj bxjVar, bqm bqmVar) {
        this.b = jobScheduler;
        this.c = bxjVar;
        this.d = bqmVar;
    }

    public final JobInfo a(int i) {
        return this.b.getPendingJob(i);
    }

    public final void b(cco ccoVar) {
        this.b.cancel(ccoVar.g);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0108  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean c(defpackage.cco r21, long r22) {
        /*
            Method dump skipped, instructions count: 433
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bxi.c(cco, long):boolean");
    }
}
