package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class bwy implements crw {
    public final /* synthetic */ String a;
    private final /* synthetic */ int b;

    public /* synthetic */ bwy(String str, int i) {
        this.b = i;
        this.a = str;
    }

    @Override // defpackage.crw
    public final boolean a(Object obj) {
        int i = this.b;
        if (i == 0) {
            cco ccoVar = (cco) obj;
            return (ccoVar.c == 4 ? (ccg) ccoVar.d : ccg.a).c.equals(this.a);
        }
        if (i != 1) {
            return ((cco) obj).f.equals(this.a);
        }
        cco ccoVar2 = (cco) obj;
        return (ccoVar2.c == 13 ? (cci) ccoVar2.d : cci.a).e.equals(this.a);
    }
}
