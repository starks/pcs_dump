package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class ciw implements dis {
    private final /* synthetic */ int a;

    public /* synthetic */ ciw(int i) {
        this.a = i;
    }

    @Override // defpackage.dis
    public final djy a(Object obj) {
        if (this.a == 0) {
            return cnx.C("");
        }
        bix bixVar = (bix) obj;
        throw new cfe(bixVar.a(), bixVar.getMessage(), bixVar);
    }
}
