package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes.dex */
final class eym extends eog {
    final /* synthetic */ eyo a;
    private final eyo b;
    private final AtomicBoolean c = new AtomicBoolean(false);

    public eym(eyo eyoVar, eyo eyoVar2) {
        this.a = eyoVar;
        this.b = eyoVar2;
    }

    @Override // defpackage.eog
    public final eoc a(eod eodVar) {
        if (this.c.compareAndSet(false, true)) {
            this.a.g.c().execute(new ewf(this.b, 17, null));
        }
        return eoc.a;
    }
}
