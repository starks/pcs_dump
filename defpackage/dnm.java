package defpackage;

import java.security.GeneralSecurityException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dnm extends dtd {
    public final dnp a;
    public final dwt b;
    public final Integer c;
    public final fsc d;

    private dnm(dnp dnpVar, fsc fscVar, dwt dwtVar, Integer num) {
        this.a = dnpVar;
        this.d = fscVar;
        this.b = dwtVar;
        this.c = num;
    }

    public static dnm b(dno dnoVar, fsc fscVar, Integer num) throws GeneralSecurityException {
        dwt dwtVarB;
        dno dnoVar2 = dno.c;
        if (dnoVar != dnoVar2 && num == null) {
            throw new GeneralSecurityException("For given Variant " + dnoVar.d + " the value of idRequirement must be non-null");
        }
        if (dnoVar == dnoVar2 && num != null) {
            throw new GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
        }
        if (fscVar.T() != 32) {
            throw new GeneralSecurityException("XChaCha20Poly1305 key must be constructed with key of length 32 bytes, not " + fscVar.T());
        }
        dnp dnpVar = new dnp(dnoVar);
        dno dnoVar3 = dnpVar.a;
        if (dnoVar3 == dnoVar2) {
            dwtVarB = dru.a;
        } else if (dnoVar3 == dno.b) {
            dwtVarB = dru.a(num.intValue());
        } else {
            if (dnoVar3 != dno.a) {
                throw new IllegalStateException("Unknown Variant: ".concat(dnoVar3.d));
            }
            dwtVarB = dru.b(num.intValue());
        }
        return new dnm(dnpVar, fscVar, dwtVarB, num);
    }

    @Override // defpackage.dky
    public final Integer a() {
        throw null;
    }
}
