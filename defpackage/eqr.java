package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public class eqr extends RuntimeException {
    private static final long serialVersionUID = 1950934672280720624L;
    public final eqo a;
    public final epc b;

    public eqr(eqo eqoVar) {
        this(eqoVar, null);
    }

    public eqr(eqo eqoVar, epc epcVar) {
        super(eqo.f(eqoVar), eqoVar.q);
        this.a = eqoVar;
        this.b = epcVar;
    }
}
