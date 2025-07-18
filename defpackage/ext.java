package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ext extends enm {
    final exu b;

    public ext(exu exuVar) {
        this.b = exuVar;
    }

    @Override // defpackage.enm
    public final exo a() {
        ekb ekbVar = new ekb((byte[]) null);
        ekbVar.a = this.b;
        clq.G(ekbVar.a != null, "config is not set");
        return new exo(eqo.b, ekbVar.a);
    }
}
