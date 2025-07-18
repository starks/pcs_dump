package defpackage;

import android.content.ComponentName;
import android.content.Intent;
import android.content.ServiceConnection;
import android.system.virtualmachine.VirtualMachine;
import com.google.android.apps.aicore.aidl.IAICoreService;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class ark implements os {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ ark(amp ampVar, dke dkeVar, int i) {
        this.c = i;
        this.b = ampVar;
        this.a = dkeVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v7, types: [android.content.ServiceConnection, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v13, types: [java.lang.Object, java.util.concurrent.Executor] */
    @Override // defpackage.os
    public final Object a(final oq oqVar) {
        int i = this.c;
        final int i2 = 0;
        if (i == 0) {
            czl czlVar = (czl) ((czl) arp.a.b()).i("com/google/android/apps/miphone/astrea/fl/federatedcompute/training/PopulationTrainingScheduler", "unregisterPopulation", 182, "PopulationTrainingScheduler.java");
            final apd apdVar = (apd) this.b;
            czlVar.r("Cancelling Training for populationName: %s", apdVar.f);
            ((arp) this.a).d.a(apdVar, new cad() { // from class: arm
                @Override // defpackage.cad
                public final void d(Object obj) {
                    if (i2 != 0) {
                        ((czl) ((czl) arp.a.b()).i("com/google/android/apps/miphone/astrea/fl/federatedcompute/training/PopulationTrainingScheduler", "registerPopulation", 139, "PopulationTrainingScheduler.java")).r("Training successfully scheduled for the populationName %s", apdVar.f);
                        oqVar.a(null);
                    } else {
                        ((czl) ((czl) arp.a.b()).i("com/google/android/apps/miphone/astrea/fl/federatedcompute/training/PopulationTrainingScheduler", "unregisterPopulation", 187, "PopulationTrainingScheduler.java")).r("Cancelled training for the populationName %s", apdVar.f);
                        oqVar.a(null);
                    }
                }
            }, new arn(apdVar, oqVar, i2));
            return "Unregister Population Future";
        }
        final int i3 = 1;
        if (i != 1) {
            if (i != 2) {
                return ((bcy) this.a).d((VirtualMachine) this.b, oqVar);
            }
            czl czlVar2 = (czl) ((czl) arp.a.b()).i("com/google/android/apps/miphone/astrea/fl/federatedcompute/training/PopulationTrainingScheduler", "registerPopulation", 134, "PopulationTrainingScheduler.java");
            final apd apdVar2 = (apd) this.b;
            czlVar2.r("Requesting Training for populationName: %s", apdVar2.f);
            ((arp) this.a).d.b(apdVar2, new cad() { // from class: arm
                @Override // defpackage.cad
                public final void d(Object obj) {
                    if (i3 != 0) {
                        ((czl) ((czl) arp.a.b()).i("com/google/android/apps/miphone/astrea/fl/federatedcompute/training/PopulationTrainingScheduler", "registerPopulation", 139, "PopulationTrainingScheduler.java")).r("Training successfully scheduled for the populationName %s", apdVar2.f);
                        oqVar.a(null);
                    } else {
                        ((czl) ((czl) arp.a.b()).i("com/google/android/apps/miphone/astrea/fl/federatedcompute/training/PopulationTrainingScheduler", "unregisterPopulation", 187, "PopulationTrainingScheduler.java")).r("Cancelled training for the populationName %s", apdVar2.f);
                        oqVar.a(null);
                    }
                }
            }, new arn(apdVar2, oqVar, i3));
            return "Register Population Future";
        }
        ?? r0 = this.b;
        amp ampVar = (amp) r0;
        ampVar.d = oqVar;
        ls lsVar = new ls(r0, 14);
        ov ovVar = oqVar.c;
        if (ovVar != 0) {
            ovVar.c(lsVar, this.a);
        }
        Intent intent = new Intent(IAICoreService.class.getCanonicalName());
        intent.setComponent(new ComponentName("com.google.android.aicore", "com.google.android.apps.aicore.service.multiuser.AiCoreMultiUserService"));
        if (ampVar.c.bindService(intent, (ServiceConnection) r0, 1)) {
            return "AiCoreServiceConnection";
        }
        ampVar.a("Unable to find/start AICoreService", false);
        return "AiCoreServiceConnection";
    }

    public /* synthetic */ ark(Object obj, Object obj2, int i) {
        this.c = i;
        this.a = obj;
        this.b = obj2;
    }
}
