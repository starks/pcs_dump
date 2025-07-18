package defpackage;

import java.security.GeneralSecurityException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dni extends dtd {
    public final dnl a;
    public final dwt b;
    public final Integer c;
    public final fsc d;

    private dni(dnl dnlVar, fsc fscVar, dwt dwtVar, Integer num) {
        this.a = dnlVar;
        this.d = fscVar;
        this.b = dwtVar;
        this.c = num;
    }

    public static dni b(dnl dnlVar, fsc fscVar, Integer num) throws GeneralSecurityException {
        dwt dwtVarB;
        dnk dnkVar = dnlVar.a;
        dnk dnkVar2 = dnk.b;
        if (dnkVar != dnkVar2 && num == null) {
            throw new GeneralSecurityException("For given Variant " + dnkVar.c + " the value of idRequirement must be non-null");
        }
        if (dnkVar == dnkVar2 && num != null) {
            throw new GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
        }
        if (fscVar.T() != 32) {
            throw new GeneralSecurityException("XAesGcmKey key must be constructed with key of length 32 bytes, not " + fscVar.T());
        }
        if (dnkVar == dnkVar2) {
            dwtVarB = dru.a;
        } else {
            if (dnkVar != dnk.a) {
                throw new IllegalStateException("Unknown Variant: ".concat(dnkVar.c));
            }
            dwtVarB = dru.b(num.intValue());
        }
        return new dni(dnlVar, fscVar, dwtVarB, num);
    }

    @Override // defpackage.dky
    public final Integer a() {
        throw null;
    }
}
