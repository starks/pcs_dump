package defpackage;

import java.security.SecureRandom;

/* compiled from: PG */
/* loaded from: classes.dex */
final class dsh extends ThreadLocal {
    @Override // java.lang.ThreadLocal
    protected final /* synthetic */ Object initialValue() {
        SecureRandom secureRandomA = dsi.a();
        secureRandomA.nextLong();
        return secureRandomA;
    }
}
