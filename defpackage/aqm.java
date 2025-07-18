package defpackage;

import android.content.Context;
import j$.util.Optional;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aqm {
    private static final czn b = czn.j("com/google/android/apps/miphone/astrea/fl/brella/service/scheduler/FederatedTrainingScheduler");
    public final Executor a;
    private final Context c;
    private final Optional d;
    private final wh e;

    public aqm(Executor executor, Context context, Optional optional, wh whVar) {
        this.a = executor;
        this.c = context;
        this.d = optional;
        this.e = whVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x00cb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final defpackage.bqf c(defpackage.apd r10) {
        /*
            Method dump skipped, instructions count: 383
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aqm.c(apd):bqf");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0036  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(defpackage.apd r7, defpackage.cad r8, defpackage.cac r9) {
        /*
            r6 = this;
            bqf r0 = r6.c(r7)
            int r1 = r7.b
            r1 = r1 & 256(0x100, float:3.59E-43)
            java.lang.String r2 = "disableTraining"
            java.lang.String r3 = "com/google/android/apps/miphone/astrea/fl/brella/service/scheduler/FederatedTrainingScheduler"
            java.lang.String r4 = "FederatedTrainingScheduler.java"
            if (r1 == 0) goto L36
            int r1 = r7.k
            int r1 = defpackage.apc.a(r1)
            if (r1 != 0) goto L1a
            int r1 = defpackage.apc.a
        L1a:
            int r5 = defpackage.apc.c
            if (r1 != r5) goto L36
            czn r1 = defpackage.aqm.b
            dab r1 = r1.c()
            czl r1 = (defpackage.czl) r1
            r5 = 87
            dab r1 = r1.i(r3, r2, r5, r4)
            czl r1 = (defpackage.czl) r1
            java.lang.String r7 = r7.d
            java.lang.String r2 = "Cancelling local computation for session_name:%s"
            r1.r(r2, r7)
            goto L4f
        L36:
            czn r1 = defpackage.aqm.b
            dab r1 = r1.c()
            czl r1 = (defpackage.czl) r1
            r5 = 90
            dab r1 = r1.i(r3, r2, r5, r4)
            czl r1 = (defpackage.czl) r1
            java.lang.String r2 = r7.f
            java.lang.String r7 = r7.d
            java.lang.String r3 = "Cancelling training for population:%s session_name:%s"
            r1.t(r3, r2, r7)
        L4f:
            android.content.Context r7 = r6.c
            java.util.concurrent.Executor r1 = r6.a
            bqg r0 = r0.a()
            cag r7 = defpackage.brb.K(r7, r1, r0)
            java.util.concurrent.Executor r0 = r6.a
            aql r1 = new aql
            r2 = 1
            r1.<init>(r6, r8, r9, r2)
            r7.k(r0, r1)
            java.util.concurrent.Executor r6 = r6.a
            r7.j(r6, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aqm.a(apd, cad, cac):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0036  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(defpackage.apd r7, defpackage.cad r8, defpackage.cac r9) {
        /*
            r6 = this;
            bqf r0 = r6.c(r7)
            int r1 = r7.b
            r1 = r1 & 256(0x100, float:3.59E-43)
            java.lang.String r2 = "scheduleTraining"
            java.lang.String r3 = "com/google/android/apps/miphone/astrea/fl/brella/service/scheduler/FederatedTrainingScheduler"
            java.lang.String r4 = "FederatedTrainingScheduler.java"
            if (r1 == 0) goto L36
            int r1 = r7.k
            int r1 = defpackage.apc.a(r1)
            if (r1 != 0) goto L1a
            int r1 = defpackage.apc.a
        L1a:
            int r5 = defpackage.apc.c
            if (r1 != r5) goto L36
            czn r1 = defpackage.aqm.b
            dab r1 = r1.c()
            czl r1 = (defpackage.czl) r1
            r5 = 57
            dab r1 = r1.i(r3, r2, r5, r4)
            czl r1 = (defpackage.czl) r1
            java.lang.String r7 = r7.d
            java.lang.String r2 = "Scheduling local computation for session_name:%s"
            r1.r(r2, r7)
            goto L4f
        L36:
            czn r1 = defpackage.aqm.b
            dab r1 = r1.c()
            czl r1 = (defpackage.czl) r1
            r5 = 60
            dab r1 = r1.i(r3, r2, r5, r4)
            czl r1 = (defpackage.czl) r1
            java.lang.String r2 = r7.f
            java.lang.String r7 = r7.d
            java.lang.String r3 = "Scheduling training for population:%s session_name:%s"
            r1.t(r3, r2, r7)
        L4f:
            android.content.Context r7 = r6.c
            java.util.concurrent.Executor r1 = r6.a
            bqg r0 = r0.a()
            cag r7 = defpackage.brb.K(r7, r1, r0)
            java.util.concurrent.Executor r0 = r6.a
            aql r1 = new aql
            r2 = 0
            r1.<init>(r6, r8, r9, r2)
            r7.k(r0, r1)
            java.util.concurrent.Executor r6 = r6.a
            r7.j(r6, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aqm.b(apd, cad, cac):void");
    }
}
