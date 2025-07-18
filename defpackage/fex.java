package defpackage;

import java.util.logging.Level;

/* compiled from: PG */
/* loaded from: classes.dex */
public class fex {
    public final Object a;
    public final eoi b;
    final /* synthetic */ fez e;
    public eog d = new enz(eoc.a);
    public emh c = emh.CONNECTING;

    public fex(fez fezVar, Object obj, eny enyVar) {
        this.e = fezVar;
        this.a = obj;
        this.b = enyVar.a(a());
    }

    protected few a() {
        return new few(this);
    }

    protected final void b() {
        this.b.e();
        this.c = emh.SHUTDOWN;
        fez.f.logp(Level.FINE, "io.grpc.util.MultiChildLoadBalancer$ChildLbState", "shutdown", "Child balancer {0} deleted", this.a);
    }

    public final String toString() {
        return "Address = " + String.valueOf(this.a) + ", state = " + String.valueOf(this.c) + ", picker type: " + String.valueOf(this.d.getClass()) + ", lb: " + String.valueOf(this.b);
    }
}
