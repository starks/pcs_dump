package defpackage;

import java.security.GeneralSecurityException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dmx extends dtd {
    public final dna a;
    public final dwt b;
    public final Integer c;

    private dmx(dna dnaVar, dwt dwtVar, Integer num) {
        this.a = dnaVar;
        this.b = dwtVar;
        this.c = num;
    }

    public static dmx b(dna dnaVar, Integer num) throws GeneralSecurityException {
        dwt dwtVarB;
        dmz dmzVar = dnaVar.a;
        if (dmzVar == dmz.b) {
            if (num != null) {
                throw new GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
            }
            dwtVarB = dru.a;
        } else {
            if (dmzVar != dmz.a) {
                throw new GeneralSecurityException("Unknown Variant: ".concat(String.valueOf(String.valueOf(dmzVar))));
            }
            if (num == null) {
                throw new GeneralSecurityException("For given Variant TINK the value of idRequirement must be non-null");
            }
            dwtVarB = dru.b(num.intValue());
        }
        return new dmx(dnaVar, dwtVarB, num);
    }

    @Override // defpackage.dky
    public final Integer a() {
        throw null;
    }
}
