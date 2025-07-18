package com.google.android.apps.miphone.astrea.common.jobs;

import android.app.PendingIntent;
import android.app.StatsManager;
import android.app.job.JobParameters;
import android.app.job.JobScheduler;
import android.content.Context;
import android.content.Intent;
import defpackage.amy;
import defpackage.aoa;
import defpackage.aom;
import defpackage.aor;
import defpackage.aow;
import defpackage.aqp;
import defpackage.arc;
import defpackage.ard;
import defpackage.arl;
import defpackage.arp;
import defpackage.asr;
import defpackage.ati;
import defpackage.att;
import defpackage.auh;
import defpackage.cnx;
import defpackage.cyv;
import defpackage.czl;
import defpackage.czn;
import defpackage.dij;
import defpackage.djy;
import defpackage.sj;
import j$.time.Duration;
import j$.util.Optional;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public class HeartbeatService extends aow {
    public static final czn a = czn.j("com/google/android/apps/miphone/astrea/common/jobs/HeartbeatService");
    public static final Duration b = Duration.ofDays(1);
    public arp c;
    public aoa d;
    public Executor e;
    public arc f;
    public aor g;
    public aoa h;
    public Context i;
    public auh j;

    @Override // android.app.job.JobService
    public final boolean onStartJob(JobParameters jobParameters) {
        djy djyVarI;
        ((czl) ((czl) a.b()).i("com/google/android/apps/miphone/astrea/common/jobs/HeartbeatService", "onStartJob", 63, "HeartbeatService.java")).p("Scheduling jobs for configured population criteria.");
        if (!((aom) this.d.b()).a()) {
            ((JobScheduler) getSystemService("jobscheduler")).cancel(jobParameters.getJobId());
            return false;
        }
        arp arpVar = this.c;
        int i = sj.a;
        int i2 = 2;
        int i3 = 1;
        if (((ard) this.h.b()).a()) {
            arc arcVar = this.f;
            djyVarI = dij.i(arcVar.c.submit(new amy(arcVar, (StatsManager) arcVar.b.getSystemService(StatsManager.class), PendingIntent.getBroadcast(arcVar.b, 0, new Intent("com.google.android.as.oss.ACTION_RESTRICTED_METRICS_CHANGED"), 201326592), i2)), new arl(this, i3), this.e);
        } else {
            djyVarI = cnx.C(cyv.a);
        }
        cnx.J(arpVar.b(Optional.of(djyVarI)), new aqp(this, jobParameters, 1), this.e);
        JobScheduler jobScheduler = (JobScheduler) getSystemService("jobscheduler");
        auh auhVar = this.j;
        asr asrVar = (asr) ati.a.createBuilder();
        att attVar = att.PCS_NUM_JOBS_SCHEDULED_COUNT;
        if (!asrVar.a.isMutable()) {
            asrVar.B();
        }
        ati atiVar = (ati) asrVar.a;
        atiVar.c = attVar.u;
        atiVar.b |= 1;
        int size = jobScheduler.getAllPendingJobs().size();
        if (!asrVar.a.isMutable()) {
            asrVar.B();
        }
        ati atiVar2 = (ati) asrVar.a;
        atiVar2.b |= 2;
        atiVar2.d = size;
        auhVar.f((ati) asrVar.z());
        return true;
    }

    @Override // android.app.job.JobService
    public final boolean onStopJob(JobParameters jobParameters) {
        return false;
    }
}
