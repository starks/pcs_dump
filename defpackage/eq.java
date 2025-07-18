package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class eq extends va {
    final /* synthetic */ er a;
    private boolean b = false;
    private int c = 0;

    public eq(er erVar) {
        this.a = erVar;
    }

    @Override // defpackage.va, defpackage.uz
    public final void a() {
        int i = this.c + 1;
        this.c = i;
        if (i == this.a.a.size()) {
            uz uzVar = this.a.b;
            if (uzVar != null) {
                uzVar.a();
            }
            this.c = 0;
            this.b = false;
            this.a.c = false;
        }
    }

    @Override // defpackage.va, defpackage.uz
    public final void b() {
        if (this.b) {
            return;
        }
        this.b = true;
        uz uzVar = this.a.b;
        if (uzVar != null) {
            uzVar.b();
        }
    }
}
