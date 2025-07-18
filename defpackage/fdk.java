package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fdk {
    public static final fvn a = fvn.g(":status");
    public static final fvn b = fvn.g(":method");
    public static final fvn c = fvn.g(":path");
    public static final fvn d = fvn.g(":scheme");
    public static final fvn e = fvn.g(":authority");
    public final fvn f;
    public final fvn g;
    final int h;

    static {
        fvn.g(":host");
        fvn.g(":version");
    }

    public fdk(String str, String str2) {
        this(fvn.g(str), fvn.g(str2));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof fdk) {
            fdk fdkVar = (fdk) obj;
            if (this.f.equals(fdkVar.f) && this.g.equals(fdkVar.g)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f.hashCode() + 527) * 31) + this.g.hashCode();
    }

    public final String toString() {
        return String.format("%s: %s", this.f.e(), this.g.e());
    }

    public fdk(fvn fvnVar, String str) {
        this(fvnVar, fvn.g(str));
    }

    public fdk(fvn fvnVar, fvn fvnVar2) {
        this.f = fvnVar;
        this.g = fvnVar2;
        this.h = fvnVar.b() + 32 + fvnVar2.b();
    }
}
