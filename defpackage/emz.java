package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class emz extends fjp {
    protected emz() {
        super((char[]) null);
    }

    public abstract fjp a();

    @Override // defpackage.fjp
    public final fjp b(eqe eqeVar) {
        ((fau) a()).c.add(eqeVar);
        return this;
    }

    public final String toString() {
        crt crtVarQ = clq.Q(this);
        crtVarQ.e("delegate", a());
        return crtVarQ.toString();
    }
}
