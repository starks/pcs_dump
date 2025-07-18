package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class bys implements bkr {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ bys(bhc bhcVar, bgy bgyVar, int i) {
        this.c = i;
        this.b = bhcVar;
        this.a = bgyVar;
    }

    @Override // defpackage.bkr
    public final void a(Object obj, Object obj2) {
        int i = this.c;
        if (i == 0) {
            int i2 = byw.a;
            ((bze) ((bzf) obj).t()).f(new bzb((brb) obj2), (String) this.a, (String) this.b);
            return;
        }
        if (i == 1) {
            int i3 = bhc.a;
            ((bhi) ((bhd) obj).t()).a(new bha((brb) obj2), (bgy) this.a);
            return;
        }
        int i4 = byw.a;
        bzb bzbVar = new bzb((brb) obj2);
        ((bze) ((bzf) obj).t()).a(bzbVar, "CURRENT:" + ((String) this.b) + ":" + ((String) this.a));
    }

    public /* synthetic */ bys(String str, int i) {
        this.c = i;
        this.a = str;
        this.b = "";
    }

    public /* synthetic */ bys(String str, String str2, int i) {
        this.c = i;
        this.a = str;
        this.b = str2;
    }
}
