package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class eus extends euv {
    public final eod a;
    public volatile eqo b;
    final /* synthetic */ eut c;
    private final emr h = emr.l();
    private final emb[] i;

    public eus(eut eutVar, eod eodVar, emb[] embVarArr) {
        this.c = eutVar;
        this.a = eodVar;
        this.i = embVarArr;
    }

    static /* bridge */ /* synthetic */ Runnable a(eus eusVar, etz etzVar) {
        emr emrVarA = eusVar.h.a();
        try {
            eod eodVar = eusVar.a;
            etw etwVarA = etzVar.a(eodVar.c, eodVar.b, eodVar.a, eusVar.i);
            synchronized (eusVar) {
                if (eusVar.f == null) {
                    super.s(etwVarA);
                    ety etyVar = eusVar.e;
                    if (etyVar == null) {
                        eusVar.g = null;
                        eusVar.d = true;
                    }
                    if (etyVar != null) {
                        super.r(etyVar);
                        return new chg(eusVar, 16, null);
                    }
                }
            }
            return null;
        } finally {
            eusVar.h.f(emrVarA);
        }
    }

    @Override // defpackage.euv
    protected final void b() {
        int i = 0;
        while (true) {
            emb[] embVarArr = this.i;
            if (i >= embVarArr.length) {
                return;
            }
            emb embVar = embVarArr[i];
            i++;
        }
    }

    @Override // defpackage.euv, defpackage.etw
    public final void c(ewa ewaVar) {
        if (this.a.a.g()) {
            ewaVar.a("wait_for_ready");
            eqo eqoVar = this.b;
            if (eqoVar != null && !eqoVar.g()) {
                ewaVar.b("Last Pick Failure", eqoVar);
            }
        }
        super.c(ewaVar);
    }

    @Override // defpackage.euv, defpackage.etw
    public final void d(eqo eqoVar) {
        super.d(eqoVar);
        synchronized (this.c.a) {
            eut eutVar = this.c;
            if (eutVar.e != null) {
                boolean zRemove = eutVar.g.remove(this);
                if (!this.c.f() && zRemove) {
                    eut eutVar2 = this.c;
                    eutVar2.b.b(eutVar2.d);
                    if (this.c.h.a != null) {
                        eut eutVar3 = this.c;
                        eutVar3.b.b(eutVar3.e);
                        this.c.e = null;
                    }
                }
            }
        }
        this.c.b.a();
    }
}
