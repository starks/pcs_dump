package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class bbm implements bbn {
    public final /* synthetic */ bbq a;
    public final /* synthetic */ efb b;
    private final /* synthetic */ int c;

    public /* synthetic */ bbm(bbq bbqVar, efb efbVar, int i) {
        this.c = i;
        this.a = bbqVar;
        this.b = efbVar;
    }

    @Override // defpackage.bbn
    public final String a(byte[] bArr) {
        if (this.c == 0) {
            axo axoVar = ((axv) this.b).b;
            if (axoVar == null) {
                axoVar = axo.a;
            }
            baw bawVarB = this.a.f.b(axoVar);
            int i = ded.b;
            dea deaVarD = deb.a.d();
            deaVarD.b(bawVarB.c.getBytes());
            deaVarD.b(bArr);
            for (bav bavVar : bawVarB.d) {
                deaVarD.b(bavVar.b.getBytes());
                deaVarD.b(bavVar.c.getBytes());
            }
            return det.e.h(deaVarD.l().e());
        }
        ayd aydVar = ((axt) this.b).b;
        if (aydVar == null) {
            aydVar = ayd.a;
        }
        bbq bbqVar = this.a;
        bcm bcmVarD = bbqVar.f.d(eea.r(bArr), aydVar);
        int i2 = ded.b;
        dea deaVarD2 = deb.a.d();
        bbx bbxVar = bcmVarD.c;
        if (bbxVar == null) {
            bbxVar = bbx.a;
        }
        deaVarD2.b(bbxVar.c.getBytes());
        bbx bbxVar2 = bcmVarD.c;
        if (bbxVar2 == null) {
            bbxVar2 = bbx.a;
        }
        deaVarD2.b(bbxVar2.e.getBytes());
        deaVarD2.b(bArr);
        bbx bbxVar3 = bcmVarD.c;
        if (bbxVar3 == null) {
            bbxVar3 = bbx.a;
        }
        for (bcj bcjVar : bbxVar3.d) {
            deaVarD2.b(bcjVar.b.getBytes());
            deaVarD2.b(bcjVar.c.getBytes());
        }
        return det.e.h(deaVarD2.l().e());
    }
}
