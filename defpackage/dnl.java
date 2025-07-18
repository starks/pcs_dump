package defpackage;

import j$.util.Objects;
import java.security.GeneralSecurityException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dnl extends dte {
    public final dnk a;
    public final int b;

    private dnl(dnk dnkVar, int i) {
        this.a = dnkVar;
        this.b = i;
    }

    public static dnl b(dnk dnkVar, int i) throws GeneralSecurityException {
        if (i < 8 || i > 12) {
            throw new GeneralSecurityException("Salt size must be between 8 and 12 bytes");
        }
        return new dnl(dnkVar, i);
    }

    @Override // defpackage.dli
    public final boolean a() {
        return this.a != dnk.b;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof dnl)) {
            return false;
        }
        dnl dnlVar = (dnl) obj;
        return dnlVar.a == this.a && dnlVar.b == this.b;
    }

    public final int hashCode() {
        return Objects.hash(dnl.class, this.a, Integer.valueOf(this.b));
    }

    public final String toString() {
        return "X-AES-GCM Parameters (variant: " + this.a.c + "salt_size_bytes: " + this.b + ")";
    }
}
