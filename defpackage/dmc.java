package defpackage;

import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dmc extends dte {
    public final int a;
    public final int b;
    public final int c;
    public final dmb d;

    public dmc(int i, int i2, int i3, dmb dmbVar) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = dmbVar;
    }

    @Override // defpackage.dli
    public final boolean a() {
        return this.d != dmb.c;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof dmc)) {
            return false;
        }
        dmc dmcVar = (dmc) obj;
        return dmcVar.a == this.a && dmcVar.b == this.b && dmcVar.c == this.c && dmcVar.d == this.d;
    }

    public final int hashCode() {
        return Objects.hash(dmc.class, Integer.valueOf(this.a), Integer.valueOf(this.b), Integer.valueOf(this.c), this.d);
    }

    public final String toString() {
        return "AesEax Parameters (variant: " + String.valueOf(this.d) + ", " + this.b + "-byte IV, " + this.c + "-byte tag, and " + this.a + "-byte key)";
    }
}
