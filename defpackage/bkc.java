package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
final class bkc {
    public final bjr a;
    public final bhq b;

    public bkc(bjr bjrVar, bhq bhqVar) {
        this.a = bjrVar;
        this.b = bhqVar;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof bkc)) {
            bkc bkcVar = (bkc) obj;
            if (a.g(this.a, bkcVar.a) && a.g(this.b, bkcVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    public final String toString() {
        bmf bmfVar = new bmf(this);
        bmfVar.a("key", this.a);
        bmfVar.a("feature", this.b);
        return bmfVar.toString();
    }
}
