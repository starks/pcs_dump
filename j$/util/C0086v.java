package j$.util;

import java.util.function.Consumer;
import java.util.function.LongConsumer;

/* renamed from: j$.util.v, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C0086v implements LongConsumer {
    public final /* synthetic */ Consumer a;

    @Override // java.util.function.LongConsumer
    public final void accept(long j) {
        this.a.accept(Long.valueOf(j));
    }

    public final LongConsumer andThen(LongConsumer longConsumer) {
        longConsumer.getClass();
        return new j$.util.function.c(this, longConsumer);
    }
}
