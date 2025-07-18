package j$.util.stream;

import j$.util.Spliterator;
import j$.util.function.Consumer$CC;
import java.util.EnumMap;
import java.util.function.Consumer;
import java.util.function.Supplier;

/* renamed from: j$.util.stream.g, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C0065g implements d0, N, Supplier {
    final Object a;

    @Override // j$.util.stream.d0
    public Object a(AbstractC0060b abstractC0060b, Spliterator spliterator) {
        abstractC0060b.c(abstractC0060b.q(this), spliterator);
        return null;
    }

    @Override // java.util.function.Consumer
    public void accept(Object obj) {
        ((Consumer) this.a).accept(obj);
    }

    public /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }

    @Override // j$.util.stream.d0
    public Object d(AbstractC0060b abstractC0060b, Spliterator spliterator) {
        new C0066h(abstractC0060b, spliterator, abstractC0060b.q(this)).invoke();
        return null;
    }

    @Override // j$.util.stream.N
    public /* synthetic */ boolean f() {
        return false;
    }

    @Override // j$.util.stream.d0
    public int g() {
        return W.p;
    }

    @Override // java.util.function.Supplier
    public /* bridge */ /* synthetic */ Object get() {
        return null;
    }

    void h(V v) {
        ((EnumMap) this.a).put((EnumMap) v, (V) 1);
    }

    @Override // j$.util.stream.N
    public /* synthetic */ void c(long j) {
    }

    @Override // j$.util.stream.N
    public /* synthetic */ void b() {
    }
}
