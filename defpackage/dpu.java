package defpackage;

import java.security.GeneralSecurityException;

/* compiled from: PG */
/* loaded from: classes.dex */
final class dpu implements dkx {
    final fpv a;

    public dpu(fpv fpvVar) throws GeneralSecurityException {
        this.a = fpvVar;
        if (fpvVar.f()) {
            drq.a.a();
            drl.a(fpvVar);
        }
    }

    @Override // defpackage.dkx
    public final byte[] a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        Object obj = this.a.d;
        if (obj == null) {
            throw new GeneralSecurityException("keyset without primary key");
        }
        byte[] bArrA = ((dkx) ((dsd) obj).a).a(bArr, bArr2);
        int i = ((dsd) this.a.d).c;
        int length = bArr.length;
        return bArrA;
    }
}
