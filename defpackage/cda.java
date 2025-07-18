package defpackage;

import com.google.android.libraries.micore.learning.training.util.StatusOr;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class cda implements dww {
    public final /* synthetic */ cdg a;
    public final /* synthetic */ byte[] b;
    public final /* synthetic */ byte[] c;

    public /* synthetic */ cda(cdg cdgVar, byte[] bArr, byte[] bArr2) {
        this.a = cdgVar;
        this.b = bArr;
        this.c = bArr2;
    }

    @Override // defpackage.dww, java.util.concurrent.Callable
    public final Object call() {
        StatusOr statusOr;
        final byte[] bArr = this.b;
        cdg cdgVar = this.a;
        Object obj = cdgVar.l;
        final byte[] bArr2 = this.c;
        synchronized (obj) {
            final ccu ccuVar = cdgVar.i;
            final dfa dfaVar = cdgVar.p;
            final long j = cdgVar.k;
            final byte[] bArr3 = cdgVar.m;
            statusOr = (StatusOr) ccuVar.e.R(new dww() { // from class: ccs
                @Override // defpackage.dww, java.util.concurrent.Callable
                public final Object call() {
                    byte[] bArr4 = bArr;
                    byte[] bArr5 = bArr2;
                    dfa dfaVar2 = dfaVar;
                    try {
                        ebs ebsVar = (ebs) efb.parseFrom(ebs.a, bArr4, een.a());
                        dzi dziVar = (dzi) efb.parseFrom(dzi.a, bArr5, een.a());
                        dzf dzfVar = dziVar.c;
                        if (dzfVar == null) {
                            dzfVar = dzf.a;
                        }
                        asr asrVar = (asr) dzfVar.toBuilder();
                        if (!asrVar.a.isMutable()) {
                            asrVar.B();
                        }
                        long j2 = j;
                        ccu ccuVar2 = ccuVar;
                        ((dzf) asrVar.a).d = j2;
                        if (ccuVar2.d) {
                            eea eeaVarR = eea.r(bArr3);
                            if (!asrVar.a.isMutable()) {
                                asrVar.B();
                            }
                            ((dzf) asrVar.a).e = eeaVarR;
                        }
                        asr asrVar2 = (asr) dziVar.toBuilder();
                        dzf dzfVar2 = (dzf) asrVar.z();
                        if (!asrVar2.a.isMutable()) {
                            asrVar2.B();
                        }
                        dzi dziVar2 = (dzi) asrVar2.a;
                        dzfVar2.getClass();
                        dziVar2.c = dzfVar2;
                        dziVar2.b |= 1;
                        try {
                            bxq bxqVarA = ccuVar2.a.a(ebsVar, (dzi) asrVar2.z(), dfaVar2);
                            synchronized (ccuVar2.b) {
                                ccuVar2.c.add(bxqVarA);
                            }
                            return new StatusOr(new cct(ccuVar2, bxqVarA), null);
                        } catch (ccq e) {
                            return new StatusOr(null, new cbw(3, e.getMessage()));
                        }
                    } catch (efp e2) {
                        throw new IllegalArgumentException(e2);
                    }
                }
            });
        }
        return statusOr;
    }
}
