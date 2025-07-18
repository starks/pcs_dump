package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ayf implements elq, aye {
    @Override // defpackage.aye
    public /* synthetic */ void a(axq axqVar, feu feuVar) {
        throw null;
    }

    @Override // defpackage.elq
    public final exo b() {
        eqi eqiVar = ayg.a;
        if (eqiVar == null) {
            synchronized (ayg.class) {
                eqiVar = ayg.a;
                if (eqiVar == null) {
                    eqh eqhVar = new eqh("com.google.android.apps.miphone.astrea.pd.api.ProtectedDownloadService");
                    eqhVar.a(ayg.b());
                    eqhVar.a(ayg.c());
                    eqhVar.a(ayg.d());
                    eqhVar.a(ayg.a());
                    eqiVar = new eqi(eqhVar);
                    ayg.a = eqiVar;
                }
            }
        }
        return new fcy(eqiVar).d(ayg.b(), new fet(new bfc(this, 0, 1), false)).d(ayg.c(), new fet(new bfc(this, 1, 1), false)).d(ayg.d(), new fet(new bfc(this, 2, 1), false)).d(ayg.a(), new fet(new bfc(this, 3, 1), false)).e();
    }

    @Override // defpackage.aye
    public /* synthetic */ void c(axt axtVar, feu feuVar) {
        throw null;
    }

    @Override // defpackage.aye
    public /* synthetic */ void d(axv axvVar, feu feuVar) {
        throw null;
    }

    @Override // defpackage.aye
    public /* synthetic */ void e(axx axxVar, feu feuVar) {
        throw null;
    }
}
