package j$.util;

import java.util.RandomAccess;

/* renamed from: j$.util.s, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C0058s extends C0053m implements RandomAccess {
    private static final long serialVersionUID = -2542308836966382001L;

    private Object writeReplace() {
        return new C0053m(this.b);
    }

    @Override // j$.util.C0053m, java.util.List
    public final java.util.List subList(int i, int i2) {
        return new C0058s(this.b.subList(i, i2));
    }
}
