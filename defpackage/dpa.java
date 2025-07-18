package defpackage;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dpa {
    public Object a;
    public Object b;
    public Object c;
    public Object d;
    public Object e;
    public Object f;

    public dpa() {
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = dpe.c;
        this.f = null;
    }

    public final dpf a() throws GeneralSecurityException {
        Object obj = this.a;
        if (obj == null) {
            throw new GeneralSecurityException("Elliptic curve type is not set");
        }
        if (this.b == null) {
            throw new GeneralSecurityException("Hash type is not set");
        }
        if (this.d == null) {
            throw new GeneralSecurityException("DEM parameters are not set");
        }
        if (this.e == null) {
            throw new GeneralSecurityException("Variant is not set");
        }
        dpb dpbVar = dpb.d;
        if (obj != dpbVar && this.c == null) {
            throw new GeneralSecurityException("Point format is not set");
        }
        if (obj == dpbVar && this.c != null) {
            throw new GeneralSecurityException("For Curve25519 point format must not be set");
        }
        Object obj2 = this.a;
        Object obj3 = this.b;
        Object obj4 = this.c;
        Object obj5 = this.d;
        dli dliVar = (dli) obj5;
        dpd dpdVar = (dpd) obj4;
        dpc dpcVar = (dpc) obj3;
        return new dpf((dpb) obj2, dpcVar, dpdVar, dliVar, (dpe) this.e, (dwt) this.f);
    }

    public final void b(dli dliVar) throws GeneralSecurityException {
        if (!dpf.a.contains(dliVar)) {
            throw new GeneralSecurityException(a.H(dliVar, "Invalid DEM parameters ", "; only AES128_GCM_RAW, AES256_GCM_RAW, AES128_CTR_HMAC_SHA256_RAW, AES256_CTR_HMAC_SHA256_RAW XCHACHA20_POLY1305_RAW and AES256_SIV_RAW are currently supported."));
        }
        this.d = dliVar;
    }

    public final dlx c() throws GeneralSecurityException {
        if (this.d == null) {
            throw new GeneralSecurityException("AES key size is not set");
        }
        if (this.b == null) {
            throw new GeneralSecurityException("HMAC key size is not set");
        }
        if (this.c == null) {
            throw new GeneralSecurityException("iv size is not set");
        }
        Object obj = this.e;
        if (obj == null) {
            throw new GeneralSecurityException("tag size is not set");
        }
        if (this.a == null) {
            throw new GeneralSecurityException("hash type is not set");
        }
        if (this.f == null) {
            throw new GeneralSecurityException("variant is not set");
        }
        Integer num = (Integer) obj;
        int iIntValue = num.intValue();
        Object obj2 = this.a;
        if (obj2 == dlv.a) {
            if (iIntValue > 20) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 20 bytes for SHA1", num));
            }
        } else if (obj2 == dlv.b) {
            if (iIntValue > 28) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 28 bytes for SHA224", num));
            }
        } else if (obj2 == dlv.c) {
            if (iIntValue > 32) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 32 bytes for SHA256", num));
            }
        } else if (obj2 == dlv.d) {
            if (iIntValue > 48) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 48 bytes for SHA384", num));
            }
        } else {
            if (obj2 != dlv.e) {
                throw new GeneralSecurityException("unknown hash type; must be SHA1, SHA224, SHA256, SHA384 or SHA512");
            }
            if (iIntValue > 64) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 64 bytes for SHA512", num));
            }
        }
        return new dlx(((Integer) this.d).intValue(), ((Integer) this.b).intValue(), ((Integer) this.c).intValue(), ((Integer) this.e).intValue(), (dlw) this.f, (dlv) this.a);
    }

    public final void d(int i) {
        if (i != 16 && i != 24 && i != 32) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte, 24-byte and 32-byte AES keys are supported", Integer.valueOf(i)));
        }
        this.d = Integer.valueOf(i);
    }

    public final void e(int i) {
        if (i < 16) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size in bytes %d; HMAC key must be at least 16 bytes", Integer.valueOf(i)));
        }
        this.b = Integer.valueOf(i);
    }

    public final void f(int i) {
        if (i < 12 || i > 16) {
            throw new GeneralSecurityException(String.format("Invalid IV size in bytes %d; IV size must be between 12 and 16 bytes", Integer.valueOf(i)));
        }
        this.c = Integer.valueOf(i);
    }

    public final void g(int i) {
        if (i < 10) {
            throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; must be at least 10 bytes", Integer.valueOf(i)));
        }
        this.e = Integer.valueOf(i);
    }

    public dpa(byte[] bArr) {
        this.d = null;
        this.b = null;
        this.c = null;
        this.e = null;
        this.a = null;
        this.f = dlw.c;
    }

    public dpa(byte[] bArr, byte[] bArr2) {
    }
}
