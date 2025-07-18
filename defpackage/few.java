package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public class few extends fev {
    final /* synthetic */ fex a;

    protected few(fex fexVar) {
        this.a = fexVar;
    }

    @Override // defpackage.fev, defpackage.eoa
    public void f(emh emhVar, eog eogVar) {
        if (this.a.c == emh.SHUTDOWN) {
            return;
        }
        fex fexVar = this.a;
        fexVar.c = emhVar;
        fexVar.d = eogVar;
        fez fezVar = fexVar.e;
        if (fezVar.i) {
            return;
        }
        fezVar.g();
    }

    @Override // defpackage.fev
    protected final eoa g() {
        return this.a.e.h;
    }
}
