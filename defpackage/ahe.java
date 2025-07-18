package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ahe extends ahd {
    final /* synthetic */ nv a;
    final /* synthetic */ ahf b;

    public ahe(ahf ahfVar, nv nvVar) {
        this.b = ahfVar;
        this.a = nvVar;
    }

    @Override // defpackage.ahd, defpackage.agz
    public final void b(ahc ahcVar) {
        ((ArrayList) this.a.get(this.b.b)).remove(ahcVar);
        ahcVar.F(this);
    }
}
