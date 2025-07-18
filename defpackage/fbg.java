package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fbg implements eyg {
    private final /* synthetic */ int a;
    private final Object b;

    public fbg(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [fbe, java.lang.Object] */
    @Override // defpackage.eyg
    public final Object a() {
        int i = this.a;
        ?? r1 = this.b;
        return i != 0 ? r1 : fbf.a.a(r1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [fbe, java.lang.Object] */
    @Override // defpackage.eyg
    public final void b(Object obj) throws Throwable {
        if (this.a != 0) {
            return;
        }
        fbf.a.c(this.b, obj);
    }
}
