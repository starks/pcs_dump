package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class drg extends dky {
    private final dsf a;

    public drg(dsf dsfVar, dln dlnVar) {
        c(dsfVar);
        this.a = dsfVar;
    }

    private static void c(dsf dsfVar) {
        int i = drf.b[dsfVar.d.ordinal()];
    }

    @Override // defpackage.dky
    public final Integer a() {
        return this.a.f;
    }

    public final dsf b(dln dlnVar) {
        c(this.a);
        return this.a;
    }
}
