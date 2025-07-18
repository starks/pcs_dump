package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ahi extends ahd {
    final /* synthetic */ ahk a;

    public ahi(ahk ahkVar) {
        this.a = ahkVar;
    }

    @Override // defpackage.ahd, defpackage.agz
    public final void a(ahc ahcVar) {
        this.a.u.remove(ahcVar);
        if (this.a.A()) {
            return;
        }
        ahc ahcVar2 = this.a;
        ahcVar2.t(ahcVar2, ahb.c, false);
        ahk ahkVar = this.a;
        ahkVar.m = true;
        ahkVar.t(ahkVar, ahb.b, false);
    }
}
