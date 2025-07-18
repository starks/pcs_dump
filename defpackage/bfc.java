package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bfc implements fer {
    private final int a;
    private final /* synthetic */ int b;
    private final Object c;

    public bfc(Object obj, int i, int i2) {
        this.b = i2;
        this.c = obj;
        this.a = i;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [bfb, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v2, types: [bfb, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v3, types: [aye, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v4, types: [aye, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v5, types: [aye, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v6, types: [aye, java.lang.Object] */
    @Override // defpackage.fer
    public final void a(Object obj, feu feuVar) {
        if (this.b == 0) {
            if (this.a != 0) {
                this.c.c((ber) obj, feuVar);
                return;
            } else {
                this.c.a((bes) obj, feuVar);
                return;
            }
        }
        int i = this.a;
        if (i == 0) {
            this.c.c((axt) obj, feuVar);
            return;
        }
        if (i == 1) {
            this.c.d((axv) obj, feuVar);
        } else if (i != 2) {
            this.c.a((axq) obj, feuVar);
        } else {
            this.c.e((axx) obj, feuVar);
        }
    }
}
