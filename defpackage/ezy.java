package defpackage;

import java.util.concurrent.TimeUnit;
import java.util.logging.Level;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ezy extends fjp {
    final /* synthetic */ ezz a;
    private final fjp b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ezy(ezz ezzVar, fjp fjpVar) {
        super((char[]) null);
        this.a = ezzVar;
        this.b = fjpVar;
    }

    @Override // defpackage.fjp
    public final eqo T(epm epmVar) {
        eqo eqoVarT = this.b.T(epmVar);
        if (eqoVarT.g()) {
            this.a.b.a();
            return eqoVarT;
        }
        ezz ezzVar = this.a;
        ezk ezkVar = new ezk(ezzVar, 4);
        etg etgVar = (etg) ezzVar.b;
        etgVar.c.c();
        if (etgVar.d == null) {
            etgVar.d = new evf();
        }
        exo exoVar = etgVar.e;
        if (exoVar != null && exoVar.b()) {
            return eqoVarT;
        }
        long jA = etgVar.d.a();
        etgVar.e = etgVar.c.d(ezkVar, jA, TimeUnit.NANOSECONDS, etgVar.b);
        etg.a.logp(Level.FINE, "io.grpc.internal.BackoffPolicyRetryScheduler", "schedule", "Scheduling DNS resolution backoff for {0}ns", Long.valueOf(jA));
        return eqoVarT;
    }
}
