package defpackage;

import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dst extends dte {
    public final int a;
    public final int b;
    public final dss c;

    public dst(int i, int i2, dss dssVar) {
        this.a = i;
        this.b = i2;
        this.c = dssVar;
    }

    @Override // defpackage.dli
    public final boolean a() {
        return this.c != dss.d;
    }

    public final int b() {
        dss dssVar = this.c;
        if (dssVar == dss.d) {
            return this.b;
        }
        if (dssVar == dss.a || dssVar == dss.b || dssVar == dss.c) {
            return this.b + 5;
        }
        throw new IllegalStateException("Unknown variant");
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof dst)) {
            return false;
        }
        dst dstVar = (dst) obj;
        return dstVar.a == this.a && dstVar.b() == b() && dstVar.c == this.c;
    }

    public final int hashCode() {
        return Objects.hash(dst.class, Integer.valueOf(this.a), Integer.valueOf(this.b), this.c);
    }

    public final String toString() {
        return "AES-CMAC Parameters (variant: " + String.valueOf(this.c) + ", " + this.b + "-byte tags, and " + this.a + "-byte key)";
    }
}
