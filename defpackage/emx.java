package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class emx extends emy {
    final /* synthetic */ fep a;
    private final elw b;

    protected emx(elw elwVar) {
        this.b = elwVar;
    }

    @Override // defpackage.emy, defpackage.elw
    public final void e(ebz ebzVar, epc epcVar) {
        epcVar.e(this.a.a);
        f().e(ebzVar, epcVar);
    }

    @Override // defpackage.emy, defpackage.epr
    protected final elw f() {
        return this.b;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public emx(fep fepVar, elw elwVar) {
        this(elwVar);
        this.a = fepVar;
    }
}
