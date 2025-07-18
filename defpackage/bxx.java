package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bxx {
    public static final bxx a;
    static final bxx b;
    private final String c;
    private final int d;
    private final int e;

    static {
        bxw bxwVar = new bxw(null);
        bxwVar.c();
        bxwVar.e();
        bxwVar.b(1);
        bxwVar.d(1);
        a = bxwVar.a();
        bxw bxwVar2 = new bxw(null);
        bxwVar2.c();
        bxwVar2.e();
        bxwVar2.b(4);
        bxwVar2.d(1);
        b = bxwVar2.a();
        bxw bxwVar3 = new bxw(null);
        bxwVar3.c();
        bxwVar3.e();
        bxwVar3.b(2);
        bxwVar3.d(1);
        bxwVar3.a();
    }

    public bxx() {
    }

    public final String a() {
        return this.c;
    }

    public final int b() {
        return this.d;
    }

    public final int c() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bxx) {
            bxx bxxVar = (bxx) obj;
            if (this.c.equals(bxxVar.a())) {
                bxxVar.e();
                int i = this.d;
                int iB = bxxVar.b();
                if (i == 0) {
                    throw null;
                }
                if (i == iB) {
                    bxxVar.d();
                    bxxVar.f();
                    int i2 = this.e;
                    int iC = bxxVar.c();
                    if (i2 == 0) {
                        throw null;
                    }
                    if (iC == 1) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = ((((this.c.hashCode() ^ 1000003) * 1000003) ^ 1237) * 1000003) ^ a.b(this.d);
        return a.b(this.e) ^ (iHashCode * 583896283);
    }

    public final String toString() {
        int i = this.d;
        String str = i != 1 ? i != 2 ? i != 3 ? i != 4 ? "null" : "NO_CHECKS" : "SKIP_SECURITY_CHECK" : "SKIP_COMPLIANCE_CHECK" : "ALL_CHECKS";
        String str2 = this.e == 1 ? "READ_AND_WRITE" : "null";
        return "FileComplianceOptions{fileOwner=" + this.c + ", hasDifferentDmaOwner=false, fileChecks=" + str + ", dataForwardingNotAllowedResolver=null, multipleProductIdGroupsResolver=null, filePurpose=" + str2 + "}";
    }

    public bxx(String str, int i, int i2) {
        this();
        this.c = str;
        this.d = i;
        this.e = i2;
    }

    public final void d() {
    }

    public final void e() {
    }

    public final void f() {
    }
}
