package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class edb extends efb implements egj {
    public static final edb a;
    private static volatile egp b;

    static {
        edb edbVar = new edb();
        a = edbVar;
        efb.registerDefaultInstance(edb.class, edbVar);
    }

    private edb() {
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
            return new edb();
        }
        if (iOrdinal == 4) {
            return new asr((short[][][]) null, (byte[]) null, (int[]) null);
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
        synchronized (edb.class) {
            eevVar = b;
            if (eevVar == null) {
                eevVar = new eev(a);
                b = eevVar;
            }
        }
        return eevVar;
    }
}
