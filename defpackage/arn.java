package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class arn implements cac {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ arn(apd apdVar, oq oqVar, int i) {
        this.c = i;
        this.a = apdVar;
        this.b = oqVar;
    }

    /* JADX WARN: Type inference failed for: r5v5, types: [feu, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v6, types: [feu, java.lang.Object] */
    @Override // defpackage.cac
    public final void c(Exception exc) {
        bho bhoVar;
        int i = this.c;
        if (i == 0) {
            ((czl) ((czl) ((czl) arp.a.e()).h(exc)).i("com/google/android/apps/miphone/astrea/fl/federatedcompute/training/PopulationTrainingScheduler", "unregisterPopulation", 193, "PopulationTrainingScheduler.java")).r("Cancel training failed for [populationName=%s]", ((apd) this.a).f);
            ((oq) this.b).b(exc);
            return;
        }
        if (i == 1) {
            ((czl) ((czl) ((czl) arp.a.e()).h(exc)).i("com/google/android/apps/miphone/astrea/fl/federatedcompute/training/PopulationTrainingScheduler", "registerPopulation", 145, "PopulationTrainingScheduler.java")).r("Scheduling training failed [populationName=%s]", ((apd) this.a).f);
            ((oq) this.b).b(exc);
            return;
        }
        if (i == 2) {
            czl czlVar = (czl) ((czl) ((czl) arw.a.e()).h(exc)).i("com/google/android/apps/miphone/astrea/fl/server/TrainerGrpcBindableService", "scheduleFederatedComputation", 65, "TrainerGrpcBindableService.java");
            apd apdVar = (apd) this.b;
            czlVar.t("Scheduling training failed [population=%s, session=%s]", apdVar.f, apdVar.d);
            this.a.b(exc);
            return;
        }
        if (i == 3) {
            czl czlVar2 = (czl) ((czl) ((czl) arw.a.e()).h(exc)).i("com/google/android/apps/miphone/astrea/fl/server/TrainerGrpcBindableService", "scheduleFederatedComputation", 93, "TrainerGrpcBindableService.java");
            apd apdVar2 = (apd) this.b;
            czlVar2.t("Cancelling training failed [population=%s, session=%s]", apdVar2.f, apdVar2.d);
            this.a.b(exc);
            return;
        }
        if ((exc instanceof bix) && (bhoVar = ((bix) exc).a.h) != null && bhoVar.c == 24) {
            ((bos) this.b).a.set(this.a);
        }
    }

    public /* synthetic */ arn(Object obj, Object obj2, int i) {
        this.c = i;
        this.b = obj;
        this.a = obj2;
    }
}
