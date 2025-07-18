package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public class fpa extends flk implements fia {
    public final fhk d;

    public fpa(fhq fhqVar, fhk fhkVar) {
        super(fhqVar, true);
        this.d = fhkVar;
    }

    @Override // defpackage.fia
    public final StackTraceElement bg() {
        return null;
    }

    @Override // defpackage.fnh
    protected final boolean bh() {
        return true;
    }

    @Override // defpackage.fnh
    protected void f(Object obj) {
        fhk fhkVar = this.d;
        fok.a(fjp.C(fhkVar), fjp.o(obj, fhkVar));
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [fhk, fia] */
    @Override // defpackage.fia
    public final fia g() {
        ?? r1 = this.d;
        if (r1 instanceof fia) {
            return r1;
        }
        return null;
    }

    @Override // defpackage.flk
    protected void h(Object obj) {
        fhk fhkVar = this.d;
        fhkVar.e(fjp.o(obj, fhkVar));
    }
}
