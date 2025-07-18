package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public class bdf implements elq, bde {
    @Override // defpackage.bde
    public /* synthetic */ void a(bdc bdcVar, feu feuVar) {
        throw null;
    }

    @Override // defpackage.elq
    public final exo b() {
        eqi eqiVar = bdg.a;
        if (eqiVar == null) {
            synchronized (bdg.class) {
                eqiVar = bdg.a;
                if (eqiVar == null) {
                    eqh eqhVar = new eqh("com.google.android.apps.miphone.astrea.pir.api.PirService");
                    eqhVar.a(bdg.a());
                    eqiVar = new eqi(eqhVar);
                    bdg.a = eqiVar;
                }
            }
        }
        return new fcy(eqiVar).d(bdg.a(), new fet(new asn(this, 2), true)).e();
    }
}
