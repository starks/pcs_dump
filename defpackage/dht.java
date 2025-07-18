package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class dht {
    static final dht a;
    static final dht b;
    final boolean c;
    final Throwable d;

    static {
        if (dif.d) {
            b = null;
            a = null;
        } else {
            b = new dht(false, null);
            a = new dht(true, null);
        }
    }

    public dht(boolean z, Throwable th) {
        this.c = z;
        this.d = th;
    }
}
