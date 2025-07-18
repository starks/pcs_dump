package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
class dxv extends Exception {
    public final int a;

    public dxv(int i, String str) {
        super(str);
        this.a = i;
    }

    public dxv(int i, String str, Throwable th) {
        super(str, th);
        this.a = i;
    }
}
