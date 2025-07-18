package defpackage;

import java.util.concurrent.ScheduledExecutorService;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class exd extends eoa {
    etb a;
    public final /* synthetic */ exm b;

    public exd(exm exmVar) {
        this.b = exmVar;
    }

    @Override // defpackage.eoa
    public final elv a() {
        return this.b.G;
    }

    @Override // defpackage.eoa
    public final /* bridge */ /* synthetic */ eof b(enx enxVar) {
        this.b.m.c();
        clq.G(!this.b.B, "Channel is being terminated");
        return new esw(this.b, enxVar);
    }

    @Override // defpackage.eoa
    public final equ c() {
        return this.b.m;
    }

    @Override // defpackage.eoa
    public final ScheduledExecutorService d() {
        return this.b.j;
    }

    @Override // defpackage.eoa
    public final void e() {
        this.b.m.c();
        this.b.m.execute(new ewf(this, 10));
    }

    @Override // defpackage.eoa
    public final void f(emh emhVar, eog eogVar) {
        this.b.m.c();
        emhVar.getClass();
        this.b.m.execute(new n(this, eogVar, emhVar, 10, (char[]) null));
    }
}
