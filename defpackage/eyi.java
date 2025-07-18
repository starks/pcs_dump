package defpackage;

import java.util.logging.Level;

/* compiled from: PG */
/* loaded from: classes.dex */
final class eyi implements eoh {
    public eyn a;
    final /* synthetic */ eyo b;

    public eyi(eyo eyoVar) {
        this.b = eyoVar;
    }

    @Override // defpackage.eoh
    public final void a(emi emiVar) {
        if (this.b.j) {
            eyo.f.logp(Level.WARNING, "io.grpc.internal.PickFirstLeafLoadBalancer$HealthListener", "onSubchannelState", "Ignoring health status {0} for subchannel {1} as this is not under a petiole policy", new Object[]{emiVar, this.a.a});
            return;
        }
        eyo.f.logp(Level.FINE, "io.grpc.internal.PickFirstLeafLoadBalancer$HealthListener", "onSubchannelState", "Received health status {0} for subchannel {1}", new Object[]{emiVar, this.a.a});
        this.a.d = emiVar;
        if (this.b.i.g()) {
            eyn eynVar = this.a;
            eyo eyoVar = this.b;
            if (eynVar == eyoVar.h.get(eyoVar.i.c())) {
                this.b.g(this.a);
            }
        }
    }
}
