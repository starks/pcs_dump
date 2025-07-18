package defpackage;

import j$.time.Duration;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class boi {
    private final boh a;
    private long b;
    private final bnc c;
    private final asr d;

    public boi(boh bohVar, bnc bncVar) {
        this.a = bohVar;
        this.c = bncVar;
        this.d = (asr) cqy.a.createBuilder();
        this.b = -1L;
    }

    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final synchronized boi clone() {
        return new boi(this);
    }

    public final synchronized cqy b() {
        return (cqy) this.d.z();
    }

    public final void c(int i, boh bohVar) {
        if (bohVar == boh.NOTHING) {
            throw new IllegalArgumentException("Cannot record an event with granularity NOTHING");
        }
        if (bohVar.compareTo(this.a) > 0) {
            return;
        }
        synchronized (this) {
            asr asrVar = (asr) cqx.a.createBuilder();
            if (!asrVar.a.isMutable()) {
                asrVar.B();
            }
            cqx cqxVar = (cqx) asrVar.a;
            int i2 = i - 1;
            if (i == 0) {
                throw null;
            }
            cqxVar.c = i2;
            cqxVar.b |= 1;
            long jNanoTime = System.nanoTime();
            long j = this.b;
            if (j >= 0) {
                long millis = Duration.ofNanos(jNanoTime - j).toMillis();
                if (!asrVar.a.isMutable()) {
                    asrVar.B();
                }
                cqx cqxVar2 = (cqx) asrVar.a;
                cqxVar2.b |= 2;
                cqxVar2.d = millis;
            }
            this.b = jNanoTime;
            asr asrVar2 = this.d;
            if (!asrVar2.a.isMutable()) {
                asrVar2.B();
            }
            cqy cqyVar = (cqy) asrVar2.a;
            cqx cqxVar3 = (cqx) asrVar.z();
            cqy cqyVar2 = cqy.a;
            cqxVar3.getClass();
            efm efmVar = cqyVar.b;
            if (!efmVar.c()) {
                cqyVar.b = efb.mutableCopy(efmVar);
            }
            cqyVar.b.add(cqxVar3);
        }
    }

    private boi(boi boiVar) {
        this.a = boiVar.a;
        this.c = boiVar.c;
        this.d = (asr) boiVar.d.clone();
        this.b = boiVar.b;
    }
}
