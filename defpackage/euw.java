package defpackage;

import j$.time.Duration;
import j$.util.Optional;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class euw {
    public Object a;
    public Object b;
    public Object c;

    public euw() {
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.List] */
    public final eoe a() {
        return new eoe(this.c, (elp) this.b, this.a);
    }

    public final dsx b() throws GeneralSecurityException {
        Object obj;
        dwt dwtVarA;
        Object obj2 = this.c;
        if (obj2 == null || (obj = this.a) == null) {
            throw new GeneralSecurityException("Cannot build without parameters and/or key material");
        }
        if (((dtb) obj2).a != ((fsc) obj).T()) {
            throw new GeneralSecurityException("Key size mismatch");
        }
        if (((dtb) this.c).a() && this.b == null) {
            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        }
        if (!((dtb) this.c).a() && this.b != null) {
            throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
        dta dtaVar = ((dtb) this.c).c;
        if (dtaVar == dta.d) {
            dwtVarA = dru.a;
        } else if (dtaVar == dta.c || dtaVar == dta.b) {
            dwtVarA = dru.a(((Integer) this.b).intValue());
        } else {
            if (dtaVar != dta.a) {
                throw new IllegalStateException("Unknown HmacParameters.Variant: ".concat(String.valueOf(String.valueOf(dtaVar))));
            }
            dwtVarA = dru.b(((Integer) this.b).intValue());
        }
        return new dsx((dtb) this.c, (fsc) this.a, dwtVarA, (Integer) this.b);
    }

    public final dst c() throws GeneralSecurityException {
        Object obj = this.a;
        if (obj == null) {
            throw new GeneralSecurityException("key size not set");
        }
        if (this.b == null) {
            throw new GeneralSecurityException("tag size not set");
        }
        if (this.c != null) {
            return new dst(((Integer) obj).intValue(), ((Integer) this.b).intValue(), (dss) this.c);
        }
        throw new GeneralSecurityException("variant not set");
    }

    public final void d(int i) throws InvalidAlgorithmParameterException {
        if (i != 16 && i != 32) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 128-bit and 256-bit AES keys are supported", Integer.valueOf(i * 8)));
        }
        this.a = Integer.valueOf(i);
    }

    public final void e(int i) throws GeneralSecurityException {
        if (i < 10 || i > 16) {
            throw new GeneralSecurityException(a.x(i, "Invalid tag size for AesCmacParameters: "));
        }
        this.b = Integer.valueOf(i);
    }

    public final dsq f() throws GeneralSecurityException {
        Object obj;
        dwt dwtVarA;
        Object obj2 = this.c;
        if (obj2 == null || (obj = this.b) == null) {
            throw new GeneralSecurityException("Cannot build without parameters and/or key material");
        }
        if (((dst) obj2).a != ((fsc) obj).T()) {
            throw new GeneralSecurityException("Key size mismatch");
        }
        if (((dst) this.c).a() && this.a == null) {
            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        }
        if (!((dst) this.c).a() && this.a != null) {
            throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
        dss dssVar = ((dst) this.c).c;
        if (dssVar == dss.d) {
            dwtVarA = dru.a;
        } else if (dssVar == dss.c || dssVar == dss.b) {
            dwtVarA = dru.a(((Integer) this.a).intValue());
        } else {
            if (dssVar != dss.a) {
                throw new IllegalStateException("Unknown AesCmacParametersParameters.Variant: ".concat(String.valueOf(String.valueOf(dssVar))));
            }
            dwtVarA = dru.b(((Integer) this.a).intValue());
        }
        return new dsq((dst) this.c, (fsc) this.b, dwtVarA, (Integer) this.a);
    }

    public final doq g() throws GeneralSecurityException {
        Object obj;
        dwt dwtVarB;
        Object obj2 = this.c;
        if (obj2 == null || (obj = this.a) == null) {
            throw new IllegalArgumentException("Cannot build without parameters and/or key material");
        }
        if (((dot) obj2).a != ((fsc) obj).T()) {
            throw new GeneralSecurityException("Key size mismatch");
        }
        if (((dot) this.c).a() && this.b == null) {
            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        }
        if (!((dot) this.c).a() && this.b != null) {
            throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
        dos dosVar = ((dot) this.c).b;
        if (dosVar == dos.c) {
            dwtVarB = dru.a;
        } else if (dosVar == dos.b) {
            dwtVarB = dru.a(((Integer) this.b).intValue());
        } else {
            if (dosVar != dos.a) {
                throw new IllegalStateException("Unknown AesSivParameters.Variant: ".concat(String.valueOf(String.valueOf(dosVar))));
            }
            dwtVarB = dru.b(((Integer) this.b).intValue());
        }
        return new doq((dot) this.c, (fsc) this.a, dwtVarB, (Integer) this.b);
    }

    public final dmi h() throws GeneralSecurityException {
        Object obj;
        dwt dwtVarB;
        Object obj2 = this.c;
        if (obj2 == null || (obj = this.a) == null) {
            throw new GeneralSecurityException("Cannot build without parameters and/or key material");
        }
        if (((dml) obj2).a != ((fsc) obj).T()) {
            throw new GeneralSecurityException("Key size mismatch");
        }
        if (((dml) this.c).a() && this.b == null) {
            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        }
        if (!((dml) this.c).a() && this.b != null) {
            throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
        dmk dmkVar = ((dml) this.c).b;
        if (dmkVar == dmk.c) {
            dwtVarB = dru.a;
        } else if (dmkVar == dmk.b) {
            dwtVarB = dru.a(((Integer) this.b).intValue());
        } else {
            if (dmkVar != dmk.a) {
                throw new IllegalStateException("Unknown AesGcmSivParameters.Variant: ".concat(String.valueOf(String.valueOf(dmkVar))));
            }
            dwtVarB = dru.b(((Integer) this.b).intValue());
        }
        return new dmi((dml) this.c, (fsc) this.a, dwtVarB, (Integer) this.b);
    }

    public final dmd i() throws GeneralSecurityException {
        Object obj;
        dwt dwtVarB;
        Object obj2 = this.c;
        if (obj2 == null || (obj = this.a) == null) {
            throw new GeneralSecurityException("Cannot build without parameters and/or key material");
        }
        if (((dmh) obj2).a != ((fsc) obj).T()) {
            throw new GeneralSecurityException("Key size mismatch");
        }
        if (((dmh) this.c).a() && this.b == null) {
            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        }
        if (!((dmh) this.c).a() && this.b != null) {
            throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
        dmg dmgVar = ((dmh) this.c).d;
        if (dmgVar == dmg.c) {
            dwtVarB = dru.a;
        } else if (dmgVar == dmg.b) {
            dwtVarB = dru.a(((Integer) this.b).intValue());
        } else {
            if (dmgVar != dmg.a) {
                throw new IllegalStateException("Unknown AesGcmParameters.Variant: ".concat(String.valueOf(String.valueOf(dmgVar))));
            }
            dwtVarB = dru.b(((Integer) this.b).intValue());
        }
        return new dmd((dmh) this.c, (fsc) this.a, dwtVarB, (Integer) this.b);
    }

    public final dly j() throws GeneralSecurityException {
        Object obj;
        dwt dwtVarB;
        Object obj2 = this.c;
        if (obj2 == null || (obj = this.a) == null) {
            throw new GeneralSecurityException("Cannot build without parameters and/or key material");
        }
        if (((dmc) obj2).a != ((fsc) obj).T()) {
            throw new GeneralSecurityException("Key size mismatch");
        }
        if (((dmc) this.c).a() && this.b == null) {
            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        }
        if (!((dmc) this.c).a() && this.b != null) {
            throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
        dmb dmbVar = ((dmc) this.c).d;
        if (dmbVar == dmb.c) {
            dwtVarB = dru.a;
        } else if (dmbVar == dmb.b) {
            dwtVarB = dru.a(((Integer) this.b).intValue());
        } else {
            if (dmbVar != dmb.a) {
                throw new IllegalStateException("Unknown AesEaxParameters.Variant: ".concat(String.valueOf(String.valueOf(dmbVar))));
            }
            dwtVarB = dru.b(((Integer) this.b).intValue());
        }
        return new dly((dmc) this.c, (fsc) this.a, dwtVarB, (Integer) this.b);
    }

    public final aux k() {
        if (this.c != null && this.b != null && this.a != null) {
            Object obj = this.c;
            return new auu((auj) obj, (auw) this.b, (String) this.a);
        }
        StringBuilder sb = new StringBuilder();
        if (this.c == null) {
            sb.append(" connectionKey");
        }
        if (this.b == null) {
            sb.append(" type");
        }
        if (this.a == null) {
            sb.append(" packageName");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void l(auj aujVar) {
        if (aujVar == null) {
            throw new NullPointerException("Null connectionKey");
        }
        this.c = aujVar;
    }

    public final void m(String str) {
        if (str == null) {
            throw new NullPointerException("Null packageName");
        }
        this.a = str;
    }

    public final void n(auw auwVar) {
        if (auwVar == null) {
            throw new NullPointerException("Null type");
        }
        this.b = auwVar;
    }

    public final and o() {
        Object obj = this.c;
        if (obj == null) {
            throw new IllegalStateException("Missing required properties: ttl");
        }
        return new and((Duration) obj, (Optional) this.b, (Optional) this.a);
    }

    public final void p(Duration duration) {
        if (duration == null) {
            throw new NullPointerException("Null ttl");
        }
        this.c = duration;
    }

    public euw(aux auxVar) {
        this();
        this.c = auxVar.a();
        this.b = auxVar.b();
        this.a = auxVar.c();
    }

    public euw(byte[] bArr, byte[] bArr2) {
        this.a = null;
        this.b = null;
        this.c = dss.d;
    }

    public euw(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        this();
    }

    public euw(byte[] bArr, char[] cArr, byte[] bArr2, byte[] bArr3) {
        this();
    }

    public euw(char[] cArr) {
        this.c = null;
        this.a = null;
        this.b = null;
    }

    public euw(char[] cArr, byte[] bArr) {
        this.c = null;
        this.b = null;
        this.a = null;
    }

    public euw(byte[] bArr) {
        this.b = elp.a;
    }

    public euw(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.a = new ArrayList();
        this.c = dri.a;
        this.b = null;
    }

    public euw(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
        this();
        this.b = Optional.empty();
        this.a = Optional.empty();
    }
}
