package j$.util.function;

import java.util.function.LongConsumer;

/* loaded from: classes2.dex */
public final /* synthetic */ class c implements LongConsumer {
    public final /* synthetic */ LongConsumer a;
    public final /* synthetic */ LongConsumer b;

    public /* synthetic */ c(LongConsumer longConsumer, LongConsumer longConsumer2) {
        this.a = longConsumer;
        this.b = longConsumer2;
    }

    @Override // java.util.function.LongConsumer
    public final void accept(long j) {
        this.a.accept(j);
        this.b.accept(j);
    }

    public final LongConsumer andThen(LongConsumer longConsumer) {
        longConsumer.getClass();
        return new c(this, longConsumer);
    }
}
