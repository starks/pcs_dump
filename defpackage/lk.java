package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class lk extends va {
    final /* synthetic */ int a;
    final /* synthetic */ ll b;
    private boolean c = false;

    public lk(ll llVar, int i) {
        this.b = llVar;
        this.a = i;
    }

    @Override // defpackage.va, defpackage.uz
    public final void a() {
        if (this.c) {
            return;
        }
        ll llVar = this.b;
        llVar.a.setVisibility(this.a);
    }

    @Override // defpackage.va, defpackage.uz
    public final void b() {
        this.b.a.setVisibility(0);
    }

    @Override // defpackage.va, defpackage.uz
    public final void c() {
        this.c = true;
    }
}
