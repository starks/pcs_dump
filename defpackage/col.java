package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class col extends cop {
    private final con a;
    private final float b;
    private final float e;

    public col(con conVar, float f, float f2) {
        this.a = conVar;
        this.b = f;
        this.e = f2;
    }

    final float a() {
        con conVar = this.a;
        return (float) Math.toDegrees(Math.atan((conVar.b - this.e) / (conVar.a - this.b)));
    }
}
