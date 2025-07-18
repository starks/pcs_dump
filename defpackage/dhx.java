package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class dhx implements Runnable {
    final dif a;
    final djy b;

    public dhx(dif difVar, djy djyVar) {
        this.a = difVar;
        this.b = djyVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        dhr dhrVar = dif.f;
        if (this.a.value != this) {
            return;
        }
        djy djyVar = this.b;
        if (dif.f.f(this.a, this, dif.k(djyVar))) {
            dif.m(this.a, false);
        }
    }
}
