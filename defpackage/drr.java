package defpackage;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class drr {
    public static final drr a = new drr();
    private final Map b = new HashMap();

    public final synchronized void a(String str, dli dliVar) {
        if (!this.b.containsKey(str)) {
            this.b.put(str, dliVar);
            return;
        }
        if (((dli) this.b.get(str)).equals(dliVar)) {
            return;
        }
        throw new GeneralSecurityException("Parameters object with name " + str + " already exists (" + String.valueOf(this.b.get(str)) + "), cannot insert " + String.valueOf(dliVar));
    }

    public final synchronized void b(Map map) {
        for (Map.Entry entry : map.entrySet()) {
            a((String) entry.getKey(), (dli) entry.getValue());
        }
    }

    public final synchronized dli c() {
        if (!this.b.containsKey("ECIES_P256_HKDF_HMAC_SHA256_AES128_GCM")) {
            throw new GeneralSecurityException(a.z("ECIES_P256_HKDF_HMAC_SHA256_AES128_GCM", "Name ", " does not exist"));
        }
        return (dli) this.b.get("ECIES_P256_HKDF_HMAC_SHA256_AES128_GCM");
    }
}
