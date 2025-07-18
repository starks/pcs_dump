package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class faq extends euk {
    final /* synthetic */ emk a;
    final /* synthetic */ ffh b;
    final /* synthetic */ String c;
    final /* synthetic */ faw d;
    final /* synthetic */ fam e;
    final /* synthetic */ dki f;
    final /* synthetic */ fbh g;
    final /* synthetic */ epc h;
    final /* synthetic */ far i;
    final /* synthetic */ ffh j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public faq(far farVar, emk emkVar, ffh ffhVar, ffh ffhVar2, String str, faw fawVar, fam famVar, dki dkiVar, fbh fbhVar, epc epcVar) {
        super(emkVar);
        this.a = emkVar;
        this.b = ffhVar;
        this.j = ffhVar2;
        this.c = str;
        this.d = fawVar;
        this.e = famVar;
        this.f = dkiVar;
        this.g = fbhVar;
        this.h = epcVar;
        this.i = farVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v7, types: [eqd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v6, types: [eqd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v9 */
    @Override // defpackage.euk
    public final void a() {
        int i = ffg.a;
        try {
            exo exoVarA = this.i.c.f.a(this.c);
            if (exoVarA == null) {
                enf enfVar = this.i.c.g;
                String str = this.c;
                this.d.c();
                exoVarA = enfVar.a(str);
            }
            if (exoVarA == null) {
                eqo eqoVarE = eqo.j.e("Method not found: " + this.c);
                this.e.g(fas.c);
                this.d.e(eqoVarE, new epc());
                this.a.j(null);
                this.f.cancel(false);
                return;
            }
            far farVar = this.i;
            faw fawVar = this.d;
            fbh fbhVar = this.g;
            fawVar.c();
            fjp[] fjpVarArr = fbhVar.b;
            if (fjpVarArr.length > 0) {
                fjp fjpVar = fjpVarArr[0];
                throw null;
            }
            Object obj = exoVarA.b;
            eqe[] eqeVarArr = farVar.c.i;
            int length = eqeVarArr.length;
            int i2 = 0;
            ?? r4 = obj;
            while (i2 < length) {
                eqf eqfVar = new eqf(eqeVarArr[i2], r4);
                i2++;
                r4 = eqfVar;
            }
            exo exoVar = new exo(exoVarA.a, (Object) r4, (byte[]) null);
            faw fawVar2 = this.d;
            epc epcVar = this.h;
            emk emkVar = this.a;
            ffh ffhVar = this.b;
            Object obj2 = exoVar.a;
            fas fasVar = this.i.c;
            this.f.d(new frj(new fag(fawVar2, (epg) obj2, epcVar, emkVar, fasVar.p, fasVar.s, ffhVar), (eqd) exoVar.b));
        } catch (Throwable th) {
            this.e.g(fas.c);
            this.d.e(eqo.c(th), new epc());
            this.a.j(null);
            this.f.cancel(false);
            throw th;
        }
    }
}
