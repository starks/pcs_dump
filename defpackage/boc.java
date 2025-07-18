package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class boc {
    public final String a;

    public boc(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof boc) {
            return this.a.equals(((boc) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
