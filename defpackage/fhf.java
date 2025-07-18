package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public class fhf implements fhn {
    private final fho key;

    public fhf(fho fhoVar) {
        fhoVar.getClass();
        this.key = fhoVar;
    }

    @Override // defpackage.fhq
    public Object fold(Object obj, fjc fjcVar) {
        return fjp.D(this, obj, fjcVar);
    }

    @Override // defpackage.fhn, defpackage.fhq
    public fhn get(fho fhoVar) {
        return fjp.E(this, fhoVar);
    }

    @Override // defpackage.fhn
    public fho getKey() {
        return this.key;
    }

    @Override // defpackage.fhq
    public fhq minusKey(fho fhoVar) {
        return fjp.F(this, fhoVar);
    }

    @Override // defpackage.fhq
    public fhq plus(fhq fhqVar) {
        return fjp.G(this, fhqVar);
    }
}
