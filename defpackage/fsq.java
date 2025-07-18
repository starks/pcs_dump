package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fsq {
    public static final fwv d = new fwv();
    public final fqv a;
    public final int b;
    public final String c;

    public fsq(fqv fqvVar, int i, String str) {
        fqvVar.getClass();
        str.getClass();
        this.a = fqvVar;
        this.b = i;
        this.c = str;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.a == fqv.a) {
            sb.append("HTTP/1.0");
        } else {
            sb.append("HTTP/1.1");
        }
        sb.append(' ');
        sb.append(this.b);
        sb.append(' ');
        sb.append(this.c);
        return sb.toString();
    }
}
