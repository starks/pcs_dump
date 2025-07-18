package defpackage;

import j$.time.Duration;
import j$.util.Optional;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ayl implements ayj {
    public static final /* synthetic */ int a = 0;
    private static final Duration b = Duration.ofMinutes(10);
    private final Executor c;
    private final anj d;

    public ayl(anj anjVar, Executor executor) {
        this.d = anjVar;
        this.c = executor;
    }

    @Override // defpackage.ayj
    public final djy a(String str) {
        euw euwVar = new euw(null, null, null, null, null);
        euwVar.p(b);
        euwVar.b = Optional.of(str);
        euwVar.a = Optional.of(true);
        return dij.i(djr.q(this.d.b(euwVar.o())), new avf(6), this.c);
    }
}
