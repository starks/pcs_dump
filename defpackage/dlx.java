package defpackage;

import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dlx extends dte {
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final dlw e;
    public final dlv f;

    public dlx(int i, int i2, int i3, int i4, dlw dlwVar, dlv dlvVar) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = dlwVar;
        this.f = dlvVar;
    }

    @Override // defpackage.dli
    public final boolean a() {
        return this.e != dlw.c;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof dlx)) {
            return false;
        }
        dlx dlxVar = (dlx) obj;
        return dlxVar.a == this.a && dlxVar.b == this.b && dlxVar.c == this.c && dlxVar.d == this.d && dlxVar.e == this.e && dlxVar.f == this.f;
    }

    public final int hashCode() {
        return Objects.hash(dlx.class, Integer.valueOf(this.a), Integer.valueOf(this.b), Integer.valueOf(this.c), Integer.valueOf(this.d), this.e, this.f);
    }

    public final String toString() {
        dlv dlvVar = this.f;
        return "AesCtrHmacAead Parameters (variant: " + String.valueOf(this.e) + ", hashType: " + String.valueOf(dlvVar) + ", " + this.c + "-byte IV, and " + this.d + "-byte tags, and " + this.a + "-byte AES key, and " + this.b + "-byte HMAC key)";
    }
}
