package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class cbn implements cab {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ cbn(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // defpackage.cab
    public final void a(cag cagVar) {
        if (this.b != 0) {
            ((bpb) this.a).close();
            return;
        }
        boolean z = ((cal) cagVar).c;
        Object obj = this.a;
        if (z) {
            ((dif) obj).cancel(false);
            return;
        }
        if (cagVar.e()) {
            ((cbo) obj).d(cagVar.c());
        } else {
            Exception excB = cagVar.b();
            if (excB == null) {
                throw new IllegalStateException();
            }
            ((cbo) obj).e(excB);
        }
    }
}
