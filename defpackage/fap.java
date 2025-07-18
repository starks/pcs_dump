package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fap extends euk {
    final /* synthetic */ emk a;
    final /* synthetic */ ffh b;
    final /* synthetic */ dki c;
    final /* synthetic */ String d;
    final /* synthetic */ epc e;
    final /* synthetic */ faw f;
    final /* synthetic */ fam g;
    final /* synthetic */ far h;
    final /* synthetic */ ffh i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fap(far farVar, emk emkVar, ffh ffhVar, ffh ffhVar2, dki dkiVar, String str, epc epcVar, faw fawVar, fam famVar) {
        super(emkVar);
        this.a = emkVar;
        this.i = ffhVar;
        this.b = ffhVar2;
        this.c = dkiVar;
        this.d = str;
        this.e = epcVar;
        this.f = fawVar;
        this.g = famVar;
        this.h = farVar;
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [eqd, java.lang.Object] */
    @Override // defpackage.euk
    public final void a() {
        int i = ffg.a;
        fax faxVar = fas.c;
        if (this.c.isCancelled()) {
            return;
        }
        try {
            frj frjVar = (frj) cnx.H(this.c);
            fjp fjpVarA = frjVar.b.a((eqc) frjVar.a, this.e);
            Object obj = frjVar.a;
            this.g.g(new faf((fag) obj, fjpVarA, ((fag) obj).c));
            this.a.d(new emj(this.f, 3), diy.a);
        } finally {
        }
    }
}
