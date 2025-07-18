package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cod extends cnx {
    final float a;

    public cod() {
        super((byte[]) null);
        this.a = -1.0f;
    }

    @Override // defpackage.cnx
    public final void a(coq coqVar, float f, float f2) {
        float f3 = f2 * f;
        coqVar.f(f3, 180.0f, 90.0f);
        float f4 = f3 + f3;
        com comVar = new com(0.0f, 0.0f, f4, f4);
        comVar.e = 180.0f;
        comVar.f = 90.0f;
        coqVar.f.add(comVar);
        coqVar.b(new cok(comVar), 180.0f, 270.0f);
        float f5 = f4 + 0.0f;
        float f6 = f5 / 2.0f;
        float f7 = f5 * 0.5f;
        coqVar.b = (((float) Math.cos(Math.toRadians(270.0d))) * f6) + f7;
        coqVar.c = f7 + (f6 * ((float) Math.sin(Math.toRadians(270.0d))));
    }
}
