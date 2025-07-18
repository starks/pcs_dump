package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dcc {
    public final ddg a;
    public final String b;

    public dcc(ddg ddgVar, String str) {
        ddgVar.getClass();
        this.a = ddgVar;
        str.getClass();
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof dcc) {
            dcc dccVar = (dcc) obj;
            if (this.a.equals(dccVar.a) && this.b.equals(dccVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ this.b.hashCode();
    }
}
