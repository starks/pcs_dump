package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class exa implements exv {
    final /* synthetic */ exm a;

    public exa(exm exmVar) {
        this.a = exmVar;
    }

    @Override // defpackage.exv
    public final elp a(elp elpVar) {
        throw null;
    }

    @Override // defpackage.exv
    public final void b(boolean z) {
        exm exmVar = this.a;
        exmVar.Q.c(exmVar.y, z);
        if (z) {
            this.a.g();
        }
    }

    @Override // defpackage.exv
    public final void d(eqo eqoVar) {
        clq.G(this.a.A.get(), "Channel must have been shut down");
    }

    @Override // defpackage.exv
    public final void e() {
        clq.G(this.a.A.get(), "Channel must have been shut down");
        exm exmVar = this.a;
        exmVar.B = true;
        exmVar.j(false);
        this.a.h();
    }

    @Override // defpackage.exv
    public final void c() {
    }
}
