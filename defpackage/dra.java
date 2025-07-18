package defpackage;

import j$.util.concurrent.ConcurrentHashMap;
import java.security.GeneralSecurityException;
import java.util.concurrent.ConcurrentMap;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dra {
    private static final Logger c = Logger.getLogger(dra.class.getName());
    public static final dra a = new dra();
    private final ConcurrentMap d = new ConcurrentHashMap();
    public final ConcurrentMap b = new ConcurrentHashMap();

    private final synchronized void d(dkz dkzVar, boolean z) {
        String strD = dkzVar.d();
        if (z && this.b.containsKey(strD) && !((Boolean) this.b.get(strD)).booleanValue()) {
            throw new GeneralSecurityException("New keys are already disallowed for key type ".concat(strD));
        }
        dkz dkzVar2 = (dkz) this.d.get(strD);
        if (dkzVar2 != null && !dkzVar2.getClass().equals(dkzVar.getClass())) {
            c.logp(Level.WARNING, "com.google.crypto.tink.internal.KeyManagerRegistry", "insertKeyManager", "Attempted overwrite of a registered key manager for key type ".concat(strD));
            throw new GeneralSecurityException(String.format("typeUrl (%s) is already registered with %s, cannot be re-registered with %s", strD, dkzVar2.getClass().getName(), dkzVar.getClass().getName()));
        }
        this.d.putIfAbsent(strD, dkzVar);
        this.b.put(strD, Boolean.valueOf(z));
    }

    public final synchronized dkz a(String str) {
        if (!this.d.containsKey(str)) {
            throw new GeneralSecurityException("No key manager found for key type ".concat(String.valueOf(str)));
        }
        return (dkz) this.d.get(str);
    }

    public final synchronized void b(dkz dkzVar, boolean z) {
        c(dkzVar, doo.a, z);
    }

    public final synchronized void c(dkz dkzVar, int i, boolean z) {
        if (!doo.a(i)) {
            throw new GeneralSecurityException("Cannot register key manager: FIPS compatibility insufficient");
        }
        d(dkzVar, z);
    }
}
