package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class avr {
    private final int a;
    private final int b;

    public avr() {
    }

    public final int a() {
        return this.b;
    }

    public final int b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof avr) {
            avr avrVar = (avr) obj;
            if (this.a == avrVar.b() && this.b == avrVar.a()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.b ^ ((this.a ^ 1000003) * 1000003);
    }

    public final String toString() {
        return "ConnectionResources{featureNameStringId=" + this.a + ", descriptionStringId=" + this.b + "}";
    }

    public avr(int i, int i2) {
        this();
        this.a = i;
        this.b = i2;
    }
}
