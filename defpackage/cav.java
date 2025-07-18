package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cav {
    private final String a;
    private final Map b;
    private final int c;

    public cav() {
        this(null, 0, 7);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cav)) {
            return false;
        }
        cav cavVar = (cav) obj;
        return fjs.c(this.a, cavVar.a) && this.c == cavVar.c && fjs.c(this.b, cavVar.b);
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31) + cau.b(this.c)) * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "Verdict(pv=" + this.a + ", action=" + ((Object) cau.a(this.c)) + ")";
    }

    public /* synthetic */ cav(String str, int i, int i2) {
        i = (i2 & 2) != 0 ? cau.d : i;
        str = 1 == (i2 & 1) ? "UNKNOWN" : str;
        fgn fgnVar = fgn.a;
        str.getClass();
        if (i == 0) {
            throw null;
        }
        this.a = str;
        this.c = i;
        this.b = fgnVar;
    }
}
