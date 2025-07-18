package j$.util.stream;

import java.util.Comparator;

/* loaded from: classes2.dex */
abstract class O extends M {
    protected final Comparator b;
    protected boolean c;

    O(N n, Comparator comparator) {
        super(n);
        this.b = comparator;
    }

    @Override // j$.util.stream.M, j$.util.stream.N
    public final boolean f() {
        this.c = true;
        return false;
    }
}
