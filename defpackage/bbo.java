package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bbo {
    private final egi a;
    private final bbc b;
    private final int c;
    private final String d;

    public bbo() {
    }

    public final int a() {
        return this.c;
    }

    public final bbc b() {
        return this.b;
    }

    public final egi c() {
        return this.a;
    }

    public final String d() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bbo) {
            bbo bboVar = (bbo) obj;
            if (this.a.equals(bboVar.c()) && this.b.equals(bboVar.b()) && this.c == bboVar.a() && this.d.equals(bboVar.d())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
        String str = this.d;
        return ((this.c ^ (iHashCode * 1000003)) * 1000003) ^ str.hashCode();
    }

    public final String toString() {
        bbc bbcVar = this.b;
        return "DownloadResult{response=" + this.a.toString() + ", state=" + bbcVar.toString() + ", approximatedDownloadSize=" + this.c + ", clientId=" + this.d + "}";
    }

    public bbo(egi egiVar, bbc bbcVar, int i, String str) {
        this();
        if (egiVar == null) {
            throw new NullPointerException("Null response");
        }
        this.a = egiVar;
        this.b = bbcVar;
        this.c = i;
        if (str == null) {
            throw new NullPointerException("Null clientId");
        }
        this.d = str;
    }
}
