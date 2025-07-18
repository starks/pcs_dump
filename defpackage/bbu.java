package defpackage;

import com.google.android.apps.aicore.aidl.AIFeature;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bbu extends ayf {
    public static final czn a = czn.j("com/google/android/apps/miphone/astrea/pd/service/ProtectedDownloadGrpcBindableService");
    private final aoa b;
    private final bbd c;
    private final Optional d;
    private final djz e;
    private final aor f;

    public bbu(aoa aoaVar, bbd bbdVar, Optional optional, djz djzVar, aor aorVar) {
        this.b = aoaVar;
        this.c = bbdVar;
        this.d = optional.flatMap(new alg(19));
        this.e = djzVar;
        this.f = aorVar;
    }

    public static eqo f(Throwable th) {
        return th instanceof UnsupportedOperationException ? eqo.i.e("vm disabled") : th instanceof RuntimeException ? eqo.l.d(th) : eqo.k.d(th);
    }

    private final void g(crp crpVar, Object obj, feu feuVar, String str) {
        if (((bak) this.b.b()).c() || this.f.a()) {
            ((czl) ((czl) a.c()).i("com/google/android/apps/miphone/astrea/pd/service/ProtectedDownloadGrpcBindableService", "handleRpc", 84, "ProtectedDownloadGrpcBindableService.java")).r("Starting %s request", str);
            cnx.J((djy) crpVar.a(obj), new bbt(str, feuVar), this.e);
        } else {
            ((czl) ((czl) a.b()).i("com/google/android/apps/miphone/astrea/pd/service/ProtectedDownloadGrpcBindableService", "handleRpc", 78, "ProtectedDownloadGrpcBindableService.java")).p("Rejecting request since the feature is disabled");
            feuVar.b(new eqp(eqo.i.e("feature disabled")));
        }
    }

    @Override // defpackage.ayf, defpackage.aye
    public final void a(axq axqVar, feu feuVar) {
        ((czl) ((czl) a.c()).i("com/google/android/apps/miphone/astrea/pd/service/ProtectedDownloadGrpcBindableService", "deleteVm", 146, "ProtectedDownloadGrpcBindableService.java")).p("Starting deleteVm request");
        cnx.J(((bcu) this.d.get()).b(), new ars(feuVar, 3), this.e);
    }

    @Override // defpackage.ayf, defpackage.aye
    public final void c(axt axtVar, feu feuVar) {
        bbd bbdVar = this.c;
        bbdVar.getClass();
        g(new arl(bbdVar, 5), axtVar, feuVar, "Download");
    }

    @Override // defpackage.ayf, defpackage.aye
    public final void d(axv axvVar, feu feuVar) {
        bbd bbdVar = this.c;
        bbdVar.getClass();
        g(new arl(bbdVar, 4), axvVar, feuVar, "GetManifestConfig");
    }

    @Override // defpackage.ayf, defpackage.aye
    public final void e(axx axxVar, feu feuVar) {
        czn cznVar = a;
        ((czl) ((czl) cznVar.c()).i("com/google/android/apps/miphone/astrea/pd/service/ProtectedDownloadGrpcBindableService", "getVmDescriptor", AIFeature.Id.GBOARD_PROOFREADING_PER_LAYER_GEM_2, "ProtectedDownloadGrpcBindableService.java")).p("Starting getVmDescriptor request");
        if (!this.d.isEmpty()) {
            cnx.J(((bcu) this.d.get()).a(axxVar), new ars(feuVar, 2), this.e);
        } else {
            ((czl) ((czl) cznVar.b()).i("com/google/android/apps/miphone/astrea/pd/service/ProtectedDownloadGrpcBindableService", "getVmDescriptor", AIFeature.Id.CHROME_SUMMARIZATION_PER_LAYER_GEM, "ProtectedDownloadGrpcBindableService.java")).p("Cannot start VM since the feature is either disabled or VMs are not supported on this device");
            feuVar.b(new eqp(eqo.i.e("VM disabled or not supported on this device.")));
        }
    }
}
