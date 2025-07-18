package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ars implements djj {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public ars(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r14v3, types: [feu, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v4, types: [feu, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v5, types: [feu, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v6, types: [feu, java.lang.Object] */
    @Override // defpackage.djj
    public final void a(Throwable th) {
        int i = this.b;
        if (i == 0) {
            ((czl) ((czl) ((czl) art.a.e()).h(th)).i("com/google/android/apps/miphone/astrea/fl/localcompute/LocalComputeUtils$2", "onFailure", 95, "LocalComputeUtils.java")).r("Failed to clean resources for session %s at cancellation.", this.a);
            return;
        }
        if (i == 1) {
            ((czl) ((czl) ((czl) art.a.e()).h(th)).i("com/google/android/apps/miphone/astrea/fl/localcompute/LocalComputeUtils$1", "onFailure", 66, "LocalComputeUtils.java")).r("Failed to prepare resources for session %s at scheduling.", this.a);
            return;
        }
        if (i == 2) {
            ((czl) ((czl) ((czl) bbu.a.d()).h(th)).i("com/google/android/apps/miphone/astrea/pd/service/ProtectedDownloadGrpcBindableService$2", "onFailure", (char) 137, "ProtectedDownloadGrpcBindableService.java")).p("Failed to start a VM");
            this.a.b(new eqp(bbu.f(th)));
        } else if (i == 3) {
            ((czl) ((czl) ((czl) bbu.a.d()).h(th)).i("com/google/android/apps/miphone/astrea/pd/service/ProtectedDownloadGrpcBindableService$3", "onFailure", (char) 163, "ProtectedDownloadGrpcBindableService.java")).p("Failed to delete the VM");
            this.a.b(new eqp(bbu.f(th)));
        } else {
            if (i == 4) {
                this.a.b(th);
                return;
            }
            ?? r14 = this.a;
            if (i != 5) {
                brh.a.k(th, "Registration for '%s' failed", r14);
            } else {
                r14.b(th);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [feu, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v18, types: [feu, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v19, types: [feu, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v5, types: [feu, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v6, types: [feu, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v7, types: [feu, java.lang.Object] */
    @Override // defpackage.djj
    public final /* synthetic */ void b(Object obj) {
        int i = this.b;
        if (i == 0) {
            if (((Boolean) obj).booleanValue()) {
                ((czl) ((czl) art.a.b()).i("com/google/android/apps/miphone/astrea/fl/localcompute/LocalComputeUtils$2", "onSuccess", 84, "LocalComputeUtils.java")).r("Successfully cleaned resources for session %s at cancellation.", this.a);
                return;
            } else {
                ((czl) ((czl) art.a.e()).i("com/google/android/apps/miphone/astrea/fl/localcompute/LocalComputeUtils$2", "onSuccess", 88, "LocalComputeUtils.java")).r("Failed to clean resources for session %s at cancellation.", this.a);
                return;
            }
        }
        if (i == 1) {
            if (((Boolean) obj).booleanValue()) {
                ((czl) ((czl) art.a.b()).i("com/google/android/apps/miphone/astrea/fl/localcompute/LocalComputeUtils$1", "onSuccess", 56, "LocalComputeUtils.java")).r("Successfully prepared resources for session %s at scheduling.", this.a);
                return;
            } else {
                ((czl) ((czl) art.a.e()).i("com/google/android/apps/miphone/astrea/fl/localcompute/LocalComputeUtils$1", "onSuccess", 59, "LocalComputeUtils.java")).r("Failed to prepare resources for session %s at scheduling.", this.a);
                return;
            }
        }
        if (i == 2) {
            ((czl) ((czl) bbu.a.c()).i("com/google/android/apps/miphone/astrea/pd/service/ProtectedDownloadGrpcBindableService$2", "onSuccess", 130, "ProtectedDownloadGrpcBindableService.java")).p("Successfully started a VM");
            this.a.c((axy) obj);
            this.a.a();
            return;
        }
        if (i == 3) {
            ((czl) ((czl) bbu.a.c()).i("com/google/android/apps/miphone/astrea/pd/service/ProtectedDownloadGrpcBindableService$3", "onSuccess", 156, "ProtectedDownloadGrpcBindableService.java")).p("Successfully deleted the VM");
            this.a.c((axr) obj);
            this.a.a();
            return;
        }
        if (i == 4) {
            this.a.c((beq) obj);
            this.a.a();
        } else {
            if (i != 5) {
                return;
            }
            bfp bfpVar = (bfp) this.a;
            bfpVar.a.setResult(-1);
            bfpVar.a.finish();
        }
    }
}
