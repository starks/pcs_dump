package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public class aph implements elq, apg {
    @Override // defpackage.apg
    public /* synthetic */ void a(apd apdVar, feu feuVar) {
        throw null;
    }

    @Override // defpackage.elq
    public final exo b() {
        eqi eqiVar = api.a;
        if (eqiVar == null) {
            synchronized (api.class) {
                eqiVar = api.a;
                if (eqiVar == null) {
                    eqh eqhVar = new eqh("com.google.android.apps.miphone.astrea.fl.api.TrainingService");
                    eqhVar.a(api.a());
                    eqiVar = new eqi(eqhVar);
                    api.a = eqiVar;
                }
            }
        }
        return new fcy(eqiVar).d(api.a(), new fet(new asn(this, 1), false)).e();
    }
}
