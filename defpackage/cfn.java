package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cfn {
    public static final cfn a = new cfn(cyw.c);
    public final cxt b;

    public cfn(cxt cxtVar) {
        this.b = cxtVar;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof cfn) {
            return this.b.equals(((cfn) obj).b);
        }
        return false;
    }

    public final int hashCode() {
        return dcr.g(this.b);
    }
}
