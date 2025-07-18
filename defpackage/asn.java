package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class asn implements fer {
    private final /* synthetic */ int a;
    private final Object b;

    public asn(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [asl, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v2, types: [apg, bde, java.lang.Object] */
    @Override // defpackage.fer
    public final void a(Object obj, feu feuVar) {
        int i = this.a;
        if (i == 0) {
            this.b.a((asi) obj, feuVar);
            return;
        }
        ?? r2 = this.b;
        if (i != 1) {
            r2.a((bdc) obj, feuVar);
        } else {
            r2.a((apd) obj, feuVar);
        }
    }
}
