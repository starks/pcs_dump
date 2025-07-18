package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class drj {
    public final int a;
    private final dla b;

    public drj(dla dlaVar, int i) {
        this.b = dlaVar;
        this.a = i;
    }

    public final String toString() {
        return String.format("(status=%s, keyId=%s)", this.b, Integer.valueOf(this.a));
    }
}
