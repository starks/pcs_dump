package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fdx {
    public final String a;
    public final int b;
    private final String c;

    public fdx(fdw fdwVar) {
        this.a = fdwVar.b;
        this.b = fdwVar.a();
        this.c = fdwVar.toString();
    }

    public static int a(char c) {
        if (c >= '0' && c <= '9') {
            return c - '0';
        }
        if (c >= 'a' && c <= 'f') {
            return c - 'W';
        }
        if (c < 'A' || c > 'F') {
            return -1;
        }
        return c - '7';
    }

    public static int b(String str) {
        if (str.equals("http")) {
            return 80;
        }
        return str.equals("https") ? 443 : -1;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof fdx) && ((fdx) obj).c.equals(this.c);
    }

    public final int hashCode() {
        return this.c.hashCode();
    }

    public final String toString() {
        return this.c;
    }
}
