package j$.util.stream;

import java.util.function.Function;
import java.util.function.Predicate;

/* loaded from: classes2.dex */
final class H extends M {
    public final /* synthetic */ int b;
    final /* synthetic */ I c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ H(I i, N n, int i2) {
        super(n);
        this.b = i2;
        this.c = i;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        switch (this.b) {
            case 0:
                if (((Predicate) this.c.m).test(obj)) {
                    this.a.accept(obj);
                    break;
                }
                break;
            default:
                this.a.accept(((Function) this.c.m).apply(obj));
                break;
        }
    }

    @Override // j$.util.stream.M, j$.util.stream.N
    public void c(long j) {
        switch (this.b) {
            case 0:
                this.a.c(-1L);
                break;
            default:
                super.c(j);
                break;
        }
    }
}
