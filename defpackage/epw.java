package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class epw implements epx {
    private final Object a;
    private final Object b;

    public epw(Object obj, Object obj2) {
        this.a = obj;
        this.b = obj2;
    }

    @Override // defpackage.epx
    public final int a() {
        return 1;
    }

    @Override // defpackage.epx
    public final epx b(Object obj, Object obj2, int i, int i2) {
        int iHashCode = this.a.hashCode();
        if (iHashCode != i) {
            return epv.d(new epw(obj, obj2), i, this, iHashCode, i2);
        }
        Object obj3 = this.a;
        return obj3 == obj ? new epw(obj, obj2) : new epu(new Object[]{obj3, obj}, new Object[]{this.b, obj2});
    }

    @Override // defpackage.epx
    public final Object c(Object obj, int i, int i2) {
        if (this.a == obj) {
            return this.b;
        }
        return null;
    }

    public final String toString() {
        return String.format("Leaf(key=%s value=%s)", this.a, this.b);
    }
}
