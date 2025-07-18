package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ebi {
    private final String a;
    private final String b;
    private final String c;
    private final int d;
    private final String e;
    private final String f;
    private final int g;

    public ebi() {
    }

    public final int a() {
        return this.g;
    }

    public final int b() {
        return this.d;
    }

    public final String c() {
        return this.e;
    }

    public final String d() {
        return this.f;
    }

    public final String e() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ebi) {
            ebi ebiVar = (ebi) obj;
            if (this.a.equals(ebiVar.g()) && this.b.equals(ebiVar.f()) && this.c.equals(ebiVar.e()) && this.d == ebiVar.b() && this.e.equals(ebiVar.c()) && this.f.equals(ebiVar.d()) && this.g == ebiVar.a()) {
                return true;
            }
        }
        return false;
    }

    public final String f() {
        return this.b;
    }

    public final String g() {
        return this.a;
    }

    public final int hashCode() {
        return this.g ^ ((((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f.hashCode()) * 1000003);
    }

    public final String toString() {
        return "PirUri{unparsedUri=" + this.a + ", scheme=" + this.b + ", host=" + this.c + ", port=" + this.d + ", databaseName=" + this.e + ", databaseVersion=" + this.f + ", entry=" + this.g + "}";
    }

    public ebi(String str, String str2, String str3, int i, String str4, String str5, int i2) {
        this();
        this.a = str;
        if (str2 == null) {
            throw new NullPointerException("Null scheme");
        }
        this.b = str2;
        this.c = str3;
        this.d = i;
        if (str4 == null) {
            throw new NullPointerException("Null databaseName");
        }
        this.e = str4;
        if (str5 == null) {
            throw new NullPointerException("Null databaseVersion");
        }
        this.f = str5;
        this.g = i2;
    }
}
