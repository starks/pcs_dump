package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fdf {
    public final fde a;
    public final int b;
    public final String c;

    public fdf(fde fdeVar, int i, String str) {
        this.a = fdeVar;
        this.b = i;
        this.c = str;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.a == fde.HTTP_1_0 ? "HTTP/1.0" : "HTTP/1.1");
        sb.append(' ');
        sb.append(this.b);
        if (this.c != null) {
            sb.append(' ');
            sb.append(this.c);
        }
        return sb.toString();
    }
}
