package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fet implements eqd {
    public final fer a;
    private final boolean b;

    public fet(fer ferVar, boolean z) {
        this.a = ferVar;
        this.b = z;
    }

    @Override // defpackage.eqd
    public final fjp a(eqc eqcVar, epc epcVar) {
        clq.w(eqcVar.d().a.a(), "asyncUnaryRequestCall is only for clientSendsOneMessage methods");
        feq feqVar = new feq(eqcVar, this.b);
        eqcVar.c();
        return new fes(this, feqVar, eqcVar);
    }
}
