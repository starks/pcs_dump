package defpackage;

import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
final class czi {
    public final int a;
    public final TimeUnit b;

    public czi(int i, TimeUnit timeUnit) {
        this.a = i;
        timeUnit.getClass();
        this.b = timeUnit;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof czi) {
            czi cziVar = (czi) obj;
            if (this.a == cziVar.a && this.b == cziVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.a;
        return this.b.hashCode() ^ (i * 37);
    }

    public final String toString() {
        return this.a + " " + this.b.toString();
    }
}
