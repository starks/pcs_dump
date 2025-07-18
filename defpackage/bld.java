package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bld implements blb {
    final /* synthetic */ blg a;

    public bld(blg blgVar) {
        this.a = blgVar;
    }

    @Override // defpackage.blb
    public final void a(bho bhoVar) {
        boolean zC = bhoVar.c();
        blg blgVar = this.a;
        if (zC) {
            blgVar.j(null, blgVar.v());
            return;
        }
        fuu fuuVar = blgVar.q;
        if (fuuVar != null) {
            fuuVar.r(bhoVar);
        }
    }
}
