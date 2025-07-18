package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bjp extends bjl {
    public final bkk b;

    public bjp(bkk bkkVar, brb brbVar) {
        super(4, brbVar);
        this.b = bkkVar;
    }

    @Override // defpackage.bjk
    public final boolean a(bkb bkbVar) {
        fcy fcyVar = (fcy) bkbVar.d.get(this.b);
        return fcyVar != null && ((bko) fcyVar.c).c;
    }

    @Override // defpackage.bjk
    public final bhq[] b(bkb bkbVar) {
        fcy fcyVar = (fcy) bkbVar.d.get(this.b);
        if (fcyVar == null) {
            return null;
        }
        return ((bko) fcyVar.c).b;
    }

    @Override // defpackage.bjl
    public final void c(bkb bkbVar) {
        fcy fcyVar = (fcy) bkbVar.d.remove(this.b);
        if (fcyVar == null) {
            this.a.F(false);
            return;
        }
        int i = byw.a;
        bkl bklVar = ((bko) fcyVar.c).a;
        bklVar.b = null;
        bklVar.c = null;
    }

    @Override // defpackage.bjl, defpackage.bjq
    public final /* bridge */ /* synthetic */ void g(bnz bnzVar, boolean z) {
    }
}
