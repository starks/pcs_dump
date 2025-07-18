package j$.util.stream;

import j$.util.function.Consumer$CC;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

/* renamed from: j$.util.stream.i, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C0067i implements Supplier, Consumer {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;

    public /* synthetic */ C0067i(Object obj, Object obj2) {
        this.a = obj;
        this.b = obj2;
    }

    @Override // java.util.function.Consumer
    public void accept(Object obj) {
        ((BiConsumer) this.a).accept(this.b, obj);
    }

    public /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }

    @Override // java.util.function.Supplier
    public Object get() {
        return new C0068j((EnumC0069k) this.a, (Predicate) this.b);
    }
}
