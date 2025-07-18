package defpackage;

import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
final class bke implements blb {
    public final biw a;
    public final bjr b;
    public blt c = null;
    public Set d = null;
    public boolean e = false;
    final /* synthetic */ bkf f;

    public bke(bkf bkfVar, biw biwVar, bjr bjrVar) {
        this.f = bkfVar;
        this.a = biwVar;
        this.b = bjrVar;
    }

    @Override // defpackage.blb
    public final void a(bho bhoVar) {
        this.f.n.post(new bkd(this, bhoVar, 0));
    }

    public final void b(bho bhoVar) {
        bkb bkbVar = (bkb) this.f.l.get(this.b);
        if (bkbVar != null) {
            bkbVar.l(bhoVar);
        }
    }

    public final void c() {
        blt bltVar;
        if (!this.e || (bltVar = this.c) == null) {
            return;
        }
        this.a.j(bltVar, this.d);
    }
}
