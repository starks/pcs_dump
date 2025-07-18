package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ftb {
    public static final fvn a;
    public static final fvn b;
    public static final fvn c;
    public static final fvn d;
    public static final fvn e;
    public static final fvn f;
    public final fvn g;
    public final fvn h;
    public final int i;

    static {
        fvn fvnVar = fvn.a;
        a = fwv.h(":");
        b = fwv.h(":status");
        c = fwv.h(":method");
        d = fwv.h(":path");
        e = fwv.h(":scheme");
        f = fwv.h(":authority");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ftb(String str, String str2) {
        this(fwv.h(str), fwv.h(str2));
        str2.getClass();
        fvn fvnVar = fvn.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ftb)) {
            return false;
        }
        ftb ftbVar = (ftb) obj;
        return fjs.c(this.g, ftbVar.g) && fjs.c(this.h, ftbVar.h);
    }

    public final int hashCode() {
        return (this.g.hashCode() * 31) + this.h.hashCode();
    }

    public final String toString() {
        fvn fvnVar = this.h;
        return this.g.e() + ": " + fvnVar.e();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ftb(fvn fvnVar, String str) {
        this(fvnVar, fwv.h(str));
        fvnVar.getClass();
    }

    public ftb(fvn fvnVar, fvn fvnVar2) {
        this.g = fvnVar;
        this.h = fvnVar2;
        this.i = fvnVar.b() + 32 + fvnVar2.b();
    }
}
