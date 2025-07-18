package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class asa {
    static final eox a;

    static {
        eit eitVar = eit.a;
        int i = fec.b;
        feb febVar = new feb(eitVar);
        int i2 = eox.d;
        a = new eou(febVar);
    }

    public static edl a(egi egiVar) {
        asr asrVar = (asr) edl.a.createBuilder();
        String strValueOf = String.valueOf(egiVar.getClass().getCanonicalName());
        if (!asrVar.a.isMutable()) {
            asrVar.B();
        }
        ((edl) asrVar.a).b = "type.googleapis.com/".concat(strValueOf);
        eea byteString = egiVar.toByteString();
        if (!asrVar.a.isMutable()) {
            asrVar.B();
        }
        ((edl) asrVar.a).c = byteString;
        return (edl) asrVar.z();
    }

    public static eqr b(eit eitVar) {
        epc epcVar = new epc();
        epcVar.f(a, eitVar);
        eqo eqoVarB = eqo.b(eitVar.b);
        if (!eitVar.c.isEmpty()) {
            eqoVarB = eqoVarB.e(eitVar.c);
        }
        return new eqr(eqoVarB, epcVar);
    }
}
