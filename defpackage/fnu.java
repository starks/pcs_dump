package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fnu implements fhn, fho {
    public static final fnu a = new fnu();

    private fnu() {
    }

    @Override // defpackage.fhq
    public final Object fold(Object obj, fjc fjcVar) {
        return fjp.D(this, obj, fjcVar);
    }

    @Override // defpackage.fhn, defpackage.fhq
    public final fhn get(fho fhoVar) {
        return fjp.E(this, fhoVar);
    }

    @Override // defpackage.fhq
    public final fhq minusKey(fho fhoVar) {
        return fjp.F(this, fhoVar);
    }

    @Override // defpackage.fhq
    public final fhq plus(fhq fhqVar) {
        return fjp.G(this, fhqVar);
    }

    @Override // defpackage.fhn
    public final fho getKey() {
        return this;
    }
}
