package defpackage;

import com.google.android.gms.learning.dynamite.training.InAppTrainingServiceImpl;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bsv implements cdf {
    private final cbx a;
    private final String b;
    private final btw c;
    private final byte[] d;
    private final fuu e;

    public bsv(cbx cbxVar, fuu fuuVar, String str, btw btwVar, byte[] bArr) {
        this.a = cbxVar;
        this.e = fuuVar;
        this.b = str;
        this.c = btwVar;
        this.d = bArr;
    }

    @Override // defpackage.cdf
    public final boolean a(byte[] bArr) {
        try {
            dzl dzlVar = (dzl) efb.parseFrom(dzl.a, bArr, een.a());
            fuu fuuVar = this.e;
            dyf dyfVar = dzlVar.c;
            if (dyfVar == null) {
                dyfVar = dyf.a;
            }
            InAppTrainingServiceImpl inAppTrainingServiceImpl = (InAppTrainingServiceImpl) fuuVar.a;
            return new fpv(inAppTrainingServiceImpl.b, dyfVar, inAppTrainingServiceImpl.c, inAppTrainingServiceImpl.d, InAppTrainingServiceImpl.a).j(this.b, this.c, this.d, dzlVar.b) != 2;
        } catch (efp e) {
            this.a.f(e, "Cannot parse serialized TaskResultInfo.");
            throw new IllegalArgumentException(e);
        }
    }
}
