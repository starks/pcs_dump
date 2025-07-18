package defpackage;

import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dtb extends dte {
    public final int a;
    public final int b;
    public final dta c;
    public final dsz d;

    public dtb(int i, int i2, dta dtaVar, dsz dszVar) {
        this.a = i;
        this.b = i2;
        this.c = dtaVar;
        this.d = dszVar;
    }

    @Override // defpackage.dli
    public final boolean a() {
        return this.c != dta.d;
    }

    public final int b() {
        dta dtaVar = this.c;
        if (dtaVar == dta.d) {
            return this.b;
        }
        if (dtaVar == dta.a || dtaVar == dta.b || dtaVar == dta.c) {
            return this.b + 5;
        }
        throw new IllegalStateException("Unknown variant");
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof dtb)) {
            return false;
        }
        dtb dtbVar = (dtb) obj;
        return dtbVar.a == this.a && dtbVar.b() == b() && dtbVar.c == this.c && dtbVar.d == this.d;
    }

    public final int hashCode() {
        return Objects.hash(dtb.class, Integer.valueOf(this.a), Integer.valueOf(this.b), this.c, this.d);
    }

    public final String toString() {
        dsz dszVar = this.d;
        return "HMAC Parameters (variant: " + String.valueOf(this.c) + ", hashType: " + String.valueOf(dszVar) + ", " + this.b + "-byte tags, and " + this.a + "-byte key)";
    }
}
