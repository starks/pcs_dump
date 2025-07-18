package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cnw extends cnx {
    final float a;

    public cnw() {
        super((byte[]) null);
        this.a = -1.0f;
    }

    @Override // defpackage.cnx
    public final void a(coq coqVar, float f, float f2) {
        float f3 = f2 * f;
        coqVar.f(f3, 180.0f, 90.0f);
        double d = f3;
        coqVar.d((float) (Math.sin(Math.toRadians(90.0d)) * d), (float) (Math.sin(Math.toRadians(0.0d)) * d));
    }
}
