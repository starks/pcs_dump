package defpackage;

import j$.util.DesugarCollections;
import j$.util.concurrent.ConcurrentHashMap;
import java.security.GeneralSecurityException;
import java.util.HashSet;
import java.util.logging.Logger;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dlm {
    public static final /* synthetic */ int a = 0;

    static {
        Logger.getLogger(dlm.class.getName());
        new ConcurrentHashMap();
        HashSet hashSet = new HashSet();
        hashSet.add(dks.class);
        hashSet.add(dkv.class);
        hashSet.add(dlo.class);
        hashSet.add(dkx.class);
        hashSet.add(dkw.class);
        hashSet.add(dlh.class);
        hashSet.add(dtn.class);
        hashSet.add(dlk.class);
        hashSet.add(dll.class);
        DesugarCollections.unmodifiableSet(hashSet);
    }

    private dlm() {
    }

    @Deprecated
    static dvc a(String str, eea eeaVar) {
        dkz dkzVarA = dra.a.a(str);
        if (dkzVarA instanceof drd) {
            return ((drd) dkzVarA).e(eeaVar);
        }
        throw new GeneralSecurityException(a.z(str, "manager for key type ", " is not a PrivateKeyManager"));
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.Map] */
    public static Class b(Class cls) {
        try {
            exo exoVar = (exo) drs.a.b.get();
            if (exoVar.a.containsKey(cls)) {
                return ((dse) exoVar.a.get(cls)).a();
            }
            throw new GeneralSecurityException(a.G(cls, "No input primitive class for ", " available"));
        } catch (GeneralSecurityException unused) {
            return null;
        }
    }

    public static Object c(dvc dvcVar, Class cls) throws GeneralSecurityException {
        String str = dvcVar.b;
        eea eeaVar = dvcVar.c;
        dkz dkzVarA = dra.a.a(str);
        if (dkzVarA.b().equals(cls)) {
            return dkzVarA.c(eeaVar);
        }
        throw new GeneralSecurityException("Primitive type " + cls.getName() + " not supported by key manager of type " + String.valueOf(dkzVarA.getClass()) + ", which only supports: " + dkzVarA.b().toString());
    }
}
