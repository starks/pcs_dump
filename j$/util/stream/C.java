package j$.util.stream;

import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;

/* loaded from: classes2.dex */
final class C implements F {
    private boolean a;
    private Object b;
    final /* synthetic */ BinaryOperator c;

    C(BinaryOperator binaryOperator) {
        this.c = binaryOperator;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        if (!this.a) {
            this.b = this.c.apply(this.b, obj);
        } else {
            this.a = false;
            this.b = obj;
        }
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }

    @Override // j$.util.stream.N
    public final /* synthetic */ void b() {
    }

    @Override // j$.util.stream.N
    public final void c(long j) {
        this.a = true;
        this.b = null;
    }

    @Override // j$.util.stream.F
    public final void e(F f) {
        C c = (C) f;
        if (c.a) {
            return;
        }
        accept(c.b);
    }

    @Override // j$.util.stream.N
    public final /* synthetic */ boolean f() {
        return false;
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        return this.a ? Optional.empty() : Optional.of(this.b);
    }
}
