package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class erh implements faz {
    final /* synthetic */ eri a;
    private final faz b;

    public erh(eri eriVar, faz fazVar) {
        this.a = eriVar;
        this.b = fazVar;
    }

    @Override // defpackage.faz
    public final elp a(elp elpVar) {
        return this.b.a(elpVar);
    }

    @Override // defpackage.faz
    public final void b(faw fawVar, String str, epc epcVar) {
        this.b.b(fawVar, str, epcVar);
    }

    @Override // defpackage.faz
    public final void c() {
        this.b.c();
        synchronized (this.a) {
            r1.b--;
        }
    }
}
