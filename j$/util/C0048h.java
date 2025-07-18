package j$.util;

import java.util.RandomAccess;

/* renamed from: j$.util.h, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C0048h extends C0046f implements RandomAccess {
    private static final long serialVersionUID = 1530674583602358482L;

    private Object writeReplace() {
        return new C0046f(this.c);
    }

    @Override // j$.util.C0046f, java.util.List
    public final java.util.List subList(int i, int i2) {
        C0048h c0048h;
        synchronized (this.b) {
            c0048h = new C0048h(this.c.subList(i, i2), this.b);
        }
        return c0048h;
    }
}
