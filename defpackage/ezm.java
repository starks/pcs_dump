package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ezm extends emb {
    long b;
    final /* synthetic */ ezv c;
    private final ezt d;

    public ezm(ezv ezvVar, ezt eztVar) {
        this.c = ezvVar;
        this.d = eztVar;
    }

    @Override // defpackage.fjp
    public final void U(long j) {
        if (this.c.r.f != null) {
            return;
        }
        synchronized (this.c.m) {
            if (this.c.r.f == null) {
                ezt eztVar = this.d;
                if (!eztVar.b) {
                    long j2 = this.b + j;
                    this.b = j2;
                    ezv ezvVar = this.c;
                    long j3 = ezvVar.v;
                    if (j2 <= j3) {
                        return;
                    }
                    if (j2 > ezvVar.n) {
                        eztVar.c = true;
                    } else {
                        long jM = ezvVar.G.m(j2 - j3);
                        ezv ezvVar2 = this.c;
                        ezvVar2.v = this.b;
                        if (jM > ezvVar2.o) {
                            this.d.c = true;
                        }
                    }
                    ezt eztVar2 = this.d;
                    Runnable runnableB = eztVar2.c ? this.c.b(eztVar2) : null;
                    if (runnableB != null) {
                        runnableB.run();
                    }
                }
            }
        }
    }
}
