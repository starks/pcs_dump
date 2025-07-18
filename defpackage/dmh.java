package defpackage;

import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dmh extends dte {
    public final int a;
    public final int b;
    public final int c;
    public final dmg d;

    public dmh(int i, int i2, int i3, dmg dmgVar) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = dmgVar;
    }

    @Override // defpackage.dli
    public final boolean a() {
        return this.d != dmg.c;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof dmh)) {
            return false;
        }
        dmh dmhVar = (dmh) obj;
        return dmhVar.a == this.a && dmhVar.b == this.b && dmhVar.c == this.c && dmhVar.d == this.d;
    }

    public final int hashCode() {
        return Objects.hash(dmh.class, Integer.valueOf(this.a), Integer.valueOf(this.b), Integer.valueOf(this.c), this.d);
    }

    public final String toString() {
        return "AesGcm Parameters (variant: " + String.valueOf(this.d) + ", " + this.b + "-byte IV, " + this.c + "-byte tag, and " + this.a + "-byte key)";
    }
}
