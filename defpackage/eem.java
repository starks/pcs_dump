package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class eem {
    private final Object a;
    private final int b;

    public eem(Object obj, int i) {
        this.a = obj;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof eem)) {
            return false;
        }
        eem eemVar = (eem) obj;
        return this.a == eemVar.a && this.b == eemVar.b;
    }

    public final int hashCode() {
        return (System.identityHashCode(this.a) * 65535) + this.b;
    }
}
