package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class evg extends eyf {
    private boolean b;
    private final eqo c;
    private final etx d;
    private final emb[] e;

    public evg(eqo eqoVar, etx etxVar, emb[] embVarArr) {
        clq.w(!eqoVar.g(), "error must not be OK");
        this.c = eqoVar;
        this.d = etxVar;
        this.e = embVarArr;
    }

    @Override // defpackage.eyf, defpackage.etw
    public final void c(ewa ewaVar) {
        ewaVar.b("error", this.c);
        ewaVar.b("progress", this.d);
    }

    @Override // defpackage.eyf, defpackage.etw
    public final void p(ety etyVar) {
        clq.G(!this.b, "already started");
        this.b = true;
        int i = 0;
        while (true) {
            emb[] embVarArr = this.e;
            if (i >= embVarArr.length) {
                etyVar.a(this.c, this.d, new epc());
                return;
            } else {
                emb embVar = embVarArr[i];
                i++;
            }
        }
    }

    public evg(eqo eqoVar, emb[] embVarArr) {
        this(eqoVar, etx.PROCESSED, embVarArr);
    }
}
