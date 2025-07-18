package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cl implements mo {
    final /* synthetic */ lx a;
    private final /* synthetic */ int b;

    public cl(ae aeVar, int i, byte[] bArr) {
        this.b = i;
        this.a = aeVar;
    }

    @Override // defpackage.mo
    public final void a(Context context) {
        int i = this.b;
        if (i == 0) {
            cp cpVarQ = ((cm) this.a).q();
            cpVarQ.e();
            this.a.aj().af("androidx:appcompat");
            cpVarQ.p();
            return;
        }
        if (i == 1) {
            Object obj = ((ae) this.a).e.a;
            aj ajVar = (aj) obj;
            ajVar.e.l(ajVar, (ag) obj, null);
            return;
        }
        if (i == 2) {
            lx.z(this.a);
            return;
        }
        if (i == 3) {
            ((awa) this.a).B();
            return;
        }
        if (i == 4) {
            ((awb) this.a).B();
            return;
        }
        if (i != 5) {
            ((bfo) this.a).C();
            return;
        }
        lx lxVar = this.a;
        bdt bdtVar = (bdt) lxVar;
        if (bdtVar.j) {
            return;
        }
        bdtVar.j = true;
        bdtVar.aS();
    }

    public /* synthetic */ cl(lx lxVar, int i) {
        this.b = i;
        this.a = lxVar;
    }
}
