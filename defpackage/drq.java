package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class drq {
    public static final drq a = new drq();
    private static final dcr c = new dcr(null);
    private final AtomicReference b = new AtomicReference();

    public final dcr a() {
        dcr dcrVar = (dcr) this.b.get();
        return dcrVar == null ? c : dcrVar;
    }
}
