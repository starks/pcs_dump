package j$.util.stream;

import java.util.function.Consumer;

/* loaded from: classes2.dex */
final class K extends L {
    @Override // j$.util.stream.L, j$.util.stream.Stream
    public final void forEach(Consumer consumer) {
        if (b()) {
            super.forEach(consumer);
        } else {
            o().forEachRemaining(consumer);
        }
    }

    @Override // j$.util.stream.AbstractC0060b
    final boolean l() {
        throw new UnsupportedOperationException();
    }

    @Override // j$.util.stream.AbstractC0060b
    final N m(int i, N n) {
        throw new UnsupportedOperationException();
    }
}
