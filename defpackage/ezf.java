package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ezf implements ezl {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public ezf(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v3, types: [eme, java.lang.Object] */
    @Override // defpackage.ezl
    public final void a(ezt eztVar) {
        int i = this.b;
        if (i == 0) {
            eztVar.a.j((ems) this.a);
        } else if (i != 1) {
            eztVar.a.m((emu) this.a);
        } else {
            eztVar.a.i(this.a);
        }
    }
}
