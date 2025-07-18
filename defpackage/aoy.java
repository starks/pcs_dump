package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aoy implements aot {
    final /* synthetic */ aqr a;
    final /* synthetic */ aqv b;
    final /* synthetic */ bpv c;

    public aoy(aqr aqrVar, aqv aqvVar, bpv bpvVar) {
        this.a = aqrVar;
        this.b = aqvVar;
        this.c = bpvVar;
    }

    @Override // defpackage.aot
    public final int a() {
        return 10;
    }

    @Override // defpackage.aot
    public final void b() {
        ((czl) ((czl) aqu.a.c()).i("com/google/android/apps/miphone/astrea/fl/federatedcompute/init/PcsFcInit", "init", 31, "PcsFcInit.java")).p("Calling BrellaInit for PCS.");
        bsp bspVar = new bsp(this.a, this.b, this.c);
        synchronized (bpx.a) {
            bpx.c = bspVar;
        }
        synchronized (bpx.a) {
            bpx.b = true;
        }
    }
}
