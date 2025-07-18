package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class dkn extends djw {
    final /* synthetic */ dkp a;
    private final dir b;

    public dkn(dkp dkpVar, dir dirVar) {
        this.a = dkpVar;
        this.b = dirVar;
    }

    @Override // defpackage.djw
    public final /* bridge */ /* synthetic */ Object a() {
        djy djyVarA = this.b.a();
        djyVarA.getClass();
        return djyVarA;
    }

    @Override // defpackage.djw
    public final String b() {
        return this.b.toString();
    }

    @Override // defpackage.djw
    public final void d(Throwable th) {
        this.a.e(th);
    }

    @Override // defpackage.djw
    public final /* bridge */ /* synthetic */ void e(Object obj) {
        this.a.f((djy) obj);
    }

    @Override // defpackage.djw
    public final boolean g() {
        return this.a.isDone();
    }
}
