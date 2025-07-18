package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes.dex */
final class eys extends eog {
    public final eof a;
    final /* synthetic */ eyt b;
    private final AtomicBoolean c = new AtomicBoolean(false);

    public eys(eyt eytVar, eof eofVar) {
        this.b = eytVar;
        this.a = eofVar;
    }

    @Override // defpackage.eog
    public final eoc a(eod eodVar) {
        if (this.c.compareAndSet(false, true)) {
            this.b.f.c().execute(new ewf(this, 18));
        }
        return eoc.a;
    }
}
