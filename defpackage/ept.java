package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
abstract class ept extends fjp {
    public ept() {
        super((char[]) null);
    }

    protected abstract fjp g();

    public final String toString() {
        crt crtVarQ = clq.Q(this);
        crtVarQ.e("delegate", g());
        return crtVarQ.toString();
    }
}
