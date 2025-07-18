package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes.dex */
final class cet {
    public final Context a;
    public final csg b;

    public cet() {
    }

    public final Context a() {
        return this.a;
    }

    public final csg b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof cet) {
            cet cetVar = (cet) obj;
            if (this.a.equals(cetVar.a()) && this.b.equals(cetVar.b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() ^ 1000003;
        return this.b.hashCode() ^ (iHashCode * 1000003);
    }

    public final String toString() {
        csg csgVar = this.b;
        return "FlagsContext{context=" + this.a.toString() + ", hermeticFileOverrides=" + csgVar.toString() + "}";
    }

    public cet(Context context, csg csgVar) {
        this();
        this.a = context;
        this.b = csgVar;
    }
}
