package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public class fhg implements fho {
    private final fiy a;
    private final fho b;

    public fhg(fho fhoVar, fiy fiyVar) {
        this.a = fiyVar;
        this.b = fhoVar instanceof fhg ? ((fhg) fhoVar).b : fhoVar;
    }

    public final fhn a(fhn fhnVar) {
        return (fhn) this.a.a(fhnVar);
    }

    public final boolean b(fho fhoVar) {
        fhoVar.getClass();
        return fhoVar == this || this.b == fhoVar;
    }
}
