package defpackage;

import android.app.Application;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import com.google.android.apps.miphone.astrea.PrivateComputeServicesApplication;
import com.google.android.apps.miphone.astrea.common.jobs.HeartbeatService;
import com.google.android.apps.miphone.astrea.networkusage.db.impl.NetworkUsageLogTtlService;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes.dex */
public class alf extends Application implements ekk {
    private boolean a = false;
    private final ejr b = new ejr(new fuu(this, null));

    @Override // defpackage.ekk
    public final /* synthetic */ ekj a() {
        return this.b;
    }

    @Override // defpackage.ekj
    public final Object aS() {
        return this.b.aS();
    }

    @Override // android.app.Application
    public void onCreate() {
        if (!this.a) {
            final int i = 1;
            this.a = true;
            PrivateComputeServicesApplication privateComputeServicesApplication = (PrivateComputeServicesApplication) this;
            all allVar = (all) aS();
            privateComputeServicesApplication.a = (Context) allVar.a.a;
            aoy aoyVar = new aoy((aqr) allVar.b.b(), (aqv) allVar.r.b(), (bpv) allVar.w.b());
            Object obj = allVar.a.a;
            final aoa aoaVarA = allVar.a();
            final Context context = (Context) obj;
            aot aotVar = new aot() { // from class: aov
                @Override // defpackage.aot
                public final /* synthetic */ int a() {
                    return 0;
                }

                @Override // defpackage.aot
                public final void b() {
                    if (((aom) aoaVarA.b()).a()) {
                        Context context2 = context;
                        czn cznVar = HeartbeatService.a;
                        Object systemService = context2.getSystemService("jobscheduler");
                        systemService.getClass();
                        JobScheduler jobScheduler = (JobScheduler) systemService;
                        if (jobScheduler.getPendingJob(532808520) != null) {
                            ((czl) ((czl) HeartbeatService.a.b()).i("com/google/android/apps/miphone/astrea/common/jobs/HeartbeatService", "considerSchedule", 152, "HeartbeatService.java")).p("HeartbeatService already scheduled.");
                            return;
                        }
                        int iSchedule = jobScheduler.schedule(new JobInfo.Builder(532808520, new ComponentName(context2, (Class<?>) HeartbeatService.class)).setPeriodic(HeartbeatService.b.toMillis()).setRequiresDeviceIdle(true).setRequiresCharging(true).setPersisted(true).build());
                        if (iSchedule == 1) {
                            ((czl) ((czl) HeartbeatService.a.c()).i("com/google/android/apps/miphone/astrea/common/jobs/HeartbeatService", "considerSchedule", 166, "HeartbeatService.java")).p("Scheduled HeartbeatService");
                        } else {
                            ((czl) ((czl) HeartbeatService.a.e()).i("com/google/android/apps/miphone/astrea/common/jobs/HeartbeatService", "considerSchedule", 168, "HeartbeatService.java")).q("Failed to schedule HeartbeatService with error code = %d", iSchedule);
                        }
                    }
                }
            };
            final Object obj2 = allVar.a.a;
            final int i2 = 0;
            aot aotVar2 = new aot() { // from class: avj
                @Override // defpackage.aot
                public final /* synthetic */ int a() {
                    return 0;
                }

                @Override // defpackage.aot
                public final void b() {
                    if (i2 != 0) {
                        ((arp) obj2).b(Optional.empty());
                        return;
                    }
                    czn cznVar = NetworkUsageLogTtlService.a;
                    Context context2 = (Context) obj2;
                    Object systemService = context2.getSystemService("jobscheduler");
                    systemService.getClass();
                    JobScheduler jobScheduler = (JobScheduler) systemService;
                    if (jobScheduler.getPendingJob(412882778) != null) {
                        ((czl) ((czl) NetworkUsageLogTtlService.a.c()).i("com/google/android/apps/miphone/astrea/networkusage/db/impl/NetworkUsageLogTtlService", "considerSchedule", 75, "NetworkUsageLogTtlService.java")).p("NetworkUsageLogTtlService already scheduled.");
                        return;
                    }
                    int iSchedule = jobScheduler.schedule(new JobInfo.Builder(412882778, new ComponentName(context2, (Class<?>) NetworkUsageLogTtlService.class)).setPeriodic(NetworkUsageLogTtlService.b.toMillis()).setRequiresDeviceIdle(true).setRequiresCharging(true).build());
                    if (iSchedule == 1) {
                        ((czl) ((czl) NetworkUsageLogTtlService.a.c()).i("com/google/android/apps/miphone/astrea/networkusage/db/impl/NetworkUsageLogTtlService", "considerSchedule", 88, "NetworkUsageLogTtlService.java")).p("Scheduled NetworkUsageLogTtlService");
                    } else {
                        ((czl) ((czl) NetworkUsageLogTtlService.a.e()).i("com/google/android/apps/miphone/astrea/networkusage/db/impl/NetworkUsageLogTtlService", "considerSchedule", 90, "NetworkUsageLogTtlService.java")).q("Failed to schedule NetworkUsageLogTtlService with error code = %d", iSchedule);
                    }
                }
            };
            final arp arpVar = (arp) allVar.E.b();
            privateComputeServicesApplication.b = cxo.l(4, aoyVar, aotVar, aotVar2, new aot() { // from class: avj
                @Override // defpackage.aot
                public final /* synthetic */ int a() {
                    return 0;
                }

                @Override // defpackage.aot
                public final void b() {
                    if (i != 0) {
                        ((arp) arpVar).b(Optional.empty());
                        return;
                    }
                    czn cznVar = NetworkUsageLogTtlService.a;
                    Context context2 = (Context) arpVar;
                    Object systemService = context2.getSystemService("jobscheduler");
                    systemService.getClass();
                    JobScheduler jobScheduler = (JobScheduler) systemService;
                    if (jobScheduler.getPendingJob(412882778) != null) {
                        ((czl) ((czl) NetworkUsageLogTtlService.a.c()).i("com/google/android/apps/miphone/astrea/networkusage/db/impl/NetworkUsageLogTtlService", "considerSchedule", 75, "NetworkUsageLogTtlService.java")).p("NetworkUsageLogTtlService already scheduled.");
                        return;
                    }
                    int iSchedule = jobScheduler.schedule(new JobInfo.Builder(412882778, new ComponentName(context2, (Class<?>) NetworkUsageLogTtlService.class)).setPeriodic(NetworkUsageLogTtlService.b.toMillis()).setRequiresDeviceIdle(true).setRequiresCharging(true).build());
                    if (iSchedule == 1) {
                        ((czl) ((czl) NetworkUsageLogTtlService.a.c()).i("com/google/android/apps/miphone/astrea/networkusage/db/impl/NetworkUsageLogTtlService", "considerSchedule", 88, "NetworkUsageLogTtlService.java")).p("Scheduled NetworkUsageLogTtlService");
                    } else {
                        ((czl) ((czl) NetworkUsageLogTtlService.a.e()).i("com/google/android/apps/miphone/astrea/networkusage/db/impl/NetworkUsageLogTtlService", "considerSchedule", 90, "NetworkUsageLogTtlService.java")).q("Failed to schedule NetworkUsageLogTtlService with error code = %d", iSchedule);
                    }
                }
            });
        }
        super.onCreate();
    }
}
