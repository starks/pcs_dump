package defpackage;

import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class enh {
    public Object a;
    public Object b;
    public Object c;
    public Object d;

    public enh() {
    }

    /* JADX WARN: Type inference failed for: r7v0, types: [enu, java.lang.Object] */
    public final enj a() {
        this.a.getClass();
        this.b.getClass();
        this.c.getClass();
        clq.G(true, "at least one of channelRef and subchannelRef must be null");
        Object obj = this.a;
        return new enj((String) obj, (eni) this.b, ((Long) this.c).longValue(), this.d);
    }

    public final void b(long j) {
        this.c = Long.valueOf(j);
    }

    public final eng c() {
        Object obj = this.d;
        Object obj2 = this.c;
        return new eng((SocketAddress) obj, (InetSocketAddress) obj2, (String) this.a, (String) this.b);
    }

    public final void d(SocketAddress socketAddress) {
        socketAddress.getClass();
        this.d = socketAddress;
    }

    public final void e(InetSocketAddress inetSocketAddress) {
        inetSocketAddress.getClass();
        this.c = inetSocketAddress;
    }

    public final dtb f() throws GeneralSecurityException {
        Object obj = this.c;
        if (obj == null) {
            throw new GeneralSecurityException("key size is not set");
        }
        if (this.d == null) {
            throw new GeneralSecurityException("tag size is not set");
        }
        if (this.b == null) {
            throw new GeneralSecurityException("hash type is not set");
        }
        if (this.a == null) {
            throw new GeneralSecurityException("variant is not set");
        }
        if (((Integer) obj).intValue() < 16) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size in bytes %d; must be at least 16 bytes", this.c));
        }
        Integer num = (Integer) this.d;
        int iIntValue = num.intValue();
        Object obj2 = this.b;
        if (iIntValue < 10) {
            throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; must be at least 10 bytes", num));
        }
        if (obj2 == dsz.a) {
            if (iIntValue > 20) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 20 bytes for SHA1", num));
            }
        } else if (obj2 == dsz.b) {
            if (iIntValue > 28) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 28 bytes for SHA224", num));
            }
        } else if (obj2 == dsz.c) {
            if (iIntValue > 32) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 32 bytes for SHA256", num));
            }
        } else if (obj2 == dsz.d) {
            if (iIntValue > 48) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 48 bytes for SHA384", num));
            }
        } else {
            if (obj2 != dsz.e) {
                throw new GeneralSecurityException("unknown hash type; must be SHA256, SHA384 or SHA512");
            }
            if (iIntValue > 64) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 64 bytes for SHA512", num));
            }
        }
        return new dtb(((Integer) this.c).intValue(), ((Integer) this.d).intValue(), (dta) this.a, (dsz) this.b);
    }

    public final void g(int i) {
        this.c = Integer.valueOf(i);
    }

    public final void h(int i) {
        this.d = Integer.valueOf(i);
    }

    public final dpn i() throws GeneralSecurityException {
        Object obj = this.d;
        if (obj == null) {
            throw new GeneralSecurityException("HPKE KEM parameter is not set");
        }
        Object obj2 = this.b;
        if (obj2 == null) {
            throw new GeneralSecurityException("HPKE KDF parameter is not set");
        }
        Object obj3 = this.a;
        if (obj3 == null) {
            throw new GeneralSecurityException("HPKE AEAD parameter is not set");
        }
        Object obj4 = this.c;
        if (obj4 == null) {
            throw new GeneralSecurityException("HPKE variant is not set");
        }
        return new dpn((dpl) obj, (dpk) obj2, (dpi) obj3, (dpm) obj4);
    }

    public final dmh j() throws GeneralSecurityException {
        Object obj = this.b;
        if (obj == null) {
            throw new GeneralSecurityException("Key size is not set");
        }
        if (this.c == null) {
            throw new GeneralSecurityException("Variant is not set");
        }
        if (this.a == null) {
            throw new GeneralSecurityException("IV size is not set");
        }
        if (this.d == null) {
            throw new GeneralSecurityException("Tag size is not set");
        }
        int iIntValue = ((Integer) obj).intValue();
        ((Integer) this.a).intValue();
        ((Integer) this.d).intValue();
        return new dmh(iIntValue, 12, 16, (dmg) this.c);
    }

    public final void k() {
        this.a = 12;
    }

    public final void l(int i) throws InvalidAlgorithmParameterException {
        if (i != 16 && i != 24 && i != 32) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte, 24-byte and 32-byte AES keys are supported", Integer.valueOf(i)));
        }
        this.b = Integer.valueOf(i);
    }

    public final void m() {
        this.d = 16;
    }

    public final dmc n() throws GeneralSecurityException {
        Object obj = this.b;
        if (obj == null) {
            throw new GeneralSecurityException("Key size is not set");
        }
        if (this.a == null) {
            throw new GeneralSecurityException("IV size is not set");
        }
        if (this.d == null) {
            throw new GeneralSecurityException("Variant is not set");
        }
        if (this.c == null) {
            throw new GeneralSecurityException("Tag size is not set");
        }
        int iIntValue = ((Integer) obj).intValue();
        int iIntValue2 = ((Integer) this.a).intValue();
        ((Integer) this.c).intValue();
        return new dmc(iIntValue, iIntValue2, 16, (dmb) this.d);
    }

    public final void o(int i) throws GeneralSecurityException {
        if (i != 12 && i != 16) {
            throw new GeneralSecurityException(String.format("Invalid IV size in bytes %d; acceptable values have 12 or 16 bytes", Integer.valueOf(i)));
        }
        this.a = Integer.valueOf(i);
    }

    public final void p(int i) throws InvalidAlgorithmParameterException {
        if (i != 16 && i != 24 && i != 32) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte, 24-byte and 32-byte AES keys are supported", Integer.valueOf(i)));
        }
        this.b = Integer.valueOf(i);
    }

    public final void q() {
        this.c = 16;
    }

    public final dls r() throws GeneralSecurityException {
        dwt dwtVarB;
        Object obj = this.d;
        if (obj == null) {
            throw new GeneralSecurityException("Cannot build without parameters");
        }
        Object obj2 = this.a;
        if (obj2 == null || this.b == null) {
            throw new GeneralSecurityException("Cannot build without key material");
        }
        if (((dlx) obj).a != ((fsc) obj2).T()) {
            throw new GeneralSecurityException("AES key size mismatch");
        }
        if (((dlx) this.d).b != ((fsc) this.b).T()) {
            throw new GeneralSecurityException("HMAC key size mismatch");
        }
        if (((dlx) this.d).a() && this.c == null) {
            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        }
        if (!((dlx) this.d).a() && this.c != null) {
            throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
        dlw dlwVar = ((dlx) this.d).e;
        if (dlwVar == dlw.c) {
            dwtVarB = dru.a;
        } else if (dlwVar == dlw.b) {
            dwtVarB = dru.a(((Integer) this.c).intValue());
        } else {
            if (dlwVar != dlw.a) {
                throw new IllegalStateException("Unknown AesCtrHmacAeadParameters.Variant: ".concat(String.valueOf(String.valueOf(dlwVar))));
            }
            dwtVarB = dru.b(((Integer) this.c).intValue());
        }
        dwt dwtVar = dwtVarB;
        Object obj3 = this.d;
        Object obj4 = this.a;
        fsc fscVar = (fsc) obj4;
        return new dls((dlx) obj3, fscVar, (fsc) this.b, dwtVar, (Integer) this.c);
    }

    public enh(byte[] bArr, byte[] bArr2) {
        this.c = null;
        this.d = null;
        this.b = null;
        this.a = dta.d;
    }

    public enh(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.b = null;
        this.a = null;
        this.c = null;
        this.d = dmb.c;
    }

    public enh(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        this.d = null;
        this.a = null;
        this.b = null;
        this.c = null;
    }

    public enh(char[] cArr) {
        this.d = null;
        this.b = null;
        this.a = null;
        this.c = dpm.c;
    }

    public enh(char[] cArr, byte[] bArr) {
        this.b = null;
        this.a = null;
        this.d = null;
        this.c = dmg.c;
    }
}
