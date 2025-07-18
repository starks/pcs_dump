package defpackage;

import java.security.GeneralSecurityException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dsj extends dkt {
    public static final dsj a = new dsj();

    private dsj() {
        super(null);
    }

    @Override // defpackage.dkt
    public final Object a(dky dkyVar, Class cls) {
        return drs.a.a(dkyVar, cls);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Object, java.util.Map] */
    @Override // defpackage.dkt
    public final Object b(fpv fpvVar, Class cls) throws GeneralSecurityException {
        int i = dlm.a;
        exo exoVar = (exo) drs.a.b.get();
        if (!exoVar.a.containsKey(cls)) {
            throw new GeneralSecurityException("No wrapper found for ".concat(cls.toString()));
        }
        dse dseVar = (dse) exoVar.a.get(cls);
        if (fpvVar.c.equals(dseVar.a()) && dseVar.a().equals(fpvVar.c)) {
            return dseVar.c(fpvVar);
        }
        throw new GeneralSecurityException("Input primitive type of the wrapper doesn't match the type of primitives in the provided PrimitiveSet");
    }
}
