package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class fhz extends fhx {
    private final fhq a;
    public transient fhk l;

    public fhz(fhk fhkVar) {
        this(fhkVar, fhkVar != null ? fhkVar.d() : null);
    }

    @Override // defpackage.fhk
    public final fhq d() {
        fhq fhqVar = this.a;
        fhqVar.getClass();
        return fhqVar;
    }

    @Override // defpackage.fhx
    protected final void h() {
        fhk fhkVar = this.l;
        if (fhkVar != null && fhkVar != this) {
            fhn fhnVar = d().get(fhm.a);
            fhnVar.getClass();
            ((fhm) fhnVar).b(fhkVar);
        }
        this.l = fhy.a;
    }

    public fhz(fhk fhkVar, fhq fhqVar) {
        super(fhkVar);
        this.a = fhqVar;
    }
}
