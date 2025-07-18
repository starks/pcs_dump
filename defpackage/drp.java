package defpackage;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class drp {
    public static final drp a = new drp();
    private final Map b = new HashMap();

    public final synchronized void a(dro droVar, Class cls) {
        dro droVar2 = (dro) this.b.get(cls);
        if (droVar2 != null && !droVar2.equals(droVar)) {
            throw new GeneralSecurityException("Different key creator for parameters class already inserted");
        }
        this.b.put(cls, droVar);
    }
}
