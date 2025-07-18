package j$.util.stream;

/* loaded from: classes2.dex */
final class I extends L {
    public final /* synthetic */ int l;
    final /* synthetic */ Object m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ I(L l, int i, Object obj, int i2) {
        super(l, i);
        this.l = i2;
        this.m = obj;
    }

    @Override // j$.util.stream.AbstractC0060b
    final boolean l() {
        return false;
    }

    @Override // j$.util.stream.AbstractC0060b
    final N m(int i, N n) {
        switch (this.l) {
            case 0:
                return new H(this, n, 1);
            case 1:
                return new J(this, n);
            default:
                return new H(this, n, 0);
        }
    }
}
