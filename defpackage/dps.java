package defpackage;

import java.security.GeneralSecurityException;
import java.util.Arrays;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
final class dps implements dkw {
    private final fpv a;

    public dps(fpv fpvVar) throws GeneralSecurityException {
        this.a = fpvVar;
        if (fpvVar.f()) {
            drq.a.a();
            drl.a(fpvVar);
        }
    }

    @Override // defpackage.dkw
    public final byte[] a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (bArr.length > 5) {
            for (dsd dsdVar : this.a.e(Arrays.copyOfRange(bArr, 0, 5))) {
                try {
                    byte[] bArrA = ((dkw) dsdVar.a).a(bArr, bArr2);
                    int i = dsdVar.c;
                    int length = bArr.length;
                    return bArrA;
                } catch (GeneralSecurityException unused) {
                }
            }
        }
        Iterator it = this.a.e(dku.a).iterator();
        while (it.hasNext()) {
            dsd dsdVar2 = (dsd) it.next();
            try {
                byte[] bArrA2 = ((dkw) dsdVar2.a).a(bArr, bArr2);
                int i2 = dsdVar2.c;
                int length2 = bArr.length;
                return bArrA2;
            } catch (GeneralSecurityException unused2) {
            }
        }
        throw new GeneralSecurityException("decryption failed");
    }
}
