package defpackage;

import android.app.job.JobParameters;
import com.google.android.apps.miphone.astrea.common.jobs.HeartbeatService;
import com.google.android.apps.miphone.astrea.networkusage.db.impl.NetworkUsageLogTtlService;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aqp implements djj {
    final /* synthetic */ Object a;
    final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public aqp(aqq aqqVar, ccy ccyVar, int i) {
        this.c = i;
        this.b = ccyVar;
        this.a = aqqVar;
    }

    @Override // defpackage.djj
    public final void a(Throwable th) {
        int i = this.c;
        if (i == 0) {
            ((ccy) this.b).a.d(new exo((Object) null, th, (char[]) null));
            return;
        }
        if (i == 1) {
            ((czl) ((czl) ((czl) HeartbeatService.a.e()).h(th)).i("com/google/android/apps/miphone/astrea/common/jobs/HeartbeatService$1", "onFailure", 'P', "HeartbeatService.java")).p("Failure in scheduling training, rescheduling the job.");
            ((HeartbeatService) this.b).jobFinished((JobParameters) this.a, true);
        } else {
            if (i != 2) {
                ((czl) ((czl) ((czl) NetworkUsageLogTtlService.a.e()).h(th)).i("com/google/android/apps/miphone/astrea/networkusage/db/impl/NetworkUsageLogTtlService$1", "onFailure", '9', "NetworkUsageLogTtlService.java")).p("Failed to delete entities.");
                return;
            }
            ((czl) ((czl) ((czl) avm.a.e()).h(th)).i("com/google/android/apps/miphone/astrea/networkusage/db/impl/NetworkUsageLogRepositoryImpl$1", "onFailure", 71, "NetworkUsageLogRepositoryImpl.java")).t("Insert future failed for NetworkUsageEntity of type = %s, feature name = %s", ((ava) this.a).c.b().name(), ((avm) this.b).c.d(((ava) this.a).c));
        }
    }

    @Override // defpackage.djj
    public final /* synthetic */ void b(Object obj) {
        int i = this.c;
        if (i == 0) {
            ((ccy) this.b).a.d(new exo(det.e.h(((ane) obj).toByteArray()), (Object) null, (char[]) null));
            return;
        }
        if (i == 1) {
            ((czl) ((czl) HeartbeatService.a.c()).i("com/google/android/apps/miphone/astrea/common/jobs/HeartbeatService$1", "onSuccess", 74, "HeartbeatService.java")).p("Finished training schedule job.");
            ((HeartbeatService) this.b).jobFinished((JobParameters) this.a, false);
            return;
        }
        if (i != 2) {
            Integer num = (Integer) obj;
            if (num.intValue() != -1) {
                ((czl) ((czl) NetworkUsageLogTtlService.a.b()).i("com/google/android/apps/miphone/astrea/networkusage/db/impl/NetworkUsageLogTtlService$1", "onSuccess", 47, "NetworkUsageLogTtlService.java")).r("Successfully removed %d entities", num);
                ((NetworkUsageLogTtlService) this.b).jobFinished((JobParameters) this.a, false);
                return;
            }
            ((czl) ((czl) NetworkUsageLogTtlService.a.e()).i("com/google/android/apps/miphone/astrea/networkusage/db/impl/NetworkUsageLogTtlService$1", "onSuccess", 50, "NetworkUsageLogTtlService.java")).p("Failed to delete old entities");
            ((NetworkUsageLogTtlService) this.b).jobFinished((JobParameters) this.a, true);
            return;
        }
        if (((Boolean) obj).booleanValue()) {
            czl czlVar = (czl) ((czl) avm.a.b()).i("com/google/android/apps/miphone/astrea/networkusage/db/impl/NetworkUsageLogRepositoryImpl$1", "onSuccess", 57, "NetworkUsageLogRepositoryImpl.java");
            String strName = ((ava) this.a).c.b().name();
            Object obj2 = this.b;
            czlVar.t("Logged new NetworkUsageEntity of type = %s, feature name = %s", strName, ((avm) obj2).c.d(((ava) this.a).c));
            return;
        }
        czl czlVar2 = (czl) ((czl) avm.a.e()).i("com/google/android/apps/miphone/astrea/networkusage/db/impl/NetworkUsageLogRepositoryImpl$1", "onSuccess", 62, "NetworkUsageLogRepositoryImpl.java");
        String strName2 = ((ava) this.a).c.b().name();
        Object obj3 = this.b;
        czlVar2.t("Failed to log NetworkUsageEntity of type = %s, feature name = %s", strName2, ((avm) obj3).c.d(((ava) this.a).c));
    }

    public aqp(Object obj, Object obj2, int i) {
        this.c = i;
        this.a = obj2;
        this.b = obj;
    }
}
