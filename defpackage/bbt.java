package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class bbt implements djj {
    final /* synthetic */ String a;
    final /* synthetic */ feu b;

    public bbt(String str, feu feuVar) {
        this.a = str;
        this.b = feuVar;
    }

    @Override // defpackage.djj
    public final void a(Throwable th) {
        ((czl) ((czl) ((czl) bbu.a.d()).h(th)).i("com/google/android/apps/miphone/astrea/pd/service/ProtectedDownloadGrpcBindableService$1", "onFailure", 100, "ProtectedDownloadGrpcBindableService.java")).r("Failed to handle %s", this.a);
        this.b.b(new eqp(th instanceof eqp ? ((eqp) th).a : th instanceof eqr ? ((eqr) th).a : th instanceof IllegalArgumentException ? eqo.e : eqo.k.d(th)));
    }

    @Override // defpackage.djj
    public final void b(Object obj) {
        ((czl) ((czl) bbu.a.c()).i("com/google/android/apps/miphone/astrea/pd/service/ProtectedDownloadGrpcBindableService$1", "onSuccess", 90, "ProtectedDownloadGrpcBindableService.java")).r("Successfully handled %s", this.a);
        this.b.c(obj);
        this.b.a();
    }
}
