package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class dag extends daj {
    final /* synthetic */ daj a;
    final /* synthetic */ daj b;

    public dag(daj dajVar, daj dajVar2) {
        this.a = dajVar;
        this.b = dajVar2;
    }

    @Override // defpackage.daj
    public final void a() {
        try {
            this.a.a();
        } finally {
            this.b.a();
        }
    }
}
