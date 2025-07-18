package j$.util;

import java.util.Iterator;
import java.util.Map;
import java.util.function.Consumer;

/* renamed from: j$.util.j, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C0050j implements Iterator, InterfaceC0085u {
    public final /* synthetic */ int a = 0;
    private final Iterator b;

    public C0050j(C0051k c0051k) {
        this.b = c0051k.a.iterator();
    }

    @Override // java.util.Iterator, j$.util.InterfaceC0085u
    public final void forEachRemaining(Consumer consumer) {
        switch (this.a) {
            case 0:
                AbstractC0087w.f(this.b, consumer);
                break;
            default:
                AbstractC0087w.f(this.b, new C0054n(consumer));
                break;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.a) {
        }
        return this.b.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.a) {
            case 0:
                return this.b.next();
            default:
                return new C0055o((Map.Entry) this.b.next());
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.a) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    public C0050j(C0057q c0057q) {
        this.b = c0057q.a.iterator();
    }
}
