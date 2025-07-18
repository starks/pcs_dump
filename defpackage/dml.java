package defpackage;

import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dml extends dte {
    public final int a;
    public final dmk b;

    public dml(int i, dmk dmkVar) {
        this.a = i;
        this.b = dmkVar;
    }

    @Override // defpackage.dli
    public final boolean a() {
        return this.b != dmk.c;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof dml)) {
            return false;
        }
        dml dmlVar = (dml) obj;
        return dmlVar.a == this.a && dmlVar.b == this.b;
    }

    public final int hashCode() {
        return Objects.hash(dml.class, Integer.valueOf(this.a), this.b);
    }

    public final String toString() {
        return "AesGcmSiv Parameters (variant: " + String.valueOf(this.b) + ", " + this.a + "-byte key)";
    }
}
