package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dyi extends efb implements egj {
    public static final dyi a;
    private static volatile egp c;
    public efd b = emptyBooleanList();

    static {
        dyi dyiVar = new dyi();
        a = dyiVar;
        efb.registerDefaultInstance(dyi.class, dyiVar);
    }

    private dyi() {
    }

    @Override // defpackage.efb
    protected final Object dynamicMethod(efa efaVar, Object obj, Object obj2) {
        egp eevVar;
        int iOrdinal = efaVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001*", new Object[]{"b"});
        }
        if (iOrdinal == 3) {
            return new dyi();
        }
        if (iOrdinal == 4) {
            return new asr((short[]) null, (short[]) null, (char[]) null);
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
        synchronized (dyi.class) {
            eevVar = c;
            if (eevVar == null) {
                eevVar = new eev(a);
                c = eevVar;
            }
        }
        return eevVar;
    }
}
