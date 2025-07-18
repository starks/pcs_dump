package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ecp extends efb implements egj {
    public static final ecp a;
    private static volatile egp c;
    public dzy b;
    private int d;

    static {
        ecp ecpVar = new ecp();
        a = ecpVar;
        efb.registerDefaultInstance(ecp.class, ecpVar);
    }

    private ecp() {
    }

    @Override // defpackage.efb
    protected final Object dynamicMethod(efa efaVar, Object obj, Object obj2) {
        egp eevVar;
        int iOrdinal = efaVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"d", "b"});
        }
        if (iOrdinal == 3) {
            return new ecp();
        }
        if (iOrdinal == 4) {
            return new asr((boolean[][]) null, (byte[]) null, (int[]) null);
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        egp egpVar = c;
        if (egpVar != null) {
            return egpVar;
        }
        synchronized (ecp.class) {
            eevVar = c;
            if (eevVar == null) {
                eevVar = new eev(a);
                c = eevVar;
            }
        }
        return eevVar;
    }
}
