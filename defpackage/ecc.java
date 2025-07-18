package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ecc extends efb implements egj {
    public static final ecc a;
    private static volatile egp b;

    static {
        ecc eccVar = new ecc();
        a = eccVar;
        efb.registerDefaultInstance(ecc.class, eccVar);
    }

    private ecc() {
    }

    @Override // defpackage.efb
    protected final Object dynamicMethod(efa efaVar, Object obj, Object obj2) {
        egp eevVar;
        int iOrdinal = efaVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0000", null);
        }
        if (iOrdinal == 3) {
            return new ecc();
        }
        if (iOrdinal == 4) {
            return new asr((short[]) null, (byte[]) null, (int[]) null);
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        egp egpVar = b;
        if (egpVar != null) {
            return egpVar;
        }
        synchronized (ecc.class) {
            eevVar = b;
            if (eevVar == null) {
                eevVar = new eev(a);
                b = eevVar;
            }
        }
        return eevVar;
    }
}
