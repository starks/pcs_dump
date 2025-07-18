package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public class bfd implements elq, bfb {
    @Override // defpackage.bfb
    public /* synthetic */ void a(bes besVar, feu feuVar) {
        throw null;
    }

    @Override // defpackage.elq
    public final exo b() {
        eqi eqiVar = bfe.a;
        if (eqiVar == null) {
            synchronized (bfe.class) {
                eqiVar = bfe.a;
                if (eqiVar == null) {
                    eqh eqhVar = new eqh("com.google.android.apps.miphone.astrea.survey.api.SurveyService");
                    eqhVar.a(bfe.a());
                    eqhVar.a(bfe.b());
                    eqiVar = new eqi(eqhVar);
                    bfe.a = eqiVar;
                }
            }
        }
        return new fcy(eqiVar).d(bfe.a(), new fet(new bfc(this, 0, 0), true)).d(bfe.b(), new fet(new bfc(this, 1, 0), true)).e();
    }

    @Override // defpackage.bfb
    public /* synthetic */ void c(ber berVar, feu feuVar) {
        throw null;
    }
}
