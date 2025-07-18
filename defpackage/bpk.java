package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes.dex */
final class bpk implements bpp {
    private final /* synthetic */ int a;

    public bpk(int i) {
        this.a = i;
    }

    @Override // defpackage.bpp
    public final bpo a(Context context, String str, bpn bpnVar) {
        int iB;
        int i = -1;
        if (this.a != 0) {
            bpo bpoVar = new bpo();
            int iB2 = bpnVar.b(context, str, true);
            bpoVar.b = iB2;
            if (iB2 != 0) {
                bpoVar.c = 1;
                return bpoVar;
            }
            int iA = bpnVar.a(context, str);
            bpoVar.a = iA;
            if (iA != 0) {
                bpoVar.c = -1;
            }
            return bpoVar;
        }
        bpo bpoVar2 = new bpo();
        int iA2 = bpnVar.a(context, str);
        bpoVar2.a = iA2;
        if (iA2 != 0) {
            iB = bpnVar.b(context, str, false);
            bpoVar2.b = iB;
        } else {
            iB = bpnVar.b(context, str, true);
            bpoVar2.b = iB;
        }
        int i2 = bpoVar2.a;
        if (i2 == 0 && iB == 0) {
            i = 0;
        } else if (i2 < iB) {
            i = 1;
        }
        bpoVar2.c = i;
        return bpoVar2;
    }
}
