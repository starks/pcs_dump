package defpackage;

import android.view.WindowInsets;

/* compiled from: PG */
/* loaded from: classes.dex */
class vf extends vi {
    final WindowInsets.Builder a;

    public vf() {
        this.a = new WindowInsets.Builder();
    }

    @Override // defpackage.vi
    public vs a() {
        vs vsVarM = vs.m(this.a.build());
        vsVarM.b.f(null);
        return vsVarM;
    }

    @Override // defpackage.vi
    public void b(rz rzVar) {
        this.a.setStableInsets(rzVar.a());
    }

    @Override // defpackage.vi
    public void c(rz rzVar) {
        this.a.setSystemWindowInsets(rzVar.a());
    }

    public vf(vs vsVar) {
        WindowInsets.Builder builder;
        super(vsVar);
        WindowInsets windowInsetsE = vsVar.e();
        if (windowInsetsE != null) {
            builder = new WindowInsets.Builder(windowInsetsE);
        } else {
            builder = new WindowInsets.Builder();
        }
        this.a = builder;
    }
}
