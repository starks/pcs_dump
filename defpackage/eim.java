package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class eim implements efg {
    private final /* synthetic */ int f;
    public static final efg e = new eim(4);
    public static final efg d = new eim(3);
    public static final efg c = new eim(2);
    public static final efg b = new eim(1);
    public static final efg a = new eim(0);

    private eim(int i) {
        this.f = i;
    }

    @Override // defpackage.efg
    public final boolean a(int i) {
        int i2 = this.f;
        return i2 != 0 ? i2 != 1 ? i2 != 2 ? i2 != 3 ? eiz.a(i) != 0 : eip.b(i) != null : eio.b(i) != null : eil.b(i) != null : ein.b(i) != null;
    }
}
