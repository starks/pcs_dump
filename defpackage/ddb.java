package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class ddb {
    public final int a;
    public final daw b;

    protected ddb(daw dawVar, int i) {
        if (dawVar == null) {
            throw new IllegalArgumentException("format options cannot be null");
        }
        if (i < 0) {
            throw new IllegalArgumentException(a.x(i, "invalid index: "));
        }
        this.a = i;
        this.b = dawVar;
    }

    public abstract void a(ddf ddfVar, Object obj);
}
