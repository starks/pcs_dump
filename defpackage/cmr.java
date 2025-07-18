package defpackage;

import android.graphics.Typeface;

/* compiled from: PG */
/* loaded from: classes.dex */
final class cmr implements cnl {
    final /* synthetic */ cms a;
    private final /* synthetic */ int b;

    public cmr(cms cmsVar, int i) {
        this.b = i;
        this.a = cmsVar;
    }

    @Override // defpackage.cnl
    public final void a(Typeface typeface) {
        if (this.b != 0) {
            cms cmsVar = this.a;
            ceg cegVar = cmsVar.v;
            if (cegVar != null) {
                cegVar.d();
            }
            if (cmsVar.k != typeface) {
                cmsVar.k = typeface;
                cmsVar.j = cnx.e(cmsVar.a.getContext().getResources().getConfiguration(), typeface);
                Typeface typeface2 = cmsVar.j;
                if (typeface2 == null) {
                    typeface2 = cmsVar.k;
                }
                cmsVar.i = typeface2;
                cmsVar.f();
                return;
            }
            return;
        }
        cms cmsVar2 = this.a;
        ceg cegVar2 = cmsVar2.u;
        if (cegVar2 != null) {
            cegVar2.d();
        }
        if (cmsVar2.n != typeface) {
            cmsVar2.n = typeface;
            cmsVar2.m = cnx.e(cmsVar2.a.getContext().getResources().getConfiguration(), typeface);
            Typeface typeface3 = cmsVar2.m;
            if (typeface3 == null) {
                typeface3 = cmsVar2.n;
            }
            cmsVar2.l = typeface3;
            cmsVar2.f();
        }
    }
}
