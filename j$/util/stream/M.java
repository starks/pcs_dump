package j$.util.stream;

import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* loaded from: classes2.dex */
public abstract class M implements N {
    protected final N a;

    public M(N n) {
        n.getClass();
        this.a = n;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }

    @Override // j$.util.stream.N
    public void b() {
        this.a.b();
    }

    @Override // j$.util.stream.N
    public void c(long j) {
        this.a.c(j);
    }

    @Override // j$.util.stream.N
    public boolean f() {
        return this.a.f();
    }
}
