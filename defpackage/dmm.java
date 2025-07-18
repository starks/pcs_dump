package defpackage;

import java.security.GeneralSecurityException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dmm extends dtd {
    public final dmp a;
    public final dwt b;
    public final Integer c;
    public final fsc d;

    private dmm(dmp dmpVar, fsc fscVar, dwt dwtVar, Integer num) {
        this.a = dmpVar;
        this.d = fscVar;
        this.b = dwtVar;
        this.c = num;
    }

    public static dmm b(dmo dmoVar, fsc fscVar, Integer num) throws GeneralSecurityException {
        dwt dwtVarB;
        dmo dmoVar2 = dmo.c;
        if (dmoVar != dmoVar2 && num == null) {
            throw new GeneralSecurityException("For given Variant " + dmoVar.d + " the value of idRequirement must be non-null");
        }
        if (dmoVar == dmoVar2 && num != null) {
            throw new GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
        }
        if (fscVar.T() != 32) {
            throw new GeneralSecurityException("ChaCha20Poly1305 key must be constructed with key of length 32 bytes, not " + fscVar.T());
        }
        dmp dmpVar = new dmp(dmoVar);
        dmo dmoVar3 = dmpVar.a;
        if (dmoVar3 == dmoVar2) {
            dwtVarB = dru.a;
        } else if (dmoVar3 == dmo.b) {
            dwtVarB = dru.a(num.intValue());
        } else {
            if (dmoVar3 != dmo.a) {
                throw new IllegalStateException("Unknown Variant: ".concat(dmoVar3.d));
            }
            dwtVarB = dru.b(num.intValue());
        }
        return new dmm(dmpVar, fscVar, dwtVarB, num);
    }

    @Override // defpackage.dky
    public final Integer a() {
        throw null;
    }
}
