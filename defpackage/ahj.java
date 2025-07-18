package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ahj extends ahd {
    final ahk a;

    public ahj(ahk ahkVar) {
        this.a = ahkVar;
    }

    @Override // defpackage.ahd, defpackage.agz
    public final void b(ahc ahcVar) {
        ahk ahkVar = this.a;
        int i = ahkVar.v - 1;
        ahkVar.v = i;
        if (i == 0) {
            ahkVar.w = false;
            ahkVar.s();
        }
        ahcVar.F(this);
    }

    @Override // defpackage.ahd, defpackage.agz
    public final void f(ahc ahcVar) {
        ahk ahkVar = this.a;
        if (ahkVar.w) {
            return;
        }
        ahkVar.z();
        this.a.w = true;
    }
}
