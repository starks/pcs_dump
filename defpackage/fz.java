package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fz implements uz {
    int a;
    final /* synthetic */ ga b;
    private boolean c = false;

    protected fz(ga gaVar) {
        this.b = gaVar;
    }

    @Override // defpackage.uz
    public final void a() {
        if (this.c) {
            return;
        }
        ga gaVar = this.b;
        gaVar.f = null;
        super/*android.view.ViewGroup*/.setVisibility(this.a);
    }

    @Override // defpackage.uz
    public final void b() {
        super/*android.view.ViewGroup*/.setVisibility(0);
        this.c = false;
    }

    @Override // defpackage.uz
    public final void c() {
        this.c = true;
    }

    public final void d(fsc fscVar, int i) {
        this.b.f = fscVar;
        this.a = i;
    }
}
