package defpackage;

import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: PG */
/* loaded from: classes.dex */
final class eqv extends emq {
    private static final Logger b = Logger.getLogger(eqv.class.getName());
    static final ThreadLocal a = new ThreadLocal();

    @Override // defpackage.emq
    public final emr a() {
        emr emrVar = (emr) a.get();
        return emrVar == null ? emr.d : emrVar;
    }

    @Override // defpackage.emq
    public final emr b(emr emrVar) {
        emr emrVarA = a();
        a.set(emrVar);
        return emrVarA;
    }

    @Override // defpackage.emq
    public final void c(emr emrVar, emr emrVar2) {
        if (a() != emrVar) {
            b.logp(Level.SEVERE, "io.grpc.ThreadLocalContextStorage", "detach", "Context was not attached when detaching", new Throwable().fillInStackTrace());
        }
        if (emrVar2 != emr.d) {
            a.set(emrVar2);
        } else {
            a.set(null);
        }
    }
}
