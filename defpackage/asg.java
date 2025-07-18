package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class asg implements eqe {
    public final eox a;
    private final emo b;

    public asg(emo emoVar, eox eoxVar) {
        this.b = emoVar;
        this.a = eoxVar;
    }

    @Override // defpackage.eqe
    public final fjp a(eqc eqcVar, epc epcVar, eqd eqdVar) {
        AtomicReference atomicReference = new AtomicReference();
        System.err.println("Seeding context with ref: " + System.identityHashCode(atomicReference));
        return fjp.O(emr.l().m(this.b, atomicReference), new asf(this, eqcVar, atomicReference), epcVar, eqdVar);
    }
}
