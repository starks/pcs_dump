package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class bwv implements crw {
    private final /* synthetic */ int a;

    @Override // defpackage.crw
    public final boolean a(Object obj) {
        int i = this.a;
        if (i == 0) {
            return true;
        }
        if (i == 1) {
            fwn fwnVar = (fwn) obj;
            return fwnVar.d() && !"Fallback-Cronet-Provider".equals(fwnVar.a());
        }
        if (i == 2) {
            return ((cco) obj).c == 4;
        }
        if (i == 3) {
            cco ccoVar = (cco) obj;
            return !(ccoVar.c == 13 ? (cci) ccoVar.d : cci.a).d.isEmpty();
        }
        if (i == 4) {
            cco ccoVar2 = (cco) obj;
            return !(ccoVar2.c == 13 ? (cci) ccoVar2.d : cci.a).g.isEmpty();
        }
        cco ccoVar3 = (cco) obj;
        if (ccoVar3.c != 13) {
            return false;
        }
        if (!((cci) ccoVar3.d).e.isEmpty()) {
            if ((ccoVar3.c == 13 ? (cci) ccoVar3.d : cci.a).d.isEmpty()) {
                if ((ccoVar3.c == 13 ? (cci) ccoVar3.d : cci.a).h.isEmpty()) {
                    return (ccoVar3.c == 13 ? (cci) ccoVar3.d : cci.a).g.isEmpty();
                }
                return false;
            }
        }
        return true;
    }
}
