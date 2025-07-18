package defpackage;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.util.Arrays;
import javax.crypto.AEADBadTagException;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: PG */
/* loaded from: classes.dex */
final class dqb implements dqc {
    private final int a;
    private final /* synthetic */ int b;
    private final dli c;

    public dqb(dlx dlxVar, int i) {
        this.b = i;
        this.c = dlxVar;
        this.a = dlxVar.a + dlxVar.b;
    }

    private final dkv d(byte[] bArr) {
        euw euwVar = new euw((char[]) null);
        euwVar.c = this.c;
        euwVar.a = fsc.az(bArr);
        return dwb.a(euwVar.g());
    }

    private final dks e(byte[] bArr) {
        byte[] bArrCopyOf = Arrays.copyOf(bArr, ((dlx) this.c).a);
        dlx dlxVar = (dlx) this.c;
        int i = dlxVar.b;
        int i2 = dlxVar.a;
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, i2, i + i2);
        enh enhVar = new enh(null, null, null, null);
        enhVar.d = this.c;
        enhVar.a = fsc.az(bArrCopyOf);
        enhVar.b = fsc.az(bArrCopyOfRange);
        return dwg.c(enhVar.r());
    }

    @Override // defpackage.dqc
    public final int a() {
        int i = this.b;
        return this.a;
    }

    @Override // defpackage.dqc
    public final byte[] b(byte[] bArr, byte[] bArr2, int i) throws GeneralSecurityException {
        if (this.b == 0) {
            int length = bArr2.length;
            if (length < i) {
                throw new GeneralSecurityException("ciphertext too short");
            }
            byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr2, i, length);
            dkv dkvVarD = d(bArr);
            byte[] bArr3 = dqd.a;
            int length2 = bArrCopyOfRange.length;
            dwb dwbVar = (dwb) dkvVarD;
            byte[] bArr4 = dwbVar.c;
            if (length2 < bArr4.length + 16) {
                throw new GeneralSecurityException("Ciphertext too short.");
            }
            if (!dsp.c(bArr4, bArrCopyOfRange)) {
                throw new GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
            }
            Cipher cipher = (Cipher) dwb.a.get();
            int length3 = dwbVar.c.length;
            byte[] bArrCopyOfRange2 = Arrays.copyOfRange(bArrCopyOfRange, length3, length3 + 16);
            byte[] bArr5 = (byte[]) bArrCopyOfRange2.clone();
            bArr5[8] = (byte) (bArr5[8] & Byte.MAX_VALUE);
            bArr5[12] = (byte) (bArr5[12] & Byte.MAX_VALUE);
            cipher.init(2, new SecretKeySpec(dwbVar.b, "AES"), new IvParameterSpec(bArr5));
            int length4 = dwbVar.c.length + 16;
            int i2 = length2 - length4;
            byte[] bArrDoFinal = cipher.doFinal(bArrCopyOfRange, length4, i2);
            if (i2 == 0 && bArrDoFinal == null && dcr.V()) {
                bArrDoFinal = new byte[0];
            }
            if (MessageDigest.isEqual(bArrCopyOfRange2, dwbVar.b(bArr3, bArrDoFinal))) {
                return bArrDoFinal;
            }
            throw new AEADBadTagException("Integrity check failed.");
        }
        int length5 = bArr2.length;
        if (length5 < i) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        byte[] bArrCopyOfRange3 = Arrays.copyOfRange(bArr2, i, length5);
        dks dksVarE = e(bArr);
        byte[] bArr6 = dqd.a;
        int length6 = bArrCopyOfRange3.length;
        dwg dwgVar = (dwg) dksVarE;
        int i3 = dwgVar.c;
        byte[] bArr7 = dwgVar.d;
        if (length6 < i3 + bArr7.length) {
            throw new GeneralSecurityException("Decryption failed (ciphertext too short).");
        }
        if (!dsp.c(bArr7, bArrCopyOfRange3)) {
            throw new GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
        }
        byte[] bArr8 = dwgVar.d;
        byte[] bArrCopyOfRange4 = Arrays.copyOfRange(bArrCopyOfRange3, bArr8.length, length6 - dwgVar.c);
        byte[] bArrCopyOfRange5 = Arrays.copyOfRange(bArrCopyOfRange3, length6 - dwgVar.c, length6);
        byte[] bArrCopyOf = Arrays.copyOf(ByteBuffer.allocate(8).putLong(0L).array(), 8);
        if (!MessageDigest.isEqual(((dwr) dwgVar.b).a(dcr.al(bArr6, bArrCopyOfRange4, bArrCopyOf)), bArrCopyOfRange5)) {
            throw new GeneralSecurityException("invalid MAC");
        }
        dwm dwmVar = dwgVar.a;
        int length7 = bArrCopyOfRange4.length;
        dvv dvvVar = (dvv) dwmVar;
        int i4 = dvvVar.a;
        if (length7 < i4) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        byte[] bArr9 = new byte[i4];
        System.arraycopy(bArrCopyOfRange4, 0, bArr9, 0, i4);
        int i5 = dvvVar.a;
        int i6 = length7 - i5;
        byte[] bArr10 = new byte[i6];
        dvvVar.a(bArrCopyOfRange4, i5, i6, bArr10, 0, bArr9, false);
        return bArr10;
    }

    @Override // defpackage.dqc
    public final byte[] c(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) throws GeneralSecurityException {
        if (this.b != 0) {
            dwg dwgVar = (dwg) e(bArr);
            dvv dvvVar = (dvv) dwgVar.a;
            int i = dvvVar.a;
            byte[] bArr5 = dqd.a;
            int length = bArr4.length;
            if (length > Integer.MAX_VALUE - i) {
                throw new GeneralSecurityException("plaintext length can not exceed " + (Integer.MAX_VALUE - dvvVar.a));
            }
            byte[] bArr6 = new byte[i + length];
            byte[] bArrB = dsi.b(i);
            System.arraycopy(bArrB, 0, bArr6, 0, dvvVar.a);
            dvvVar.a(bArr4, 0, length, bArr6, dvvVar.a, bArrB, true);
            return dcr.al(bArr2, bArr3, dcr.al(dwgVar.d, bArr6, dwgVar.b.a(dcr.al(bArr5, bArr6, Arrays.copyOf(ByteBuffer.allocate(8).putLong(0L).array(), 8)))));
        }
        dwb dwbVar = (dwb) d(bArr);
        byte[] bArr7 = dwbVar.c;
        byte[] bArr8 = dqd.a;
        int length2 = bArr4.length;
        if (length2 > 2147483631 - bArr7.length) {
            throw new GeneralSecurityException("plaintext too long");
        }
        Cipher cipher = (Cipher) dwb.a.get();
        byte[] bArrB2 = dwbVar.b(bArr8, bArr4);
        byte[] bArr9 = (byte[]) bArrB2.clone();
        bArr9[8] = (byte) (bArr9[8] & Byte.MAX_VALUE);
        bArr9[12] = (byte) (bArr9[12] & Byte.MAX_VALUE);
        cipher.init(1, new SecretKeySpec(dwbVar.b, "AES"), new IvParameterSpec(bArr9));
        byte[] bArr10 = dwbVar.c;
        int length3 = bArrB2.length;
        int length4 = bArr10.length;
        byte[] bArrCopyOf = Arrays.copyOf(bArr10, length4 + length3 + length2);
        System.arraycopy(bArrB2, 0, bArrCopyOf, length4, length3);
        if (cipher.doFinal(bArr4, 0, length2, bArrCopyOf, dwbVar.c.length + length3) == length2) {
            return dcr.al(bArr2, bArr3, bArrCopyOf);
        }
        throw new GeneralSecurityException("not enough data written");
    }

    public dqb(dot dotVar, int i) {
        this.b = i;
        this.c = dotVar;
        this.a = dotVar.a;
    }
}
