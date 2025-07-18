package defpackage;

import java.util.concurrent.atomic.AtomicLong;

/* compiled from: PG */
/* loaded from: classes.dex */
final class eta implements ews {
    private final AtomicLong a = new AtomicLong();

    @Override // defpackage.ews
    public final void a() {
        this.a.getAndAdd(1L);
    }
}
