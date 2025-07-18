package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class oh {
    static final oh a;
    static final oh b;
    final boolean c;
    final Throwable d;

    static {
        if (op.a) {
            b = null;
            a = null;
        } else {
            b = new oh(false, null);
            a = new oh(true, null);
        }
    }

    public oh(boolean z, Throwable th) {
        this.c = z;
        this.d = th;
    }
}
