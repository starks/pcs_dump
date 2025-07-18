package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bjn extends bjl {
    public final fcy b;

    public bjn(fcy fcyVar, brb brbVar) {
        super(3, brbVar);
        this.b = fcyVar;
    }

    @Override // defpackage.bjk
    public final boolean a(bkb bkbVar) {
        return ((bko) this.b.c).c;
    }

    @Override // defpackage.bjk
    public final bhq[] b(bkb bkbVar) {
        return ((bko) this.b.c).b;
    }

    @Override // defpackage.bjl
    public final void c(bkb bkbVar) {
        ((bko) this.b.c).b(bkbVar.b, this.a);
        bkk bkkVarA = ((bko) this.b.c).a();
        if (bkkVarA != null) {
            bkbVar.d.put(bkkVarA, this.b);
        }
    }

    @Override // defpackage.bjl, defpackage.bjq
    public final /* bridge */ /* synthetic */ void g(bnz bnzVar, boolean z) {
    }
}
