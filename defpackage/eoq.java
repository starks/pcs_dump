package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class eoq implements eqk {
    private final /* synthetic */ int a;

    public eoq(int i) {
        this.a = i;
    }

    @Override // defpackage.eqk
    public final /* synthetic */ int a(Object obj) {
        int i = this.a;
        if (i == 0) {
            return ((eop) obj).a();
        }
        if (i != 1) {
            ((epp) obj).e();
            return 5;
        }
        ((eoj) obj).d();
        return 5;
    }

    @Override // defpackage.eqk
    public final /* synthetic */ void b(Object obj) {
        int i = this.a;
        if (i == 0) {
            ((eop) obj).c();
        } else if (i != 1) {
            ((epp) obj).d();
        } else {
            ((eoj) obj).e();
        }
    }
}
