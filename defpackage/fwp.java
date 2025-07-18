package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fwp {
    public final int a;
    public final int b;
    public final int c;
    public final int d;

    public fwp(String str) {
        String[] strArrSplit = "133.0.6876.3".split("\\.");
        this.a = Integer.parseInt(strArrSplit[0]);
        this.b = Integer.parseInt(strArrSplit[1]);
        this.c = Integer.parseInt(strArrSplit[2]);
        this.d = Integer.parseInt(strArrSplit[3]);
    }

    public final String toString() {
        return this.a + "." + this.b + "." + this.c + "." + this.d;
    }
}
