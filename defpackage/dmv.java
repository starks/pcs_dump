package defpackage;

import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dmv extends dte {
    public final String a;
    public final dmu b;

    public dmv(String str, dmu dmuVar) {
        this.a = str;
        this.b = dmuVar;
    }

    @Override // defpackage.dli
    public final boolean a() {
        return this.b != dmu.b;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof dmv)) {
            return false;
        }
        dmv dmvVar = (dmv) obj;
        return dmvVar.a.equals(this.a) && dmvVar.b.equals(this.b);
    }

    public final int hashCode() {
        return Objects.hash(dmv.class, this.a, this.b);
    }

    public final String toString() {
        return "LegacyKmsAead Parameters (keyUri: " + this.a + ", variant: " + this.b.c + ")";
    }
}
