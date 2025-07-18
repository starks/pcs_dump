package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class byr implements bkr {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ byr(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // defpackage.bkr
    public final void a(Object obj, Object obj2) {
        int i = this.b;
        if (i == 0) {
            int i2 = byw.a;
            ((bze) ((bzf) obj).t()).c(new byz((brb) obj2));
            return;
        }
        if (i == 1) {
            ((bmv) ((bmy) obj).t()).a((bmo) this.a);
            ((brb) obj2).D(null);
        } else if (i != 2) {
            int i3 = byw.a;
            ((bze) ((bzf) obj).t()).b(new bzb((brb) obj2), ((edg) this.a).toByteArray());
        } else {
            int i4 = byw.a;
            ((bze) ((bzf) obj).t()).a(new bzb((brb) obj2), (String) this.a);
        }
    }
}
