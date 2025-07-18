package defpackage;

import java.security.GeneralSecurityException;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class drt {
    public static final drt a = (drt) dso.a(new dng(11));
    public final AtomicReference b = new AtomicReference(new egc(new egc(), (byte[]) null));

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.lang.Object, java.util.Map] */
    public final dky a(dsk dskVar, dln dlnVar) throws GeneralSecurityException {
        egc egcVar = (egc) this.b.get();
        dsl dslVar = new dsl(dskVar.getClass(), ((dsf) dskVar).b);
        if (egcVar.c.containsKey(dslVar)) {
            return ((drx) egcVar.c.get(dslVar)).d(dskVar, dlnVar);
        }
        throw new GeneralSecurityException(a.G(dslVar, "No Key Parser for requested key type ", " available"));
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.lang.Object, java.util.Map] */
    public final dli b(dsk dskVar) throws GeneralSecurityException {
        egc egcVar = (egc) this.b.get();
        dsl dslVar = new dsl(dskVar.getClass(), ((dsg) dskVar).a);
        if (egcVar.a.containsKey(dslVar)) {
            return ((drx) egcVar.a.get(dslVar)).b(dskVar);
        }
        throw new GeneralSecurityException(a.G(dslVar, "No Parameters Parser for requested key type ", " available"));
    }

    /* JADX WARN: Type inference failed for: r2v5, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, java.util.Map] */
    public final dsk c(dky dkyVar, Class cls, dln dlnVar) throws GeneralSecurityException {
        egc egcVar = (egc) this.b.get();
        dsm dsmVar = new dsm(dkyVar.getClass(), cls);
        if (egcVar.d.containsKey(dsmVar)) {
            return ((drx) egcVar.d.get(dsmVar)).c(dkyVar, dlnVar);
        }
        throw new GeneralSecurityException(a.G(dsmVar, "No Key serializer for ", " available"));
    }

    /* JADX WARN: Type inference failed for: r2v5, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, java.util.Map] */
    public final dsk d(dli dliVar, Class cls) throws GeneralSecurityException {
        egc egcVar = (egc) this.b.get();
        dsm dsmVar = new dsm(dliVar.getClass(), cls);
        if (egcVar.b.containsKey(dsmVar)) {
            return ((drx) egcVar.b.get(dsmVar)).a(dliVar);
        }
        throw new GeneralSecurityException(a.G(dsmVar, "No Key Format serializer for ", " available"));
    }

    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r1v9, types: [java.lang.Object, java.util.Map] */
    public final synchronized void e(drx drxVar) {
        egc egcVar = new egc((egc) this.b.get());
        dsm dsmVar = new dsm((Class) drxVar.b, drxVar.a);
        if (egcVar.b.containsKey(dsmVar)) {
            drx drxVar2 = (drx) egcVar.b.get(dsmVar);
            if (!drxVar2.equals(drxVar) || !drxVar.equals(drxVar2)) {
                throw new GeneralSecurityException("Attempt to register non-equal serializer for already existing object of type: ".concat(dsmVar.toString()));
            }
        } else {
            egcVar.b.put(dsmVar, drxVar);
        }
        this.b.set(new egc(egcVar, (byte[]) null));
    }

    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r1v9, types: [java.lang.Object, java.util.Map] */
    public final synchronized void f(drx drxVar) {
        egc egcVar = new egc((egc) this.b.get());
        dsl dslVar = new dsl(drxVar.a, (dwt) drxVar.b);
        if (egcVar.a.containsKey(dslVar)) {
            drx drxVar2 = (drx) egcVar.a.get(dslVar);
            if (!drxVar2.equals(drxVar) || !drxVar.equals(drxVar2)) {
                throw new GeneralSecurityException("Attempt to register non-equal parser for already existing object of type: ".concat(dslVar.toString()));
            }
        } else {
            egcVar.a.put(dslVar, drxVar);
        }
        this.b.set(new egc(egcVar, (byte[]) null));
    }

    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r1v9, types: [java.lang.Object, java.util.Map] */
    public final synchronized void g(drx drxVar) {
        egc egcVar = new egc((egc) this.b.get());
        dsm dsmVar = new dsm((Class) drxVar.b, drxVar.a);
        if (egcVar.d.containsKey(dsmVar)) {
            drx drxVar2 = (drx) egcVar.d.get(dsmVar);
            if (!drxVar2.equals(drxVar) || !drxVar.equals(drxVar2)) {
                throw new GeneralSecurityException("Attempt to register non-equal serializer for already existing object of type: ".concat(dsmVar.toString()));
            }
        } else {
            egcVar.d.put(dsmVar, drxVar);
        }
        this.b.set(new egc(egcVar, (byte[]) null));
    }

    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r1v9, types: [java.lang.Object, java.util.Map] */
    public final synchronized void h(drx drxVar) {
        egc egcVar = new egc((egc) this.b.get());
        dsl dslVar = new dsl(drxVar.a, (dwt) drxVar.b);
        if (egcVar.c.containsKey(dslVar)) {
            drx drxVar2 = (drx) egcVar.c.get(dslVar);
            if (!drxVar2.equals(drxVar) || !drxVar.equals(drxVar2)) {
                throw new GeneralSecurityException("Attempt to register non-equal parser for already existing object of type: ".concat(dslVar.toString()));
            }
        } else {
            egcVar.c.put(dslVar, drxVar);
        }
        this.b.set(new egc(egcVar, (byte[]) null));
    }
}
