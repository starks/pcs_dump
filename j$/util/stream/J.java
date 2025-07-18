package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.Function;

/* loaded from: classes2.dex */
final class J extends M {
    boolean b;
    final /* synthetic */ I c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    J(I i, N n) {
        super(n);
        this.c = i;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) throws Exception {
        Stream stream = (Stream) ((Function) this.c.m).apply(obj);
        if (stream != null) {
            try {
                boolean z = this.b;
                N n = this.a;
                if (z) {
                    Spliterator spliterator = ((Stream) stream.a()).spliterator();
                    while (!n.f() && spliterator.tryAdvance(n)) {
                    }
                } else {
                    ((Stream) stream.a()).forEach(n);
                }
            } catch (Throwable th) {
                try {
                    stream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        if (stream != null) {
            stream.close();
        }
    }

    @Override // j$.util.stream.M, j$.util.stream.N
    public final void c(long j) {
        this.a.c(-1L);
    }

    @Override // j$.util.stream.M, j$.util.stream.N
    public final boolean f() {
        this.b = true;
        return this.a.f();
    }
}
