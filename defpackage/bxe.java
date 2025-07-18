package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class bxe implements bxg {
    public final /* synthetic */ bxh a;
    public final /* synthetic */ int b;
    private final /* synthetic */ int c;

    public /* synthetic */ bxe(bxh bxhVar, int i, int i2) {
        this.c = i2;
        this.a = bxhVar;
        this.b = i;
    }

    @Override // defpackage.bxg
    public final crv a(ccp ccpVar) {
        bxh bxhVar;
        boolean z = false;
        boolean zJ = true;
        if (this.c == 0) {
            asr asrVar = (asr) ccpVar.toBuilder();
            List<cco> arrayList = new ArrayList();
            int i = this.b;
            if (i == 0) {
                arrayList = bxh.q(asrVar, new bwv(0));
            } else if (i == 1) {
                arrayList = bxh.q(asrVar, new bwv(2));
            } else if (i == 2) {
                arrayList = bxh.q(asrVar, new bwv(3));
            } else if (i == 3) {
                arrayList = bxh.q(asrVar, new bwv(4));
            }
            Iterator it = arrayList.iterator();
            while (true) {
                bxhVar = this.a;
                if (!it.hasNext()) {
                    break;
                }
                bxhVar.f.b((cco) it.next());
            }
            for (cco ccoVar : arrayList) {
                if (ccoVar.c == 13) {
                    zJ &= bxhVar.j((cci) ccoVar.d);
                }
            }
            if (!zJ) {
                bxhVar.d.k(ccj.dt);
            }
            return new crv((ccp) asrVar.z(), Boolean.valueOf(zJ));
        }
        asr asrVar2 = (asr) ccpVar.toBuilder();
        cco ccoVarN = bxh.n(asrVar2, this.b);
        if (ccoVarN == null) {
            return new crv(ccpVar, null);
        }
        bxh bxhVar2 = this.a;
        if (!bxhVar2.c.aY(bxhVar2.b.getPackageName())) {
            bxhVar2.d.k(ccj.cN);
            z = true;
        }
        long millis = TimeUnit.SECONDS.toMillis(bxhVar2.c.W());
        long jA = bxhVar2.e.a();
        ehf ehfVar = ccoVarN.i;
        if (ehfVar == null) {
            ehfVar = ehf.a;
        }
        long jA2 = ehz.a(ehfVar);
        if (millis <= 0 || jA - jA2 <= millis) {
            zJ = z;
        } else {
            bxhVar2.d.k(ccj.cO);
        }
        if (ccoVarN.c == 13 && ((cci) ccoVarN.d).e.isEmpty()) {
            bxhVar2.d.k(ccj.cP);
        } else if (!zJ) {
            asr asrVar3 = (asr) ccoVarN.toBuilder();
            ehf ehfVarB = ehz.b(bxhVar2.e.a());
            if (!asrVar3.a.isMutable()) {
                asrVar3.B();
            }
            cco ccoVar2 = (cco) asrVar3.a;
            ehfVarB.getClass();
            ccoVar2.j = ehfVarB;
            ccoVar2.b |= 4;
            cco ccoVar3 = (cco) asrVar3.z();
            asrVar2.f(ccoVar3);
            return new crv((ccp) asrVar2.z(), ccoVar3);
        }
        return new crv((ccp) asrVar2.z(), null);
    }
}
