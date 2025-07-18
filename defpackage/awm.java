package defpackage;

import j$.time.Duration;
import j$.time.Instant;
import j$.time.temporal.ChronoUnit;
import j$.util.Collection;
import j$.util.stream.Stream;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class awm implements avw {
    private final Duration a;

    public awm(Duration duration) {
        this.a = duration;
    }

    @Override // defpackage.avw
    public final cxc a(cxc cxcVar) {
        Stream streamFilter = Collection.EL.stream(cxcVar).map(new akn(Instant.now().truncatedTo(ChronoUnit.DAYS).minus(this.a), 7)).filter(new ari(5));
        int i = cxc.d;
        return (cxc) streamFilter.collect(cvu.a);
    }
}
