package defpackage;

import android.content.Context;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ach {
    public afb a;
    public final adz b;
    private final aci c;
    private final ade d;
    private final List e;

    public ach() {
    }

    private final void f() {
        int i = adc.c;
        afe afeVarD = d();
        if (afeVarD != null) {
            afeVarD.c(this.c.l == i);
        }
    }

    public final void a(ady adyVar) throws Exception {
        uq.k(adyVar, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        uq.k(adyVar, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '" + c().b + "')");
    }

    protected final aci b() {
        return this.c;
    }

    protected final ade c() {
        return this.d;
    }

    /* JADX WARN: Type inference failed for: r2v4, types: [afe, java.lang.Object] */
    public final afe d() {
        adz adzVar = this.b;
        if (!(adzVar instanceof adz)) {
            adzVar = null;
        }
        if (adzVar != null) {
            return adzVar.a.a;
        }
        return null;
    }

    protected final List e() {
        return this.e;
    }

    public ach(aci aciVar, ade adeVar) {
        this();
        this.c = aciVar;
        this.d = adeVar;
        this.e = aciVar.c;
        epl eplVar = new epl(aciVar.a);
        eplVar.a = aciVar.b;
        eplVar.c = new acy(this, adeVar.a);
        Object obj = eplVar.c;
        if (obj == null) {
            throw new IllegalArgumentException("Must set a callback to create the configuration.");
        }
        this.b = new adz(new fsc(ur.g(new afd((Context) eplVar.b, (String) eplVar.a, (afc) obj))));
        f();
    }

    public ach(aci aciVar, fiy fiyVar) {
        this();
        this.c = aciVar;
        this.d = new acx();
        this.e = aciVar.c;
        this.b = new adz(new fsc((afe) fiyVar.a(new aci(aciVar.a, aciVar.b, aciVar.m, aciVar.n, ffh.I(aciVar.c, new acz(new ada(this, 1))), aciVar.l, aciVar.d, aciVar.e, aciVar.f, aciVar.g, aciVar.h, aciVar.i, aciVar.j))));
        f();
    }
}
