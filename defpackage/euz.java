package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class euz implements Runnable {
    final /* synthetic */ boolean a;
    final /* synthetic */ eva b;

    public euz(eva evaVar, boolean z) {
        this.a = z;
        this.b = evaVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.a) {
            evd evdVar = this.b.a;
            evdVar.p = true;
            if (evdVar.l > 0) {
                csf csfVar = evdVar.o;
                csfVar.c();
                csfVar.d();
            }
        }
        this.b.a.q = false;
    }
}
