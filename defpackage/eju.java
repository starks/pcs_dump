package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes.dex */
final class eju implements zz {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public eju(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // defpackage.zz
    public final /* synthetic */ zx a(Class cls) {
        return this.b != 0 ? ur.d() : ur.d();
    }

    @Override // defpackage.zz
    public final zx b(Class cls, aag aagVar) {
        if (this.b != 0) {
            ekb ekbVar = new ekb(aagVar);
            ald aldVarG = ((ejm) ebq.y((Context) this.a, ejm.class)).g();
            aldVarG.a = ekbVar;
            return new ejn(aldVarG.c(), ekbVar);
        }
        ab abVar = (ab) this.a;
        if (!(abVar.G() instanceof ekk)) {
            throw new IllegalStateException("FragmentRetainedComponent cannot be instantiated without a host");
        }
        ((ejv) ebq.z(((ejl) ((ekk) abVar.G()).a()).a(), ejv.class)).c();
        return new ejw(new alj(null));
    }

    @Override // defpackage.zz
    public final /* synthetic */ zx c(fkk fkkVar, aag aagVar) {
        return this.b != 0 ? ur.c(this, fkkVar, aagVar) : ur.c(this, fkkVar, aagVar);
    }
}
