package defpackage;

import java.security.GeneralSecurityException;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class drs {
    public static final drs a = new drs();
    public final AtomicReference b = new AtomicReference(new exo(new exo((byte[]) null), (byte[]) null));

    /* JADX WARN: Type inference failed for: r2v5, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, java.util.Map] */
    public final Object a(dky dkyVar, Class cls) throws GeneralSecurityException {
        exo exoVar = (exo) this.b.get();
        dsb dsbVar = new dsb(dkyVar.getClass(), cls);
        if (exoVar.b.containsKey(dsbVar)) {
            return ((dsa) exoVar.b.get(dsbVar)).a(dkyVar);
        }
        throw new GeneralSecurityException(a.G(dsbVar, "No PrimitiveConstructor for ", " available"));
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object, java.util.Map] */
    public final synchronized void b(dsa dsaVar) {
        exo exoVar = new exo((exo) this.b.get());
        if (dsaVar == null) {
            throw new NullPointerException("primitive constructor must be non-null");
        }
        dsb dsbVar = new dsb(dsaVar.a, dsaVar.b);
        if (exoVar.b.containsKey(dsbVar)) {
            dsa dsaVar2 = (dsa) exoVar.b.get(dsbVar);
            if (!dsaVar2.equals(dsaVar) || !dsaVar.equals(dsaVar2)) {
                throw new GeneralSecurityException("Attempt to register non-equal PrimitiveConstructor object for already existing object of type: ".concat(dsbVar.toString()));
            }
        } else {
            exoVar.b.put(dsbVar, dsaVar);
        }
        this.b.set(new exo(exoVar, (byte[]) null));
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, java.util.Map] */
    public final synchronized void c(dse dseVar) {
        exo exoVar = new exo((exo) this.b.get());
        ?? r0 = exoVar.a;
        Class clsB = dseVar.b();
        if (r0.containsKey(clsB)) {
            dse dseVar2 = (dse) exoVar.a.get(clsB);
            if (!dseVar2.equals(dseVar) || !dseVar.equals(dseVar2)) {
                throw new GeneralSecurityException("Attempt to register non-equal PrimitiveWrapper object or input class object for already existing object of type".concat(clsB.toString()));
            }
        } else {
            exoVar.a.put(clsB, dseVar);
        }
        this.b.set(new exo(exoVar, (byte[]) null));
    }
}
