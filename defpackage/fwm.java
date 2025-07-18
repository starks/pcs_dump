package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fwm {
    public fwn a;
    public int b;

    public final boolean equals(Object obj) {
        return (obj instanceof fwm) && this.a.equals(((fwm) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
