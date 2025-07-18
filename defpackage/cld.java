package defpackage;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import com.google.android.material.button.MaterialButton;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cld {
    public final MaterialButton a;
    public cof b;
    public xl c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public PorterDuff.Mode j;
    public ColorStateList k;
    public ColorStateList l;
    public ColorStateList m;
    public Drawable n;
    public boolean p;
    public LayerDrawable r;
    public int s;
    public err t;
    public boolean o = false;
    public boolean q = true;

    public cld(MaterialButton materialButton, cof cofVar) {
        this.a = materialButton;
        this.b = cofVar;
    }

    private final coa e(boolean z) {
        LayerDrawable layerDrawable = this.r;
        if (layerDrawable == null || layerDrawable.getNumberOfLayers() <= 0) {
            return null;
        }
        return (coa) ((LayerDrawable) ((InsetDrawable) this.r.getDrawable(0)).getDrawable()).getDrawable(!z ? 1 : 0);
    }

    public final coa a() {
        return e(false);
    }

    public final void b() {
        this.o = true;
        this.a.e(this.k);
        this.a.f(this.j);
    }

    public final void c(cof cofVar) {
        this.b = cofVar;
        this.t = null;
        d();
    }

    public final void d() {
        coa coaVarA = a();
        if (coaVarA != null) {
            err errVar = this.t;
            if (errVar != null) {
                coaVarA.u(errVar);
            } else {
                coaVarA.d(this.b);
            }
            xl xlVar = this.c;
            if (xlVar != null) {
                coaVarA.k(xlVar);
            }
        }
        coa coaVarE = e(true);
        if (coaVarE != null) {
            err errVar2 = this.t;
            if (errVar2 != null) {
                coaVarE.u(errVar2);
            } else {
                coaVarE.d(this.b);
            }
            xl xlVar2 = this.c;
            if (xlVar2 != null) {
                coaVarE.k(xlVar2);
            }
        }
        LayerDrawable layerDrawable = this.r;
        cor corVar = null;
        if (layerDrawable != null && layerDrawable.getNumberOfLayers() > 1) {
            corVar = this.r.getNumberOfLayers() > 2 ? (cor) this.r.getDrawable(2) : (cor) this.r.getDrawable(1);
        }
        if (corVar != null) {
            corVar.d(this.b);
            if (corVar instanceof coa) {
                coa coaVar = (coa) corVar;
                err errVar3 = this.t;
                if (errVar3 != null) {
                    coaVar.u(errVar3);
                }
                xl xlVar3 = this.c;
                if (xlVar3 != null) {
                    coaVar.k(xlVar3);
                }
            }
        }
    }
}
