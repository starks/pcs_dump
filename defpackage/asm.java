package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public class asm implements elq, asl {
    @Override // defpackage.asl
    public /* synthetic */ void a(asi asiVar, feu feuVar) {
        throw null;
    }

    @Override // defpackage.elq
    public final exo b() {
        eqi eqiVar = aso.a;
        if (eqiVar == null) {
            synchronized (aso.class) {
                eqiVar = aso.a;
                if (eqiVar == null) {
                    eqh eqhVar = new eqh("com.google.android.apps.miphone.astrea.http.api.HttpService");
                    eqhVar.a(aso.a());
                    eqiVar = new eqi(eqhVar);
                    aso.a = eqiVar;
                }
            }
        }
        return new fcy(eqiVar).d(aso.a(), new fet(new asn(this, 0), true)).e();
    }
}
