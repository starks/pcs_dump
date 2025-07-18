package defpackage;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dmt extends dtd {
    public final dmv a;
    public final dwt b;
    public final Integer c;

    private dmt(dmv dmvVar, dwt dwtVar, Integer num) {
        this.a = dmvVar;
        this.b = dwtVar;
        this.c = num;
    }

    public static dmt b(dmv dmvVar, Integer num) throws GeneralSecurityException {
        dwt dwtVarB;
        dmu dmuVar = dmvVar.b;
        if (dmuVar == dmu.a) {
            if (num == null) {
                throw new GeneralSecurityException("For given Variant TINK the value of idRequirement must be non-null");
            }
            dwtVarB = dwt.b(ByteBuffer.allocate(5).put((byte) 1).putInt(num.intValue()).array());
        } else {
            if (dmuVar != dmu.b) {
                throw new GeneralSecurityException("Unknown Variant: ".concat(dmuVar.c));
            }
            if (num != null) {
                throw new GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
            }
            dwtVarB = dwt.b(new byte[0]);
        }
        return new dmt(dmvVar, dwtVarB, num);
    }

    @Override // defpackage.dky
    public final Integer a() {
        throw null;
    }
}
