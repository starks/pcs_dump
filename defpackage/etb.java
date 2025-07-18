package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class etb {
    public final eoa a;
    public eoi b;
    public eoj c;
    final /* synthetic */ exo d;

    public etb(exo exoVar, eoa eoaVar) {
        this.d = exoVar;
        this.a = eoaVar;
        eoj eojVarA = ((eok) exoVar.a).a((String) exoVar.b);
        this.c = eojVarA;
        if (eojVarA != null) {
            this.b = eojVarA.a(eoaVar);
            return;
        }
        throw new IllegalStateException("Could not find policy '" + ((String) exoVar.b) + "'. Make sure its implementation is either registered to LoadBalancerRegistry or included in META-INF/services/io.grpc.LoadBalancerProvider from your jar files.");
    }
}
