package j$.util.stream;

import j$.util.function.Consumer$CC;
import java.util.function.Consumer;
import java.util.function.Predicate;

/* renamed from: j$.util.stream.j, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C0068j implements N {
    boolean a;
    boolean b;
    final /* synthetic */ EnumC0069k c;
    final /* synthetic */ Predicate d;

    C0068j(EnumC0069k enumC0069k, Predicate predicate) {
        this.c = enumC0069k;
        this.d = predicate;
        this.b = !enumC0069k.b;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        if (this.a) {
            return;
        }
        boolean zTest = this.d.test(obj);
        EnumC0069k enumC0069k = this.c;
        if (zTest == enumC0069k.a) {
            this.a = true;
            this.b = enumC0069k.b;
        }
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }

    @Override // j$.util.stream.N
    public final boolean f() {
        return this.a;
    }

    @Override // j$.util.stream.N
    public final /* synthetic */ void c(long j) {
    }

    @Override // j$.util.stream.N
    public final /* synthetic */ void b() {
    }
}
