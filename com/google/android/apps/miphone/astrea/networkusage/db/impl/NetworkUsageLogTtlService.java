package com.google.android.apps.miphone.astrea.networkusage.db.impl;

import android.app.job.JobParameters;
import defpackage.aqp;
import defpackage.avb;
import defpackage.avm;
import defpackage.czl;
import defpackage.czn;
import j$.time.Duration;
import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes.dex */
public class NetworkUsageLogTtlService extends avb {
    public static final czn a = czn.j("com/google/android/apps/miphone/astrea/networkusage/db/impl/NetworkUsageLogTtlService");
    public static final Duration b = Duration.ofDays(1);
    public Duration c;
    public avm d;

    @Override // android.app.job.JobService
    public final boolean onStartJob(JobParameters jobParameters) {
        ((czl) ((czl) a.c()).i("com/google/android/apps/miphone/astrea/networkusage/db/impl/NetworkUsageLogTtlService", "onStartJob", 31, "NetworkUsageLogTtlService.java")).p("Starting DB clean-up job");
        this.d.c((this.d.f() && this.d.g()) ? Instant.now().minus(this.c) : Instant.now(), new aqp(this, jobParameters, 3));
        return true;
    }

    @Override // android.app.job.JobService
    public final boolean onStopJob(JobParameters jobParameters) {
        return false;
    }
}
